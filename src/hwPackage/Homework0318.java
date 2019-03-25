package hwPackage;

import java.util.Scanner;

public class Homework0318 {
    public static void main(String[] args) {
        //정수 하나를 입력받아서 각 자리의 합을 구해서 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("입력:");
        int input = sc.nextInt();
        int sum = 0;
        while(input!=0){
            sum+=(input%10);
            input/=10;
        }
        System.out.println(sum);

    }
}
