package br.edu.insper.desagil.aula10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class FileManager {
	private CharsetDecoder decoder;

	public FileManager() {
		this.decoder = Charset.forName("UTF-8").newDecoder();
	}

	private String readContent(BufferedReader reader) throws IOException {
		String content = "";
		String line = reader.readLine();
		while (line != null) {
			content += line;
			line = reader.readLine();
		}
		return content + "\n";
	}

	public String load(String path) {
		System.out.println("Abrindo leitor");
		InputStream fileStream;
		try {
			fileStream = new FileInputStream(path);
			System.out.println("Leitor aberto");
		} catch (FileNotFoundException e) {
			throw new IllegalArgumentException("Arquivo não encontrado");
		}
		System.out.println("Leitor aberto");

		Reader fileReader = new InputStreamReader(fileStream, decoder);
		BufferedReader reader = new BufferedReader(fileReader);

		System.out.println("Lendo conteúdo");
		String content;
		try {
			content = readContent(reader);
			System.out.println("Conteúdo lido");
		} catch (IOException e) {
			System.err.println("Erro ao ler conteúdo: " + e.getMessage());
			content = null;
		}

		System.out.println("Fechando leitor");
		try {
			reader.close();
			System.out.println("Leitor fechado");
		} catch (IOException e) {
			System.err.println("Erro ao fechar leitor");
		}
		System.out.println("Leitor fechado");

		return content;
	}

	public void save(String path, String content) {
		System.out.println("Abrindo escritor");
		FileWriter writer;
		try {
			writer = new FileWriter(path);
			System.out.println("Escritor aberto");
		} catch (IOException e) {
			throw new IllegalArgumentException("Erro ao abrir escritor: " + e.getMessage());
		}

		System.out.println("Escrevendo conteúdo");
		try {
            writer.write(content);
			System.out.println("Conteúdo escrito");
        } catch (IOException e) {
			System.err.println("Erro ao escrever conteúdo: " + e.getMessage());
        }

		System.out.println("Fechando escritor");
		try {
			writer.close();
			System.out.println("Escritor fechado");
		} catch (IOException e) {
			System.err.println("Erro ao fechar escritor");
		}
	}
}
