/**
 * Created by adavi on 18.11.2017.
 */
public class MyWork implements PartOne {



    @Override
    public String hello() {
        System.out.println("Hello. What is you name");

        String name =  Main.scanner.next().toUpperCase();

        System.out.print("Hello " + name +"\n");

        System.out.println( name +". Where you want to trip");

        String userAnswer = Main.scanner.next().toUpperCase();

        System.out.println(userAnswer + " sounds great");

        return userAnswer;
    }

    @Override
    public void budget(String userAnswer) {
        System.out.println("What the duration of your trip");
        int days = Main.scanner.nextInt();

        int [] arrTime = getTime(days);

        System.out.println("What is you budget for trip");

        double budgetToTrip = Main.scanner.nextInt();
        boolean go = true;
        while (go){
            switch (userAnswer){

                case "USA":{

                    System.out.println(budgetToTrip + " in " + userAnswer +". There is no more");
                    go = false;
                    break;
                }
                case "EUROPE":{
                    budgetToTrip *= 0.9;
                    System.out.println(budgetToTrip + " in " + userAnswer +". There is no more");
                    go = false;
                    break;
                }
                case "UKRAINE":{
                    budgetToTrip *= 25;
                    System.out.println(budgetToTrip + " in " + userAnswer +". This is norm");
                    go = false;
                    break;
                }
                default:{
                    System.out.println("$ forever");
                    go = false;
                }
            }
        }

    }

    public int[]  getTime(int days){

        int hourDuration = 0;
        int minDuration = 0;
        int secDuration = 0;

        for(int i  = 0; i < days; i++){

            hourDuration = i * 24;
            minDuration = hourDuration * 60;
            secDuration = minDuration * 60;

        }
        int [] durationTime = {hourDuration , minDuration, secDuration};
        System.out.println("It is:" + hourDuration + " hour" );
        System.out.println("It is:" + minDuration + " min" );
        System.out.println("It is:" + secDuration + " seconds" );

        return durationTime;
    }

    @Override
    public void moneyInNewCountry(int currency) {

    }
}
