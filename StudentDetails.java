
import java.util.*; 
    public class StudentDetails{
    public static void main(String[] args) { 

        List<Student> li = new LinkedList<>(); 
        li.add(new Student("Tanya", 173, 100));
        li.add(new Student("abc" , 12 , 80));
        li.add(new Student("pqr" , 23 , 90)); 

        for(Student i : li){
            i.display();
        }
    }
    } 


class Student{

    String name;
    int rollNo;
    int tmarks;

    Student(String name , int rollNo , int tmarks){
        this.name = name;
        this.rollNo = rollNo;
        this.tmarks = tmarks;
    }

    public void display(){
        System.out.println("Student name is " + name);
        System.out.println("Student rollNo is " + rollNo);
        System.out.println("Student tmarks "+ tmarks);
    }
}