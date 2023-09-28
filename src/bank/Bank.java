package bank;
class Account{
    public String name;
    protected String email;
    private String password;

    public String getpass()
    {
        //setpass(randomPass);
        return this.password;
    }

    public void setpass(String pass)
    {
        this.password=pass;
    }
}

public class Bank
{
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name= "Apna College";
        account1.email= "Apnacollege@gmail.com";
        account1.setpass("abcd");
        System.out.println(account1.getpass());

    }
}
