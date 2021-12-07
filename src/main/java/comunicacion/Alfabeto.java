package comunicacion;

public class Alfabeto extends Pictograma{
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras=letras;
		this.interpretacion=interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
		
	}
	@Override
	public String interpretacion() {
		return interpretacion;
		
	}
	@Override
	public String toString() {
		String alfab = "";
		for(int i=0; i<letras.length; i++) {
			alfab += letras[i] + ", ";
		}
		return alfab.substring(0, alfab.length()-2);
	}
	public void setLetras(String[] letras) {
		this.letras=letras;
	}
	public String[] getLetras() {
		return letras;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion=interpretacion;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public static void main(String[] args) {
		
		
		Fabula fabula = new Fabula("pensamiento", "La tortuga y la liebre", "Esopo", 2, "no se debe uno burlar de los demás, ni presumir o ser vanidoso", "Cuento corto");
		System.out.println(fabula);
		Tesis tesis = new Tesis("Pensamiento expansivo", "Recomendador", "Alejandro", 20, "Recomendar asignaturas", new String [] {"Primero", "Segundo"}, "Se hace trabajo futuro", "[1] Maquinaria",  "Escrito investigativo");
		System.out.println(tesis);
		Libro libro = new Libro("Creacion", "El resplandor", "Stephen King", 599, "N/A", "Doubleday", "Primera", "Escrito largo");
		System.out.println(libro);
		Periodico periodico = new Periodico("Investigacion", "Se encontro la solucion", "Colombiano", 6, "20/12/2020", "Cura del covid", "Escrito informativo");
		System.out.println(periodico);
		
		
	}

}