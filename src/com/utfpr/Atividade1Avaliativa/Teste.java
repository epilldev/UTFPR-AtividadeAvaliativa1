package com.utfpr.Atividade1Avaliativa;

import java.text.DecimalFormat;
import java.util.List;

public class Teste {

	public static void main(String[] args) {

		List<Carga> veiculos = List.of(new Carga("ABC123", "Ford", "ModeloX", "Vermelho", 80, 6, 8, 250, 1000, 500),
				new Carga("XYZ456", "Chevrolet", "ModeloY", "Azul", 70, 8, 10, 300, 1200, 600),
				new Carga("DEF789", "Toyota", "ModeloZ", "Verde", 90, 6, 8, 220, 800, 400),
				new Carga("GHI101", "Nissan", "ModeloA", "Prata", 75, 10, 12, 350, 1500, 700),
				new Carga("JKL111", "Volkswagen", "ModeloB", "Preto", 85, 8, 10, 280, 1100, 550));

		List<Passeio> veiculosPasseio = List.of(new Passeio("ABC001", "Honda", "Civic", "Azul", 150.5f, 4, 4, 160, 5),
				new Passeio("XYZ002", "Toyota", "Corolla", "Prata", 140.2f, 4, 4, 150, 5),
				new Passeio("DEF003", "Volkswagen", "Golf", "Branco", 155.0f, 4, 4, 170, 5),
				new Passeio("GHI004", "Ford", "Focus", "Preto", 135.8f, 4, 4, 130, 5),
				new Passeio("JKL005", "Chevrolet", "Cruze", "Vermelho", 145.7f, 4, 4, 140, 5));

		imprimirCarga(veiculos, 0);
		imprimirInformacoes(veiculosPasseio, 0);

	}

	public static void imprimirCarga(List<Carga> veiculos, int index) {

		DecimalFormat df = new DecimalFormat("0.000");
		if (index < veiculos.size()) {
			Carga veiculo = veiculos.get(index);

			System.out.println("************************************************************");
			System.out.println("Veiculo Carga " + (index + 1));
			System.out.println("Marca: " + veiculo.getMarca());
			System.out.println("Modelo: " + veiculo.getModelo());
			System.out.println("Placa: " + veiculo.getPlaca());
			System.out.println("Velocidade Máxima: " + df.format(veiculo.calcVel(veiculo.getVelocMax())));
			System.out.println("Quantidade de Pistão: " + veiculo.getMotor().getQtdPist());
			System.out.println("Potência: " + veiculo.getMotor().getPotencia());
			System.out.println("Tara: " + veiculo.getTara());

			imprimirCarga(veiculos, index + 1);
		}
	}

	public static void imprimirInformacoes(List<Passeio> veiculos, int index) {
		DecimalFormat df = new DecimalFormat("0.000");
		if (index < veiculos.size()) {
			Passeio veiculo = veiculos.get(index);

			System.out.println("************************************************************");
			System.out.println("Veiculo Passeio " + (index + 1));
			System.out.println("Marca: " + veiculo.getMarca());
			System.out.println("Modelo: " + veiculo.getModelo());
			System.out.println("Placa: " + veiculo.getPlaca());
			System.out.println("Velocidade Máxima: " + df.format(veiculo.calcVel(veiculo.getVelocMax())));
			System.out.println("Quantidade de Passageiros: " + veiculo.getQtdePassageiros());
			System.out.println("Potência: " + veiculo.getMotor().getPotencia());
			System.out.println("Quantidade de Pistões: " + veiculo.getMotor().getQtdPist());

			imprimirInformacoes(veiculos, index + 1); // Chamada recursiva para o próximo veículo
		}
	}
}
