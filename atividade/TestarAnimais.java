public class TestarAnimais {
    public static void main(String [] args){
        Mamifero camelo = new Mamifero(nome "Camelo",
                comprimento:150 cm,
                numerodepatas: 4,
                cor: "Amarelo"
                ambiente: "Terra",
                velocidademinima: 2.0 m/s);
        System.out.println("Informações do Camelo:");
        camelo.dadosMamifero();
        System.out.println();

        Peixe tubarao = new peixe(nome: "Tubarão",
                comprimento:300 cm,
                numerodepatas: 0,
                cor: "Cinzento"
                ambiente: "Mar",
                velocidademinima: 1.5 m/s
                caracteristica: "Barbatanas e cauda");
        System.out.println("Informações do Tubarão");
        tubarao.dadosPeixe();
        System.out.println();

        Mamifero ursocanada = new Mamifero(nome: "Urso-do-Canadá",
                comprimento:180 cm,
                numerodepatas:4,
                cor: "Vermelho",
                ambiente: "Terra"
                velocidademinima:0.5 m/s,
                Alimento:"Mel");
        System.out.println("Informações do Urso-do-Canadá");
        ursocanada.dadosMamifero();
        System.out.println();
    }
}
