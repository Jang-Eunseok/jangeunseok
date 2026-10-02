import java.awt.desktop.SystemEventListener;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int num1;
    int num2;
    
    System.out.print("첫 번째 수를 입력 (분자) : ");
    num1 = keyboard.nextInt();
    System.out.print("두 번째 수를 입력 (분모) : ");
    num2 = keyboard.nextInt();

    System.out.printf("\n%d를 %d로 나누면 몫  = %d, 나머지 = %d 이다.\n", num1, num2, num1 / num2, num1 % num2);
    System.out.printf("%d를 %d로 나누면 몫 = %.1f 이다.\n", num1, num2, (float) num1 / num2);
    
    
}
