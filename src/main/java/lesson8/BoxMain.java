package lesson8;

public class BoxMain {
    public static void main(String[] args) {
        Box mybox = new Box();
        Box cube = new Box();
        Box parallelepiped = new Box();

        cube.width = 10;
        cube.height = 10;
        cube.depth = 10;

        parallelepiped.width = 10;
        parallelepiped.height = 20;
        parallelepiped.depth = 15;

        cube.getVolume();
        parallelepiped.getVolume();
    }
}
