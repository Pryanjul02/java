public class dice {

    int roll(){
        double diceroll=  (Math.random()*6);
        return (int )Math.ceil(diceroll);
    }


    public static void main(String[] args) {
        dice roll = new dice();
        for(int i =0;i<10;i++){
            System.out.println(roll.roll());

        }
    }

}
