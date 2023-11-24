package Poly;

public class Primate {
    public boolean hasHair() {
        return true;
    }

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        Primate primate = lemur;
        System.out.println(primate.hasHair());

        Lemur l2 = (Lemur)primate;
        System.out.println(l2.age);

    }
}

interface HasTail {
    public boolean isTailStriped();
}

class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;
}




