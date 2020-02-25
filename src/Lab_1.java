import java.util.Scanner;
import static java.lang.System.out;
import java.util.Stack;

public class Lab_1 {
    String scobe;
    Stack <Character> scobes= new Stack<>();
    Scanner in =new Scanner(System.in);
    Lab_1(){
        scobe = in.nextLine();
        for (int i = 0; i < scobe.length(); i++){
            if (scobe.charAt(i) == ')') {
                if (scobes.peek() == '('){
                    scobes.pop();
                }
                else{
                    break;
                }
            }
            else if (scobe.charAt(i) == '}') {
                if (scobes.peek() == '{'){
                    scobes.pop();
                }
                else{
                    break;
                }
            }
            else if (scobe.charAt(i) == ']') {
                if (scobes.peek() == '['){
                    scobes.pop();
                }
                else{
                    break;
                }
            }
            else{
                scobes.push(scobe.charAt(i));
            }
        }
        if (scobes.empty()){
            out.print("Right");
        }
        else{
            out.print("Wrong");
        }
    }
}
