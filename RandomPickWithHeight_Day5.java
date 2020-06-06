class RandomPickWithHeight_Day5 {
    
    private TreeMap<Integer,Integer> tmap;
    private Random rand;
    private int total;
    
    public RandomPickWithHeight_Day5(int[] w) {
        tmap = new TreeMap<>();
        total = 0;
        rand = new Random();
        for(int i = 0 ; i <w.length ; i++)
        {
            total += w[i];
            tmap.put(total,i);
        }
    }
    
    public int pickIndex() {
        int k = tmap.higherKey(rand.nextInt(total));
        return tmap.get(k);
    }
}
