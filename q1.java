// q1: WAP to calculate the sum of all the elements in an integer array

public class q1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int sum = 0;
        for (int i = 0; i<arr.length; i++)
        {
            sum = sum+arr[i];
        }

        System.out.println("The sum of all elements in array is: " + sum);
    }
}
