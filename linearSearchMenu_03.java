public class linearSearchMenu_03 {

    public static void linearSearch(String[] menu, String Key){
        String message="Dish not found";
        for(int i=0;i<menu.length;i++){
            if(menu[i]==Key){

                System.out.println("Dish found at option "+ i);
                break;
            } 
            else{
                System.out.println("Dish not found");
                
            }
            
        }  
        
         
    }
    public static void main(String[] args) {
        String[] menu={"Samosa","VadaPav","PaniPuri", "Bhelpuri"};
        String Key="PaniPuri";

        linearSearch(menu, Key);
     
    }
}
