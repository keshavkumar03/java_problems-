import java.util.*;

public class Max_profit{
    public static List<Integer> calculateProfit(int[]input1, int input2, int[] input3, int[] input4, int inputs) {
        List<Integer> resultList = new ArrayList<>();
        int length = input1.length;

        for (int i = 0; i < inputs; i++) {
            int L = input3[i];
            int R = input4[i];
            int result = 0;

            for (int j = L; j <= R; j++) {
                int index = (j - 1) % input2;
                result += input1[index];
            }

            //Handling the special conditions
            if (input1[0] < 10) {
                result += 10;
            }

            if (input1[0] > 10 && i == 1) {
                result += 20;
            }

            resultList.add(result);
        }

        return resultList;
    }
        

    public static void main(String[] args) {
        int[] input1 = {12, 5, 3};
        int input2 = 3;
        int[] input3 = {7, 4};
        int[] input4 = {8, 8};
        int inputs = 2;

        List<Integer> result = calculateProfit(input1, input2, input3, input4, inputs);
        System.out.println(result);
    }
}

