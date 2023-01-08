public class test {
    public static void main(String[] args) {
        String words = "Hello   World!";
        String[] wordcount = words.split("   ");
        for (String word : wordcount) {
            System.out.println(word);
        }
    }
}