import java.util.*;
public class ar1{
    public static void main(String[] args){
        int arr1[] = {1,2,3};
        int arr2[]= {4,5,6};

        int a = arr1.length;
        int b = arr2.length;
        int n = a+b;

        int arr3[] = new int[n];

        for (int i = 0; i < a; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < a; i++) {
            arr3[i+a] = arr2[i];
        }

        

        int n1 = n/2;
        float x=arr3[n1];
        float y=arr3[n1-1];
        float n2 = (x+y)/2;

        if(n%2!=0){
            System.out.println(arr3[n1]);
        }
        else{
            System.out.println(n2);
        }

        
    }
}