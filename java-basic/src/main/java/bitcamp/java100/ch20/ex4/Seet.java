package bitcamp.java100.ch20.ex4;

public class Seet {
    String type;
    boolean heat;
    boolean autoControl;
    
    public Seet() {
        System.out.println("Seet()");
    }

    @Override
    public String toString() {
        return "Seet [type=" + type + ", heat=" + heat + ", autoControl=" + autoControl + "]";
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHeat() {
        return heat;
    }

    public void setHeat(boolean heat) {
        this.heat = heat;
    }

    public boolean isAutoControl() {
        return autoControl;
    }

    public void setAutoControl(boolean autoControl) {
        this.autoControl = autoControl;
    }
    
    
}
