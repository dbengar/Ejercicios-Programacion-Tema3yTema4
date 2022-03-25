package ejercicio7;

public class empleado {
	private String nif;
	private String nombre;
	private double sueldo_base;
	private int horas_extras;
	private double IRPF;
	private char casado;
	private int n_hijos;
	private static double importe_extra;
	
	public empleado() {
		
	}

	public empleado(String nif, String nombre, double sueldo_base, int horas_extras, double iRPF, char casado,
			int n_hijos) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.sueldo_base = sueldo_base;
		this.horas_extras = horas_extras;
		IRPF = iRPF;
		this.casado = casado;
		this.n_hijos = n_hijos;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo_base() {
		return sueldo_base;
	}

	public void setSueldo_base(double sueldo_base) {
		this.sueldo_base = sueldo_base;
	}

	public int getHoras_extras() {
		return horas_extras;
	}

	public void setHoras_extras(int horas_extras) {
		this.horas_extras = horas_extras;
	}

	public double getIRPF() {
		return IRPF;
	}

	public void setIRPF(double iRPF) {
		IRPF = iRPF;
	}

	public char getCasado() {
		return casado;
	}

	public void setCasado(char casado) {
		this.casado = casado;
	}

	public int getN_hijos() {
		return n_hijos;
	}

	public void setN_hijos(int n_hijos) {
		this.n_hijos = n_hijos;
	}

	public static double getImporte_extra() {
		return importe_extra;
	}

	public static void setImporte_extra(double importe_extra) {
		empleado.importe_extra = importe_extra;
	}
	
	public double  calculohorasextras() {
		if (horas_extras>0) {
			importe_extra=importe_extra*horas_extras;
		}else if(horas_extras==0){
			importe_extra=0;
		}
	return importe_extra;
	}
	
	public double salariobruto() {
		double salariobruto= sueldo_base+calculohorasextras();
		return salariobruto;
	}
	
	public double retencionirpf() {
		if(casado=='S' || casado=='s' ) {
			IRPF=IRPF-2;
		}
		if(n_hijos>0) {
			IRPF=IRPF-n_hijos;
		}
		double retencion= IRPF*salariobruto()/100;
		return retencion;
	}

	@Override
	public String toString() {
		return  nif +  nombre + "\nsueldo_base: " + sueldo_base + "\n horas_extras: "
				+ horas_extras + "\n tipo IRPF: " + IRPF + "\n Casado: " + casado + "\n Numero de hijos: " + n_hijos;
	}
	
	
	
	
}
