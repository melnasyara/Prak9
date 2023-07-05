public class Samsung extends SmartPhoneCamera {

   private String merk = "Samsung";

    @Override
    public void savePicture(){
        System.out.println(merk + ",Foto disimpan...");
    }

    @Override
    public String getMerk (){
        return merk;
    }
}
