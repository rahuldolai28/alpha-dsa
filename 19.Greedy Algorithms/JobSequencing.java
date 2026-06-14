import java.util.ArrayList;
import java.util.Collections;

// Job Sequencing Problem
// Given an array of jobs where every job has a deadline and profit if
// the job is finished before the deadline. It is also given that every
// job takes a single unit oftime, so the minimum possible deadline for any
// job is 1. Maximize the total profit if only one job can
// be scheduled at a time.
// Job A = 4, 20
// Job B = 1, 10
// Job C = 1, 40
// Job D = 1, 30
// ans = C, A

public class JobSequencing {

    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {

        int jobInfo[][] = {
                { 4, 200 },
                { 1, 40 },
                { 1, 30 },
                { 1, 20 }
        };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        // Sort by profit (descending)
        Collections.sort(jobs,
                (a, b) -> Integer.compare(b.profit, a.profit));

        // Find maximum deadline
        int maxDeadline = 0;
        for (Job j : jobs) {
            maxDeadline = Math.max(maxDeadline, j.deadline);
        }

        boolean slots[] = new boolean[maxDeadline + 1];

        ArrayList<Integer> seq = new ArrayList<>();
        int totalProfit = 0;

        for (Job curr : jobs) {

            // Try latest available slot
            for (int j = curr.deadline; j > 0; j--) {

                if (!slots[j]) {
                    slots[j] = true;

                    seq.add(curr.id);
                    totalProfit += curr.profit;

                    break;
                }
            }
        }

        System.out.println("Max Jobs = " + seq.size());
        System.out.println("Total Profit = " + totalProfit);

        System.out.print("Jobs : ");
        for (int id : seq) {
            System.out.print((char) ('A' + id) + " ");
        }
    }
}