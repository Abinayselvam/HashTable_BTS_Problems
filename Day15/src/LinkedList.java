public class LinkedList<K, V> {

    MapNode<K, V> head;

    // Add or update
    public void add(K key, V value) {

        MapNode<K, V> temp = head;

        while (temp != null) {

            if (temp.key.equals(key)) {

                Integer count =
                        (Integer) temp.value;

                temp.value =
                        (V) Integer.valueOf(count + 1);

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

    // Remove node
    public void remove(K key) {

        if (head == null) {
            return;
        }

        // Remove head
        if (head.key.equals(key)) {

            head = head.next;
            return;
        }

        MapNode<K, V> temp = head;

        while (temp.next != null) {

            if (temp.next.key.equals(key)) {

                temp.next = temp.next.next;
                return;
            }

            temp = temp.next;
        }
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