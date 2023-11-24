package ArraysEx;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {

        Stack<String>stack=new Stack<>();

        //System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

          String myFavGame=stack.pop();
        //System.out.println(stack.search("DOOM"));

//        System.out.println(stack.peek());
        //System.out.println(stack);

        for(int i=0;i<1000000000;i++){
            stack.push("Skyrim");
        }
        System.out.println(stack);

    }
}
