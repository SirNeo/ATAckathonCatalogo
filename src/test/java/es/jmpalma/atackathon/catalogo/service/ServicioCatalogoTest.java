//package es.jmpalma.atackathon.catalogo.service;
//
//import static org.hamcrest.Matchers.containsString;
//import static org.hamcrest.Matchers.empty;
//import static org.hamcrest.Matchers.equalTo;
//import static org.hamcrest.Matchers.hasSize;
//import static org.hamcrest.Matchers.not;
//import static org.junit.Assert.fail;
//import static org.mockito.Matchers.anyLong;
//import static org.mockito.Matchers.anyObject;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.nio.charset.Charset;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertTrue;
//import static org.mockito.Matchers.any;
//import static org.mockito.Matchers.anyDouble;
//import static org.mockito.Matchers.anyInt;
//import static org.mockito.Matchers.anyList;
//import static org.mockito.Matchers.anyLong;
//import static org.mockito.Matchers.anyObject;
//import static org.mockito.Matchers.anyString;
//import static org.mockito.Mockito.doNothing;
//import static org.mockito.Mockito.when;
//import static org.mockito.Mockito.verify;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultActions;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//
//@RunWith(SpringRunner.class)
////@SpringBootTest(classes = FavoritoApplication.class)
//@WebAppConfiguration
//public class ServicioCatalogoTest {
//	private MockMvc mockMvc;
//
//	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
//           MediaType.APPLICATION_JSON.getSubtype(),
//           Charset.forName("utf8"));
//
//	@Autowired
//   private WebApplicationContext webApplicationContext;
//
//	@MockBean
//   private FavoritoDAO favDAO;
//
//	@MockBean
//	CatalogoClient catalogoClient;
//
//	@InjectMocks
//	private FavoritoServiceController favoritoController;
//
//	@Before
//   public void setup() throws Exception {
//       this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//   }
//
//	/**
//	 * Test method for {@link com.sdc.atackathon.service.FavoritoServiceController#getFavoritesBooks()}.
//	 */
//	@Test
//	public void testGetFavoritesBooksVacio() {
//		when(favDAO.getFavoritesIds()).thenReturn(new ArrayList<Integer>());
//
//		try {
//			ResultActions res = this.mockMvc.perform(get("/favoritos/api/getFavoritesBooks")
//								        	.contentType(contentType))
//											//.andDo(print())
//								        	.andExpect(status().isOk())
//								        	.andExpect(jsonPath("$", empty()));
//		} catch (JsonProcessingException e1) {
//			fail(e1.getMessage());
//		} catch (Exception e) {
//			fail(e.getMessage());
//		}
//	}
//
//	@Test
//	public void testGetFavoritesBooksOk() {
////		List<Book> listado = new ArrayList<Book>();
//		Book bookCarga1 = new Book(1, "Libro1", "Libro1 de Pepe", 1);
////		listado.add(bookCarga);
//		Book bookCarga2 = new Book(2, "Libro2", "Libro2 de Pepe", 1);
////		listado.add(bookCarga);
//		Book bookCarga3 = new Book(3, "Libro3", "Libro3 de Pepe", 1);
////		listado.add(bookCarga);
//		Book bookCarga4 = new Book(4, "Libro4", "Libro4 de Pepe", 1);
////		listado.add(bookCarga);
//
//		ArrayList<Integer> listadoIdsFavoritos = new ArrayList<Integer>();
//		listadoIdsFavoritos.add(Integer.valueOf(1));
//		listadoIdsFavoritos.add(Integer.valueOf(2));
//		listadoIdsFavoritos.add(Integer.valueOf(3));
//		listadoIdsFavoritos.add(Integer.valueOf(4));
//
//		when(favDAO.getFavoritesIds()).thenReturn(listadoIdsFavoritos);
//		when(catalogoClient.getBookDetail(anyInt())).thenReturn(bookCarga1,
//															 bookCarga2,
//															 bookCarga3,
//															 bookCarga4);
//		try {
//			ResultActions res = this.mockMvc.perform(get("/favoritos/api/getFavoritesBooks")
//						        	.contentType(contentType))
//									//.andDo(print())
//						        	.andExpect(status().isOk())
//						        	.andExpect(jsonPath("$", not(empty())))
//						        	.andExpect(jsonPath("$", hasSize(4)));
//		} catch (JsonProcessingException e1) {
//			fail(e1.getMessage());
//		} catch (Exception e) {
//			fail(e.getMessage());
//		}
//
//	}
//
//}