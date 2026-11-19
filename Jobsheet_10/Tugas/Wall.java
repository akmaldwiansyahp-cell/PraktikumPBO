package Jobsheet_10.Tugas;

public class Wall implements Damageable{
    private int durability;

    public Wall(int dur){
        this.durability = dur;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }

    @Override
    public void damaged() {
        durability -= 8;
    }

    public String getWallInfo(){
        String info = "";

        info += "Wall Durability: " + getDurability();

        return info;
    }
}
