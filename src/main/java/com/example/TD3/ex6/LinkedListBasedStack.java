package com.example.TD3.ex6;

import java.util.ArrayList;

public class LinkedListBasedStack implements StackImplementations {
    private ArrayList<Integer> internalState;
    private int idx = -1;

    LinkedListBasedStack(){
        internalState = new ArrayList<>();
    }
    LinkedListBasedStack(int initialSize){
        internalState = new ArrayList<>(initialSize);
    }
    @Override
    public void push(int e) {
        internalState.add(e);
        idx++;
    }

    @Override
    public int pop() throws EmptyStackException {
        if (!isEmpty()){
            int e = internalState.remove(idx);
            idx--;
            return e;
        }
        throw new EmptyStackException();
    }

    @Override
    public int getSize() {
        return internalState.size();
    }

    @Override
    public boolean isEmpty() {
        return getSize() == 0 /* Or idx == -1 */;
    }

    public static LinkedListBasedStack from(int[] array){
        // create LinkedListBasedStack from int
        LinkedListBasedStack linkedListBasedStack = new LinkedListBasedStack(array.length);
        for (int e: array
             ) {
            linkedListBasedStack.push(e);
        }
        return linkedListBasedStack;
    }
}
