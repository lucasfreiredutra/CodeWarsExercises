/*
Write a function that takes an array of words and smashes them together into a sentence and returns the sentence. You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word. Be careful, there shouldn't be a space at the beginning or the end of the sentence!

['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
 */

public class Exercise5 {

    public static void main(String[] args) {
        String[] words = {"Hello", "world"};
        System.out.println(smash(words));

    }

    public static String smash(String[] words) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i != words.length - 1) {
                stringBuilder.append(words[i] + " ");
            } else {
                stringBuilder.append(words[i]);
            }
        }

        return stringBuilder.toString();
    }
}
