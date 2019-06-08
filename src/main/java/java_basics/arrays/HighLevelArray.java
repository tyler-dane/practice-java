package java_basics.arrays;

/** Demonstrates Array class with high-level interface*/
class HighLevelArray {
    /**
     * Reference to array
     */
    private long[] arr;

    /**
     * Number of data items
     */
    private int nElems;

    public HighLevelArray(int max) {
        arr = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int i;
        for (i = 0; i < nElems; i++) {
            if (arr[i] == searchKey) {
                break;      // exit loop before end
            }
            // gone to end?
            if (i == nElems) {
                System.out.println("Could not find " + searchKey);
                return false;
            } else {
                return true;        // no, found it
            }
        }
        return true; //todo added to fix compile
    }

    public void insert(long value) {
        arr[nElems] = value;    // put into into next open index in array
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) {          // look for it
            if (value == arr[j]) {
                break;
            }   // jump to else
            if (j == nElems) {
                return false;
            }  // can't find it
            else {
                /** after finding, set k = j, then increment k,
                 * grabbing the element to the right of k and replacing it with
                 * k's current position. This excludes everything before k, since
                 * no need to shift those elements */
                for (int k = j; k < nElems; k++) {
                    arr[k] = arr[k + 1];
                    nElems--;
                    return true;
                }
            }
        }
        return true; //todo added this to compile
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.println(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int maxSize = 100;
        HighLevelArray arr = new HighLevelArray(maxSize);
        arr.insert(44);
        arr.insert(29);
        arr.insert(2);
        arr.insert(4);
        arr.insert(-33);
        arr.insert(88);

        arr.display();

        //search
        int searchKey = 88;
        if (arr.find(searchKey)) {
            System.out.println(searchKey + " in array");
        } else {
            System.out.println(searchKey + " not in array");
        }

        //delete
        arr.delete(4);
        arr.delete(-33);
        arr.delete(1000);

        //display again
        arr.display();
    }
}

