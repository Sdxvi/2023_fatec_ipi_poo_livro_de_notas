public class TesteLivroDeNotas{
    public static void main(String args []){

        //nome completamente qualificado da classe
        String nomeDisciplina = javax.swing.JOptionPane.showInputDialog("Digite o nome da disciplina");
        //var = inferência de tipo
        var livroDeNotas = new LivroDeNotas(nomeDisciplina);
        // livroDeNotas.nomeDisciplina = nomeDisciplina;
        livroDeNotas.exibirMensagem();
        System.out.println("Ate logo");
    }
}