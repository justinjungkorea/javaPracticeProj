package w3Package;

import java.util.*;

public class Homework0304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.정수를 입력받아서 동일한 내용의 문자열로 변경하고 문자열을 정수로 변경하도록 작성(메소드 사용 금지 charAt(), length(), +연산 아용)
        System.out.println("1.정수를 입력받아서 동일한 내용의 문자열로 변경하고 문자열을 정수로 변경하도록 작성(메소드 사용 금지 charAt(), length(), +연산 아용)");
        System.out.print("정수 입력 : ");
        int input = sc.nextInt();
        char[] str = new char[10];
        int cnt=0;
        while(input!=0){
            int temp = input%10;
            str[cnt++] = (char)(temp+'0');
            input = input/10;
        }
        char[] str2 = new char[cnt];
        for(int i=0;i<cnt;++i){
            str2[i] = str[cnt-1-i];
        }
        System.out.println(str2);

        //2.정수 배열에 중복된 모든 데이터를 출력하시오.(int[] ar = {10,30,20,20,10,30,50,40} set 이용, 배열생성)
        int[] ar = {10,30,20,20,10,30,10,50,40};

        for(int i=1;i<ar.length;++i){
            for(int j=0;j<i;++j){
                if(ar[i] == ar[j]){
                    System.out.print(ar[j]+"\t");
                    break;
                }
            }
        }


    }
}
