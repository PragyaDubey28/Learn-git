import java.util. ArrayList;
import java.util. Scanner;

  class Student{
  int id;
  String Name;
  int Age;

  Student(int id, String NAme, int Age){
    this.id =id;
    this.Name =Name;
    this.id = id;
  }
}
    
public class StudentManagementSystem{
  static ArrayList<Student> students-new ArrayList<>();
   static Scanner sc=new Scanner(System.in);
  
    public static void main (String[]args){

      While(true){

        System.out.println("\n---Student Management System---");
        System.out.println("1. Add Student");
        System.out.println("2.View Student");
        System.out.println("3.Update Student" );
        System.out.println( "Delete Student");
        System.out.println( "5.Exit");

        System.out.print("Choose option");

        int choice = sc.nextInt();

         switch (choice) {
          
        case 1:
           addStudent();
           
           Break;

        case 2:
          viewStudent();
          
          Break;

          case 3:
            updateStudent();

            Break;

            case 4:
              deleteDtudent();
              
              Break;

            case 5:
              System.out.println("Thankyou!");
              System.exit(0);
            default:
               System.out.println("invalid choice!");

    }


}
}
  static void addStudent(){

 
   System.out.println("Enter id");
   int id=sc. nextInt();
   sc.nextLine();

   System.out.println("Enter Name");
   String Name=sc nextLine();


   System.out.println("Enter Age");
   int Age=sc.nextInt();

   Student.add(new student (id,Name,Age));
   system.out.println("Student added Successfully")
  }
    static void view students(){
      if(student.is Empty()){
        System.out.println("No student found");
        return;
      }
      system.out.println("\n id\tName\tAge");
      for(Student s: students){
        System.out.println(s.id+"\t"+s.Name+"\t"+s.Age);
      }
    }

    static void updatestudent(){
      System.out.println("ENter Student id to update");
      int id=sc.nextInt();
      for(Student s : Students){
        if(s.id==id){
          sc.nextLine();
          System.out.println("Entern new Name");
          s.Name=sc.nextLine();
          System.out.println("Enter new Age");
          s.Age=sc.nextInt();
          System.out.println("Student updated Successfully");
          return;
        }
      }
      System.out.println("Student not found");
    }

    static void deletestudent(){
      System.out.println("ENter Student id to delete");
      int id=sc.nextInt();
      for(Student s : Students){
        if(s.id==id){
          Student.remove(s);
          System.out.println("");
          s.Name=sc.nextLine();
          System.out.println("Enter new Age");
          s.Age=sc.nextInt();
          System.out.println("Student updated Successfully");
          return;
        }
      }
      System.out.println("Student not found");
    }




    

