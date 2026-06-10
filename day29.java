//two dimensional Array
public class day29 {
    public static void main(String[] args){
        int[][] a = new int[5][4];
        int[][] arr ={
                {10,20,30,40},
                {50,60,70,80},
                {90,100,110,120},
                {130,140,150,160,170},
                {180,190,200,210}
        };
        System.out.println(a[1][2]);

        for(int[] i:arr)
        {
            for(int j:i){
                System.out.print(j + " ");
            }
        }
    }
}
