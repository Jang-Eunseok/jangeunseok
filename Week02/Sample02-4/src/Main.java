//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int age;
    double height;
    float weight;

    System.out.print("당신의 이름은 ?");
    name = keyboard.nextLine();

    System.out.printf("%s님의 나이는 ?", name);
    age = keyboard.nextInt();

    System.out.printf("%s님의 키는(예 170.5) ?", name);
    height = keyboard.nextDouble();

    System.out.printf("%s님의 몸무게는(예 78.6) ?", name);
    weight = keyboard.nextFloat();

    System.out.printf("%s님의 나이는 %d살 입니다.\n", name, age);
    System.out.printf("%s님의 키는 %.1f CM 입니다.\n", name, height);
    System.out.printf("%s님의 몸무게는 %.1f KG 입니다.\n", name, weight);
}
