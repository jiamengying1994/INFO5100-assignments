import java.util.HashMap;

public class Assignment4 {

    public int findCharacter(String str){
        if(str==null || str.length()==0){
            return -1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i< str.length();i++){
            char target = str.charAt(i);
            if (map.containsKey(target)){
                map.put(target, map.get(target)+1);
            }
            else{
                map.put(target, 1);
            }
        }
        for (int i=0; i< str.length();i++){
            char target =str.charAt(i);
            if(map.get(target)==1){
                return i;
            }
        }
        return -1;
    }


    public int addDigits(int num){
        return (num-1)%9+1;
    }

    public void moveZeros(int[] arr){
        int firstZeroIndex = 0;
        while (firstZeroIndex < arr.length && arr[firstZeroIndex] != 0) {
            firstZeroIndex++;
        }
        for (int j= firstZeroIndex+1; j< arr.length; j++){
            if (arr[j]!=0){
                int temp = arr[firstZeroIndex];
                arr[firstZeroIndex]=arr[j];
                arr[j]= temp;
                firstZeroIndex++;
            }
        }
    }

    public String findLongestPalindromicString( String string){
        if(string == null||string.length()<=1){
            return string;

        }

        int len = string.length();
        boolean[][] dp = new boolean[len][len];
        int maxlen = 1;
        String result = null;

        for(int l=0; l<len; l++){
            for (int i=0; i< len-1; i++){
                int j = i+1;
                if(string.charAt(i)== string.charAt(j)&&(j-i<=2||dp[i+1][j-1])){
                    dp[i][j] = true;

                    if (j-i+1> maxlen){
                        maxlen = j-i+1;
                        result =string.substring(i,j+1);
                    }
                }
            }
        }

        return result;


    }

    public void rotateMatrix(int[][] matrix) {

        int len = matrix.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len - 1 - j];
                matrix[i][len - 1 - j] = temp;
            }
        }
    }
}
