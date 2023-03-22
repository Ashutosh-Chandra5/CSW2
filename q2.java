// q2: WAP which will give the position of an element in a given array

public class q2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int key = 3;
        int temp = 0;
        int flag = 0;
        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i] == key)
            {
                flag = 1;
                temp = i;
                break;
            }

            else
            {
                flag = 0;
            }
        }

        if (flag == 1)
        {
            System.out.println("The element is found at index: " + temp);
        }

        if (flag == 0)
        {
            System.out.println("Element is not found");
        }
    }
}
