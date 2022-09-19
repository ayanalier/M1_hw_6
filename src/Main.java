public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.sethIt(100);
        boss.sethEalth(500);
        boss.weapon.setNameOfWeapon("Тризубец");
        boss.weapon.setTypeOfWeapon("Стрела");
        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setStrely(45);
        skeleton.sethEalth(100);
        skeleton.sethIt(20);
        skeleton.weapon.setTypeOfWeapon("Phys");
        skeleton.weapon.setNameOfWeapon("uron");
        System.out.println(skeleton.printInfo());
    }
}