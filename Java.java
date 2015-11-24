package javaapplication1;
import java.io.*;
public class Java {
    public static void main (String []args) throws Exception{
        BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
        int a1, a2;
        a1=3;a2=3;
        while ((a1!=0)&&(a1!=1)){
        System.out.print("Masukkan nilai p (1 atau 0) : ");
        a1 = Integer.parseInt(masuk.readLine());
        if ((a1!=0)&&(a1!=1))
            System.out.println("Pastikan input yang anda masukkan benar (1 atau 0)\n");
        }
        while ((a2!=0)&&(a2!=1)){
        System.out.print("Masukkan nilai q (1 atau 0) : ");
        a2 = Integer.parseInt(masuk.readLine());
        if ((a2!=0)&&(a2!=1))
            System.out.println("Pastikan input yang anda masukkan benar (1 atau 0)\n");
        }
        String stpil="0";
        while (!stpil.equals("5")) {
            System.out.println("=================================");
            System.out.println("         Daftar Proposisi        ");
            System.out.println("=================================");
            System.out.println(" 1. Konjungsi");
            System.out.println(" 2. Disjungsi");
            System.out.println(" 3. Implikasi");
            System.out.println(" 4. Biimplikasi");
            System.out.println(" 5. Keluar \n");
            System.out.print("Masukkan pilihan : ");
            stpil = masuk.readLine();
            switch (stpil) {
                case "1":
                    if ((a1==1) && (a2==1))
                        System.out.println( "Proposisi " + a1+" ^ "+a2 + " bernilai benar. \n");
                    else
                        System.out.println( "Proposisi " + a1+" ^ "+a2 + " bernilai salah. \n");
                    break;
                case "2":
                    if ((a1==0) && (a2==0))
                        System.out.println( "Proposisi " + a1+" v "+a2 + " bernilai salah. \n");
                    else
                        System.out.println( "Proposisi " + a1+" v "+a2 + " bernilai benar. \n");
                    break;
                case "3":
                    if ((a1==1) && (a2==0))
                        System.out.println( "Proposisi " + a1+" --> "+a2 + " bernilai salah. \n");
                    else
                        System.out.println( "Proposisi " + a1+" --> "+a2 + " bernilai benar. \n");
                    break;
                case "4":
                    if (a1==a2)
                        System.out.println( "Proposisi " + a1+" <--> "+a2 + " bernilai benar. ");
                    else
                        System.out.println( "Proposisi " + a1+" <--> "+a2 + " bernilai salah. ");
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Pastikan input yang anda masukkan benar (1-5)\n\n");
                    break;
            }
        }
    }
}
