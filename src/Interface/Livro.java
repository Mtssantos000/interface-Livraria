package Interface;

public class Livro {
    private String titulo;
    private String autor;
    private String tipo;
    private int id;
    private double valor;
  

 

	public Livro() {
		super();
	}



	public Livro(String titulo, String autor, String tipo, int id, double valor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.tipo = tipo;
		this.id = id;
                this.valor = valor; 
	}



	public String imprimir() {
        return "Titulo:"+titulo+"\n"+"Autor:"+autor+"\n"+"Tipo:"+tipo+"\n"+"Id:"+id+"\n" + String.format("Preço R$:%.2f \n" ,valor);
    }

	

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the tipo
     */
    public String getGenero() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setGenero(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    
}
