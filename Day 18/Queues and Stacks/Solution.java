
public class Solution {
    /* Stack - using an ArrayDeque */
    ArrayDeque<Character> dequeAsStack = new ArrayDeque();
    
    void pushCharacter(char ch) {
        dequeAsStack.push(ch);
    }
    
    char popCharacter() {
        return dequeAsStack.pop();
    }
    
    /* Queue - using an ArrayDeque */
    ArrayDeque<Character> dequeAsQueue = new ArrayDeque();
    
    void enqueueCharacter(char ch) {
        dequeAsQueue.add(ch);
    }

    char dequeueCharacter() {
        return dequeAsQueue.remove();
    }
