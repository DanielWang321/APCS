package apcs.Misc;


public class test {
    public static void main(String[] args) {
        System.out.println(getChargingCost(12,1));
        System.out.println(getChargeStartTime(1));
    }

    public static int getChargingCost(int startHour, int chargeTime){
        int [] rateTable = {50,60,160,60,80,100,100,120,150,150,150,200,40,240,220,220,200,200,180,180,140,100,80,60};
        int totalCost = 0;
        int i = startHour;
        while (i< startHour + chargeTime){
            totalCost += rateTable[(i)%24];
            i++;
        }
        return totalCost;
    }

    public static int getChargeStartTime(int chargeTime){
        int optimalStartCost = getChargingCost(0,chargeTime);
        int optimalStartTime = 0;
        for(int i = 1; i < 24; i++){
            int currentStartCost = getChargingCost(i,chargeTime);
            if (currentStartCost < optimalStartCost){
                    optimalStartCost = currentStartCost;
                    optimalStartTime = i;
            }
        }
        return optimalStartTime;
}
}