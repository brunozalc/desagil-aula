package br.edu.insper.desagil.aula13;

import br.pro.hashi.sdx.rest.jackson.server.JacksonRestServer;
import br.pro.hashi.sdx.rest.server.RestServer;

public class WebApi {
	public static void main(String[] args) {
		RestServer server = JacksonRestServer.from("br.edu.insper.desagil.aula13.resource");
		server.start();
		System.out.println("Endereço privado: %s".formatted(server.getPrivateUrl()));
		System.out.println("Endereço público: %s".formatted(server.getPublicUrl()));
	}
}
