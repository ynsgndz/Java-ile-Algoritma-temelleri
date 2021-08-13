
public class Main {

    public static void main(String[] args) {


        String [][] list=new String[6][4];
        for (int i=0 ; i<list.length;i++){
            for (int k=0;k< list[i].length;k++)
            {
                if (i==0 || i==2 || i==3 || i==5){
                    list[i][k]=" * ";
                }
                else if(k==0 || k==3){
                    list[i][k]=" * ";
                }
                else{
                    list[i][k]="   ";
                }
            }
        }

        for (String[] l:list){
            for (String m:l){
                System.out.print(m);
            }
            System.out.println();
        }





    }
}
    