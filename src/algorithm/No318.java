package algorithm;

public class No318 {
    public int maxProduct(String[] words) {
        if (words == null || words.length == 0) return 0;
        int len = words.length;
        int[] value = new int[len];
        for (int i = 0; i < len; i++) for (int j = 0; j < words[i].length(); j++) value[i] |= 1 << (words[i].charAt(j) - 'a');

        int maxProduct = 0;
        for (int i = 0; i < len; i++) for (int j = i + 1; j < len; j++)
            if ((value[i] & value[j]) == 0 && words[i].length() * words[j].length() > maxProduct)
                maxProduct = words[i].length() * words[j].length();
        return maxProduct;
    }
}
