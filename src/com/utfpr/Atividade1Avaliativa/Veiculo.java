package com.utfpr.Atividade1Avaliativa;

public abstract class Veiculo {

	String placa;
	String marca;
	String modelo;
	String cor;
	float velocMax;
	int qtdRodas;

	Motor motor;

	public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPist,
			int potencia) {

		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.velocMax = velocMax;
		this.qtdRodas = qtdRodas;
		this.motor = new Motor(qtdPist, potencia);
	}

	public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas) {

		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.velocMax = velocMax;
		this.qtdRodas = qtdRodas;
		motor = new Motor();
	}

	public Veiculo() {

		this.placa = "";
		this.marca = "";
		this.modelo = "";
		this.cor = "";
		this.velocMax = 0;
		this.qtdRodas = 0;
		motor = new Motor();
	}
	
	public abstract float calcVel(float velocMax);

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(float velocMax) {
		this.velocMax = velocMax;
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		String veiculo = "Cor: " + this.cor + "\n" + "Marca: " + this.marca + "\n" + "Modelo: " + this.modelo + "\n"
				+ "Placa: " + this.placa + "\n" + "Quantidade de rodas: " + this.qtdRodas + "\n" + "Velocidade Máxima: "
				+ this.velocMax + "\n" + "Quantidade de Pistão: " + this.motor.getQtdPist() + "\n" + "Potência: "
				+ this.motor.getPotencia() + "\n";

		return veiculo;
	}

}
