package Collections;

public class ogrenci implements Comparable<personel> {

    String name;
    String ders;

    public String getName() {
        return name;
    }

    public String getDers() {
        return ders;
    }

    public void setDers(String ders) {
        this.ders = ders;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ogrenci{" +
                "name='" + name + '\'' +
                ", ders='" + ders + '\'' +
                '}';
    }


    @Override
    public int compareTo(personel o) {
        return 0;

    }
}
