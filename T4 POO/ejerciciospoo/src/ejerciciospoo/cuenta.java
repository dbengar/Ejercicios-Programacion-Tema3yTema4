package ejerciciospoo;

public class cuenta {
	private String nombre;
	private String numero_de_cuenta;
	private double tipo_de_interes;
	private double saldo;
	
	public cuenta (){
		
	}
	
	public cuenta(String nombre, String numero_de_cuenta, double tipo_de_interes, double saldo) {
		  this.nombre= nombre;
		  this.numero_de_cuenta= numero_de_cuenta;
		  this.tipo_de_interes= tipo_de_interes;
		  this.saldo = saldo;
		  
	}
	
	
	public cuenta(cuenta cuentacliente) {
		  this.nombre= cuentacliente.nombre;
		  this.numero_de_cuenta= cuentacliente.numero_de_cuenta;
		  this.tipo_de_interes= cuentacliente.tipo_de_interes;
		  this.saldo = cuentacliente.saldo;
		  
	}

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero_de_cuenta() {
		return numero_de_cuenta;
	}

	public void setNumero_de_cuenta(String numero_de_cuenta) {
		this.numero_de_cuenta = numero_de_cuenta;
	}

	public double getTipo_de_interes() {
		return tipo_de_interes;
	}

	public void setTipo_de_interes(double tipo_de_interes) {
		this.tipo_de_interes = tipo_de_interes;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//Fin getters and setters
	
	public boolean ingreso(double ingreso) {
		boolean ingreso_cuenta = true;
		if (ingreso>0) {
			saldo+=ingreso;
		}else {
			ingreso_cuenta=false;
		}
		return ingreso_cuenta;
	}
	
	
	public boolean reintegro(double reintegro) {
		boolean reintegro_cuenta = true;
		if(reintegro>0 && saldo>reintegro) {
			saldo-=reintegro;
		}else {
			reintegro_cuenta=false;
		}
		return reintegro_cuenta;
	}
	
	public boolean transferencia(cuenta c, double n) {
        boolean correcto = true;
        if (n < 0) {
            correcto = false;
        } else if (saldo >= n) {
            reintegro(n);
            c.ingreso(n);
        } else {
            correcto = false;
        }
        return correcto;
    }

	@Override
	public String toString() {
		return "cuenta [nombre=" + nombre + ", numero_de_cuenta=" + numero_de_cuenta + ", tipo_de_interes="
				+ tipo_de_interes + ", saldo=" + saldo + "]";
	}	
	
	
	
}
