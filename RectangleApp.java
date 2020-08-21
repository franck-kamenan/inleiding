package be.intecbrussel.hoofdstuk8.inleiding;

public class RectangleApp
{
    public static void main(String[] args)
    {
        System.out.println("The rectangle object.");
        Rectangle leRectangle = new Rectangle();
        leRectangle.width = 10;
        leRectangle.height = 5;
        System.out.println(leRectangle.width);
        System.out.println(leRectangle.height);
    }
}
