//create the Scanner Method//

import java.util.Scanner;

//this is the ClassName//

public class StudentResults

{
//this is the Main Method//

public static void main(String[] args)

{

//create Scanner Class to capture Student Name//

    Scanner Name = new Scanner(System.in);

//declare the variables with datatype String//

//Input Student Name//

System.out.println("Enter Your Name:");

    String jam1 = Name.next();

//Input Student Registration Number//

System.out.println("Enter Your Registration Number:");

    String jam2 = Name.next();

//Input Student  Course Name//

System.out.println("Enter Your Course Name:");

    String jam3 = Name.next();

//Input Student Year Of Study And Semester//

System.out.println("Enter Your Year Of Study And Semester:");

    String jam4 = Name.next();

//print out the result//

System.out.println("Student Name: " + jam1 + " Registration Number: " + jam2 
+ " Course Name: " + jam3 + " Year Of Study And Semester: " + jam4);

//create Scanner Class to capture Course Units//

    Scanner Detail = new Scanner(System.in);

//declare the variables with datatype String//

    String sub1,sub2,sub3,sub4,sub5,sub6;

//Input Your Course Unit 1 Name//

System.out.println("Enter Your Course Unit 1:");

    sub1 = Detail.next();

//Input Your Course Unit 2 Name//

System.out.println("Enter Your Course Unit 2:");

    sub2 = Detail.next();

//Input Your Course Unit 3 Name//

System.out.println("Enter Your Course Unit 3:");

    sub3 = Detail.next();

//Input Your Course Unit 4 Name//

System.out.println("Enter Your Course Unit 4:");

    sub4 = Detail.next();

//Input Your Course Unit 5 Name//

System.out.println("Enter Your Course Unit 5:");

    sub5 = Detail.next();

//Input Your Course Unit 6 Name//

System.out.println("Enter Your Course Unit 6:");

    sub6 = Detail.next();

//print out the result//

System.out.println("Course Unit 1: " + sub1 + " Course Unit 2: " + sub2 + 
" Course Unit 3: " + sub3 + " Course Unit 4: " + sub4 + " Course Unit 5: " + sub5 
+ " Course Unit 6: " + sub6);

//Create Scanner Class to capture Student Marks//

    Scanner Mark = new Scanner(System.in);

//Declare the variables with datatype int//

    int mark1,mark2,mark3,mark4,mark5,mark6;

//Input Your Course Unit 1 Marks//

System.out.println("Enter Your Course Unit 1 Marks:");

    mark1 = Mark.nextInt();

//Input Your Course Unit 2 Marks//

System.out.println("Enter Your Course Unit 2 Marks:");

    mark2 = Mark.nextInt();

//Input Your Course Unit 3 Marks//

System.out.println("Enter Your Course Unit 3 Marks:");
    mark3 = Mark.nextInt();

//Input Your Course Unit 4 Marks//

System.out.println("Enter Your Course Unit 4 Marks:");

     mark4 = Mark.nextInt();

//Input Your Course Unit 5 Marks//

System.out.println("Enter Your Course Unit 5 Marks:");

    mark5 = Mark.nextInt();

//Input Your Course Unit 6 Marks//

System.out.println("Enter Your Course Unit 6 Marks:");

    mark6 = Mark.nextInt();

//print out the result//

System.out.println("Course Unit 1: " + mark1 + " Course Unit 2: " + mark2 + 
" Course Unit 3: " + mark3 + " Course Unit 4: " + mark4 + " Course Unit 5: " + 
mark5 + " Course Unit 6: " + mark6);

    //Computes the GPA points Of the Student//

    if(mark1>=80 && mark1<=100)

    {

    //print out 5.0 points//

        System.out.println("Course Unit 1: 5.0 GP");

    }

    else if(mark1>=75 && mark1<=79)

    {

    //print out 4.5 points//

        System.out.println("Course Unit 1: 4.5 GP");

    }

    else if(mark1>=70 && mark1<=74)

    {

    //print out 4.0 points//

        System.out.println("Course Unit 1: 4.0 GP");

    }

    else if(mark1>=65 && mark1<=69)

    {

    //print out 3.5 points//

        System.out.println("Course Unit 1: 3.5 GP");

    }

    else if(mark1>=60 && mark1<=64)

    {

    //print out 3.0 points//

        System.out.println("Course Unit 1: 3.0 GP");

    }

    else if(mark1>=55 && mark1<=59)

    {

    //print out 2.5 points//

        System.out.println("Course Unit 1: 2.5 GP");

    }

    else if(mark1>=50 && mark1<=54)

    {

    //print out 2.0 points//

        System.out.println("Course Unit 1: 2.0 GP");

    }

    else if(mark1>=1 && mark1<=49)

    {

    //print out Retake//

        System.out.println("Course Unit 1: Retake");

    }

    else if(mark1==0)

    {

    //print Missed Exam//

        System.out.println("Course Unit 1: Missed Paper");

    }

    //computes the GPA points Of the Student//

    if(mark2>=80 && mark2<=100)

    {

    //print out 5.0 points//

        System.out.println("Course Unit 2: 5.0 GP");

    }

    else if(mark2>=75 && mark2<=79)

    {

    //print out 4.5 points//

        System.out.println("Course Unit 2: 4.5 GP");

    }

    else if(mark2>=70 && mark2<=74)

    {

    //print out 4.0 points//

        System.out.println("Course Unit 2: 4.0 GP");

    }

    else if(mark2>=65 && mark2<=69)

    {

    //print out 3.5 points//

        System.out.println("Course Unit 2: 3.5 GP");

    }

    else if(mark2>=60 && mark2<=64)

    {

    //print out 3.0 points//

        System.out.println("Course Unit 2: 3.0 GP");

    }

    else if(mark2>=55 && mark2<=59)

    {

    //print out 2.5 points//

        System.out.println("Course Unit 2: 2.5 GP");

    }

    else if(mark2>=50 && mark2<=54)

    {

    //print out 2.0 points//

        System.out.println("Course Unit 2: 2.0 GP");

    }

    else if(mark2>=1 && mark2<=49)

    {

    //print out Retake//

        System.out.println("Course Unit 2: Retake");

    }

    else if(mark2==0)

    {

    //print Missed Exam//

        System.out.println("Course Unit 2: Missed Paper");

    }

    //computes the GPA points Of the Student//

    if(mark3>=80 && mark3<=100)

    {

    //print out 5.0 points//

        System.out.println("Course Unit 3: 5.0 GP");

    }

    else if(mark3>=75 && mark3<=79)

    {

    //print out 4.5 points//

        System.out.println("Course Unit 3: 4.5 GP");

    }

    else if(mark3>=70 && mark3<=74)

    {

    //print out 4.0 points//

        System.out.println("Course Unit 3: 4.0 GP");

    }

    else if(mark3>=65 && mark3<=69)

    {

    //print out 3.5 points//

        System.out.println("Course Unit 3: 3.5 GP");

    }

    else if(mark3>=60 && mark3<=64)

    {

    //print out 3.0 points//

        System.out.println("Course Unit 3: 3.0 GP");

    }

    else if(mark3>=55 && mark3<=59)

    {

    //print out 2.5 points//

        System.out.println("Course Unit 3: 2.5 GP");

    }

    else if(mark3>=50 && mark3<=54)

    {

    //print out 2.0 points//

        System.out.println("Course Unit 3: 2.0 GP");

    }

    else if(mark3>=1 && mark3<=49)

    {

    //print out Retake//

        System.out.println("Course Unit 3: Retake");

    }

    else if(mark3==0)

    {

    //print Missed Exam//

        System.out.println("Course Unit 3: Missed Paper");

    }

    //computes the GPA points Of the Student//

    if(mark4>=80 && mark4<=100)

    {

    //print out 5.0 points//

        System.out.println("Course Unit 4: 5.0 GP");

    }

    else if(mark4>=75 && mark4<=79)

    {

    //print out 4.5 points//

        System.out.println("Course Unit 4: 4.5 GP");

    }

    else if(mark4>=70 && mark4<=74)

    {

    //print out 4.0 points//

        System.out.println("Course Unit 4: 4.0 GP");

    }

    else if(mark4>=65 && mark4<=69)

    {

    //print out 3.5 points//

        System.out.println("Course Unit 4: 3.5 GP");

    }

    else if(mark4>=60 && mark4<=64)

    {

    //print out 3.0 points//

        System.out.println("Course Unit 4: 3.0 GP");

    }

    else if(mark4>=55 && mark4<=59)

    {

    //print out 2.5 points//

        System.out.println("Course Unit 4: 2.5 GP");

    }

    else if(mark4>=50 && mark4<=54)

    {

    //print out 2.0 points//

        System.out.println("Course Unit 4: 2.0 GP");

    }

    else if(mark4>=1 && mark4<=49)

    {

    //print out Retake//

        System.out.println("Course Unit 4: Retake");

    }

    else if(mark4==0)

    {

    //print Missed Exam//

        System.out.println("Course Unit 4: Missed Paper");

    }

    //computes the GPA points Of the Student//

    if(mark5>=80 && mark5<=100)

    {

    //print out 5.0 points//

        System.out.println("Course Unit 5: 5.0 GP");

    }

    else if(mark5>=75 && mark5<=79)

    {

    //print out 4.5 points//

        System.out.println("Course Unit 5: 4.5 GP");

    }

    else if(mark5>=70 && mark5<=74)

    {

    //print out 4.0 points//

        System.out.println("Course Unit 5: 4.0 GP");

    }

    else if(mark5>=65 && mark5<=69)

    {

    //print out 3.5 points//

        System.out.println("Course Unit 5: 3.5 GP");

    }

    else if(mark5>=60 && mark5<=64)

    {

    //print out 3.0 points//

        System.out.println("Course Unit 5: 3.0 GP");

    }

    else if(mark5>=55 && mark5<=59)

    {

    //print out 2.5 points//

        System.out.println("Course Unit 5: 2.5 GP");

    }

    else if(mark5>=50 && mark5<=54)

    {

    //print out 2.0 points//

        System.out.println("Course Unit 5: 2.0 GP");

    }

    else if(mark5>=1 && mark5<=49)

    {

    //print out Retake//

        System.out.println("Course Unit 5: Retake");

    }

    else if(mark5==0)

    {

    //print Missed Exam//

        System.out.println("Course Unit 5: Missed Paper");

    }

    //computes the GPA points Of the Student//

     if(mark6>=80 && mark6<=100)

    {

    //print out 5.0 points//

        System.out.println("Course Unit 6: 5.0 GP");

    }

    else if(mark6>=75 && mark6<=79)

    {

    //print out 4.5 points//

        System.out.println("Course Unit 6: 4.5 GP");

    }

    else if(mark6>=70 && mark6<=74)

    {

    //print out 4.0 points//

        System.out.println("Course Unit 6: 4.0 GP");

    }

    else if(mark6>=65 && mark6<=69)

    {

    //print out 3.5 points//

        System.out.println("Course Unit 6: 3.5 GP");

    }

    else if(mark6>=60 && mark6<=64)

    {

    //print out 3.0 points//

        System.out.println("Course Unit 6: 3.0 GP");

    }

    else if(mark6>=55 && mark6<=59)

    {

    //print out 2.5 points//

        System.out.println("Course Unit 6: 2.5 GP");

    }

    else if(mark6>=50 && mark6<=54)

    {

    //print out 2.0 points//

        System.out.println("Course Unit 6: 2.0 GP");

    }

    else if(mark6>=1 && mark6<=49)

    {

    //print out Retake//

        System.out.println("Course Unit 6: Retake");

    }

    else if(mark6==0)

    {

    //print Missed Exam//

        System.out.println("Course Unit 6: Missed Paper");

    }

//Declare the variables with datatype Double//

    Scanner Point = new Scanner(System.in);

//Input your graded points for Course Unit 1//

System.out.println("Enter Your Course Unit 1 GP:");

    float p1 = Point.nextFloat();

//Input your graded points for Course Unit 2//

System.out.println("Enter Your Course Unit 2 GP:");

    float p2 = Point.nextFloat();

//Input your graded points for Course Unit 3//

System.out.println("Enter Your Course Unit 3 GP:");

    float p3 = Point.nextFloat();

//Input your graded points for Course Unit 4//

System.out.println("Enter Your Course Unit 4 GP:");

    float p4 = Point.nextFloat();

//Input your graded points for Course Unit 5//

System.out.println("Enter Your Course Unit 5 GP:");

    float p5 = Point.nextFloat();

//Input your graded points for Course Unit 6//

System.out.println("Enter Your Course Unit 6 GP:");

    float p6 = Point.nextFloat();

//Add the total graded points//

    float p7 = (p1 + p2 + p3 + p4 + p5 + p6);

//Divide the total graded points with total number of course units//

    float p8 = p7 / 6;

//Display the Grade Point Average(GPA)//

System.out.println("GPA: " +p8);

//Grading System for Degrees and Diplomas or Certificates Students//

if(p8>=4.60 && p8<=5.00)

{

//print grade A//

System.out.println("Grade: |A|");

}

else if(p8>=4.50 && p8<=4.59)

{

//print grade B+//

System.out.println("Grade: |B+|");

}

else if(p8>=4.00 && p8<=4.49)

{
//print grade B//

System.out.println("Grade: |B|");

}

else if(p8>=3.50 && p8<=3.99)

{

//print grade C+//

System.out.println("Grade: |C+|");

}

else if(p8>=3.00 && p8<=3.49)

{

//print grade C//

System.out.println("Grade: |C|");

}

else if(p8>=2.50 && p8<=2.99)

{

//print grade D+//

System.out.println("Grade: |D+|");

}

else if(p8>=2.00 && p8<=2.49)

{

//print grade D//

System.out.println("Grade: |D|");

}

else if(p8>=0.00 && p8<=1.99)

{

//print grade F//

System.out.println("Grade: |F|");

}

else

{

//print no grade found if results not graded//

System.out.println("|No Grade Found|");

}

//Cumulative Grade Point Average(CGPA)For Degrees and Diplomas or Certificates Students//

if(p8>=4.40 && p8<=5.00)

{

//Display First Class (Honours)//

System.out.println("Degrees Students: |First Class (Honours)|-|Diplomas/Certificates Students: |Distinction|");

}

else if(p8>=3.60 && p8<=4.39)

{

//Display Second Class-Upper Division (Honours)//

System.out.println("Degrees Students: |Second Class-Upper Division (Honours)|-|Diplomas/Certificates Students: |Credit|");

}

else if(p8>=2.80 && p8<=3.59)

{

//Display Second Class-Lower Division (Honours)//

System.out.println("Degrees Students: |Second Class-Lower Division (Honours)|-|Diplomas/Certificates Students: |Credit|");

}

else if(p8>=2.00 && p8<=2.79)

{

//Display Pass//

System.out.println("Comment: Pass");

}

else if(p8>=0.00 && p8<=1.99)

{

//Display Student failed

System.out.println("Comment: Failed");

}

else if(p8>=2.00 && p8<=5.00)

{

//print out proceed to the next semester on Normal Progress//

System.out.println("Comment: Proceed to the Next Semester On Normal Progress(NP)");

}

else if(p8>=1.00 && p8<=1.99)

{

//print out proceed to the next semester on probation//

System.out.println("Comment: Proceed to the Next Semester On Probationary Progress(PP)");

}

else if(p8==0.00)

{

//print out Retakes all your courses to proceed to the next semester//

System.out.println("Comment: Please Retakes Your Courses to Proceed to the Next Semester");

}

//Display the Graduation Loads & Credit Units//

System.out.println("Minimum Graduation Load(CUs): 40 | Total Credit Units: 44.00");  
    
    }
    
}
