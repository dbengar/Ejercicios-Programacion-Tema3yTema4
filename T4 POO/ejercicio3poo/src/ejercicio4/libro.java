package ejercicio4;

public class libro {
		private String titulo;
		private String autor;
		private int numero_ejemplares;
		private int numero_ejemplares_prestados;
		
		
		public libro() {
			}


		public libro(String titulo, String autor, int numero_ejemplares, int numero_ejemplares_prestados) {
			super();
			this.titulo = titulo;
			this.autor = autor;
			this.numero_ejemplares = numero_ejemplares;
			this.numero_ejemplares_prestados = numero_ejemplares_prestados;
		}


		public String getTitulo() {
			return titulo;
		}


		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}


		public String getAutor() {
			return autor;
		}


		public void setAutor(String autor) {
			this.autor = autor;
		}


		public int getNumero_ejemplares() {
			return numero_ejemplares;
		}


		public void setNumero_ejemplares(int numero_ejemplares) {
			this.numero_ejemplares = numero_ejemplares;
		}


		public int getNumero_ejemplares_prestados() {
			return numero_ejemplares_prestados;
		}


		public void setNumero_ejemplares_prestados(int numero_ejemplares_prestados) {
			this.numero_ejemplares_prestados = numero_ejemplares_prestados;
		}


		
		
		public boolean prestamo () {
			boolean hacer_prestamo=true;
			if(numero_ejemplares==0) {
				hacer_prestamo=false;
			}else {
				numero_ejemplares_prestados++;
				numero_ejemplares--;
			}
			return hacer_prestamo;
		}
		
		public boolean devolucion () {
			boolean hacer_devolucion=true;
			if(numero_ejemplares_prestados==0) {
				hacer_devolucion=false;
			}else {
				numero_ejemplares_prestados--;
				numero_ejemplares++;
			}
			return hacer_devolucion;
		}


		@Override
		public String toString() {
			return "\n libro titulo= " + titulo + "\n autor=" + autor + "\n numero_ejemplares=" + numero_ejemplares
					+ "\n numero_ejemplares_prestados=" + numero_ejemplares_prestados + "";
		}
		
		
		
		
}
