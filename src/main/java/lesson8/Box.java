package lesson8;

public  class Box {
    public double width;//ширина
    public double height;//высота
    public double depth;//глубина
    public Box() {
    width = 10;
    height = 10;
    depth = 10;
    }
    public String getVolume() {
        return "Объем равен: " + (width*height*depth);

    }
    public void printInfo(){
        System.out.println(getVolume());
    }
}
