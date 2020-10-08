public class TesteConexao {

    public static void main(String[] args) {

        try (Conexao conex = new Conexao()){
            conex.leDados();
        } catch (Exception ex) {
            System.out.println("Deu erro na conexão");
        }


        //----------------------------------------------

        Conexao conexao = null;

//        try {
//            conexao = new Conexao();
//            conexao.leDados();
//        } catch (IllegalStateException ex){
//            System.out.println("Deu erro na conexão");
//        } finally {
//            conexao.close();
//        }
    }
}
