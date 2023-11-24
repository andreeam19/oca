package OOPIsFun;

public class Main {
    public static void main(String[] args) {
        Pen p=new Pen();

        System.out.println(p.color);
        System.out.println(p.point);
        System.out.println(p.type);

        System.out.println(p.clicked);

        p.click();

        System.out.println(p.clicked);

        System.out.println("-----------");
        System.out.println();

        Headphones h=new Headphones();

        System.out.println(h.charge);
        System.out.println(h.controls);
        System.out.println(h.color);

        System.out.println(h.power);
        h.powerOn();
        System.out.println(h.power);

        System.out.println();

        System.out.println(h.volume);
        h.volumeUp();
        System.out.println(h.volume);
        h.volumeDown();
        System.out.println(h.volume);
    }
}
