//package es.jmpalma.atackathon.catalogo.service;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.fail;
//
//import java.io.IOException;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.web.client.RestTemplate;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import es.jmpalma.atackathon.catalogo.dto.Libro;
//
//@RunWith(SpringRunner.class)
//@WebAppConfiguration
//@ContextConfiguration
//public class ServicioCatalogoTestIT {
//
//	/**
//	 * Test method for
//	 * {@link com.sdc.atackathon.service.FavoritoServiceController#getFavoritesBooks()}.
//	 */
//	@Test
//	public void testGetFavoritesBooks() {
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<String> response = restTemplate
//				.getForEntity("http://localhost:9090/favoritos/api/getFavoritesBooks", String.class);
//
//		assertNotNull(response);
//		assertNotNull(response.getStatusCode());
//		assertNotNull(response.getBody());
//
//		assertEquals(response.getStatusCode(), HttpStatus.OK);
//
//		ObjectMapper mapper = new ObjectMapper();
//		List<Libro> listado = null;
//		try {
//			listado = (List<Libro>) mapper.readValue(response.getBody(), List.class);
//			assertEquals(listado.size(), 4);
//		} catch (IOException e) {
//			fail("No ha devuelto la Beca correctamente --> id = 1");
//		}
//
//	}
//
//}
