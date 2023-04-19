package LopConNguoiVaLopConKeThua;

public class People {
    private String name;
    private  boolean gender;
    private  int age;

    public People(){
        this.name = " Ten mac dinh";
        this.gender = false;
        this.age = age;
    }
    public People(String name, boolean gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public  String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void  eat(){
        System.out.println("People eating..");
    }
public void sleep(){
    System.out.println(" sleeping ....");

}
@Override
    public String toString(){
        return "A people with name: "
                + getName()
                + ", age: "
                + getAge()
                + " and gender: "
                + (isGender() ? "Nam" : "Nữ");

}

}
