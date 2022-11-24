package entities;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion() {
    }

    public  Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    public void takeDamage(Champion other){
        if (this.armor < other.attack){
            this.life -= other.attack - this.armor;
        }else{
            this.life -= 1;
        }
    }
    public String status(){
        if(getLife() > 0){
            return getName() + ": " + getLife() + " de vida";
        }else {
            return getName() + ": " + " 0 de vida (morreu)";
        }
    }
}
