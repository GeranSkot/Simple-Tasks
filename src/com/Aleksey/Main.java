package com.Aleksey;
import com.sun.security.jgss.InquireSecContextPermission;

import java.io.*;
import java.util.*;
import java.math.*;


public class Main {
    public static void main(String args[]) {
        System.out.print("Enter the first digit: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.print("Enter the second  digit: ");
        int y = scan.nextInt();
        System.out.print("Enter the third digit: ");
        int z = scan.nextInt();
        int numbers[] = { x, y, z};
        Set<String> set = new HashSet<String>();
        permute(numbers, 0, set);
        for (String number: set) {
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