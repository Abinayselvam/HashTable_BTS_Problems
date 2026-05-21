public class Main {

    public static void main(String[] args) {

        System.out.println(
                "Welcome to Hash Table Program"
        );

        String sentence =
                "To be or not to be";

        String[] words =
                sentence.split(" ");

        HashTable<String, Integer> hashTable =
                new HashTable<>();

        for (String word : words) {

            hashTable.add(word, 1);
        }

        System.out.println("\nWord Frequencies:");

        hashTable.display();
    }
}