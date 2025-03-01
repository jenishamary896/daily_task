

public class Company
{
    static String companyName="cotiviti";
    String employeeName;
    Company(String myemployeeName){
    //this.companyName=mycompanyName;
    this.employeeName=myemployeeName;
    }
    void display(){
    System.out.println("company:"+companyName);
    System.out.println("employee:"
    +employeeName);
    }

public static void main(String[] args){
    Company com1= new Company("sree");
    Company com2= new Company("deen");
    com1.display();
    com2.display();
        companyName="corrohealth";
            com1.display();
                com2.display();


}
}
    
    
