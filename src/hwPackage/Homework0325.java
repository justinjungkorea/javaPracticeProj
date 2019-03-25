package hwPackage;

public class Homework0325 {
    public static void main(String[] args) {
        int[] data = {7,4,3,5,9};
        insertionSort(data);
        for(int temp:data){
            System.out.print(temp+", ");
        }
    }
    public static void insertionSort(int[] arr){
        int i,j;
        for(i=1;i<arr.length;++i){
            int key = arr[i];
            for(j=i-1;j>=0;--j){
                if(arr[j]>key){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[++j] = key;
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
