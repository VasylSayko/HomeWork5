class Hero {
    private String name;
    private int hp;

    public Hero() {
        name = "Paratrooper";
        hp = 100;
    }

    public Hero(String name, int hp) {
        this.name = name;
        if (hp >= 10 && hp <= 200)
        this.hp = hp;
        else
            this.hp=200;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}

class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero("Stranger", 260);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());
    }
}