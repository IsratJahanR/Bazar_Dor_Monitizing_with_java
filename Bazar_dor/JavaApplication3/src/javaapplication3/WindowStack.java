/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.awt.Window;
import java.util.Stack;

public class WindowStack {
    private static Stack<Window> windowStack = new Stack<>();

    public static void push(Window window) {
        windowStack.push(window);
    }

    public static Window pop() {
        return windowStack.pop();
    }

    public static boolean isEmpty() {
        return windowStack.isEmpty();
    }
}