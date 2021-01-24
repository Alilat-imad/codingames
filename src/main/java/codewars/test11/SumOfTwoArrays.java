package codewars.test11;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int res = SumOfTwoArrays.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6});
        System.out.println(res);
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2){
        int result = 0;
        for (int nb:
             arr1)
            result += nb;

        for (int nb:
                arr2)
            result += nb;
        return result;
    }

    }
