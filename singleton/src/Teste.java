public class Teste {
    public static void main(String[] args) {

        System.out.println("Testes relacionados ao Design Pattern Singleton:");

        Singleton singleton = Singleton.getInstancia();
        System.out.println(singleton);
        singleton = Singleton.getInstancia();
        System.out.println(singleton);

        SingletonJaInstancia singletonJaInstancia = SingletonJaInstancia.getInstancia();
        System.out.println(singletonJaInstancia);
        singletonJaInstancia = singletonJaInstancia.getInstancia();
        System.out.println(singletonJaInstancia);

        SingletonEncapsula singletonEncapsula = SingletonEncapsula.getInstancia();
        System.out.println(singletonEncapsula);
        singletonEncapsula = SingletonEncapsula.getInstancia();
        System.out.println(singletonEncapsula);
    }
}
