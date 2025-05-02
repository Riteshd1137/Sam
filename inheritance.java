import java.util.Scanner; 
//SY AIML 
/*Problem Statement:: Design and develop inheritance for a given case 
study, identify objects and relationships and  
implement inheritance wherever applicable. Employee class has Emp_name, 
Emp_id, Address,  
Mail_id, and Mobile_no as members. Inherit the classes: Programmer, Team 
Lead, Assistant  
Project Manager and Project Manager from employee class. Add Basic Pay 
(BP) as the member of  
all the inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of 
BP as PF, 0.1% of BP for  
staff club fund. Generate pay slips for the employees with their gross 
and net salary. */ 
 
class Employee { 
    Scanner sc = new Scanner(System.in); 
    String Emp_name; 
    String address; 
    String Mail_id; 
    String Mobile_no; 
    int Emp_id; 
    double BP, DA, HRA, PF, SF; 
 
    void getdata() { 
        System.out.print("\nEnter the name of Employee: "); 
        Emp_name = sc.nextLine(); 
        System.out.print("\nEnter the Emp_id of Employee: "); 
        Emp_id = sc.nextInt(); 
        sc.nextLine(); // Consume newline 
        System.out.print("\nEnter the Mail_id of Employee: "); 
        Mail_id = sc.nextLine(); 
        System.out.print("\nEnter the Mobile_no of Employee: "); 
        Mobile_no = sc.nextLine(); 
        System.out.print("\nEnter the Address of Employee: "); 
        address = sc.nextLine(); 
        System.out.print("\nEnter the Basic pay of Employee: "); 
        BP = sc.nextDouble(); 
    } 
 
    void Displaydata() { 
        System.out.println("The name of Employee: " + Emp_name); 
        System.out.println("The Emp_id of Employee: " + Emp_id); 
        System.out.println("The Address of Employee: " + address); 
        System.out.println("The Mail_id of Employee: " + Mail_id); 
        System.out.println("The Mobile_no of Employee: " + Mobile_no); 
    } 
 
    void gross_salary() { 
        DA = 0.97 * BP; 
        HRA = 0.1 * BP; 
        PF = 0.12 * BP; 
        SF = 0.001 * BP; 
    } 
 
void Display_salary() { 
System.out.println("\nThe DA is " + DA); 
System.out.println("The HRA is " + HRA); 
System.out.println("The PF is " + PF); 
System.out.println("The SF is " + SF); 
System.out.println("The gross salary of the employee is: " + (BP + DA + 
HRA)); 
System.out.println("The Net salary of the employee is: " + (BP + DA + HRA - PF - SF)); 
} 
} 
 
class Programmer extends Employee { 
     
} 
 
class TeamLeader extends Employee { 
} 
 
class AssistantProjectManager extends Employee { 
} 
 
class ProjectManager extends Employee { 
} 
 
class inheritance { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int ch = 0; 
        Employee e=new Employee(); 
        Programmer p = new Programmer(); 
        TeamLeader t = new TeamLeader(); 
        AssistantProjectManager a = new AssistantProjectManager(); 
        ProjectManager m = new ProjectManager(); 
 
        while (ch != 5) { 
            System.out.println("1.Employee pay slip\n2.Programmer pay 
slip\n3.Team Leader pay slip\n4.Assistant Project Manager pay 
slip\n5.Project Manager pay slip\n6.Exit\nEnter Your Choice:: "); 
            ch = sc.nextInt(); 
 
            if (ch > 5) break; 
 
            switch (ch) { 
                case 1: 
                    e.getdata(); 
                    e.Displaydata(); 
                    e.gross_salary(); 
                    e.Display_salary(); 
                    break; 
                case 2: 
                    p.getdata(); 
                    p.Displaydata(); 
                    p.gross_salary(); 
                    p.Display_salary(); 
                    break; 
                case 3: 
                    t.getdata(); 
                    t.Displaydata(); 
                    t.gross_salary(); 
                    t.Display_salary(); 
                    break; 
                case 4: 
                    a.getdata(); 
                    a.Displaydata(); 
                    a.gross_salary(); 
                    a.Display_salary(); 
                    break; 
                case  5: 
                    m.getdata(); 
                    m.Displaydata(); 
                    m.gross_salary(); 
                    m.Display_salary(); 
                    break; 
                default: 
                    System.out.println("Please enter a valid input."); 
                    break; 
            } 
        } 
        sc.close(); 
    } 
}
