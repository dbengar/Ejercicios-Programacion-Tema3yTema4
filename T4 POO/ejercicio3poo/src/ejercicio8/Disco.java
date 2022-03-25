package ejercicio8;

public class Disco {
	private String codigo;
	private String autor;
	private String titulo;
	private String tipo;
	private int duracion;
	
	public Disco() {
			
	}
	
	public Disco(int codigo, String autor, String titulo, String tipo, int duracion) {
		super();
		this.codigo = "LIBRE";
		this.autor = autor;
		this.titulo = titulo;
		this.tipo = tipo;
		this.duracion = duracion;
	}
	

	public Disco(Disco disco) {
		super();
		this.codigo = disco.codigo;
		this.autor = disco.autor;
		this.titulo = disco.titulo;
		this.tipo = disco.tipo;
		this.duracion = disco.duracion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Disco [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", tipo=" + tipo + ", duracion="
				+ duracion + "]";
	}
	

}

