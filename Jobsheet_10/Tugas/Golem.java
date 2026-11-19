package Jobsheet_10.Tugas;

public class Golem extends Monster{
    public Golem(int health, int level){
        super.health = health;
        super.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            super.health += super.health * 20 / 100;
        }else if (level == 2) {
            super.health += super.health * 30 / 100;
        }else if (level == 3) {
            super.health += super.health * 45 / 100;
        }else{
            System.out.println("Level Tidak Tersedia");
        }        
    }

    @Override
    public void damaged() {
        super.health -= super.health * 15 /100;        
    }

    @Override
    public String getMonsterInfo() {
        String info = "";

        info += "Golem Data: ";
        info += "\n"+super.getMonsterInfo();

        return info;
    }
}
