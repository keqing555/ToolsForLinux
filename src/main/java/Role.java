import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
//对象传输要实现序列化
public class Role implements Serializable {
    private int rid;
    private String rname;
    private String[] strings;
    private Weapon weapon;
    private List<Weapon> weaponList;
    private Set<Weapon> weaponSet;
    private Map<String, Weapon> weaponMap;

    public Role() {
    }

    public Role(int rid, String rname, String[] strings, Weapon weapon, List<Weapon> weaponList, Set<Weapon> weaponSet, Map<String, Weapon> weaponMap) {
        this.rid = rid;
        this.rname = rname;
        this.strings = strings;
        this.weapon = weapon;
        this.weaponList = weaponList;
        this.weaponSet = weaponSet;
        this.weaponMap = weaponMap;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public List<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(List<Weapon> weaponList) {
        this.weaponList = weaponList;
    }

    public Set<Weapon> getWeaponSet() {
        return weaponSet;
    }

    public void setWeaponSet(Set<Weapon> weaponSet) {
        this.weaponSet = weaponSet;
    }

    public Map<String, Weapon> getWeaponMap() {
        return weaponMap;
    }

    public void setWeaponMap(Map<String, Weapon> weaponMap) {
        this.weaponMap = weaponMap;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", strings=" + Arrays.toString(strings) +
                ", weapon=" + weapon +
                ", weaponList=" + weaponList +
                ", weaponSet=" + weaponSet +
                ", weaponMap=" + weaponMap +
                '}';
    }
}
