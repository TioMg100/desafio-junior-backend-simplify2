package com.desafio.junior;

import com.desafio.junior.entity.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class JuniorApplicationTests {
	@Autowired
	private WebTestClient webTestCliente;

	@Test
	void testeCreateTodoSuccess() {

		var todo = new Todo("chrystian", "Teste", false, 1);
		webTestCliente
				.post()
				.uri("/todos")
				.bodyValue(todo)
				.exchange()
				.expectStatus().isCreated()
				.expectBody()
				.jsonPath("$").isArray()
				.jsonPath("$.length()").isEqualTo(1)
				.jsonPath("$[0].nome").isEqualTo(todo.getNome())
				.jsonPath("$[0].descricao").isEqualTo(todo.getDescricao())
				.jsonPath("$[0].realizado").isEqualTo(todo.isRealizado())
				.jsonPath("$[0].prioridade").isEqualTo(todo.getPrioridade());
	}
	@Test
	void testCreateTodoFailure(){

		webTestCliente
				.post()
				.uri("/todos")
				.bodyValue( new Todo("","",false,0)).exchange().expectStatus().isBadRequest();


		}

	}


