//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String source; // 배열
    char[] convert; // 배열 선언

    System.out.print("영어 문장 입력 : ");
    source = keyboard.nextLine();

    convert = new char[source.length()];

    for (int i = 0; i < source.length(); i++) {
        if (source.charAt(i) >= 'A' && source.charAt(i) <= 'Z') // 대문자
            convert[i] = (char) (source.charAt(i) + 32);
        else if (source.charAt(i) >= 'a' && source.charAt(i) <= 'z')
            convert[i] = (char) (source.charAt(i) - 32);
        else
            convert[i] = source.charAt(i);
    }

    System.out.println("원문 : " + source);
    System.out.println("변화 : " + new String(convert));
}
