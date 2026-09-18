//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    String name = "홍길동";
    float height = 170.6f;
    double weight = 67.5;
    int age = 21;
    char gender = '남';

    System.out.printf("%s의 키는 %.1fCm 입니다.\n", name, height);
    System.out.printf("%s의 몸무게는 %.1fKg 입니다.\n", name, weight);
    System.out.printf("%s의 나이는 %d살 입니다.\n", name, age);
    System.out.printf("%s은 %c자입니다.\n", name, gender);
}
