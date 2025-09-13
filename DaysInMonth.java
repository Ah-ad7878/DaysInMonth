package pk.org.cas;

import java.util.Scanner;

public class DaysInMonth {
    private int month;

    public static final int MONTH1 = 1;
    public static final int MONTH2 = 2;
    public static final int MONTH3 = 3;
    public static final int MONTH4 = 4;
    public static final int MONTH5 = 5;
    public static final int MONTH6 = 6;
    public static final int MONTH7 = 7;
    public static final int MONTH8 = 8;
    public static final int MONTH9 = 9;
    public static final int MONTH10 = 10;
    public static final int MONTH11 = 11;
    public static final int MONTH12 = 12;




    Scanner sc = new Scanner(System.in);

    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
   // sep ,nov,apl,jun
    public DaysInMonth(){

    }
    public DaysInMonth(int month){
        this.month = month;
    }
    int option;
    public void month(){
        System.out.println("choose an Month");
        System.out.println("1-jan");
        System.out.println("2-feb");
        System.out.println("3-march");
        System.out.println("4-April");
        System.out.println("5-may");
        System.out.println("6-june");
        System.out.println("7-july");
        System.out.println("8-Aguest");
        System.out.println("9-september");
        System.out.println("10-october");
        System.out.println("11-november");
        System.out.println("12-december");
        System.out.print("Enter a choice");
        option = sc.nextInt();


    }


    //pattern 1
//    public void output(){
//        if(option == MONTH9 || option == MONTH11 || option == MONTH4 || option == MONTH6){
//            System.out.println("This month has 30 days "+ " and month no is "+option);
//        } else if (option == MONTH1|| option == MONTH3 || option == MONTH5 || option == MONTH7 || option == MONTH8|| option== MONTH10 || option == MONTH12 ) {
//            System.out.println("This month has 31 days "+" and month no is "+ option);
//        } else if (option == MONTH2) {
//            System.out.println("This month has 28 days"+ " and month no is "+option);
//        }else {
//            System.out.println("invalid month");
//        }
//    }
        //pattern 2
    public void display(){
        if (option == MONTH9 || option == MONTH11 || option == MONTH4 || option == MONTH6){
            System.out.println("This month has 30 days "+ " and month no is "+option);
            System.out.println("wow! this month has long days");
        }else {
            if(option == MONTH1|| option == MONTH3 || option == MONTH5 || option == MONTH7 || option == MONTH8|| option== MONTH10 || option == MONTH12){
                System.out.println("This month has 31 days "+" and month no is "+ option);
                System.out.println("Wow! this month has one day extra from other month");
            }else {
                if (option == MONTH2){
                    System.out.println("This month has 28 days"+ " and month no is "+option);
                    System.out.println("o shit this month has  3 days less from other days");
                }else {
                    System.out.println("invalid month");
                }
            }
        }
    }
}
