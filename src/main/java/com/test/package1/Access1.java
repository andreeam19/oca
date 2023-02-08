package com.test.package1;

public class Access1 {
    //default-  poate avea acces oricine din  acelasi pachet
    //public-acceasi chestie doar ca scrii private si te ajuta
    //private-ai acces doar in clasa respectiva
    // protected-ai acces la orice din acelasi pachet doar
               //-exceptie e daca o clasa are extends
    //int hours=3;
   // int minutes=47;
    int hours=3;
    protected int minutes=47;
//diferenta dintre default si public e ca scii public inainte.
    protected int getHours(){
        return hours;

    }
}
