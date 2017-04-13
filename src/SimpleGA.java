public class SimpleGA {
    public static void main(String[] args){
        Population p = new Population(1000);
        for (int i = 0; true; ++i){
            if (i % 10 == 0){
                System.out.printf(p.toString());
            }
            p.live();
            p.reproduce();
            if(p.getPercentFitted() > 0.1){
                break;
            }
        }
        p.live();
        System.out.printf(p.toString());
    }
}
