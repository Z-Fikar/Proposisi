package javaapplication1;
import java.io.*;
public class Java {
    public static void main (String []args) throws Exception{
        BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan nilai argumen 1 (1 atau 0) : ");
        int a1 = Integer.parseInt(masuk.readLine());
        System.out.print("Masukkan nilai argumen 2 (1 atau 0) : ");
        int a2 = Integer.parseInt(masuk.readLine());
        int pil=0;
        while (pil != 5) {
            System.out.println("=================================");
            System.out.println("         Daftar Proposisi        ");
            System.out.println("=================================");
            System.out.println(" 1. Konjungsi");
            System.out.println(" 2. Disjungsi");
            System.out.println(" 3. Implikasi");
            System.out.println(" 4. Biimplikasi");
            System.out.println(" 5. Keluar \n");
            System.out.print("Masukkan pilihan : ");
            pil = Integer.parseInt(masuk.readLine());
            switch (pil) {
                case 1:
                    if ((a1==1) && (a2==1))
                        System.out.println( "Proposisi " + a1+" ^ "+a2 + " bernilai benar. \n");
                    else
                        System.out.println( "Proposisi " + a1+" ^ "+a2 + " bernilai salah. \n");
                    break;
                case 2:
                    if ((a1==0) && (a2==0))
                        System.out.println( "Proposisi " + a1+" v "+a2 + " bernilai salah. \n");
                    else
                        System.out.println( "Proposisi " + a1+" v "+a2 + " bernilai benar. \n");
                    break;
                case 3:
                    if ((a1==1) && (a2==0))
                        System.out.println( "Proposisi " + a1+" --> "+a2 + " bernilai salah. \n");
                    else
                        System.out.println( "Proposisi " + a1+" --> "+a2 + " bernilai benar. \n");
                    break;
                case 4:
                    if (a1==a2)
                        System.out.println( "Proposisi " + a1+" <--> "+a2 + " bernilai benar. ");
                    else
                        System.out.println( "Proposisi " + a1+" <--> "+a2 + " bernilai salah. ");
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
    }
}
