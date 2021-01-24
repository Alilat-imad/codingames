package codewars.test6;

public class ShortestWord {
    public static void main(String[] args) {
        ShortestWord.getShortedStringWordLength("Bonjour Everyone My Name is Imad ALILAT");
    }

    public static int getShortedStringWordLength(String input){
        // First we have to convert the input To String[]
        String[] chu = input.split(" ");
        int length = input.length();
        String shortestWord = "";
        for(String word : chu)
        {
            if(word.length() < length) {
                length = word.length();
                shortestWord = word;
            }
        }
        System.out.println("The Shortest word is : '" + shortestWord + "' And it's length is : "  + length);
        return length;
    }

}
