//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    final int START = 1; // 1원
    final int TARGET = 100000000;
    int total = 0;

    int day = 1;
    for (int i = START; true; i *= 2) {
        total += i;
        System.out.printf("오늘 저축 금액 = %,11d원, %,3d일 = %,11d원\n", i, day, total);

        if (total >= TARGET)
            break;
        day++;
    }

    System.out.printf("%d일에 %,d원이 되니다\n", day, total);
}
