import java.util.Scanner;
public class Tester extends student{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Student/Teacher");
        String pilihan = in.nextLine();
        if (pilihan == "Student") {
            System.out.println("Status:");
            String name = in.nextLine();
            String major = in.nextLine();
            int age = in.nextInt();
            int Studentnumber = in.nextInt();
            int score = in.nextInt();
            System.out.println("Biodata:");
            student std1 = new student(name,age,Studentnumber,score,major);
            std1.print();
        }else if (pilihan == "Teacher"){
                  System.out.println("Status:");
                  String name = in.nextLine();
                  int age = in.nextInt();
                  System.out.println("shift:");
                  if(pilihan == "fulltime"){
                    String unit = in.nextLine();
                    int Anual_salary = in.nextInt();
                  }else if(pilihan == "parttime"){
                    String Hour_worked = in.nextLine();
                  }
        }else{
            System.out.println("Input Salah!");
        }
    }
}

