class Employee {
    private long accountNo;
    private String name,email;
    private float balance;
    public long getAccountNo(){
        return accountNo;
    }
    public void setAccountNo(long accountNo){
        this.accountNo = accountNo;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public float getBalance(){
        return balance;
    }
    public void setBalance(float balance){
        this.balance = balance;
    }
}
public class Main{
    public static void main(String[] args){
        Employee Ram = new Employee();
        Ram.setAccountNo(987563);
        Ram.setName("Ramcharan");
        Ram.setEmail("ramcharan@gmail.com");
        Ram.setBalance(1000);
        System.out.println("Emp Account no. - "+ Ram.getAccountNo());
        System.out.println("Emp Name - "+ Ram.getName());
        System.out.println("Emp Email  - "+ Ram.getEmail());
        System.out.println("Emp balance. - "+ Ram.getBalance());
    }
}