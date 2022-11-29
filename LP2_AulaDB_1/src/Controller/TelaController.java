
package Controller;

import View.CadastroFuncionario;
import View.ListarFuncionario;
import View.Menu;

public class TelaController {
    private Menu menu;
    private CadastroFuncionario cadastro;
    private ListarFuncionario lista;

    public TelaController(CadastroFuncionario cadastro, ListarFuncionario lista, Menu menu){
        this.cadastro = cadastro;
        this.lista = lista;
        this.menu = menu;
    }
    
    public void initController(){ 
        
        if(menu.getNome_menu().getText().equals("Matheus") && menu.getSenha_menu().getText().equals("12345")){
        }
        
        /*
        //logar no sistema com User e senha fixos
        menu.getBotao_menu
        //mudar da tela listar para cadastro
        lista.getjBNew().addActionListener(e -> exibirTelaCadastro());
        //mudar da tela de cadastro para tela listage
        cadastro.getjBReturn().addActionListener(e -> exibirTelaListagem());
        */
        
        
    }
    
    private void exibirTelaCadastro(){
        cadastro.setVisible(true);
        lista.setVisible(false);
    }
    private void exibirTelaListagem(){
        lista.setVisible(true);
        cadastro.setVisible(false);
    }
    private void exibirMenu(){
        
    }
    
}
