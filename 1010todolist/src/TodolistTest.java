/**
 * @author Na Liu  10/02/2021
 * CIS 211: Data Structures
 * Fall 2021
 * Assignment 4 LinkedList & Array TodoList Project
 */
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class TodolistTest {
    static LinkedTodolist todolist1 = new LinkedTodolist();

    public static void main(String[] args) {
        test1();
        //test2();
    }

    static void test1(){
        int[] nums = {1, 3, 1, 3, 4, 3, 1, 1, 3, 1, 3, 2, 3, 2, 3, 2, 6, 5};
        String[] tasks = {"study", "", "Homework", "", "", "", "Sleep", "Eat", "", "Buy milk", "", "Eat", "", "Sleep", "", "Buy cereal", "", ""};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("To Do List App Menu:\n" +
                    "1. Add Item\n" +
                    "2. Remove Item\n" +
                    "3. View List\n" +
                    "4. Clear List\n" +
                    "5. Exit\n");
            System.out.println(" What would you like to do? (1-5):");
            System.out.println(nums[i] );
            switch (nums[i]) {
                case 1:
                    System.out.println("Task name :" +"\n"+tasks[i] +"\n");
                    todolist1.add(tasks[i]);break;
                case 2:
                    System.out.println("Task name :" +"\n"+tasks[i] +"\n");
                    try{
                        todolist1.delete(tasks[i]);break;
                    }catch (UnsupportedOperationException ex){
                        System.out.println(ex);break;
                    }
                case 3: System.out.println(todolist1);break;
                case 4: todolist1.clear();
                    System.out.println("Clearing list...\n" + "Exiting...\n");
                    break;
                case 5: System.out.println("Exiting...\n");break;
                case 6: System.out.println("Invalid choice. Try again.\n");break;
            }
        }
    }

//    static void test2(){
//        boolean con = true;
//        while (con) {
//            System.out.println("To Do List App Menu:\n" +
//                    "1. Add Item\n" +
//                    "2. Remove Item\n" +
//                    "3. View List\n" +
//                    "4. Clear List\n" +
//                    "5. Exit\n");
//
//            System.out.println(" What would you like to do? (1-5):");
//            Scanner input = new Scanner(System.in);
//            int chooseNum = 0;
//            try {
//                chooseNum = input.nextInt();
//                input.nextLine();
//            } catch (Exception ex) {
//                System.out.println(ex);
//            }
//
//            if (chooseNum == 1) {
//                System.out.println("Task Name :");
//                String todo1 = input.nextLine();
//                todolist1.add(todo1);
//                //System.out.println(todolist1);
//            } else if (chooseNum == 2) {
//                System.out.println("Task Name :");
//                String remove1 = input.nextLine();
//                try {
//                    todolist1.delete(remove1);
//                } catch (UnsupportedOperationException ex) {
//                    System.out.println(ex);
//                }
//            } else if (chooseNum == 3) {
//                System.out.println(todolist1 + "\n");
//            } else if (chooseNum == 4) {
//                todolist1.clear();
//                System.out.println("Clearing list...\n" +
//                        "Exiting...\n");
//            } else if (chooseNum == 5) {
//                System.out.println("Exiting...\n");
//                con = false;
//            } else {
//                System.out.println("Invalid choice. Try again.\n");
//            }
//        }
    }



