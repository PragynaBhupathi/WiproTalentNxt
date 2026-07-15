class Box{
    double width,height,depth;
    Box(double w,double h,double d) {
        width = w;
        height = h;
        depth = d;
    }
    double getVolume() {
        return width * height * depth;
    }
}
public class HOA1 {
	public static void main(String[] args) {
        Box box1 = new Box(6,5,4);
        System.out.println("Width  : " + box1.width);
        System.out.println("Height : " + box1.height);
        System.out.println("Depth  : " + box1.depth);
        System.out.println("Volume of the box = " + box1.getVolume());
    }
}