package class2;
/*
Create a jave program and name it variables
a:
in your program creat different type of variables to store student's information( First name,last name, grade, city, state,
phone number) and then print value of those variables in the format:
1: My First name is _ and my last name is _
2: I am A/B Student_
3: I live in city _ and State_
4: and my phone number is ....

B:
change student's city,state,phone number and grade.
and print those updated values:

Example:
My name is _ and I moved to new city _ and my new state_.
My New phone number is _


 */
public class TaskVariables {
    public static void main(String[] args) {

            String firstName="Ezharullah";
            String lastName="Qazi Zada";
            char grade='A';
            String city="Fredericksburg";
            String state="Virgina";
            int phoneNumber=+1234555656;


        System.out.println("My First name is "+firstName+" and My Last name is "+lastName);
        System.out.println("I am grade "+grade+" Student");
        System.out.println("I live in city "+city+" and state "+state);
        System.out.println("And my phone number is "+phoneNumber);

        firstName="Khan";
        lastName="Jan";
        grade='B';
        city="Fairfax";
        state="New jersey";
        phoneNumber=34242345;

        System.out.println("My first name is "+firstName+" "+lastName);
        System.out.println("My new grade is "+grade);
        System.out.println("I moved to new city "+city);
        System.out.println("My new state is "+state);
        System.out.println("My new phone number is "+phoneNumber);

        }

    }

