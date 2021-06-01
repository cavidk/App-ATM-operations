
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ATM_Loops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //Islem == Bakiye girecek => Para cekme => Para yatirma.. 
        System.out.println("Verilenleri daxil edin: ");
        
        int bakiye = 1000;
        String islemler = "1.Islem : Bakiye Ogrenme\n"
                          +"2.Islem: Para Cekme\n"
                          +"3.Islem : Para Yatirma\n"
                          + "Cikis icin click to : Q.";
        
        System.out.println("****************************");
        System.out.println(islemler);
        System.out.println("****************************");
        
       while(true){
           System.out.print("Islemi seciniz: ");
           String islem = scanner.nextLine();
           
           if(islem.equals("Q")){
               System.out.print("Programdan cikiliyor...");
               break;
           }
           else if(islem.equals("1")) {
               System.out.println("Bakiyeniz: " + bakiye);
           }
           else if(islem.equals("2")){
               System.out.print("Cekmek istediyiniz tutar: ");
               int tutar = scanner.nextInt();
               scanner.nextLine();
                 if (bakiye - tutar < 0){
                  System.out.println("Yeterli bakiye yok.." + bakiye);
              }  else {
                  bakiye -= tutar;
                  System.out.println("Yeni bakiye.." + bakiye);
              }
           }
           else if(islem.equals("3")){
               System.out.println("Yatirmak istediginiz miktar: ");
               int miktar = scanner.nextInt();
               scanner.nextLine();
               
               bakiye += miktar;
               System.out.println("Yeni bakiyeniz: " + bakiye);
           }
           else{
               System.out.println("Gecersiz islem...");
           }
       }
       
        
    }
}
