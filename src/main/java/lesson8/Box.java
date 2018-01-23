package lesson8;

public  class Box {
    public double width;//ширина
    public double height;//высота
    public double depth;//глубина

    public void volume() {
        System.out.println("Объем равен: ");
        System.out.println(width*height*depth);
    }
}
