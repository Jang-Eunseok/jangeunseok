//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
    final int TEMP = 5;
    Scanner keyboard  = new Scanner(System.in);
    int start, end;
    int even = 0, odd = 0;
    char answer;

    while (true) {
        for (; true; ) {
            System.out.print("어디부터 시작할까요 ? ");
            start = keyboard.nextInt();
            System.out.printf("어디까지 더할까요 ? (최소값 = %d) ", start + TEMP);
            end = keyboard.nextInt();
            if (start > 0 && end >= start + 5)
                break;
            else {
                System.err.printf("ERROR : 시작값(%d)는 마지막 값(%d)보다 %d가 크거나 같아야 함", start, end, TEMP);
                System.in.read();
            }
        }
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.printf("%d ~ %d까지의 합 = %,d\n", start, end, even + odd);
        System.out.printf("\t 짝수의 합 = %,d\n", even);
        System.out.printf("\t 홀수의 합 = %,d\n", odd);

        while (true) {
            System.out.print("계속할까요 ? (Yes/No)");
            keyboard.nextLine();
            answer = keyboard.nextLine().charAt(0);
            if (answer == 'Y' || answer == 'y' || answer == 'N' || answer == 'n')
                break;
            else {
                System.err.print("ERROR : 입력 오류");
                System.in.read();
            }
        }
        if (answer == 'n' || answer == 'N')
            break;
    }
}
