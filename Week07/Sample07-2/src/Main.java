//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int num1, num2;
    float result;
    String message;

    System.out.print("분자 입력 : ");
    num1 = keyboard.nextInt();
    System.out.print("분모 입력 : ");
    num2 = keyboard.nextInt();

    if (num2 == 0){
        message = "ERROR : 분모는 0이면 안됨";
    } else {
        result = (float) num1 / num2;
        message = String.format("%d / %d = %.2f", num1, num2, result);
    }
    System.out.println("IF ~ Else\n" + message);

    switch (num2) {
        case 0 :
            message = "ERROR : 분모는 0이면 안됨";
            break;
        default:
            result = (float) num1 / num2;
            message = String.format("%d / %d = %.2f", num1, num2, result);
    }

    System.out.println("Switch\n" + message);
}
