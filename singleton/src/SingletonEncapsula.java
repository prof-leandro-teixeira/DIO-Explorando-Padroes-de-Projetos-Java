/**
 * SingletonEncapsula já atribui a instância "SingletonEncapsula"
 * @author prof-leandro-teixeira
 */

public class SingletonEncapsula {
    private  static class Encapsula{
        public static SingletonEncapsula instancia = new SingletonEncapsula();
    }

    private SingletonEncapsula(){
        super();
    }
    public static SingletonEncapsula getInstancia(){
        return Encapsula.instancia;
    }

}
