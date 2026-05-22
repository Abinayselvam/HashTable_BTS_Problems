public class Main {

    public static void main(String[] args) {

        System.out.println(
                "Welcome to Hash Table Program"
        );

        String paragraph =
                "Paranoids are not paranoid because they are paranoid " +
                        "but because they keep putting themselves deliberately " +
                        "into paranoid avoidable situations";

        paragraph =
                paragraph.toLowerCase();

        String[] words =
                paragraph.split(" ");

        HashTable<String, Integer> hashTable =
                new HashTable<>();

        // Add words
        for (String word : words) {

            hashTable.add(word, 1);
        }

        System.out.println(
                "\nBefore Removing:"
        );

        hashTable.display();

        // Remove avoidable
        hashTable.remove("avoidable");

        System.out.println(
                "\nAfter Removing 'avoidable':"
        );

        hashTable.display();
    }
}