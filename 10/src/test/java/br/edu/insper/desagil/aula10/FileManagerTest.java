package br.edu.insper.desagil.aula10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileManagerTest {
	private FileManager f;

	@BeforeEach
	void setUp() {
		f = new FileManager();
	}

	@Test
	void load() {
		String content = assertDoesNotThrow(() -> {
			return f.load("entrada.txt");
		});
		assertEquals("hello world\n", content);
	}

	@Test
	void loadMissing() {
		IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
			f.load("missing.txt");
		});
		assertEquals("Arquivo não encontrado", e.getMessage());
	}

	@Test
	void loadInvalid() {
		String content = assertDoesNotThrow(() -> {
			return f.load("invalid.txt");
		});
		assertNull(content);
	}

	@Test
	void save() {
		assertDoesNotThrow(() -> {
			f.save("saida.txt", "hello world\n");
	});
	}
}
