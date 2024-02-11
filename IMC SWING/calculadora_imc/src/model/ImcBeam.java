package model;

import java.text.DecimalFormat;

public class ImcBeam {
	private float peso;
	private float altura;
	
	
	public ImcBeam(String peso, String altura) {
		setPeso(peso);
		setAltura(altura);
	}
	
	public ImcBeam() {}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public void setPeso(String peso) {
		this.peso = (peso.matches("[0-9.]+")== false ? 0f:Float.parseFloat(peso));
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public void setAltura(String altura) {
		this.altura = (altura.matches("[0-9.]+")== false ? 0f:Float.parseFloat(altura));
	}
	
	public String getResultado() {
		Float imc = peso/(altura*2);
		
		if(imc.isNaN())
			return "Valores Vazios";
		
		StringBuilder result = new StringBuilder("\nIMC =" + new DecimalFormat("#.#").format(imc));
		
		if(imc < 18.5) {
			result.append("\nVocê está Abaixo do Peso");
		}else if(imc >= 18.6 && imc <= 24.9){
			result.append("\nPeso ideal(Parabéns)");
		}else if(imc >= 25 && imc <= 29.9) {
			result.append("\nLevemente Acima do Peso");
		}else if (imc >= 30 && imc <= 34.9) {
			result.append("\nObsidade Grau I");
		}else if(imc >=35 && imc <= 39.9) {
			result.append("\nObsidade Grau II (Severa)");
		}else {
			result.append("\nObsidade III (Mórbida)");
		}
		
		return result.toString();
	}
	@Override
	public String toString() {
		return "Resultado" + getResultado() + "";
	}
	
}
