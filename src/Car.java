public class Car {
    /*Car klassini yarating. Unda rangi, modeli, narxi, Avtomat yoki mexanik tuzilmaga ekanligi
    haqida informatsiya beruvchi atributlari mavjud bo’lsin.*/
    public void color(String color) {
        System.out.println(color);
    }

    public void model(String model) {
        System.out.println(model);
    }

    public void price(long price) {
        System.out.println(price);
    }

    public void isAutomatic(boolean isAutomatic) {
        if (isAutomatic) System.out.println("Avtomat");
        else System.out.println("Mexanika");
    }
}
