public class App
 {
  public static void main(String args[])
  {
  // mystery3();

  //  nested();

    practice1();

    System.out.println();

    practice2();

    System.out.println();

    practice3();
 }
 
 public static void practice1() {
    for (int num = 1; num < 6; num++) {
        for (int counter = 0; counter < num; counter++) {
            System.out.print(num);
        }
    System.out.println();
    }
 }

 public static void practice2() {
    char dot = '.';
    for (int num = 1; num < 6; num++) {
        for (int i = 5; i > num; i--) {
            System.out.print(dot);
            }
        for (int counter = 0; counter < num; counter++) {
            System.out.print(num);
        }
        System.out.println();
    }
    
    }




 public static void practice3() {
    char dot = '.';
    for (int num = 1; num < 6; num++) {
        for (int i = 5; i > num; i--) {
            System.out.print(dot);
            }
        System.out.print(num);
        for (int j = 1; j < num; j++) {
            System.out.print(dot);
        }
        System.out.println();
        }
    
    }
 
    public static void challenge() {
        
    }


 
 /* 
 public static void mystery3() {
   int foo = 3;
   for (int number = 0; foo > number; number += 2) {
    foo++;
    System.out.println(foo + " " + number + " ");
} }

   public static void nested() {
    for (int number = 1; number < 6; number++) {
        for (int counter = 1; counter < 5; counter++) {
        System.out.print(number);
        }
    System.out.println();
    }
   }*/

 }