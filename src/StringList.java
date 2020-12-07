import java.util.Arrays;

public class StringList {
    public String[] array;
    public static final int SIZE = 5;
    public static final float SIZE_COEFFICIENT = 2.3f;
    private int sizeOfElements = 0;

    public StringList() {
        this.array = new String[SIZE];
    }

    public StringList(String str) {
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i].trim();
        }
        if (strArr.length < SIZE) {
            array = Arrays.copyOf(strArr, SIZE);
        }
        if (strArr.length > SIZE) {
            array = new String[(int) (SIZE * SIZE_COEFFICIENT)];
            array = Arrays.copyOf(strArr, array.length);
        }
        this.sizeOfElements = strArr.length;
    }

    public void add(String str) {
        sizeOfElements++;
        if (sizeOfElements >= array.length) {
            array = Arrays.copyOf(array, (int) (array.length * SIZE_COEFFICIENT));
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = str;
                break;
            }
        }
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < sizeOfElements; i++) {
            if (i == sizeOfElements - 1) {
                System.out.println(array[i] + "]");
                break;
            }
            System.out.print(array[i] + ",");
        }
    }

    public void add(String str, int index) {
        sizeOfElements++;
        if (sizeOfElements >= array.length) {
            array = Arrays.copyOf(array, (int) (array.length * SIZE_COEFFICIENT));
        }
        for (int i = sizeOfElements - 2; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = str;
    }


    public void remove(String str) {
        sizeOfElements--;
        int index = 0;
        for (int i = 0; i < sizeOfElements; i++) {
            if (array[i].equals(str)) {
                array[i] = null;
                index = i;
                array[index] = array[index + 1];
            }
        }
        for (int i = index + 1; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    public void remove(int index) {
        sizeOfElements--;
        int ind = 0;
        for (int i = 0; i < sizeOfElements; i++) {
            if (i == index) {
                array[i] = null;
                ind = i;
                array[ind] = array[ind + 1];
            }

        }
        for (int i = index + 1; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    public void get(int index){
        System.out.println("Элемент под индексом : " + index + " - " + array[index] );
    }
}


