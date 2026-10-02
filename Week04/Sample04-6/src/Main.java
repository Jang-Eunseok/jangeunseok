//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    long a = 3_000_000_000L; // 30억
    long b = 4000000000L; // 40억
    long c = a * b;

    System.out.printf("a = %,d, b = %,d, c = %,d\n", a, b, c);

    BigInteger a1 = BigInteger.valueOf(a);
    BigInteger b1 = BigInteger.valueOf(b);
    BigInteger c1 = a1.multiply(b1);

    System.out.printf("a1 = %,d, b1 = %,d, c1 = %,d\n", a1, b1, c1);
}