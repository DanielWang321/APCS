package apcs.unit10;

public class WaterFlowing {
    public static void main(String[] args) {
        int[][] mountain = { { 100, 99, 200, 200, 200, 200, 200, 200, 200, 200 },
                             { 200, 98, 200, 200, 200, 200, 200, 200, 200, 200 },
                { 200, 97, 96, 200, 200, 200, 200, 200, 200, 200 },
                { 200, 200, 95, 200, 200, 200, 85, 84, 83, 200 },
                { 200, 200, 94, 93, 92, 200, 86, 200, 82, 200 },
                { 200, 150, 200, 200, 91, 200, 87, 200, 81, 200 },
                { 200, 200, 200, 200, 90, 89, 88, 200, 80, 200 },
                { 200, 150, 100, 200, 200, 200, 200, 200, 79, 200 },
                { 200, 200, 200, 200, 200, 200, 200, 200, 78, 77 },
                { 200, 200, 200, 200, 200, 200, 200, 200, 200, 76 } };

        System.out.println("mountain 6,1: " + canFlowOffMap(mountain, 6, 1));
        System.out.println("mountain 1,0: " + canFlowOffMap(mountain, 1, 0));
        System.out.println("mountain 6,5: " + canFlowOffMap(mountain, 6, 5));
        System.out.println("mountain 5,2: " + canFlowOffMap(mountain, 5, 2));
        System.out.println("mountain 6,7: " + canFlowOffMap(mountain, 6, 7));
        System.out.println("mountain 7,3: " + canFlowOffMap(mountain, 7, 3));
        System.out.println("mountain 8,6: " + canFlowOffMap(mountain, 8, 6));
        //System.out.println("mountain 3,1: " + canFlowOffMap(mountain, 3, 1));

    }

    public static boolean canFlowOffMap(int[][] map, int r, int c) {

        if (r <= 0 || r >= map.length-1 || c <= 0 || c >= map[0].length-1) {
            return true;
        }
        int currentHeight = map[r][c];
        if (map[r - 1][c] < currentHeight) {
            return canFlowOffMap(map, r - 1, c);
        }
        if (map[r + 1][c] < currentHeight) {
            return canFlowOffMap(map, r +1, c);
        }
        if (map[r][c - 1] < currentHeight) {
            return canFlowOffMap(map, r , c-1);
        }
        if (map[r][c + 1] < currentHeight) {
            return canFlowOffMap(map, r , c+1);
        }
        return false;
    }
}
