/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package septiarakurnia21103010.phoneuser;

import java.util.Scanner;

/**
 *
 * @author admin
 * Septiara 21103010
 */
public class TrialPhone {
    public void choosePhone(String aksi){
        Scanner input = new Scanner(System.in);
        PhoneUser user;
        boolean condition = true;
        while (condition){
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("Pilih Jenis Hp Anda ");
            System.out.println("[1] Xiaomi");
            System.out.println("[2] Iphone");
            System.out.println("[3] Samsung");
            System.out.println("[4] Oppo");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi > ");
            aksi = input.nextLine();

            if(aksi.equalsIgnoreCase("1")){
                Phone redmiNote8 = new Xiaomi();
                user = new PhoneUser(redmiNote8);
                user.turnOnThePhone();
                user.onPhone(user, aksi, redmiNote8);
            }else if(aksi.equalsIgnoreCase("2")){
                Phone iPhone11Pro = new iPhone();
                user = new PhoneUser(iPhone11Pro);
                user.turnOnThePhone();
                user.onPhone(user, aksi, iPhone11Pro);
            }else if(aksi.equalsIgnoreCase("3")){
                Phone SamsungXFlip = new Samsung();
                user = new PhoneUser(SamsungXFlip);
                user.turnOnThePhone();
                user.onPhone(user, aksi, SamsungXFlip);
            }else if(aksi.equalsIgnoreCase("4")){
                Phone OppoReno3 = new Samsung();
                user = new PhoneUser(OppoReno3);
                user.turnOnThePhone();
                user.onPhone(user, aksi, OppoReno3);
            }else if(aksi.equalsIgnoreCase("0")){
                System.exit(0);
            }else{
                System.out.println("Aksi Salah!");
            }
        }
    }
    public static void main(String[] args) {
        String aksi = null;
        TrialPhone saya = new TrialPhone();
        saya.choosePhone(aksi);
    }
}
