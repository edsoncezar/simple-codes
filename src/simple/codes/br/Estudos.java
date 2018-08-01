package simple.codes.br;

/**
 Este exemplo mostra como criar uma JTree bem
 simples. Os itens s�o fornecidos como um array
 de objetos, de forma que cada sub-array
 constitui uma se��o da �rvore. Os elementos s�o
 inseridos em suas devidas posi��es usando uma
 fun��o recursiva.
 
 @author edson
**/


import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;

public class Estudos extends JFrame{
  public Estudos(){
    super("Exemplo de uma JTree simples");
	
    Object[] linguagens = {
      "Linguagens",
      new Object[]{
        "Compiladas",
        "C++",
        "Delphi"
      }, 
      new Object[]{
        "Interpretadas",
        "JavaScript",
        "Python",
        "Ruby"
      }, 
      new Object[]{
    	"Edson",
    	"JavaScript",
    	"Python",
    	new Object[]{
    	    	"Edson",
    	    	"JavaScript",
    	    	"Python",
    	    	"Ruby"
    	},
       }
    };

    DefaultMutableTreeNode raiz = montar(linguagens);
    JTree arvore = new JTree(raiz);  

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
			
    JScrollPane scrollPane = new JScrollPane(arvore);
    c.add(scrollPane);
    	
    setSize(400, 300);
    setVisible(true);
  }
	
  public static void main(String args[]){
    Estudos app = new Estudos();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  private DefaultMutableTreeNode montar(Object[] hier){
    DefaultMutableTreeNode no = new DefaultMutableTreeNode(hier[0]), filho;
    
    for(int i = 1; i < hier.length; i++){
      Object n_no = hier[i];
      if(n_no instanceof Object[]) // n� possui filhos
        filho = montar((Object[])n_no);
      else
        filho = new DefaultMutableTreeNode(n_no); // folha
      no.add(filho);
    }

    return(no);
  }
}
