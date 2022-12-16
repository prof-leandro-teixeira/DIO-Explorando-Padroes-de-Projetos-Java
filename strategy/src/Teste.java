public class Teste {

    public static void main(String[] args) {

        System.out.println("Testes relacionados ao Design Pattern Strategy:");
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setStrategy(defensivo);
        robo.mover();

        robo.setStrategy(normal);
        robo.mover();
        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();


    }
}
