package D01Array.A01Basics;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = i;
            System.out.print(String.format("%d ",arr[i]));
        }
        System.out.println("\n");

        int[] scores = new int[]{100, 99, 66};
        for (int score : scores)
        {
            System.out.println(score);
        }
        System.out.println("\n");

        scores[0] = 98;
        for (int i = 0; i < scores.length; i++)
        {
            System.out.println(scores[i]);
        }
    }
}
