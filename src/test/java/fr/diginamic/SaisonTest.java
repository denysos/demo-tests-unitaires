package fr.diginamic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exo1.Saison;

public class SaisonTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLibelleSaison() {
		String libelle = Saison.AUTOMNE.getLibelle();
		int rang = Saison.AUTOMNE.getOrdre();
		
		assertEquals("Automne", libelle);
		assertEquals(3,rang);
	}
	
	@Test
	public void testLibelleSaisonInconu() {
		Saison saison = Saison.valueOf("AUTOMNE");
		String libelle = saison.getLibelle();
		
		assertEquals("Auuuutomne", libelle);
	}
	
	@Test
	public void testLibelleSaisonNull() {
		Saison saison = Saison.valueOf("AUTOMNE");
		String libelle = saison.getLibelle();
		
		assertEquals(null, libelle);
	}

}
