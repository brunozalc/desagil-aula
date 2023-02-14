package br.edu.insper.desagil.aula3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fichas {

	public List<Map<String, String>> reformata(List<Map<String, String>> originais) {
		List<Map<String, String>> creds = new ArrayList<>();
		for (Map<String, String> cred : originais) {
			Map<String, String> cred2 = new HashMap<>();
			if (cred.containsKey("curso")) {
				cred2.put("email", cred.get("login") + "@al.insper.edu.br");
			} else {
				cred2.put("email", cred.get("login") + "@insper.edu.br");
			}
			cred2.put("nome", cred.get("nome") + " " + cred.get("sobrenome"));
			creds.add(cred2);
		}
		return creds;
	}

}
