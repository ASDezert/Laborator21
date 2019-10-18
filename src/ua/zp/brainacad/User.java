package ua.zp.brainacad;

public class User {
    //Создать класс User с полями name, old и phone
    private String name;
    private int old;
    private String phone;

    public User(String name, int old, String phone) {
        this.name = name;
        this.old = old;
        this.phone = phone;
    }

    //Переопределить в классе User метод hashcode, Указав в нем только обработку поля name.
    @Override
    public int hashCode() { //Что-то вроде этого имеется ввиду? Тело метода я просто скопировал с интернета.
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
