package br.edu.insper.desagil.aula20;

import java.io.IOException;

import br.pro.hashi.sdx.dao.DaoClient;

public class Fixture {
	public static void main(String[] args) throws IOException {
		DaoClient client = DaoClient.fromCredentials("main.json");
		client.connect();

		/* NÃO MODIFIQUE NADA ACIMA DESTA LINHA. */

		Dao<Paciente> dao = Dao.of(Paciente.class);
		Paciente paciente = new Paciente(73, "João");
		paciente.addDosagem("dipirona", 70);
		paciente.addDosagem("colecalciferol", 80);
		
		dao.create(paciente);
		
		Paciente paciente = dao.retrieve(73);
		System.out.println(paciente.getNumero());
		System.out.println(paciente.getNome());

		Paciente paciente = new Paciente(74, "Maria");
		dao.update(paciente);

		dao.delete(73);

		List<Paciente> pacientes = new ArrayList<>();
		pacientes.add(new Paciente(75, "Pedro"));
		pacientes.add(new Paciente(76, "José"));

		Historico historico = new Historico("Máquina de Raio-X", pacientes);

		dao.create(historico);
		

		/* NÃO MODIFIQUE NADA ABAIXO DESTA LINHA. */

		client.disconnect();
	}
}
