//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    int a = Integer.MAX_VALUE;
    long b = a + 1; // Overflow
    long c = a + 1L; // long형 연산이 가능

    System.out.printf("a = %,d, b = %,d, c = %,d\n", a, b, c);
}
