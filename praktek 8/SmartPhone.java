public abstract class SmartPhone implements Phone, Browser{
    
    private int volume;
    private boolean isPowerOn;

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone dihidupkan...");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan...");
    }

    @Override
    public void volumeUp(int volume) {
        System.out.println("Volume naik... sebesar" + volume + "");
        this.volume = volume;
    }

    @Override
    public void volumeDown(int volume) {
        System.out.println("Volume turun... sebesar" + volume + "");
        this.volume = volume;
    }

   @Override
   public void openBrowser(){
    System.out.println("Browser dibuka...");
   }

   @Override
   public void closeBrowser(){
    System.out.println("Browser ditutup...");
   }

   public abstract String getMerk();
}

