public class sandPile {
    public static int forI=-1;
    public static int forJ=-1;


    public static void main(String args[]){
        int n=2;
        int[][]pule={{1,2,0},{1,3,3,},{0,1,1}};
        sandpile(n,pule);


    }


    public static int[][] sandpile(int n, int[][]pile){
        for(int i=0;i<n;i++){
             forI=-1;
             forJ=-1;

            int centerCoordinate =n/2;
            int center = pile[centerCoordinate][centerCoordinate];


            center ++;
            if(center ==4){
                addNeighbors(pile, centerCoordinate, centerCoordinate);
            boolean notScanned=true;
            while(notScanned) {
                notScanned=scanMatrix(pile);
                if(forI!=-1&&forJ!=-1)
                addNeighbors(pile, forI, forJ);
            }

            }
            }
        return pile;
    }

        public static boolean scanMatrix(int[][]pile){
            forI=-1;
            forJ=-1;

            for(int i=0;i<pile.length;i++){
            for(int j=0;j<pile.length;j++){
                if(pile[i][j]==4){
                    forI=i;
                    forJ=j;
                    return true;
                }
            }
        }
        return false;
        }

        public static void addNeighbors(int[][]pile,int placeI,int placeJ){
            pile[placeI][placeJ] = 0;
            System.out.println("place is " + placeI + " place j " + placeJ);
            if (placeI - 1 >= 0) {
                pile[placeI - 1][placeJ] += 1;
            }
            if (placeI + 1 < pile.length) {
                pile[placeI + 1][placeJ] += 1;
            }
            if (placeJ - 1 >= 0) {
                pile[placeI][placeJ - 1] += 1;
            }
            if (placeJ + 1 < pile.length) {
                pile[placeI][placeJ + 1] += 1;
            }


            System.out.println("************* ");
            for (int i = 0; i < pile.length; i++) {
                for (int j = 0; j < pile.length; j++) {
                    System.out.println((pile[i][j]));
                }
            }
        }
}
