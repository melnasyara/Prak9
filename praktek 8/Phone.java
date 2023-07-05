public interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    public void powerOn();

    public void powerOff();

    public void volumeUp(int volume);

    public void volumeDown(int volume);
}