public class LinkedList<K,V> {
    MapNode<K,V> head;

    // Add node
    public void add(K key, V value) {

        // If key already exists -> increment
        MapNode<K, V> temp = head;

        while (temp != null) {

            if (temp.key.equals(key)) {

                Integer count =
                        (Integer) temp.value;

                temp.value = (V) Integer.valueOf(count + 1);

                return;
            }

            temp = temp.next;
        }

        // Add new node
        MapNode<K, V> newNode =
                new MapNode<>(key, value);

        newNode.next = head;

        head = newNode;
    }
    // Display
    public void display() {

        MapNode<K, V> temp = head;

        while (temp != null) {

            System.out.println(
                    temp.key + " -> " + temp.value
            );

            temp = temp.next;
        }
    }
}
