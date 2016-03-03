package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student stu = new Student();
        Schedule schedule = new Schedule();
        WaitingList waitL = new WaitingList();
        Scanner in = new Scanner(System.in);

        int close = 0;
        int choice = 0;

        System.out.println("Please Enter Your First Name.");
        stu.fName = in.nextLine();

        System.out.println("\nNow Enter Your Middle Initial.");
        stu.mInit = in.nextLine();

        System.out.println("\nNext Enter Your Last Name.");
        stu.lName = in.nextLine();

        System.out.println("\nFinally, Enter Your Phone Number.");
        //in.nextLine();
        stu.pNumber = in.nextLine();

        stu.confirmation(choice);
        if(choice == 1)
        {
            System.out.println("Sorry For The Inconvenience,\nWe Hope You Finish The Application Soon.");

            System.exit(0);
        }
        else if(choice == 0)
        {

            System.out.println("Great!");
            stu.setFName(stu.fName);
            stu.setMInit(stu.mInit);
            stu.setLName(stu.lName);
            stu.setNum(stu.pNumber);
            schedule.insertFirstClass(stu.getFName(), stu.getMInit(), stu.getLName(), stu.getNum());
            waitL.setSchedule(stu.fName, stu.mInit, stu.lName, stu.pNumber);
        }
        else
        {
            System.out.println("Seems There Was An Error In Your Process,\nPlease Press A Key To Close The Application And Restart.");

            System.exit(0);
        }

        System.out.println("Now That Your Are Set, We Look Forward To Furthering Your Career At Our Campus. See You Soon! :)");
        System.out.println("\nPress Any Key To Exit....");
        close = in.nextInt();
        System.exit(0);
    }
}
