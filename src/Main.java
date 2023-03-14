public class Main {
    public static void main(String[] args) {

        try{
            int divider =0;
            int value = 500;
            if (divider==0){
                throw new Exception("Divided by zero");
            }
            int result=value/divider;
            System.out.println("results=="+result);

        }catch(Exception e){
            System.out.println(" error aayo divided by zero ");
        }




    }
}