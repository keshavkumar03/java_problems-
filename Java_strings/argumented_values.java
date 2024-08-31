package Java_strings;
/* agusticValues  */
public class argumented_values {

    public static String agusticValues(String input1) {  
        int[] total = new int[1];  // Create an array to hold the total sum, initialized to 0.
        dfs(input1, 1, String.valueOf(input1.charAt(0)), total);  // Start DFS with the first character.
        return String.valueOf(total[0]);  // Return the total sum as a string.
    }
    
    private static void dfs(String input, int index, String current, int[] total) {  
        if (index == input.length()) {  
            total[0] += evaluateExpression(current);  // If we reach the end, evaluate and add the expression.
            return;  
        }
        
        dfs(input, index + 1, current + '+' + input.charAt(index), total);  // Option 1: Add '+' and recurse.
        dfs(input, index + 1, current + input.charAt(index), total);  // Option 2: Just append the character and recurse.
    }
    
    private static int evaluateExpression(String expression) {  
        String[] parts = expression.split("\\+");  // Split the expression by '+'.
        int sum = 0;  
        for (String part : parts) {  
            sum += Integer.parseInt(part);  // Convert each part to integer and add to sum.
        }
        return sum;  // Return the total sum.
    }

    public static void main(String[] args) {
        String input1 = "111";

        String output1 = agusticValues(input1);
        System.out.println("Output: " + output1);
    }
}
