public class TestaContaComExceptionChecked {

    public static void main(String[] args) {
        Conta conta = new Conta();
        try {
            conta.deposita();
        } catch (MinhaException minha){
            System.out.println("tratamento....");
        }
    }
}
