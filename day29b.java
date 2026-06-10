//three dimensional Array
public class day29b {
    public static void main(String[] args){
        int[][][] a = new int[2][3][4];
        int[][][] arr ={
                {
                        {10, 20, 30, 40},
                        {50, 60, 70, 80},
                        {90, 100, 110, 120}
                },

                {
                        {130, 140, 150, 160},
                        {170, 180, 190, 200},
                        {210, 220, 230, 240}
                }

        };
        System.out.println(arr[0][1][2]);
        System.out.println(arr[1][2][3]);

        for(int[][] i:arr){
            for(int[] j:i){
                for(int k:j){
                    System.out.print(k + " ");
                }
            }
        }

    }

}
