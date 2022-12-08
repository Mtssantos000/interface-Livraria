package Interface;

import java.util.ArrayList;

public class Estoque extends Cad_Lista_Livro {
            ArrayList<Livro>ListaLivro;
	/*private static ArrayList<Livro> listalivros = new ArrayList<>();

	public static ArrayList<Livro> getListalivros() {
		return listalivros;
	}//metodo GEt
	
	//Add um objeto na lista
	static public void adicionar(Livro l) {
		listalivros.add(l);
	}
	
	static public String listar() {
		String saida="";
		long i=1;
		
		for(Livro l: listalivros) {
			saida += "\n====== Livro Nº: "+ (i++)+ " =======\n";
			saida += l.imprimir()+"\n";
		}
		
		return saida;
	}
	*/
	 public  boolean remover(String titulo) {
		for(Livro l : ListaLivro) {
			if(l.getTitulo().equalsIgnoreCase(titulo)) {
				ListaLivro.remove(l);

				return true;
			}
		}
		return false;
	}/**
	 * REMOVER LIVROS
	 **/

    /**
     * REMOVER LIVROS
     * @param ListaLivro
     */
   /* public static void setListalivros(ArrayList<Livro>ListaLivro){
		Estoque.ListaLivro = ListaLivro;
	}
	*/

    
   
    
}

