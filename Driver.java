package com.hackercode.controller;
import com.hackercode.UserDefinedExceptions.InsufficientFundsException;
import com.hackercode.constants.Constants;
import com.hackercode.utilities.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.rmi.RemoteException;
import java.util.*;

public class Driver {
    public static void main(String argv[]){
        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Depositing Rs 5000");
        c.deposit(5000);
        try{
            System.out.println("Withdrawing Rs. 1000");
            c.withdraw(1000);
            System.out.println("Withdrawing Rs. 5000");
            c.withdraw(5000);

        } catch (InsufficientFundsException e){
            System.out.println("Sorry Insufficient Balance, You are short of "+e.getAmount());
        }

            // System.out.println("File Exist");
        /*int a,b;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        Operations obj = new Operations();
        int sum=obj.add(a,b);
        int diff=obj.sub(a,b);
        int prod=obj.mul(a,b);
        float res=obj.div(a,b);
        System.out.println("Sum is: "+sum);
        System.out.println("Difference is: "+diff);
        System.out.println("Product is: "+prod);
        System.out.println("Division is: "+res);
        System.out.print("User");
        int arr[] = new int[10];
        for(int i=0;i<10;i++)
            arr[i]=in.nextInt();
        SelectionSort sortObj = new SelectionSort();
        sortObj.sorting(arr);

        //ArrayList Example
        int n=10,j=10;
        ArrayList<Integer> arrli = new ArrayList<Integer>();
        for(int i=0;i<20;i++){
            arrli.add(j);
            j--;
        }
        System.out.println("Original ArrayList");
        for(int i=0;i<20;i++){
            System.out.print(arrli.get(i)+" ");
        }
        System.out.println("ArrayList after removinf 1st element");
        arrli.remove(4);
        for(int i=0;i<19;i++){
            System.out.print(arrli.get(i)+" ");
        }
        arrli.add(5,34);
        for(int i=0;i<19;i++){
            System.out.print(arrli.get(i)+" ");
        }

        System.out.println("\n\nArrayList after Sorting");
        Collections.sort(arrli);
        for(int i=0;i<19;i++){
            System.out.print(arrli.get(i)+" ");
        }

        int arr[] = new int[10];
        Vector<Integer> v = new Vector();
        Hashtable<Integer, String> h = new Hashtable();
        ArrayList<Integer> arrli2 = new ArrayList<Integer>();
        arr[0]=10;
        v.addElement(10);
        h.put(12,"HackerCode");
        arrli2.add(10);

        System.out.println("Array: "+arr[0]+"  Vector: "+v.elementAt(0)+
                "    Hastable: "+h.get(12)+"  ArrayList: "+arrli2.get(0));

        int n=5;
        int inf=999;
        int[] visited=new int[5];
      //  int v=0;
        Scanner scan = new Scanner(System.in);
        int[][] graph = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j]=scan.nextInt();
                if(graph[i][j]<=0)
                    graph[i][j]=inf;
            }
        }
        for(int i=0;i<n;i++)
            Dijktras.dij(graph,visited,n,i);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(graph[i][j]+"  ");
            }
            System.out.println();
        }*/

    }
}
/*
        input
        0 3 0 1 0
        3 0 2 0 0
        0 2 0 2 4
        1 2 0 0 3
        0 0 4 3 0
        0
        */