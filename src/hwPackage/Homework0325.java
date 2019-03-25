package hwPackage;

public class Homework0325 {
    public static void main(String[] args) {
        int[] data = {4,2,0,9,8,1};
        insertionSort(data);
        for(int temp:data){
            System.out.print(temp+", ");
        }
    }
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;++i){
            for(int j=i-1;j>=0;--j){
                if(arr[j]>arr[j+1]) swap(arr,j,j+1);
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
