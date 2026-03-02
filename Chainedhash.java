public class Chainedhash {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;


        }

        static class Hashtable {
            private Node[] table;
            private int size;

            public Hashtable(int size) {
                this.size = size;
                table = new Node[size];

            }

            private int hash(int key) {
                return key % size;
            }

            public void insect(int key) {
                int index = hash(key);
                Node newNode = new Node(key);
                newNode.next = table[index];
                table[index] = newNode;
            }

            public boolean searchint(int key) {
                int index = hash(key);
                Node current = table[index];
                while (current != null) {
                    if (current.data == key) {
                        return true;
                    }
                    current = current.next;
                }
                return false;
            }

            public void delete(int key) {
                int index = hash(key);
                Node current = table[index];
                Node prev = null;
                while (current != null) {
                    if (current.data == key) {

                        if (prev.data == key) {
                            table[index] = current.next;


                        } else {
                            prev.next = current.next;
                        }
                        return;
                    }
                    prev = current;
                    current = current.next;

                }
            }

            public void display() {
                for (int i = 0; i < size; i++) {
                    System.out.println(i);
                    Node current = table[i];
                    while (current != null) {
                        System.out.println(current.data);
                        current = current.next;
                    }
                }


            }
        }


    }
}
