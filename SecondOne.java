import java.util.*;
    
    class Book{  
      public int id;  
 public String name;
 public String date_of_birth;
 public String blood_group;
 public double height;
 public int marks;
int quantity;  
public Book(int id, String name, String date_of_birth, String blood_group, double height, int marks) {  
    this.id = id;  
    this.name = name;  
    this.date_of_birth=date_of_birth;  
    this.blood_group=blood_group;  
    this.height=height;
    this.marks=marks;
}  
}  
public class ListIteratorExample2 {  
public static void main(String[] args) {  
    //Creating list of Books  
    List<Book> list=new ArrayList<Book>();  
    System.out.println("enter Id:");
    
   int Id=Integer.parseInt(args[0]);
   System.out.println(Id);
   System.out.println("enter Name:");
   String Name=args[1];
   System.out.println(Name);
    //Creating Books  
    Book b1=new Book(1, "Kaveri","3-9-1997", "B-positive",5.2, 500);  
    Book b2=new Book(2, "Manu","4-5-1996", "A-positive",5.6, 400);  
    Book b3=new Book(3, "James","5-7-1994", "o-positive",6.0, 300);  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
//Traversing list  
    System.out.println("Total data is:");
    for(Book b:list){  
    System.out.println(b.id+" "+b.name+" "+b.date_of_birth+" "+b.blood_group+" "+b.height+" "+b.marks);  
    } 

    System.out.println("\nthe searching data is:");
    for(Book b:list){  
        if(b.id==Id && (b.name.toLowerCase()).equals(Name)){
 System.out.println(b.id+" "+b.name+" "+b.date_of_birth+" "+b.blood_group+" "+b.height+b.marks);  
        }
    } 
}  
}