class Student {
    private String name;
    private int age;
    private long phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
 public class Main {
     public static void main(String[] args) {
         Student s1 = new Student();
         Student s2 = new Student();
         s1.setName("Amit");
         s1.setAge(25);
         s1.setPhoneNumber(3248978);
         System.out.println("Name- " + s1.getName());
         System.out.println("Age- " + s1.getAge());
         System.out.println("PhoneNumber- " + s1.getPhoneNumber());

         s2.setName("Ankit ");
         s2.setAge(26);
         s2.setPhoneNumber(8489282);
         System.out.println("Name- " + s2.getName());
         System.out.println("Age- " + s2.getAge());
         System.out.println("PhoneNumber- " + s2.getPhoneNumber());

     }
 }