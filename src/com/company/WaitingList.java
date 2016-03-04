package com.company;
import java.util.Timer;
import java.util.Random;
/*
 * Created by Vontre on 2/29/2016.
 */
public class WaitingList {
    Schedule classes = new Schedule();
    Student student = new Student();
    Timer timer;

    int choice = 0;


    public void setSchedule(String fN, String mI, String lN, String pNum)
    {
        if(student.confirmation() == 0)
        {
            System.out.println("Generating Schedule...");
            waiting();
            classSet(fN, mI, lN, pNum);
        }
    }

    public void waiting()
    {

        for(int i = 0; i == 10; i++)
        {

            try
            {
                Thread.sleep(10000);
            }
            catch(InterruptedException e)
            {
                System.out.println(".\n");
            }

        }
    }

    public void classSet(String fN, String mI, String lN, String pNum)
    {
        Random rnd = new Random();
        int randClass = rnd.nextInt(7) + 1;

        switch(randClass)
        {
            case 1:
                System.out.println("Student Name:\n" + lN + ", " +  fN + " " + mI + ".\n");
                System.out.println("Student Email:\n" + lN + fN + "@SomeSchool.com\n");
                System.out.println("Schedule:\n\t Monday\t|| Tuesday\t|| Wednesday\t|| Thursday\n|| Friday |");
                System.out.println("8:00 |\t CHEM110\t|| BIO101\t|| CHEM110\t|| BIO101\t|| CHEM110|");
                System.out.println("9:00 |\t _______\t|| BIO101\t|| _______\t|| BIO101\t||  _____ |");
                System.out.println("10:00|\t        \t|| ______\t||        \t|| ______\t||        |");
                System.out.println("11:00|\t MATH120\t||       \t|| MATH120\t||       \t|| MATH120|");
                System.out.println("12:00|\t ______     \t|| HIST201\t|| ______\t|| HIST201\t||  ____  |");
                System.out.println("1:00 |\t            \t|| HIST201\t||       \t|| HIST201\t||        |");
                System.out.println("2:00 |\t            \t|| ______ \t||       \t|| ______ \t||        |");
                System.out.println("3:00 |\t            \t||        \t||       \t||        \t||        |");
                System.out.println("4:00 |\t            \t||        \t||       \t||        \t||        |");
                break;
            case 2:
                System.out.println("Student Name:\n" + lN + ", " +  fN + " " + mI + ".\n");
                System.out.println("Student Email:\n" + lN + fN + "@SomeSchool.com\n");
                System.out.println("Schedule:\n\t Monday\t|| Tuesday\t|| Wednesday\t|| Thursday\n|| Friday |");
                System.out.println("8:00 |\t PYSC220\t||       \t|| PSYC220\t||       \t|| PSYC220|");
                System.out.println("9:00 |\t _______\t||  CS130\t|| _______\t||  CS130\t||  _____ |");
                System.out.println("10:00|\t        \t||  CS130\t||        \t||  CS130\t||        |");
                System.out.println("11:00|\t  LIT410\t||  _____\t||  LIT410\t||  _____\t||  LIT410|");
                System.out.println("12:00|\t ______     \t||        \t|| ______\t||        \t||  _____ |");
                System.out.println("1:00 |\t            \t||        \t||       \t||        \t||        |");
                System.out.println("2:00 |\t            \t||        \t||       \t||        \t||        |");
                System.out.println("3:00 |\t            \t||        \t||       \t||        \t||        |");
                System.out.println("4:00 |\t            \t||        \t||       \t||        \t||        |");
                break;
            case 3:
                System.out.println("Student Name:\n" + lN + ", " +  fN + " " + mI + ".\n");
                System.out.println("Student Email:\n" + lN + fN + "@SomeSchool.com\n");
                System.out.println("Schedule:\n\t Monday\t|| Tuesday\t|| Wednesday\t|| Thursday\n|| Friday |");
                System.out.println("8:00 |\t CHEM110\t|| BIO101\t|| CHEM110\t|| BIO101\t|| CHEM110|");
                System.out.println("9:00 |\t _______\t|| BIO101\t|| _______\t|| BIO101\t||  _____ |");
                System.out.println("10:00|\t        \t|| ______\t||        \t|| ______\t||        |");
                System.out.println("11:00|\t MATH120\t||       \t|| Math120\t||       \t|| MATH120|");
                System.out.println("12:00|\t ______     \t|| HIST201\t|| ______\t|| HIST201\t||  ____  |");
                System.out.println("1:00 |\t            \t|| HIST201\t||       \t|| HIST201\t||        |");
                System.out.println("2:00 |\t            \t|| ______ \t||       \t|| ______ \t||        |");
                System.out.println("3:00 |\t            \t||        \t||       \t||        \t||        |");
                System.out.println("4:00 |\t            \t||        \t||       \t||        \t||        |");
                break;
            case 4:
                System.out.println("Student Name:\n" + lN + ", " +  fN + " " + mI + ".\n");
                System.out.println("Student Email:\n" + lN + fN + "@SomeSchool.com\n");
                System.out.println("Schedule:\n\t Monday\t|| Tuesday\t|| Wednesday\t|| Thursday\n|| Friday |");
                System.out.println("8:00 |\t CHEM110\t|| BIO101\t|| CHEM110\t|| BIO101\t|| CHEM110|");
                System.out.println("9:00 |\t _______\t|| BIO101\t|| _______\t|| BIO101\t||  _____ |");
                System.out.println("10:00|\t        \t|| ______\t||        \t|| ______\t||        |");
                System.out.println("11:00|\t MATH120\t||       \t|| Math120\t||       \t|| MATH120|");
                System.out.println("12:00|\t ______     \t|| HIST201\t|| ______\t|| HIST201\t||  ____  |");
                System.out.println("1:00 |\t            \t|| HIST201\t||       \t|| HIST201\t||        |");
                System.out.println("2:00 |\t            \t|| ______ \t||       \t|| ______ \t||        |");
                System.out.println("3:00 |\t            \t||        \t||       \t||        \t||        |");
                System.out.println("4:00 |\t            \t||        \t||       \t||        \t||        |");
                break;
            case 5:
                System.out.println("Student Name:\n" + lN + ", " +  fN + " " + mI + ".\n");
                System.out.println("Student Email:\n" + lN + fN + "@SomeSchool.com\n");
                System.out.println("Schedule:\n\t Monday\t|| Tuesday\t|| Wednesday\t|| Thursday\n|| Friday |");
                System.out.println("8:00 |\t CHEM110\t|| BIO101\t|| CHEM110\t|| BIO101\t|| CHEM110|");
                System.out.println("9:00 |\t _______\t|| BIO101\t|| _______\t|| BIO101\t||  _____ |");
                System.out.println("10:00|\t        \t|| ______\t||        \t|| ______\t||        |");
                System.out.println("11:00|\t MATH120\t||       \t|| Math120\t||       \t|| MATH120|");
                System.out.println("12:00|\t ______     \t|| HIST201\t|| ______\t|| HIST201\t||  ____  |");
                System.out.println("1:00 |\t            \t|| HIST201\t||       \t|| HIST201\t||        |");
                System.out.println("2:00 |\t            \t|| ______ \t||       \t|| ______ \t||        |");
                System.out.println("3:00 |\t            \t||        \t||       \t||        \t||        |");
                System.out.println("4:00 |\t            \t||        \t||       \t||        \t||        |");
                break;
            default:
                System.out.println("Sorry, there are no classes available at this time.\nPlease try again later");
                System.exit(0);
                break;
        }
    }
}
