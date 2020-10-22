
//삼항 연산자
public class Tutorial4 {
    public static void main(String[] args) {
        int x = 70;
        int y = 60;

        System.out.println("최댓값은" + max(x,y)+"입니다.");
    }
    // 반환형, 함수이름, 매개 변수
    static int max(int a, int b){
        //제일 왼쪽에 조건식을 넣어주고 그 다음에 ? 그리고 참값일때의 값 써주고 : 그리고 거짓일 때의 값
        int result = (a>b)? a:b;
        return result;
        //a가 b보다 클 때에 한 해 참이라면 a를 반환하고 거짓이면 b를 반환
    }
}
