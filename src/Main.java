import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.out;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        out.println("Выберите номер лабараторной");
        int ch=in.nextInt();
        if (ch==1){
            Lab_1 l1= new Lab_1();
        }
        else if (ch==2){
            Lab_2 l2= new Lab_2();
        }
    }
}
