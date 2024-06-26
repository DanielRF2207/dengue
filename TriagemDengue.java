package dengue;

public class TriagemDengue {

	public static void main(String[] args) {

		String dengue = "";
		dengue += verificaSintomas("Dor de cabeça");
		dengue += verificaSintomas("Febre");
		dengue += verificaSintomas("Dor atrás dos olhos");
		dengue += verificaSintomas("Dor nas articulações");

		System.out.println(dengue);

		diagnostico(dengue);

	}

	private static void diagnostico(String dengue) {
		boolean d1 = dengue.contains("Dor de cabeça");
		boolean d2 = dengue.contains("Febre");
		boolean d3 = dengue.contains("Dor atrás dos olhos");
		boolean d4 = dengue.contains("Dor nas articulações");

		boolean diagnosticoFinal = d1 && d2 && d3 && d4;

		System.out.println("A pessoa está com dengue?" + diagnosticoFinal);

	}

	private static String verificaSintomas(String sintoma) {

		return String.format("%s \n", sintoma);
	}

}