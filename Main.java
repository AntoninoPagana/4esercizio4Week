import javax.lang.model.type.ArrayType;

public class Main {
    public static void main(String[] args) {
        int[] array = {5,8,2,6,9};
        dividoNumero(array,12);
    }
    public static void dividoNumero(int[] array, int parametroSlotArray){
        try {
            int risultato = array[parametroSlotArray] / 0;
            System.out.println("Risultato divisione: " + risultato);
        } catch (ArithmeticException e){
            System.out.println("Errore: " + e);
        } catch (Exception e){
            System.out.println("Errore: " + e);
        }
    }
}
