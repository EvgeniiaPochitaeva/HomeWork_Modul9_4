package HomeWork_Modul9_4;

public class MyStack {   private Object[] myArray;
    private int size;

    private String color;

    @Override
    public String toString() {
        return color;
    }

    public MyStack() {
        myArray = new Object[10];
        size = 0;
    }
    public void push(Object value) {
        if (size == myArray.length) {
            Object[] newArray = new Object[myArray.length * 2];
            System.arraycopy(myArray, 0, newArray, 0, size);
            myArray = newArray;
        }
        myArray[size] = value;
        size++;

    }//    push(Object value) додає елемент в кінець
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона.");
        }

        System.arraycopy(myArray, index + 1, myArray, index, size - index - 1);
        myArray[size - 1] = null;
        size--;
    } //    remove(int index) видаляє елемент за індексом
    public void clear() {
        for (int i = 0; i < size; i++) {
            myArray[i] = null;
        }
        size = 0;
    } //    clear() очищає колекцію

    public int size() {
        return size;
    }//    size() повертає розмір колекції

    public Object peek() {
        if (size == 0 ) {
            throw new IndexOutOfBoundsException("массив пустой");
        }
        return myArray[0];
    }//    peek() повертає перший елемент стеку
    public Object pop() {
        if (size==0) {
            throw new IndexOutOfBoundsException("массив пустой");
        }
        Object firstElement = myArray[0];
        System.arraycopy(myArray, 1, myArray, 0, size - 1);
        myArray[size - 1] = null;
        size--;
        return firstElement;
    }      //    pop() повертає перший елемент стеку та видаляє його з колекції
}






