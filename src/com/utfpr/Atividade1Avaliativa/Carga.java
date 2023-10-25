package com.utfpr.Atividade1Avaliativa;

public final class Carga extends Veiculo {

	private int cargaMax;
	private int tara;

	public Carga() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carga(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPist,
			int potencia) {
		super(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPist, potencia);
		// TODO Auto-generated constructor stub
	}

	public Carga(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas) {
		super(placa, marca, modelo, cor, velocMax, qtdRodas);
		// TODO Auto-generated constructor stub
	}

	public Carga(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPist,
			int potencia, int cargaMax, int tara) {
		super(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPist, potencia);
		this.cargaMax = cargaMax;
		this.tara = tara;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public int getTara() {
		return tara;
	}

	public void setTara(int tara) {
		this.tara = tara;
	}

	@Override
	public float calcVel(float velocMax) {
		return velocMax * 100000; // 1 km/h = 100000 cm/h
	}

}
