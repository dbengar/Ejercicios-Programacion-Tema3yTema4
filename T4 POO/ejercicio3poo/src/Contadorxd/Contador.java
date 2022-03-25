package Contadorxd;

public class Contador {
	
	private int cont;

	public Contador(){
		
	}
	
	public Contador(int cont) {
		this.cont= cont;
		if(cont<0) {		
			cont=0;
		}
	}
	
	public Contador(Contador user) {
		this.cont= user.cont;
		if(user.cont<0) {		
			user.cont=0;
		}
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public int incrementar(int incremento) {
		incremento=cont++ ;
		return incremento;
	}
	
	public int decrementar(int decremento) {
		if(cont<0) {
			decremento=0;
		}else {
			decremento=cont--;

		}
		return decremento;
	}
}
