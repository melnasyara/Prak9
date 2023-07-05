public class iPhone extends SmartPhoneCamera {

    private String merk = "Iphone";

    @Override
    public void savePicture(){
         System.out.println(merk + ",Foto disimpan...");
    }

    @Override
    public String getMerk (){
        return merk;
    }
}
