import java.util.*;
class Doctor 
{
public String dname,spe;
public void showdoc()
{
System.out.println(" Doctor Name Is : "+dname);
System.out.println(" Doctor Specialization Is : "+spe);
}
}

class Patient
{
public String pname,problem;
public void showpat()
{
System.out.println(" Patient Name Is : "+pname);
System.out.println(" Patient Problem Is : "+problem);
}
}
public class Hospital
{
public static void main(String arg[ ])
{
Scanner sc =new Scanner(System.in);
Doctor d= new Doctor();
Patient p= new Patient();
System.out.println("Enter Doctor Name : ");
d.dname=sc.nextLine();
System.out.println("Enter Patient Name : ");
p.pname=sc.nextLine();
System.out.println("Enter Doctor Specialization : ");
d.spe=sc.nextLine();
System.out.println("Enter Patient Problem : ");
p.problem=sc.nextLine();
d.showdoc();
p.showpat();
System.out.println("Created By Vishnu Gupta Karapakula : )" );
}
}
