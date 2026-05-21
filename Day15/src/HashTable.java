public class HashTable<K, V> {

    private final int size = 11;

    LinkedList<K, V>[] table;

    public HashTable() {

        table = new LinkedList[size];

        for (int i = 0; i < size; i++) {

            table[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int hash(K key) {

        return Math.abs(
                key.hashCode()
        ) % size;
    }

    // Add word
    public void add(K key, V value) {

        int index = hash(key);

        table[index].add(key, value);
    }

    // Remove word
    public void remove(K key) {

        int index = hash(key);

        table[index].remove(key);
    }

    // Display
    public void display() {

        for (int i = 0; i < size; i++) {

            if (table[i].head != null) {

                System.out.println(
                        "\nBucket " + i + ":"
                );

                table[i].display();
            }
        }
    }
}