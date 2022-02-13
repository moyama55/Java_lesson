public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;
    void heal(Hero h) {
        int basePoint = 10;
        wand.setPower(3.5);
        int recovPoint = (int)(basePont * this.wand.getPower(););
        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint +"回復した");
    }
}