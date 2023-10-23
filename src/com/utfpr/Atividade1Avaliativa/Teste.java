package com.utfpr.Atividade1Avaliativa;

public class Teste {

	public static void main(String[] args) {

		Veiculo veiculo1 = new Veiculo();
		veiculo1.setPlaca("ABC123");
		veiculo1.setMarca("Toyota");
		veiculo1.setModelo("Corolla");
		veiculo1.setCor("Verde");
		veiculo1.setVelocMax(180.0f);
		veiculo1.setQtdRodas(4);
		veiculo1.getMotor().setQtdPist(4);
		veiculo1.getMotor().setPotencia(150);

		Veiculo veiculo2 = new Veiculo("XYZ789", "Honda", "Civic", "Vermelho", 170.0f, 4);

		Veiculo veiculo3 = new Veiculo("ABC123", "Toyota", "Corolla", "Azul", 180.0f, 4, 4, 150);

		System.out.println("Veiculo 1:");
		System.out.println(veiculo1.toString());

		System.out.println("************************************************************");
		System.out.println("Veiculo 2");
		System.out.println("Placa: " + veiculo2.getPlaca());
		System.out.println("Marca: " + veiculo2.getMarca());
		System.out.println("Modelo: " + veiculo2.getModelo());
		System.out.println("Cor: " + veiculo2.getCor());
		System.out.println("Quantidade de rodas: " + veiculo2.getQtdRodas());
		System.out.println("Velocidade Máxima: " + veiculo2.getVelocMax());
		System.out.println("Quantidade de Pistão: " + veiculo2.getMotor().getQtdPist());
		System.out.println("Potência: " + veiculo2.getMotor().getPotencia());

		System.out.println("************************************************************");
		System.out.println("Veiculo 3");
		System.out.println("Placa: " + veiculo3.getPlaca());
		System.out.println("Marca: " + veiculo3.getMarca());
		System.out.println("Modelo: " + veiculo3.getModelo());
		System.out.println("Cor: " + veiculo3.getCor());
		System.out.println("Quantidade de rodas: " + veiculo3.getQtdRodas());
		System.out.println("Velocidade Máxima: " + veiculo3.getVelocMax());
		System.out.println("Quantidade de Pistão: " + veiculo3.getMotor().getQtdPist());
		System.out.println("Potência: " + veiculo3.getMotor().getPotencia());

	}

}
