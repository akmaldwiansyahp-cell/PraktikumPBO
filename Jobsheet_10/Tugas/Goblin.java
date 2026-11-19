package Jobsheet_10.Tugas;

public class Goblin extends Monster{
    public Goblin(int health, int level){
        super.health = health;
        super.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            super.health += super.health * 15 / 100;
        }else if (level == 2) {
            super.health += super.health * 25 / 100;
        }else if (level == 3) {
            super.health += super.health * 35 / 100;
        }else{
            System.out.println("Level Tidak Tersedia");
        }
    }

    @Override
    public void damaged() {
        super.health -= super.health * 25 /100;
    }

    @Override
    public String getMonsterInfo() {
        String info = "";

        info += "Goblin Data: ";
        info += "\n"+super.getMonsterInfo();

        return info;
    }
}
