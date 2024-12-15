public class BottleSong{
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "garrafas";

        while (bottlesNum > 0) {
            if (bottlesNum == 1) {
                word = " garrafa ";
            }
            System.out.println( bottlesNum +" "+ word + " verde , pendurada na parede");
            System.out.println( bottlesNum  +" "+ word + " verde , pendurada na parede");
            System.out.println(" E se uma garrafa derde cair acidentalmente, ");
                bottlesNum = bottlesNum - 1;
            
                if (bottlesNum > 0) {
                    System.out.println("Restará " + bottlesNum +" "+ word + " verde , pendurada na parede");
                } else {
                    System.out.println(" Restará " + bottlesNum + " não haverá garrafas verdes, pendurada na parede.");
                }
        }
    }
}