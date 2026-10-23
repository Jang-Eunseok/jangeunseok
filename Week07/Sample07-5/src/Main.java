//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int birth;
    String result = "";

    Calendar calendar = Calendar.getInstance();
    int year = calendar.get(Calendar.YEAR);

    System.out.print("출생 년도 입력 : ");
    birth = keyboard.nextInt();

    if (birth <= year) {
        switch (birth % 12) {
            case 0 :
                result = "원숭이";
                break;
            case 1 :
                result = "닭";
                break;
            case 2 :
                result = "개";
                break;
            case 3 :
                result = "돼지";
                break;
            case 4 :
                result = "쥐";
                break;
            case 5 :
                result = "소";
                break;
            case 6 :
                result = "호랑이";
                break;
            case 7 :
                result = "토끼";
                break;
            case 8 :
                result = "용";
                break;
            case 9 :
                result = "뱀";
                break;
            case 10 :
                result = "말";
                break;
            case 11 :
                result = "양";
                break;
        }
    } else {
        result = "미래 소년";
    }

    System.out.printf("%,d년에 태어나신 당신은 %s 띠 입니다.\n", birth, result);
}
