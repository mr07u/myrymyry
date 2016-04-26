package mergesort;
import java.util.*;
public class MergeSort {
    public static Comparable[] mergeSort(Comparable[] list) 
    {
        if (list.length <= 1) {
            return list;
        }
        //podzial na 2 tablice
        Comparable[] p = new Comparable[list.length / 2];
        Comparable[] q = new Comparable[list.length - p.length];
        System.arraycopy(list, 0, p, 0, p.length);
        System.arraycopy(list, p.length, q, 0, q.length);  
        mergeSort(p);
        mergeSort(q);
         
        merge(p, q, list);
        return list;
    }
    private static void merge(Comparable[] first, Comparable[] second, Comparable[] wynik) 
    {
        int Pierwsza = 0;
        int Druga = 0;
        int Merged = 0;
        while (Pierwsza < first.length && Druga < second.length) 
        {
            if (first[Pierwsza].compareTo(second[Druga]) < 0) 
            {
                wynik[Merged] = first[Pierwsza];
                Pierwsza++;
            } 
            else
            {
                wynik[Merged] = second[Druga];
                Druga++;
            }
            Merged++;
        }
       
    }
    //tu powinien byc test
    
    public static void main(String[] args) {
        //przykaldowa tablica z kartki
        Integer[] a = {14,7,3,12,9,11,6,2};
        //wykorzystanie metody
        Comparable[] mergeSort = mergeSort(a);
        System.out.println(Arrays.toString(mergeSort));
    }
    
}
