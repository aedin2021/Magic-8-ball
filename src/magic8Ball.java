import java.util.Scanner;

public class magic8Ball {


    public static void main (String[] args){
        /*<>==&& if(){ *if statement*} 10 (5p) (5n) 0-100*/
        Scanner key;
        key = new Scanner(System.in);
        String q;
        int num;




        System.out.println("Ask any question.");
        q = key.nextLine();
        num =  (int)(Math.random()*100);
        if (num==0){System.out.print("You found the secret answer this will tell you the truth, Bush did 9/11.");
        }else if (num<10){System.out.print("Your going to ace it.");
        }else if (num<20){System.out.print("It was planned to fail.");
        }else if (num<30){System.out.print("It will be fine.");
        }else if (num<40){System.out.print("Only time will tell.");
        }else if (num<50){System.out.print("Yes.");
        }else if (num<60){System.out.print("No.");
        }else if (num<70){System.out.print("It will happen.");
        }else if (num<80){System.out.print("You can do it.");
        }else if (num<90){System.out.print("It was never meant to be discovered.");
        }else if (num<100){System.out.print("Never.");}












    }


}
