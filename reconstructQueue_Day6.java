class reconstructQueue_Day6 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b) -> a[0]==b[0] ? a[1]-b[1] : b[0]-a[0]);
        List<int[]> ans = new ArrayList<>();
        for(int[] p : people)
        {
            ans.add(p[1],p);
        }
        int n = people.length;
        return ans.toArray(new int[n][2]);
    }
}
