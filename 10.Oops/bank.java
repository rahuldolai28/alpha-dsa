public class bank {
    public static void main(String[] args) {
        account sbi = new account();
        sbi.username = "rahul";

        System.out.println(sbi.username);
        System.out.println(sbi.setPassword("sbi"));
    }
}

class account {
    public String username;
    private String password;

    public String setPassword(String pwd) {
        password = pwd;
        return password;
    }
}
