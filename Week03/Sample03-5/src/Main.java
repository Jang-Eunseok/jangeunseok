//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int base;
    int 사각형면적;
    double radius;
    double 원의면적;
    final double PI = 3.141592;
    double area;

    System.out.printf("정사각형의 한 변의 길이 입력(예 5) ");
    base = keyboard.nextInt();
    사각형면적 = base * base;
    radius =  base / 2.0;
    원의면적 = PI * radius * radius;
    area = 사각형면적 - 원의면적;

    System.out.printf("한 변의 길이가 %,d Cm인 정사각형의 면적은 %,d \u33a0\n", base, 사각형면적);
    System.out.printf("반지름이 %,.2f Cm인 원의 면적은 %,.2f \u33a0\n", radius, 원의면적);
    System.out.printf("구하는 면적 : %,.2f \u33a0\n", area);
}
