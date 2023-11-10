package strings;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("Khalil Rezgui Java Fundamentals");
    }

    public static void countWords(String string) {
        // FROM SCRATCH
        /*int count = 0;
        while (!string.isEmpty()) {
            int indexOfSpace = string.indexOf(" ");
            if (indexOfSpace != -1) {
                String word = string.substring(0, indexOfSpace);
                System.out.println(word);
                count++;
                string = string.substring(indexOfSpace + 1);
            } else {
                System.out.println(string);
                count++;
                string = "";
            }
        }
        System.out.println(count);*/

        // Split + Regex Method
        var words = string.split(" ");
        int count = words.length;

        for (var word : words){
            System.out.println(word);
        }
        String countMessage = String.format("Your sentence has %d words",count);
        System.out.println(countMessage);

    }
}
