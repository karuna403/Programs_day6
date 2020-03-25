import java.util.*;  
 public class Student{ 
     
public String Name;
public String Email;
public  String MN;
public String Address;
  public void setName(String name){
         Name=name;
         
     }
     public String getName(){
         return Name;
         
     }
     public void setEmail(String email){
         Email=email;
         
     }
     public String getEmail(){
         return Email;
         
     }
     public void setMN(String mn){
         MN=mn;
         
     }
     public String getMN(){
         return MN;
         
     }
     public void setAddress(String address){
         Address=address;
         
     }
     public String getAddress(){
         return Address;
         
     }
    
   public static void main(String args[]){  
       System.out.println("enter first person details:");
      ArrayList<Student> alist=new ArrayList<Student>();
      
      System.out.println("enter name:");
      Scanner sc=new Scanner(System.in);
     String a=sc.nextLine();
      System.out.println(a);
     System.out.println("enter email:");
String b=sc.nextLine();
      System.out.println(b);
      System.out.println("enter phone number:\n");
    
      String c=sc.nextLine();
      System.out.println(c);
     System.out.println("enter address:");
     String d=sc.nextLine();
      System.out.println(d);
      Student j=new Student();
    j.setName(a);
        j.setEmail(b);
      j.setMN(c);
      j.setAddress(d);
      alist.add(j);
      System.out.println("\nenter second person details:");
      Student j1=new Student();
      System.out.println("enter name:");
      
     String e=sc.nextLine();
      System.out.println(e);
     System.out.println("enter email:");
     String f=sc.nextLine();
      System.out.println(f);
      System.out.println("enter phone number:");
      
     String g=sc.nextLine();
      System.out.println(g);
     System.out.println("enter address:");
     String h=sc.nextLine();
      System.out.println(h);
      
      j1.setName(e);
      j1.setEmail(f);
       j1.setMN(g);
      j1.setAddress(h);
      alist.add(j1);
      System.out.println("\ntotal persons details in a collection list are:");
  for(Student s:alist){
      
      System.out.println(s.Name+" "+s.Email+" "+s.MN+" "+s.Address);
          
          }
      //displaying elements
    }
}