import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class ManipuladorDeStringTest {

	@Test
	public void deveRetornarFraseComPalavrasEmOrdemCrescente(){
		String fraseOrdenada = ManipuladorDeString.ordenaFrase("O rato roeu a roupa do rei de roma");
		assertEquals("O a do de rei rato roeu roma roupa", fraseOrdenada);
	}
	
	@Test
	public void deveRetornarFraseComPalavrasEmOrdemCrescente2(){
		String fraseOrdenada = ManipuladorDeString.ordenaFrase("Um pequeno jabuti xereta viu dez cegonhas felizes");
		assertEquals("Um viu dez jabuti xereta pequeno felizes cegonhas", fraseOrdenada);
	}
	
	@Test
	public void deveRetornarFraseComPalavrasEmOrdemCrescente3(){
		String fraseOrdenada = ManipuladorDeString.ordenaFrase("N�s chegamos na sala de aula");
		assertEquals("na de N�s sala aula chegamos", fraseOrdenada);
	}
	
	@Test
	public void deveRetornarFraseComPalavrasEmOrdemCrescente4(){
		String fraseOrdenada = ManipuladorDeString.ordenaFrase("Ficamos por aqui mesmo");
		assertEquals("por aqui mesmo Ficamos", fraseOrdenada);
	}
	
	@Test
	public void deveRetornarFraseComPalavrasEmOrdemCrescente5(){
		String fraseOrdenada = ManipuladorDeString.ordenaFrase("Eu e voc� voc� e eu");
		assertEquals("e e Eu eu voc� voc�", fraseOrdenada);
	}
	
}
