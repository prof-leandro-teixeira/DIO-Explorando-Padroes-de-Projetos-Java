/**
 * SingletonJaInstancia já atribui a instância "SingletonJaInstancia"
 * @see <a href="https://stackoverflow.com/questions/15019306/regarding-static-holder-singleton-pattern/24018148#24018148">Referencia</a>
 * @author prof-leandro-teixeira
 */

public class SingletonJaInstancia {
    private  static SingletonJaInstancia instancia = new SingletonJaInstancia();
    private SingletonJaInstancia(){
        super();
    }
    public static SingletonJaInstancia getInstancia(){
        return instancia;
    }

}
