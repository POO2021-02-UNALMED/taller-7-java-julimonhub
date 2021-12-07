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
		//Alfabeto alfabeto = new Alfabeto("alfabeto griego, occidente", new String [] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}, "Alfabeto latino");
		//System.out.println(alfabeto);
		
		Fabula fabula = new Fabula("pensamiento", "La tortuga y la liebre", "Esopo", 2, "no se debe uno burlar de los demás, ni presumir o ser vanidoso", "Cuento corto");
		System.out.println(fabula);
		Tesis tesis = new Tesis("Pensamiento expansivo", "Recomendador", "Alejandro", 20, "Recomendar asignaturas", new String [] {"Primero", "Segundo"}, "Se hace trabajo futuro", "[1] Maquinaria",  "Escrito investigativo");
		System.out.println(tesis);
		Libro libro = new Libro("Creacion", "El resplandor", "Stephen King", 599, "N/A", "Doubleday", "Primera", "Escrito largo");
		System.out.println(libro);
		Periodico periodico = new Periodico("Investigacion", "Se encontro la solucion", "Colombiano", 6, "20/12/2020", "Cura del covid", "Escrito informativo");
		System.out.println(periodico);
		
		/*System.out.println(alfabeto.getOrigen());
		System.out.println(alfabeto.cantidadLetras());
		System.out.println(fabula.getOrigen());
		System.out.println(fabula.getTitulo());
		System.out.println(fabula.getAutor());
		System.out.println(fabula.getPaginas());
		System.out.println(fabula.getEnsenanza());
		System.out.println(libro.getOrigen());
		System.out.println(libro.getTitulo());
		System.out.println(libro.getAutor());
		System.out.println(libro.getPaginas());
		System.out.println(libro.getCo_autor());
		System.out.println(libro.getEditorial());
		System.out.println(libro.getEdicion());
		System.out.println(periodico.getOrigen());
		System.out.println(periodico.getTitulo());
		System.out.println(periodico.getAutor());
		System.out.println(periodico.getPaginas());
		System.out.println(periodico.getFecha());
		System.out.println(periodico.getPrimicia());
		System.out.println(tesis.getOrigen());
		System.out.println(tesis.getTitulo());
		System.out.println(tesis.getAutor());
		System.out.println(tesis.getPaginas());
		System.out.println(tesis.getIdea());
		System.out.println(tesis.getArgumentos());
		System.out.println(tesis.getArgumentos().length);
		System.out.println(tesis.getConclusion());
		System.out.println(tesis.getReferencias());
		System.out.println(alfabeto.interpretacion());
		System.out.println(fabula.interpretacion());
		System.out.println(fabula.palabrasTotales(140));
		System.out.println(libro.interpretacion());
		System.out.println(libro.palabrasTotales(140));
		System.out.println(periodico.interpretacion());
		System.out.println(periodico.palabrasTotales(140));
		System.out.println(tesis.interpretacion());
		System.out.println(tesis.palabrasTotales(140));*/
		
	}

}