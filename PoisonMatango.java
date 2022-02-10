public class PoisonMatango extends Matango{
    int poisonAttackCount = 5; 
    public PoisonMatango(char suffix){
        super(suffix);
    }
    public void Attack(Hero h){
        super.Attack(h);
        if (poisonAttackCount != 0) {
            System.out.println("さらに毒の胞子をばらまいた");
            int poisondamage = h.hp - h.hp / 5;
            System.out.println(poisondamage + "のダメージ");
        }
        poisonAttackCount -= 1;
    }
}  