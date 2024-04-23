public class Miles {
    public static void main(String[] args) {
        int cost = 7359;
        int bonusScale = 20;
        int bonusMile = cost / bonusScale;

        System.out.println("При покупке билета стоимостью " + cost + " руб., Ваш бонус составит " + bonusMile + " бонусных миль.");
    }
}
