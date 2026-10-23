//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int man1, man2;
    String type1,  type2;
    String result;

    System.out.print("첫번째 선수 입력 (가위 - 1, 바위 - 2, 보 - 3) ");
    man1 = keyboard.nextInt();
    System.out.print("두번째 선수 입력 (가위 - 1, 바위 - 2, 보 - 3) ");
    man2 = keyboard.nextInt();

    if ((man1 >= 1 && man1 <= 3) && (man2 >= 1 && man2 <= 3)) {
        if (man1 == 1) {
            type1 = "가위";
        } else if (man1 == 2) {
            type1 = "바위";
        } else {
            type1 = "보";
        }

        if (man2 == 2) {
            type2 = "가위";
        } else if (man2 == 2) {
            type2 = "바위";
        } else {
            type2 = "보";
        }

        switch (man1 - man2) {
            case 0:
                result = String.format("man1(%s)과 man2(%s)이면, 비겼습니다.", type1, type2);
                break;
            case -1:
            case 2:
                result = String.format("man1(%s)과 man2(%s)이면, man2가 이겼습니다.", type1, type2);
                break;
            case -2:
            case 1:
                result = String.format("man1(%s)과 man2(%s)이면, man1이 이겼습니다.", type1, type2);
                break;
            default:
                result = "ERROR";
        }
    } else {
        result = "Error(범위 오류)";
    }

    System.out.println(result);
}
