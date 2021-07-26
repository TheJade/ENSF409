import java.util.Scanner;
public class RegistrationApp {
   
    public static void main(String [] args){
        CourseCatalogue cat = new CourseCatalogue ();
		//System.out.println(cat);
		Student st = new Student ("Sara", 1);
		Student st2 = new Student ("Sam", 2);
		Course myCourse = cat.searchCat("ENGG", 233);
		if (myCourse != null) {
			cat.createCourseOffering(myCourse, 1, 100);
			cat.createCourseOffering(myCourse, 2, 200);
		}
		//System.out.println(myCourse.getCourseOfferingAt(0));
		
		Registration reg = new Registration ();
        Registration reg2 = new Registration ();
		reg.completeRegistration(st, myCourse.getCourseOfferingAt(0));
        reg2.completeRegistration(st2, myCourse.getCourseOfferingAt(0));
		
		//System.out.println(reg);
        Scanner scan = new Scanner(System.in);
        String input = "0";
        while(!input.equals("6")){
            //scan.close();
            System.out.println("Enter a number corresponding to one of the menu items.");
            System.out.println("1. Search catalogue courses");
            System.out.println("2. Add course to student courses");
            System.out.println("3. Remove course from student courses");
            System.out.println("4. View all courses in catalogue");
            System.out.println("5. View all courses taken by student");
            System.out.println("6. Quit");
            input = scan.nextLine();
            if(input.equals("1")){
                System.out.println("Enter a course name and number.  (Ex: ENSF 409).");
                String in[]= scan.nextLine().split(" ");
                System.out.println(cat.searchCat(in[0],Integer.valueOf(in[1])));
            }
            if(input.equals("2")){
                System.out.println("Enter name of the student.");
                String name = scan.nextLine();
                Student newStudent = new Student(name,1);
                //get course list
                //ArrayList <Course> cList = cat.getCourseList();
                //ArrayList <CourseOffering> coList = cList.

                System.out.println("Enter the name and number of the course you want to add to the student's courses.");
                String in[] = scan.nextLine().split(" ");
                Registration newReg = new Registration();
                //newReg.completeRegistration(name,in[0],)
                Course course = cat.searchCat("ENGG", 233);
                System.out.println(course);
                System.out.println("Enter the section number you want to add");
                newReg.completeRegistration(newStudent,course.getCourseOfferingAt(Integer.valueOf(scan.nextLine())));

            }
            if(input.equals("4")){
                System.out.println(cat.toString());
                
            }
            if(input.equals("5")){
                
            }
            
        }
    }
}