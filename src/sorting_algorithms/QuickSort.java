package sorting_algorithms;
import java.util.*;
class QuickSort{
    static Scanner sc =new Scanner(System.in);
    static int[] arr;
    public static void swap(int[] arr,int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public static int pivotfind(int[] arr, int low, int high){
        int pivot= arr[high];
        int i=low-1;
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i, j);
                // int temp=arr[i];
                // arr[i]=arr[j];
                // arr[j]=temp;
            }
        }
        // int temp=arr[i+1];
        // arr[i+1]=arr[high];
        // arr[high]=temp;
        swap(arr,high, i+1);
        return i;
    }

    public static void quickSort(int[] arr, int low,int high){
        if(low<high){
        int pi=pivotfind(arr, low, high);
        quickSort(arr, low, pi-1);
        quickSort(arr, pi+1, high);
        }
    }
    public static void inputArray(int n){
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void printArray(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
       
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the array Elements");
        arr=new int[n];
        inputArray(n);
        quickSort(arr,0,n-1);
        printArray(arr,n);
    }
}
