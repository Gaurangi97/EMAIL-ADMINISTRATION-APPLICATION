import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;


    private int MailboxCapacity=500;
    private String alternateemail;
    private String companysuffix="abcd.com";
    private String Email;

    private int defaultpasswordLength;
    //constructor to receive the 1st name and last name.
    public Email(String firstname,String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
        System.out.println("Email created: "+this.firstname+""+this.lastname);

         //call a method askiing for the department -return the deprtment
        this.department =setdepartment();
        System.out.println("department :"+this.department);
        //call a method that returns a random password
        this.password= randomPassword(8);
        System.out.println("Your password is "+this.password);
        //combine elements to generate email
        Email= firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+companysuffix;
        System.out.println("your email is"+ Email);


    }

    //Ask for the department
    private String setdepartment(){
        System.out.println("Enter the department\n1 for sales \n2 for development \n3 for accounting \n0 for none");
        Scanner in =new Scanner(System.in);
        int depchoice=in.nextInt();
        if(depchoice==1){
            return "sales";}
         else if (depchoice==2){return "dev";}
         else if (depchoice==3){return "acct";}
         else {return "";}
        }


    //Generate a random password
        private String randomPassword(int length){
        String passwordset="ABCDEF";
        char[]password =new char[length];
        for(int i=0;i<length;i++){
            int rand=(int)(Math.random()*passwordset.length());
            password[i]=passwordset.charAt(rand);
         }
        return new String(password);
        }
    }
    //set the mailbox capacity
public void setMailboxCapacity(int capacity) {
   this.MailboxCapacity()  = capacity;
}


    // set the alternate email
public void setalternateEmail(String altEmail){
    this.alternateemail=altEmail;

}
    //change the password
public void changedpassword(String password){
    this.password()=password;
}
public int getmailboxcapacity(){
    return MailboxCapacity();
}
public String getalternateemail(){
    return setalternateEmail();
}
public String getpassword(){return password();}


public String showinfo (){
    return "DisplayName: +firstName + lastName +
            "Company Email: "+Email+
            "MAILBOX" capacity: 'MB';
}