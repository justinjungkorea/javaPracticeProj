package hwPackage;

public class Homework {

    public static void main(String[] args) {

        //1.정수 데이터 5개를 저장하는 배열을 생성하고 배열의 데이터를 한줄로 전부 출력
        System.out.println("1.정수 데이터 5개를 저장하는 배열을 생성하고 배열의 데이터를 한줄로 전부 출력");
        int[] data = {6, 3, 7, 1, 4};
        int sum = 0;
        for (int temp : data) {
            System.out.printf("%5d", temp);
            sum += temp;
        }

        System.out.println("\nsum of data : " + sum);

        //2.1-1000 완전수 개수 구해서 출력 (자기 자신을 제외한 약수의 합이 자기 자신과 같은 수)
        System.out.println("2. 1-1000 완전수 개수 구해서 출력 (자기 자신을 제외한 약수의 합이 자기 자신과 같은 수)");
        for (int i = 1; i <= 1000; ++i) {
            if (perfectNum(i)) {
                System.out.printf("%5d", i);
            }
        }
        //4.AOPSOAOAJSHDKSAOAOAAJSKS 문자열에서 AOA가 있는 곳의 시작 위치를 전부 출력
        System.out.println("\n4. AOPSOAOAJSHDKSAOAOAAJSKS 문자열에서 AOA가 있는 곳의 시작 위치를 전부 출력");
        String str = "AOPSOAOAJSHDKSAOAOAAJSKS";
        int length = str.length();
        for (int i = 0; i < length; ++i) {
            if (str.charAt(i) == 'A' && str.charAt(i + 1) == 'O' && str.charAt(i + 2) == 'A') {
                System.out.printf("%3d", i);
                i += 2;
            }
        }

        //5.anagram 출력 EROS->ROSE->OSER->SERO->EROS
        System.out.println("\n5. anagram 출력 (EROS->ROSE->OSER->SERO->EROS)");
        anagram("EROS");


    }

    //완전수인지 판별하는 함수
    public static boolean perfectNum(int n) {
        boolean flag = false;
        int sum = 1;
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) flag = true;
        return flag;
    }

    //anagram 함수
    public static void anagram(String str) {
        int cnt = 0;
        for (int i = 0; i < 10; ++i) {
            try {
                Thread.sleep(1000);
                for (int j = 0; j < str.length(); ++j) {
                    System.out.print(str.charAt(cnt % str.length()));
                    cnt++;
                }
                cnt++;
                System.out.println();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
