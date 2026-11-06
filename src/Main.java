import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList create kiye hai
        ArrayList<Student> students = new ArrayList<>();
      
        students.add(new Student(101, "Md Talib Khan", "B.tech", 99, "7070460960"));
        students.add(new Student(102, "Md Firdaush Khan", "BCA", 90, "7070460980"));
        students.add(new Student(103, "Mansi Dhanik", "B.tech", 95, "7070460970"));
        students.add(new Student(104, "Md Shakir Alam", "B.tech", 99, "7070460950"));
        students.add(new Student(105, "Navin kumar", "B.tech", 92, "7070460940"));
        students.add(new Student(106, "Shahil Ansari", "MCA", 100, "7070460930"));
        students.add(new Student(107, "Md Asik", "BSC", 93, "7070460920"));

        while(true) {
            
        System.out.println();
        System.out.println("=========================================");
        System.out.println("STUDENT MANAGEMENT RECORD SYSTEM");
        System.out.println("=========================================");

        System.out.println();
        System.out.println("Welcome to student management system!");

        System.out.println();
        System.out.println("1.Add Student");
        System.out.println("2.View all Students");
        System.out.println("3.Search Student");
        System.out.println("4.Update Student");
        System.out.println("5.Delete Student");
        System.out.println("6.Calculate Result");
        System.out.println("7.Exit");

        System.out.println();
        System.out.println("=========================================");
        
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.println();
       System.out.println("You select option:" + choice);

        //Switch Case
        switch(choice) {
    case 1:

    int id;

    boolean exists;

    while (true) {

        System.out.print("Enter Student ID: ");

        if (sc.hasNextInt()) {

            id = sc.nextInt();

            if (id > 0) {

                exists = false;

                for (Student s : students) {

                    if (s.id == id) {

                        exists = true;

                        break;
                    }
                }
                if (exists) {

                    System.out.println();
                    System.out.println("Student ID Already Exists!");
                    System.out.println("Please enter a different Student ID.");

                } else {
                    break;

                }

            } else {

                System.out.println("Invalid Student ID!");

            }
            } else {

            System.out.println("Enter numbers only!");

            sc.next();

        }
    }

    sc.nextLine(); //ye line q use kiye yahan pr aur double k baad v ? ANS:> jawab ye hai ki Jab hum nextInt() use karte hain
                     //toh Enter ka newline character input buffer mein reh jata hai.
                     //Isliye nextInt() ke baad sc.nextLine() use karte hain.


    System.out.print("Enter Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Course: ");
    String course = sc.nextLine();

    double marks;

    while (true) {

        System.out.print("Enter Marks: ");

        if (sc.hasNextDouble()) {

            marks = sc.nextDouble();

            if (marks >= 0 && marks <= 100) {

                break;

            } else {

                System.out.println("Marks must be between 0 and 100!");
            }
           } else {

            System.out.println("Invalid Input! Enter numbers only.");

            sc.next();
        }
    }

    sc.nextLine();

    String contact;
    while (true) {

        System.out.print("Enter Contact: ");

        contact = sc.nextLine();

        if (contact.matches("[0-9]{10}")) {

            break;

        } else {

            System.out.println("Invalid Contact!");
            System.out.println("Enter exactly 10 digits.");
        }
    }

    Student s = new Student(id, name, course, marks, contact);

    students.add(s);

    System.out.println();
    System.out.println("Student Added Successfully!");
    break;

            case 2:
                 System.out.println("All Students Details:");
            System.out.println();
            for (Student s1 : students) {
                s1.displayStudent();
                System.out.println("---------------------------------------");
                System.out.println();
            }
              break;

            case 3:
                System.out.println("Enter Student Id:");
                int searchid = sc.nextInt();
                boolean found = false;

                for(Student s1 : students) {
                    if(s1.id == searchid) {
                        System.out.println();
                        System.out.println("Student Found!");
                        System.out.println();

                        s1.displayStudent();

                        found = true;
                          break;
                    }
                }
                if(found == false) {
                    System.out.println();
                    System.out.println("Student not found!");
                    System.out.println();
                }
                break;

             case 4:
                   System.out.println("Enter student id to update:");
                   int updateid = sc.nextInt();
                   boolean found1 = false;
                   for(Student s1 : students ) {
                    if(s1.id == updateid) {
                        found1 = true;
                    
                    System.out.println();
                    System.out.println("Student Found.");
                    System.out.println("Enter new Details:");
                    sc.nextLine();

                    System.out.println("Enter new name:");
                    s1.name = sc.nextLine();

                    System.out.println("Enter new course:");
                    s1.course = sc.nextLine();

                    System.out.println("Enter new marks:");
                    s1.marks = sc.nextDouble();

                     sc.nextLine();

                    System.out.println("Enter new contact number:");
                    s1.contact = sc.nextLine();

                    System.out.println();
                    System.out.println("Student Updated Successfully.");
                    break;
                    }
                   }
                   if(found1 == false) {
                    System.out.println();
                    System.out.println("Student not found!");
                   }
                   break;


                case 5:
                    System.out.println("Enter Student Id to Delete.");
                    int deleteid = sc.nextInt();

                    boolean found2 = false;
                    Iterator<Student> itr = students.iterator(); //Ye ArrayList ke students ko one by one access karega.
                     while(itr.hasNext()) { //Jab tak ArrayList mein students available hain, loop chalega.
                        Student s1 = itr.next();
                        if(s1.id == deleteid) {
                            found2 = true;
                            itr.remove(); //matlab current student ArrayList se delete ho gaya.

                            System.out.println();
                            System.out.println("Student Deleted Successfully!");
                            break;
                        }
                     }
                     if(found2 == false) {
                        System.out.println();
                        System.out.println("Student Not Found!");
                     }
                     break;

                    case 6:
                       System.out.println("Enter Student Id:");
                       int resultid = sc.nextInt();

                       boolean found3 = false;
                       for(Student s1 : students) {
                        if(s1.id == resultid) {
                            found3 = true;
                            double percentage = s1.marks;
                            String grade;
                            if(percentage >= 90) {
                                grade = "A+";
                                }else if(percentage >= 80) {
                                    grade = "A";
                            }else if(percentage >= 70) {
                                      grade = "B";
                        }
                        else if(percentage >= 60) {
                            grade = "C";
                        }
                        else if(percentage >= 40) {
                            grade = "D";
                        }
                        else{
                            grade = "Fail";
                        }

                        System.out.println();
            System.out.println("===== STUDENT RESULT =====");

            System.out.println("Student ID: " + s1.id);
            System.out.println("Name: " + s1.name);
            System.out.println("Course: " + s1.course);
            System.out.println("Marks: " + s1.marks);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade);

            System.out.println("==========================");
            break;
         }
      }
      if(found3 != true) {
        System.out.println();
        System.out.println("Student Not Found!");
      }
      break;

                       case 7:
                        System.out.println();
                        System.out.println("Thankyou for using student management system.");
                         System.out.println();
                        return;

                        default:
                            System.out.println("Invalid Choice! Please try again.");
        }
    }
}
}
