public class Student {
   int id;
   String name;
   String course;
   double marks;
   String contact; 
   
   // Constructor
   public Student (int id, String name, String course, double marks, String contact ) {
    this.id = id;
    this.name = name;
    this.course = course;
    this.marks = marks;
    this.contact = contact;
   }
   // Display student details
   void displayStudent() {
      System.out.println("Student Id:" + id);
      System.out.println("Name:" + name);
      System.out.println("Course:" + course);
      System.out.println("marks:" + marks);
      System.out.println("Contact:" + contact);
   }

}
