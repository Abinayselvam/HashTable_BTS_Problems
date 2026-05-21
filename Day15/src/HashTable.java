public class HashTable<K, V> {

    private final int size = 10;

    LinkedList<K, V>[] table;

    public HashTable() {

        table = new LinkedList[size];

        for (int i = 0; i < size; i++) {

            table[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int hash(K key) {

        return Math.abs(key.hashCode()) % size;
    }

    // Add word
    public void add(K key, V value) {

        int index = hash(key);

        table[index].add(key, value);
    }

    // Display all
    public void display() {

        for (LinkedList<K, V> list : table) {

            list.display();
        }
    }
}