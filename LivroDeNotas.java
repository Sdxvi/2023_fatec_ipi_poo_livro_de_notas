public class LivroDeNotas{
    //variável de instância
    //private é um modificador de acesso
    // ENCAPSULAMENTO
    private String nomeDisciplina;
    // metódos getters/setters
    // princípio do menor privilégio
    //getter :
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    //setter :
    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }


    public void exibirMensagem(){
        System.out.printf("Bem vindo ao livro de notas de %s \n", nomeDisciplina);
    }
    
    //construtor padrão (aquele cuja lista de parâmetros é vazia)
    LivroDeNotas(String n){
        //shadowing, aconteceria caso o nome dessa String fosse nomeDisciplina, assim por conta dos nomes iguais a mais recente acaba deixando a outra na "sombra"
        //para corrigir isso, você insere o this. atrás do objeto que já existe na classe
        nomeDisciplina = n;
    }
}