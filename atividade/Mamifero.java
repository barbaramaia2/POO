public class Mamifero extends Animal{private String alimento;

    public Mamifero(String alimento,float comprimento, int numerodepatas, String cor, String ambiente, float velocidademedia);
    this.alimento = alimento;

    public

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    public void dadosMamifero(){
        super.dados();
        System.out.println("alimento" + alimento);
    }
}
