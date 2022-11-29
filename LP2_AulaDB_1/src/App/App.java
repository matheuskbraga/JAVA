package App;

import Controller.FuncionarioController;
import Controller.TelaController;
import Model.FuncionarioDAO;
import Model.Funcionario;
import View.CadastroFuncionario;
import View.ListarFuncionario;
import View.Menu;
import java.util.ArrayList;
import javax.swing.JFrame;

public class App {
    
    public static void main(String[] args) {
        Menu menu = new Menu();
        ListarFuncionario lista = new ListarFuncionario();
        CadastroFuncionario cadastro = new CadastroFuncionario();
        FuncionarioController fc = new FuncionarioController(lista, cadastro);
        
        
        TelaController tc = new TelaController(cadastro, lista, menu);
        fc.initController();
        tc.initController();
        lista.setVisible(true);
    }
}
