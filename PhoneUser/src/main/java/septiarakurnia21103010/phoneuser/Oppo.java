/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package septiarakurnia21103010.phoneuser;

/**
 *
 * @author admin
 * Septiara 21103010
 */
public class Oppo implements Phone{
    private int volume;
    private boolean isPowerOn;
    
    public Oppo(){
        this.volume = 50;
    }
    public void PowerOn(){
        isPowerOn = true;
        System.out.println("SELAMAT DATANG");
    }
    public void PowerOff(){
        isPowerOn = false;
        System.out.println("SAMPAI JUMPA");
    }
    public int getVolume(){
        return this.volume;
    }
    public void VolumeUp(){
        if (isPowerOn){
            if(this.volume == MaxVolume){
                System.out.println("Volume "+getVolume()+"%");
            }
            else{
                this.volume += 10;
                System.out.println("Volume "+getVolume()+"%");
            }
        }else{
            System.out.println("Phone Mati");
        }
    }
    public void VolumeDown(){
        if(isPowerOn){
            if(this.volume == MinVolume){
                System.out.println("Volume "+getVolume()+"%");
            }else{
                this.volume -=10;
                System.out.println("Volume "+getVolume()+"%");
            }
        }else{
            System.out.println("Phone Mati");
        }
    }
}
