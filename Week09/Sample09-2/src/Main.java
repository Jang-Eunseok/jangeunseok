//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    final int LINE = 5;
    final int STAR = 25;

    System.out.println("*************************");
    System.out.println("*************************");
    System.out.println("*************************");
    System.out.println("*************************");
    System.out.println("*************************");

    for (int i = 1; i <= LINE; i++)
        System.out.println("*************************");

    for (int i = 1; i <= LINE; i++) {
        for (int j = 1; j <= STAR; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println();

    int i = 1;
    while (i <= LINE) {
        int j = 1;
        while (j <= STAR) {
            System.out.print("*");
            j++;
        }
        System.out.println();
        i++;
    }

    System.out.println();

    i = 1;
    do {
        int j = 1;
        do {
            System.out.print("*");
            j++;
        } while (j <= STAR);
        System.out.println();
        i++;
    } while (i <= LINE);

}
