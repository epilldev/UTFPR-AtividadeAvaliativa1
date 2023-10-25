package com.utfpr.Atividade1Avaliativa;

public final class Passeio extends Veiculo {

	private int qtdePassageiros;

	public Passeio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passeio(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPist,
			int potencia) {
		super(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPist, potencia);
		// TODO Auto-generated constructor stub
	}

	public Passeio(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas) {
		super(placa, marca, modelo, cor, velocMax, qtdRodas);
		// TODO Auto-generated constructor stub
	}

	public Passeio(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPist,
			int potencia, int qtdePassageiros) {
		super(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPist, potencia);
		this.qtdePassageiros = qtdePassageiros;
	}

	public int getQtdePassageiros() {
		return qtdePassageiros;
	}

	public void setQtdePassageiros(int qtdePassageiros) {
		this.qtdePassageiros = qtdePassageiros;
	}

	@Override
	public float calcVel(float velocMax) {
		return velocMax * 1000;
	}

}
