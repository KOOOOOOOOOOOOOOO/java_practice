public class Tutorial3 {
    // 초를 입력받아 몇분 몇초인지 알려주는 프로그램...
    final static int SECOND = 1000;
    
    public static void main(String[] args) {
        //n나누기 60을 하면 분... 그리고 분으로 나눠지 않는 나머지는 초
        int minute = SECOND/60;
        int second = SECOND%60;

        System.out.println(minute + "분"+ second + "초");
    }
}
