//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int price;
    char grade; // V, G, S, N
    String gradeType;
    int discountRate;
    int discount;
    int lastPayment;

    System.out.print("제품 가격 입력 : ");
    price = keyboard.nextInt();

    System.out.print("회원 등급을 입력 (V, G, S, N) : ");
    grade = keyboard.next().charAt(0);

    gradeType = grade == 'V' ? "VIP" :
                (grade == 'G' ? "GOLD" :
                (grade == 'S' ? "SILVER" : "NONE"));
    discountRate = grade == 'V' ? 20 : (grade == 'G' ? 15 : (grade == 'S' ? 10 : 0));

    discount = (int)(price - (price * discountRate / 100.0));
    lastPayment = discount >= 100000 ? (int) (discount - (discount * 10.0 / 100)) : discount;

    System.out.printf("물품 가격 : %,d 원\n", price);
    System.out.printf("회원 등급 : %s (%d %% 할인)\n", gradeType, discountRate);
    System.out.printf("할인 가격 : %,d 원\n", discount);
    System.out.printf("결제 금액 : %,d 원\n", lastPayment);
}
