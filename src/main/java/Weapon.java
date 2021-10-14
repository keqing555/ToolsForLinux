import java.io.Serializable;

public class Weapon implements Serializable {
    private int wid;
    private String wname;

    public Weapon() {
    }

    public Weapon(int wid, String wname) {
        this.wid = wid;
        this.wname = wname;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "wid=" + wid +
                ", wname='" + wname + '\'' +
                '}';
    }
}
