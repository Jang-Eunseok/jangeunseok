//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    double a = 1500.35;
    double b = 890.76;

    int sum = (int) (a + b);
    double tax = sum * (10.0 / 100);
    int result = (int) (sum - tax);

    System.out.printf("이자1 = %.2f 원\n", a);
    System.out.printf("이자2 = %.2f 원\n", b);
    System.out.printf("합계 : %,d 원\n", sum);
    System.out.printf("세금 : %,d 원\n", (int) tax);
    System.out.printf("순수 이자 : %,d 원\n", result);
}
