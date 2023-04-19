package com.chuongtrinhhinhhoc;

public class Shape { //tao ra lop co ten la shape
    private String color = "green"; //khai bao thuoc tinh color vs gia tri mac dinh la mauxanh
    private boolean filled = true; // kb thuoc tinh filled vs gia tri mac dinh laf true

    public Shape() { // constructor khoong tham so
    }

    public Shape(String color, boolean filled) { // co tham so
        this.color = color;
        this.filled = filled;
    }
    // getter,setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
  //ke thua phuog thuc to string tu lop object, ghi de phuong thuc de hien thi thong tin cua  doi tuong shape
    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
