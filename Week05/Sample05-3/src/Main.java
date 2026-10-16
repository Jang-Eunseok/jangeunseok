//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int apple;
    int pear;
    int payment;
    final int APPLE = 500;
    final int PEAR = 600;
    int price;
    boolean flag;
    String result;

    System.out.print("구입한 사과 개수 : ");
    apple = keyboard.nextInt();

    System.out.print("구입한 배 개수 : ");
    pear = keyboard.nextInt();

    System.out.print("지불한 금액 : ");
    payment = keyboard.nextInt();

    price = apple * APPLE + pear * PEAR;
    flag = payment >= price;
    result = flag == true ? String.format("물품 가격 : %,d 원\n 지불 금액 : %,d 원\n 반환 금액 %,d 원\n", price, payment, payment - price) : "금액이 부족합니다" ;
    System.out.println(result);


}
