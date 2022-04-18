import java.util.Scanner;

public class UsAlma {
    static int usAlma(int alt,int us){
        if (us<=0){
            return 1;

        }
        int result =1;
        for (int i = 0;i<us; i++){
            result*=alt;
        }
        return result;

    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Alt giriniz: ");
        int a = inp.nextInt();

        System.out.print("Us giriniz: ");
        int b = inp.nextInt();
        System.out.println(a+"^"+b+"="+usAlma(a,b));
    }
}
