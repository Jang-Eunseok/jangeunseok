//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    final int MONEY = 100000000;
    final int MONTH = 2000000;
    int life = MONEY;
    int month = 1;

    while(true) {
        life -= MONTH;
            if (month % 12 == 0) {
                life = (int) (life + (life * (5 / 100.0f)));
            }
            if (life < MONTH)
                break;
            System.out.printf("%2d개월 후 원금 : %,11d원\n", month++, life);
        }

        System.out.printf("%d개월까지 살고 나면 잔고는 %,d원 남아요.\n", month, life);
}
