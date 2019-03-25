package hwPackage;

import java.util.*;

public class Homework0304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.정수를 입력받아서 동일한 내용의 문자열로 변경하고 문자열을 정수로 변경하도록 작성(메소드 사용 금지 charAt(), length(), +연산 아용)
        System.out.println("1.정수를 입력받아서 동일한 내용의 문자열로 변경하고 문자열을 정수로 변경하도록 작성(메소드 사용 금지 charAt(), length(), +연산 아용)");
        System.out.print("정수 입력 : ");
        int input = sc.nextInt();
        String str = intToStr(input);
        System.out.println(str);
        System.out.println(strToInt(str));



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

    public static String intToStr(int n){

        String str = "";
        while(n!=0){
            int temp = n%10;
            str = temp + str;
            n = n/10;
        }
        return str;
    }

    public static int strToInt(String str){
        int ans=0;
        for(int i=0;i<str.length();++i){
            char ch = str.charAt(i);
            ans = ans*10 + (ch-'0');
        }
        return ans;
    }
}
