package com.nighthawk.hacks;

public class StackHeapTest {
    public int n = 5; // Primitive data type
    public Integer n1 = 5;
    public String n2 = "before";

    public static void changeInt(int nValue, int nRefn, StackHeapTest nRef, Integer nInt, String nString) {
        System.out.println("\nBefore (Stack):\n");
        System.out.println(nValue + " or " + System.identityHashCode(nValue));
        System.out.println(nRefn + " or " + System.identityHashCode(nRefn));
        System.out.println(nRef + " or " + System.identityHashCode(nRef));

        nValue += 10;
        nRefn += 10;
        nRef.n += 10;

        System.out.println("\nAfter (Stack):\n");
        System.out.println(nValue + " or " + System.identityHashCode(nValue));
        System.out.println(nRefn + " or " + System.identityHashCode(nRefn));
        System.out.println(nRef.n + " or " + System.identityHashCode(nRef.n));
    }

    public static void main(String[] args) {
        int nValue = 5;
        // int nRef = 5;
        StackHeapTest nRef = new StackHeapTest();

        System.out.println("\nBefore (Heap):\n");
        System.out.println(nValue + " or " + System.identityHashCode(nValue));
        System.out.println(nRef + " or " + System.identityHashCode(nRef));
        System.out.println(nRef.n + " or " + System.identityHashCode(nRef.n));

        changeInt(nValue, nRef.n, nRef);

        System.out.println("\nAfter (Heap)\n");
        System.out.println(nValue + " or " + System.identityHashCode(nValue));
        System.out.println(nRef + " or " + System.identityHashCode(nRef));
        System.out.println(nRef.n + " or " + System.identityHashCode(nRef.n));
    }
}
