public class matrix {
    public static void main(String[] args) {
        String[] friends = {"Brian", "Ronald", "Laura"};

        int[][] scores = {
                {1, 2, 4, 2, 6, 5, 4, 3, 3, 2, 5, 7, 2, 7, 8, 4, 3, 2},
                {2, 3, 5, 1, 1, 2, 3, 1, 1, 2, 4, 1, 3, 3, 2, 6, 3, 2},
                {4, 4, 2, 1, 2, 2, 1, 4, 2, 2, 2, 3, 2, 5, 8, 1, 2, 2}
        };
        System.out.println("Score Table: ");
        for(int i=0; i < friends.length; i++){

            System.out.printf("%s %n-------------%n",friends[i]);
            for(int j=0; j<scores[i].length; j++){
                System.out.printf("Hole #%d: %d %n", j+1, scores[i][j]);
            }
            System.out.println();

        }
    }
}


