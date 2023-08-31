package HomeWork_Modul9_4;


public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        String colorBlack = "Black";
        String colorWhite = "White";
        String colorGreen = "Green";
        myStack.push(colorBlack);
        myStack.push(colorWhite);
        myStack.push(colorGreen);

        System.out.println(myStack.size());
        myStack.peek();
        System.out.println(myStack.peek());

        myStack.remove(1);
        myStack.pop();


        myStack.clear();


    }


}
