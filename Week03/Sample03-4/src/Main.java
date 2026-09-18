//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    short value1 = 32677;
    short value2 = 200;
    int result = value1 + value2;
    short result1 = (short) (value1 + value2);

    System.out.printf("%,d + %,d = %,d (%,d)\n", value1, value2, result, result1);
}
