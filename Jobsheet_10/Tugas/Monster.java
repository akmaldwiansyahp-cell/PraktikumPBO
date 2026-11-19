package Jobsheet_10.Tugas;

public abstract class Monster implements Damageable{
    protected int health;
    protected int level;

    public abstract void heal();

    public abstract void damaged();

    public String getMonsterInfo(){
        String info = "";

        info += "Health: " + health + "\n";
        info += "level: " + level + "\n";

        return info;
    }
    
}
