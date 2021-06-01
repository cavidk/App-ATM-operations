
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
public class YoxlamaAtm {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Verilenleri daxil edin: ");
        String islemler = "1.Islem : Bakiye Ogrenme\n"
                          +"2.Islem: Para Cekme\n"
                          +"3.Islem : Para Yatirma\n"
                          + "Cikis icin click to : Q.";
     String transfer = "4.Islem: Transfer etme.\n";                   
        
        System.out.println("****************************");
        System.out.println(islemler);
        System.out.println(transfer);
        System.out.println("****************************");
        int bakiye = 1000;
        
        while(true){
            System.out.print("Islemi secin: ");
            String islem = scanner.nextLine();
        if (islem.equals("Q")){
            System.out.println("Program sonlandiriliyor! Biraz bekleyin.");
            scanner.nextLine();
            break;
        }
        else if(islem.equals("1")){
            System.out.print("Bakiyeniz: " + bakiye);
            scanner.nextLine();
        }
        else if(islem.equals("2")){
            System.out.print("Cekmek istediyiniz para tutarini giriniz: ");
            int tutar = scanner.nextInt();
            scanner.nextLine();
            
            if (bakiye - tutar <0 ){
                System.out.println("Hesabinizda yeterli miktar yok. Lutfen bakiyenizi kontrol edip yeniden deneyin veya hesabinizi arttirin!" + bakiye);
            }else{
                   //Hesabimizi yeniliyoruz...
                   
                bakiye -= tutar;
                System.out.println("Yeni bakiye: " + bakiye);
          }
        }else if(islem.equals("3")){
            System.out.print("Yatirmak istediyiniz para miktarini giriniz: " + bakiye);
            int miktar = scanner.nextInt();
            scanner.nextLine();
     
        //Hesabimizi kontrol ediyoruz burada;
   
                bakiye +=miktar;
            System.out.println("Bakiyeniz yanilendi: " + bakiye);
           
            
            //Transfer emeliyyati
            
        }else if(islem.equals("4")){
            System.out.print("Baska hesaba yatiracaginiz para: ");
            int tr = scanner.nextInt();
            
            if (bakiye - tr <0 ){
                System.out.println("Hesabinizda transfer icin gerekli miktar yok. Lutfen bakiyenizi kontrol edip yeniden transfer isteyinizi deneyin.." + bakiye);
            }else{
                   //Hesabimizi yeniliyoruz...
                   
                bakiye -= tr;
                System.out.println(" Transfer basrili.. \nYeni bakiye: " + bakiye);
          }
        }
        else {
            System.out.println("Islem geceersiz.Yeniden deneyin lutfen..");
        }
       }
    }
}
