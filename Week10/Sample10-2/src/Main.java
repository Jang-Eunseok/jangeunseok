//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    // int[] score;
    // int[] score = new int[]{90, 85, 70, 75, 100};

    int[] score = new int[] {90, 85, 70, 75, 100};
    int total = 0;
    float avg;

    for (int i = 0; i < score.length; i++)
        total += score[i];
    avg = (float) total / score.length;

    System.out.println();
    for (int i = 0; i < score.length; i++)
        System.out.printf("%d\n", score[i]);

    System.out.printf("합계 : %d\n", total);
    System.out.printf("평균 : %.2f\n", avg);
}
