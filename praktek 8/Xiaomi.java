public  class Xiaomi extends SmartPhoneCamera {

    private String merk = "Xiaomi";
    @Override
public void savePicture(){
     System.out.println(merk + ",Foto disimpan...");

}

@Override
public String getMerk(){
    return merk;
}

}