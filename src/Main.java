
public class Main
{
    public static void main(String args[])
    {
        int foundRadius = 1;
        double[] arr = new double[2];

        notifyUser(foundRadius, arr);

    }

    public static double[] generateCoord(double arr[])
    {
        double xCoor = (double) (Math.random() * 99 + 1);
        double yCoor = (double) (Math.random() * 99 + 1);


        arr[0] = xCoor;
        arr[1] = yCoor;

        return arr;

    }

    public static void notifyUser(int radius, double arr[])
    {
        if (radius < 5)
        {
            generateCoord(arr);
            System.out.println("Someone walked past your device!");
            for (int i = 0; i < 2; i++)
                System.out.println(arr[i] + "\n");

        }

    }
}
