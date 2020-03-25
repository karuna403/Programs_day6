import java.util.*;
    class Book{  
        public String name;
 public String date_of_birth;
 public String blood_group;
 public int age;
 public String last_blood_donated_date;
 public String address;

public Book( String name, String date_of_birth, String blood_group, int age, String last_blood_donated_date, String address ) {  
      
    this.name = name;  
    this.date_of_birth=date_of_birth;  
    this.blood_group=blood_group;  
    this.age=age;
    this.last_blood_donated_date=last_blood_donated_date;
    this.address=address;
}  
}  
public class ListIteratorExample2 {  
public static void main(String[] args) {  
    //Creating list of Books  
    List<Book> list=new ArrayList<Book>();  
    
    
   
   
    //Creating Books  
    Book b1=new Book( "Kaveri","3-9-1997", "B-positive", 30, "3-3-2020", "D-no:2-25,penamaluru");  
    Book b2=new Book( "Manu","4-5-1996", "A-positive", 15, "3-2-2020", "D-no:3-24, vijayawada");  
    Book b3=new Book( "James","5-7-1994", "o-positive",10, "Didn't_give_previous", "D-no:5-52, gannavaram");  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
//Traversing list  
    System.out.println("Total data is:");
    for(Book b:list){  
    System.out.println(b.name+" " +b.date_of_birth+" "+b.blood_group+" "+b.age+" "+b.last_blood_donated_date+" "+b.address);  
    } 
    System.out.println("\npersons who are not eligible for donating blood:");
    for(Book b:list){  
        if(b.age<17){
    System.out.println("name:"+" "+b.name+" "+"age:"+b.age+" "+" this person not eligible for donating blood");  
    } 
    }
    
}  
}
  