class twoCitySchedCostDay3 {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b) -> (a[0]-b[0])-(a[1]-b[1]));
       int cost = 0;
        for(int i = 0 ; i < costs.length/2 ; i++)
        {
            cost += costs[i][0];
            cost += costs[costs.length/2+i][1];
        }
        return cost;
    }
}
