public class Toy {
    static int id;
    private String toy_id;
    private String name;
    private int frequency = 1; 
    private int volume = 1; 

    public Toy(String name, int frequency, int volume) {
        this.toy_id = ((Object) (++id)).toString();
        this.name = name;
        this.frequency = frequency;
        this.volume = volume;
    }

    public Toy(Toy toy) { 
        this.toy_id = toy.getToy_id();
        this.name = toy.getName();
        this.frequency = toy.getFrequency();
        this.volume = 1;
    }

    public String getToy_id() {
        return toy_id;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return name 
            + "/id" + toy_id 
            + "/frequency:" + frequency 
            + "/volume:" + volume;

    }
}