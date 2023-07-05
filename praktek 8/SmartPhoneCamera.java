public abstract class SmartPhoneCamera extends SmartPhone implements Camera{
 
    @Override
    public void openCamera(){
        System.out.println("Kamera dibuka...");
    }

    @Override
    public void takepicture(){
        System.out.println("Foto diambil...");
    }

    public abstract void savePicture();
}
