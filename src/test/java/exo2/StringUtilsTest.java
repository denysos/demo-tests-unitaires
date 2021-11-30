package exo2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exo3.CalculImpossibleException;
import exo3.StringUtils;

public class StringUtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDistanceLevenshtein0() throws CalculImpossibleException {
		assertEquals(0, StringUtils.levenshteinDistance("bonjour", "bonjour"));
	}
	
	@Test
	public void testDistanceLevenshteinMajuscules0() throws CalculImpossibleException {
		//attention case sensitive !
		assertEquals(0, StringUtils.levenshteinDistance("Bonjour", "bonjour"));
	}
	
	@Test
	public void testDistanceLevenshteinEspacesExtremite0() throws CalculImpossibleException {
		//attention case sensitive !
		assertEquals(0, StringUtils.levenshteinDistance("bonjour", "    bonjour"));
	}
	
	@Test
	public void testDistanceLevenshteinPermutation() throws CalculImpossibleException {
		assertEquals(2, StringUtils.levenshteinDistance("chien", "chine"));
	}

	@Test
	public void testDistanceLevenshtein1caractereEnPlus() throws CalculImpossibleException {
		assertEquals(1, StringUtils.levenshteinDistance("bonjour", "bonjoure"));
	}

	@Test
	public void testDistanceLevenshtein1caractereEnPlusFail() throws CalculImpossibleException {
		assertTrue(0 != StringUtils.levenshteinDistance("bonjour", "bonjoure"));
	}

	@Test
	public void testDistanceLevenshtein1caractereEnMoins() throws CalculImpossibleException {
		assertEquals(1, StringUtils.levenshteinDistance("bonjour", "bonjou"));
	}

	@Test
	public void testDistanceLevenshtein1caractereEnMoinsFail() throws CalculImpossibleException {
		assertTrue(0 != StringUtils.levenshteinDistance("bonjour", "bonjou"));
	}

	@Test
	public void testDistanceLevenshtein1caractereSubstitution() throws CalculImpossibleException {
		assertEquals(1, StringUtils.levenshteinDistance("bonjour", "bonjout"));
	}

	@Test
	public void testDistanceLevenshtein1caractereSubstitutionFail() throws CalculImpossibleException {
		assertTrue(0 != StringUtils.levenshteinDistance("bonjour", "bonjout"));
	}
	//

	@Test
	public void testDistanceLevenshtein2caractereEnPlus() throws CalculImpossibleException {
		assertEquals(2, StringUtils.levenshteinDistance("bonjour", "bonjourer"));
	}

	@Test
	public void testDistanceLevenshtein2caractereEnPlusFail()  throws CalculImpossibleException {
		assertTrue(1 != StringUtils.levenshteinDistance("bonjour", "bonjourer"));
	}

	@Test
	public void testDistanceLevenshtein2caractereEnMoins()  throws CalculImpossibleException {
		assertEquals(2, StringUtils.levenshteinDistance("bonjour", "bojou"));
	}

	@Test 
	public void testDistanceLevenshtein2caractereEnMoinsFail()  throws CalculImpossibleException {
		assertTrue(1 != StringUtils.levenshteinDistance("bonjour", "bojou"));
	}

	@Test
	public void testDistanceLevenshtein2caractereSubstitution()  throws CalculImpossibleException {
		assertEquals(2, StringUtils.levenshteinDistance("bonjour", "banjoun"));
	}

	@Test
	public void testDistanceLevenshtein2caractereSubstitutionFail()  throws CalculImpossibleException {
		assertTrue(1 != StringUtils.levenshteinDistance("bonjour", "banjoun"));
	}

//	@Test (expected = CalculImpossibleException.class)
	@Test
	public void testDistanceLevenshteinParamNull()  throws CalculImpossibleException {
		assertEquals(-1, StringUtils.levenshteinDistance("bonjour", null));
	}

}
