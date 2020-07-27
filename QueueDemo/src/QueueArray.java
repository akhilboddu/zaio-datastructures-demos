class QueueArray {

    // instance variables
    private int maxSize;
    private String[] qArray;
    private int back;

    // constructor
    public QueueArray(int n) {
        System.out.print("Creating QueueArray\n");
        maxSize = n;
        qArray = new String[n];
        back = -1;
    }

    public void enqueue(String val) {
        if (back - 1 == maxSize) {
            System.out.println("Queue is full");
        } else {
            back += 1;
            qArray[back] = val;
        }

    }

    public int size() {
        return (back + 1);
    }

    public boolean empty() {
        return (back == -1);
    }

    public String front() {
        return qArray[0];
    }

    /**
     * [a,b,c,d,e] [_,b,c,d,e] [b,c,d,e,_]
     */
    public String dequeue() {
        String removingValue = qArray[0];
        for (int i = 1; i <= back; i++) {
            qArray[i - 1] = qArray[i];
        }
        back -= 1;
        return removingValue;
    }

    public void print() {
        System.out.print("Top of Queue \n");
        for (int i = 0; i <= back; i++) {
            System.out.print(qArray[i]);
            System.out.print("\n");
        }
        System.out.print("End of Queue \n");
    }

    public static void main(String[] args) {
        System.out.println("Creating Queue using Array");

        QueueArray q = new QueueArray(10);

        q.enqueue("Akhil");
        q.enqueue("Asif");
        q.enqueue("Zolotov");
        q.print();

        q.dequeue();
        q.print();

        System.out.println("Size of Q: " + q.size());

    }
}