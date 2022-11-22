/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package septiarakurnia21103010.phoneuser;

import java.util.Scanner;


/**
 *
 * @author admin
 * Septiara 21103010
 */
public class PhoneUser {
    private Phone phone;
    public PhoneUser(Phone phone){
        this.phone = phone;
    }
    void turnOnThePhone(){
        this.phone.PowerOn();
    }
    void turnOffThePhone(){
        this.phone.PowerOff();
    }
    void makePhoneLouder(){
        this.phone.VolumeUp();
    }
    void makePhoneSilent(){
        this.phone.VolumeDown();
    }
    public void onPhone (PhoneUser user, String aksi, Phone phone){
        user = new PhoneUser(phone);
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        while (condition){
            System.out.println("== APLIKASI INTERFACE ==");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[5] Ganti Handphone");
            System.out.println("[0] Keluar");
            System.out.println("=========================");
            System.out.println("Pilih Aksi > ");
            aksi = input.next();
            
            if(aksi.equalsIgnoreCase("1")){
                user.turnOnThePhone();
            }else if(aksi.equalsIgnoreCase("2")){
                user.turnOffThePhone();
            }else if(aksi.equalsIgnoreCase("3")){
                user.makePhoneLouder();
            }else if(aksi.equalsIgnoreCase("4")){
                user.makePhoneSilent();
            }else if(aksi.equalsIgnoreCase("5")){
                TrialPhone pt = new TrialPhone();
                pt.choosePhone(aksi);
            }else if(aksi.equalsIgnoreCase("0")){
                System.exit(0);
            }else{
                System.out.println("Aksi Salah!");
            }
        }
    }
}
