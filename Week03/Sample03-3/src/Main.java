//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    long value1 = 3000000000L;
    long value2 = 4000000000L;
    long result = value1 * value2;

    System.out.printf("%,d * %,d = %,d\n", value1, value2, result);
}
