package id.ac.polinema.recyclerview.models;

public class TeamLatihan {

    public String logo;
    public  String name;
    public String keterangan;
    public TeamLatihan(String logo, String name, String keterangan) {
        this.logo = logo;
        this.name= name;
        this.keterangan = keterangan;
    }
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

}
