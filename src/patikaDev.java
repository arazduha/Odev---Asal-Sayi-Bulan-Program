import java.util.Scanner;
public class patikaDev {
    static void power(){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n1 = input.nextInt();
        if (n1>=2){
            int syc = 0;
            int i = 2;
            while (i<n1){
                if (n1%i==0){
                    syc++;
                }
                i++;
            }
            if (syc == 0) {
                System.out.println(n1 + " sayisi ASALDIR !");
            } else {
                System.out.println(n1 + " sayisi ASAL degildir !");
            }
        } else {
            System.out.println("1'den buyuk bir deger giriniz.");
        }
    }

    public static void main(String[] args) {
        power();
    }
}

