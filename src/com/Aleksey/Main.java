package com.Aleksey;
import com.sun.security.jgss.InquireSecContextPermission;

import java.io.*;
import java.util.*;
import java.math.*;



/*class Main {



    static void combinationUtil(int arr[], int n, int r, int index,
        int data[], int i)
        {
        if (index == r)
        {
        for (int j=0; j<r; j++)
        System.out.print(data[j]+" ");
        System.out.println("");
        return;
        }

        if (i >= n)
        return;

        data[index] = arr[i];
        combinationUtil(arr, n, r, index+1, data, i+1);

        combinationUtil(arr, n, r, index, data, i+1);
        }


static void printCombination(int arr[], int n, int r)
        {
        int data[]=new int[r];
        combinationUtil(arr, n, r, 0, data, 0);
        }*/

    /*Driver function to check for above function*/
/*public static void main (String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int r = 3;
        int n = arr.length;
        printCombination(arr, n, r);
        }*/






public class Main {

//    public static void main(String[] args) {
//        System.out.print("Введите первую цифру: ");
//        Scanner Scan = new Scanner(System.in);
//        int x = Scan.nextInt();
//        System.out.print("Введите вторую цифру: ");
//        Scanner Sca = new Scanner(System.in);
//        int y = Sca.nextInt();
//        System.out.print("Введите третью цифру: ");
//        Scanner Sc = new Scanner(System.in);
//        int z = Sc.nextInt();

//        int numbers[] = { i, j, k};



        //numbers = new int[2];
        //numbers[0] = i;
        //numbers[1] = j;
        //numbers[2] = k;
        //int i, j, k;
        //i = Integer.parseInt(args[0]);
        //j = Integer.parseInt(args[1]);
        //k = Integer.parseInt(args[2]);

//        System.out.println("\n Введенные числа: " + i + " " + j + " " + k);
//        System.out.println("\n Все возможные комбинации: \n");
//        if ((i != j) && (j != k) && (k != i)) {
//            System.out.println(i + " " + j + " " + k +" ");
//            System.out.println(i + " " + k + " " + j +" ");
//            System.out.println(j + " " + i + " " + k +" ");
//            System.out.println(j + " " + k + " " + i +" ");
//            System.out.println(k + " " + i + " " + j +" ");
//            System.out.println(k + " " + j + " " + i +" \n");
//        } else {
//            if ((i == j) || (i == k))
//                System.out.println(i + " " + j + " " + k +" \n");
//            else {
//                if (i == j) {
//                    System.out.println(i + " " + j + " " + k +" ");
//                    System.out.println(i + " " + k + " " + j +" ");
//                    System.out.println(k + " " + j + " " + i +" \n");
//                } else {
//                    if (i == k) {
//                        System.out.println(i + " " + k + " " + j +" ");
//                        System.out.println(i + " " + j + " " + k +" ");
//                        System.out.println(j + " " + k + " " + i +" \n");
//                    } else {
//                        System.out.println(j + " " + k + " " + i +" ");
//                        System.out.println(j + " " + i + " " + k +" ");
//                        System.out.println(i + " " + j + " " + k +" \n");
//                    }
//                }
//            }
//        }



//        public static void main(String[] args) {
//
//            Set<Integer> myset = new HashSet<Integer>();
//            myset.add(1);
//            myset.add(5);
//            myset.add(7);
//
//
//            List<Set<Integer>> achieved = solveChallenge(myset);
//            System.out.println(achieved);
//        }
//
//        public static List<Set<Integer>> solveChallenge(Set<Integer> myset) {
//
//            int n = myset.size();
//            Integer[] myInts = new Integer[n];
//            Iterator<Integer> iterator = myset.iterator();
//            int index = 0;
//            while (iterator.hasNext()) {
//                myInts[index] = iterator.next();
//                ++index;
//            }
//
//            List<Set<Integer>> myList = new ArrayList<Set<Integer>>();
//            Set<Integer> subSet;
//            for (int i = 0; i < n; i++) {
//                for (int j = i; j < n; j++) {
//
//                    if (j != i) {
//                        subSet = new HashSet<Integer>();
//                        subSet.add(myInts[i]);
//                        subSet.add(myInts[j]);
//                        myList.add(subSet);
//                    }
//
//                }
//            }
//            return myList;
//        }







    public static void main(String args[])
    {
        System.out.print("Enter the first digit: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.print("Enter the SECOND  digit: ");
        int y = scan.nextInt();
        System.out.print("Enter the ThIrD digit: ");
        int z = scan.nextInt();

        int numbers[] = { x, y, z};

        Set<String> set = new HashSet<String>();

        permute(numbers, 0, set);

        for (String number: set
             ) {
            System.out.println(number);
        }

        scan.close();

    }

    static void permute(int[] a, int k,  Set<String> set)

    {

        StringBuilder sb = new StringBuilder();
        String value;
        if (k == a.length)
        {
            for (int i = 0; i < a.length; i++)
            {
                int i1i = a[i];
                sb.append((String.valueOf(i1i) ));
            }
            set.add(sb.toString());
        }
        else
        {
            for (int i = k; i < a.length; i++)
            {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
                permute(a, k + 1, set);
                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }

}












        /*char[] digits = Integer.toString(input).toCharArray();

        for (int i = a; i < digits.length - 2; i++) {
            for (int b; b < digits.length - 1; b++) {
                for (int c; c < digits.length; c++) {
                    System.out.println("" + digits[i] + digits[b] + digits[c]);
        }*/
        /*int[] input = {a, b, c};
        for  (a = 0; a < 10; a++){
            for (b = 0; b < 10; b++) {
                for (c = 0; c < 10; c++) {
                    if (a != b & b != c & c != a) {
                        System.out.println(input[a] + "" + input[b] + "" + input[c]);
                    }
                }
            }
        }
    }*/
        /*int input;
        char[] digits = Integer.toString(input).toCharArray();

        for (int i = 0; i < digits.length - 2; i++) {
            for (int j = i + 1; j < digits.length - 1; j++) {
                for (int k = j + 1; k < digits.length; k++) {
                    System.out.println("" + digits[i] + digits[j] + digits[k]);
                }
            }
        }*/


