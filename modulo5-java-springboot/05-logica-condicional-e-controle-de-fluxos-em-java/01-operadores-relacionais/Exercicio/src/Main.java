public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        boolean aceite = true;

        if(a == b){
            System.out.println("Os números são iguais " + a + " = " + b);
        }else{
            System.out.println("Os números são diferentes " + a + " != " + b);
        }

        System.out.println((aceite == true ? "OK, é verdadeiro!" : "No, Falso"));

        if(aceite == true){
            System.out.println("OK, é verdadeiro!");
        }

        String texto = "Felipe";

        if( texto == "Felipe"){
            System.out.println("é você mesmo Felipe.");
        }



    }
}