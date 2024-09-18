public class Mains {
    public static void main(String[] args) {
      String[][] yes = new String[3][3];
      yes[0][0] = "sign";
      yes[0][1] = "swine";
      yes[0][2] = "time";
      yes[1][0] = "Yesssir";
      yes[1][1] = "Due";
      yes[1][2] = "Sizi";
      yes[2][0] = "Peaxy";
      yes[2][1] = "Nas";
      yes[2][2] = "Sense";
      
      for(int i= 0 ; i < yes.length ; i++){
        System.out.println();
        for(int p = 0; p < yes.length ; p++){
          System.out.println(yes[i][p] + " ");
        }
      }  
      } 
      
    }