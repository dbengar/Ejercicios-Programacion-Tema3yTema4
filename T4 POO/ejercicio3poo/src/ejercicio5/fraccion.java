package ejercicio5;

public class fraccion {
	private int num;
	private int den;

	public fraccion() {
        this.num = 0;
        this.den = 1;
	}

	public fraccion(int num, int den) {
		super();
		this.num = num;
		if (den==0) {
			den=1;
		}
		this.den = den;
		simplificar();
	}
	
	public fraccion(int num) {
    this.num = num;
    this.den = 1;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}
	
	//sumar fracciones
    public fraccion sumar(fraccion f) {
    	fraccion aux = new fraccion();
        aux.num = this.num * f.den + this.den * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  //se simplifica antes de devolverla                                                   
        return aux;
    }
   
    //restar fracciones
    public fraccion restar(fraccion f) {
    	fraccion aux = new fraccion();
        aux.num = this.num * f.den - this.den * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
    }
   
    //multiplicar fracciones
    public fraccion multiplicar(fraccion f) {
    	fraccion aux = new fraccion();
        aux.num = this.num * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
    }

    //dividir fracciones
    public fraccion dividir(fraccion f) {
    	fraccion aux = new fraccion();
        aux.num = this.num * f.den;
        aux.den = this.den * f.num;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
    }
   
    //Cálculo del máximo común divisor por el algoritmo de Euclides                                               
    private int mcd() {
        int u = Math.abs(num); //valor absoluto del numerador
        int v = Math.abs(den); //valor absoluto del denominador
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    //método para simplificar fracciones
    private void simplificar() {
        int n = mcd(); //se calcula el mcd de la fracción
        num = num / n;
        den = den / n;
    }

    @Override
    public String toString() {
        simplificar();
        return num + "/" + den;
    }    
	
}
