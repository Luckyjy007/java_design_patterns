package me.zbl.factory.my;

public interface NumberFactory  {

    Number parse(String str);
    static NumberFactoryImpl numberFactoryImpl = new NumberFactoryImpl();

    public static NumberFactoryImpl getFactory(){

        return numberFactoryImpl;
    }

}
