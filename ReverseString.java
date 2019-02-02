public class ReverseString {
    public String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] array = s.split(" ");

        for (int i = array.length - 1; i >= 0; i--) {
            String newStr = array[i].trim();
            if (newStr.isEmpty()) {
                continue;
            }

            stringBuilder.append(newStr);
            stringBuilder.append(" ");
        }

        return stringBuilder.toString().trim();
    }
}
