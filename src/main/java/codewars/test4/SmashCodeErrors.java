package codewars.test4;

public class SmashCodeErrors {

    // Imad ALILAT /
    // We want to get the longest Word and it's length.

    public static int findLongest(final String str) {
        String[] strChunks = str.split(" ");
        int size = 0;
        for(String word : strChunks){
            size = Math.max(word.length(), size);
        }
        return size;
    }

}
