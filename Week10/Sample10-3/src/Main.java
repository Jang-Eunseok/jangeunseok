//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    String[] name = {"홍길동", "이대한", "한민국", "경복대", "이미숙"};
    char[] attend = new char[name.length];
    int count = 0;
    float rate;

    int i = 0;
    while (i < name.length) {
        System.out.printf("%s님 출석 했나요 ? (1 = 출석 / 0 = 결석)", name[i]);
        attend[i] = keyboard.nextLine().charAt(0);
        if (attend[i] == '0' || attend[i] == '1')
            i ++;
        else {
            System.err.println("ERROR : 출석 = 1, 결석 = 0");
            System.in.read();
        }
    }
    for (i = 0; i < attend.length; i++) {
        if (attend[i] == '0')
            count++;
    }
    rate = (float) count / name.length * 100;

    System.out.println();
    for (i = 0; i < name.length; i++) {
        System.out.printf("%s님 %s\n", name[i], attend[i] == '1' ? "출석" : "결석");
    }
    System.out.println("결석자 수 = " + count);
    System.out.printf("결석율 : %.2f %%\n", rate);
}
