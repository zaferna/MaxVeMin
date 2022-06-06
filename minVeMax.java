import java.util.Scanner;

public class minVeMax {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int n,i,s,max,min;
        System.out.print("Kac Adet Sayi Girilecek :");
        n = inp.nextInt();
        s=0;
        max=0;
        min=0;

        for(i=1;i<=n;i++){
            System.out.print(i+". Sayiyi Giriniz :");
            s=i;
            s= inp.nextInt();
            if(i==1){
                max=s;
                min=s;
            }


            if(s>=max){
                max=s;
            } else if (s<=min) {
                min=s;

            }


        }
        System.out.println("En Kucuk Sayi:"+min);
        System.out.print("En Buyuk Sayi:"+max);



    }
}
