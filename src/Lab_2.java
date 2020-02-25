import java.util.Scanner;
import static java.lang.System.out;

public class Lab_2 {
    Scanner in =new Scanner(System.in);
    Lab_2(){
        out.println("Введите сумму к получению");
        int n = in.nextInt();
        out.println("Введите кол-во купюр с наминалом 5000");
        int k1 = in.nextInt();
        out.println("Введите кол-во купюр с наминалом 1000");
        int k2 = in.nextInt();
        out.println("Введите кол-во купюр с наминалом 100");
        int k3 = in.nextInt();
        out.println("Введите кол-во с наминалом 30");
        int k4 = in.nextInt();
        bank:
        for (int i=0; i < k4+1 ; i++){
            for (int j=0; j<k3+1;j++){
                for (int l=0;l<k2+1;l++){
                    for (int m=0;m<k1+1;m++){
                        if (m*5000+l*1000+j*100+i*30==n){
                            out.println("5000 - "+m+", 1000 - "+l+", 100 - "+j+", 30 - "+i);
                            break bank;
                        }
                    }
                }
            }
            if (i==k4){
                out.println("Невозможно выдать сумму");
            }
        }

    }
}
