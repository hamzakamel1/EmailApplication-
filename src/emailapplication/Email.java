package emailapplication;
import java.util.Scanner;



public class Email {
    // variables
    private String firstName;
    private String lastName;
    private String passWord;
    private String department;
    private int defultPasswordLen =10;
    private String alternativeMail;
    private int mailboxCapicity =600;
    private String companySuffix= "cic-cairo.com";
    private String email;





    // Constractor to recive the first name and the last name
    public Email (String firstName, String lastName){
        this.firstName= firstName;
        this.lastName=lastName;
        System.out.println("Email:"+ this.firstName +" "+this.lastName);

        // Call a method asking for the departement and returns the department type
        this.department= setDepartment();
        System.out.println("Department: " + this.department);

        //Call a method that generates random password
        this.passWord=randomPassword(defultPasswordLen);
        System.out.println("Your Password is:" +this.passWord);

        //Compine elements to generate emails
        email= firstName.toLowerCase()+ "_" + lastName.toLowerCase() + "@" + department +"."+companySuffix;

    }




    // Ask for the department
    private String setDepartment(){
        System.out.print("DEPARTMENT TYPES \n1-Sales\n2-Development\n3-Accounting\n4-NOne \n Enter your choice: ");
        Scanner input = new Scanner(System.in);
        int developmentChoise = input.nextInt();
        if (developmentChoise == 1) return "Sales";
        else if(developmentChoise ==2 ) return "Dev";
        else if (developmentChoise == 3 ) return "acc";
        else return " ";

    }




    // Generate a random password
    private String randomPassword(int length){
        String PasswordSet ="ABCDEFGHIJKLMNOP1234567890!@#$%&*~+_-";
        char [] password= new char[length];

        for( int i =0 ; i<length ; i++){
        int random= (int) ( Math.random() * PasswordSet.length());
        password[i]= PasswordSet.charAt(random);
        }
        return new String(password);
    }







    // set the mailbox capacity
    public void setMaillboxCapacity(int capacity) { this.mailboxCapicity= capacity; }
    // set the altrenative email
    public void setAlternativeMail(String alltEmail) { this.alternativeMail = alltEmail; }
    // change the password
    public void changePassword(String passWord){ this.passWord=passWord; }



    // GetMethods
    public int getMailboxCapicity(){ return mailboxCapicity; }
    public String getAlternativeMail() { return alternativeMail; }
    public String getPassWord() {return passWord; }


    public String showInformation(){
        return "NAME:"+firstName +" "+lastName +
                "\nCOMPANY EMAIL:" + email +
                "\nMAILBOX CAPACITY:"+ mailboxCapicity +"MB";

    }
}




