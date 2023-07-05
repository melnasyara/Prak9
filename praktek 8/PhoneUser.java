public class PhoneUser {
    SmartPhone smartPhone;
    SmartPhoneCamera smartPhoneCamera;

    public PhoneUser(SmartPhone smartPhone){
        this.smartPhone = smartPhone;
    }
    public PhoneUser(SmartPhoneCamera smartPhoneCamera){
        this.smartPhoneCamera = smartPhoneCamera;
        this.smartPhone = smartPhoneCamera;
    }

    public void turnOnThePhone() {
        smartPhone.powerOn();
    }

    public void turnOffThePhone() {
        smartPhone.powerOff();
    }

    public void makePhoneLouder(int volume) {
        smartPhone.volumeUp(volume);
    }

    public void makePhoneSilent(int volume) {
        smartPhone.volumeDown(volume);
    }

    public void closeBrowser(){
        smartPhone.closeBrowser();
    }

    public void openBrowser(){
        smartPhone.closeBrowser();
    }

    public String getPhoneMerk(){
        return smartPhone.getMerk();
    }

    public void openCameraPhone(){
        smartPhoneCamera.openCamera();
    }
    
    public void savePicturePhone(){
        smartPhoneCamera.savePicture();
    }

    public void takePicturePhone(){
        smartPhoneCamera.takepicture();
    }
}
