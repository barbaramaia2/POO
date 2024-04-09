public class Peixe extends Animal{
    private String caracteristica;

    public Peixe(String caracteristica,float comprimento, int numerodepatas, String cor, String ambiente, float velocidademedia);
    this.caracteristica = caracteristica;

    public

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    public void dadosPeixe(){
        super.dados();
        System.out.println("caracteristica" + caracteristica);
    }
}
