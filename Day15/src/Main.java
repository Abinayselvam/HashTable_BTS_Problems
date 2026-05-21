public class Main {

    public static void main(String[] args) {
        System.out.println(
                "Welcome to Hash Table Program"
        );

        String paragraph =
                "Paranoids are not paranoid because they are paranoid " +
                        "but because they keep putting themselves deliberately " +
                        "into paranoid avoidable situations";

        // Convert to lowercase
        paragraph = paragraph.toLowerCase();

        // Split into words
        String[] words =
                paragraph.split(" ");

        HashTable<String, Integer> hashTable =
                new HashTable<>();

        // Add words
        for (String word : words) {

            hashTable.add(word, 1);
        }

        // Display result
        System.out.println(
                "\nWord Frequencies:"
        );

        hashTable.display();
    }
}