package janelas;
import estruturas.Parametros;
import javax.swing.UIManager;
public class Principal {    
    public static void main (String[] args) throws Exception{
         UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
        Parametros parametros = new Parametros();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal(parametros).setVisible(true);
            }
        });
    
        
    }
    
}
