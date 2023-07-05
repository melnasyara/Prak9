public class Main {
    public static void main(String[] args) {

        SmartPhoneCamera xiaomi = new Xiaomi();
        SmartPhoneCamera iphone = new iPhone();
        SmartPhoneCamera samsung = new Samsung();
        
        SmartPhone oppo = new Oppo();
        
        PhoneUser hpHudaa = new PhoneUser(oppo);
        
        String merk = hpHudaa.getPhoneMerk();
        System.out.println("Merk HP:"+merk);
        hpHudaa.turnOnThePhone();
        hpHudaa.makePhoneLouder(75);
        hpHudaa.makePhoneSilent(50);
        hpHudaa.openBrowser();
        hpHudaa.closeBrowser();
        try{
        hpHudaa.openCameraPhone();
        hpHudaa.takePicturePhone();
        hpHudaa.savePicturePhone();
        }catch(Exception e){
            System.out.println("Error : hp" +merk+" tidak memiliki kamera");
        }
        hpHudaa.turnOffThePhone();
    }

}
