package exo3;

/**
 * Classe qui fournit des services de traitements de chaines de caractères
 * 
 * @author DIGINAMIC
 */

public final class StringUtils 
{

	/**
	 * Retourne la distance de Levenshtein entre 2 chaines de caractères.
	 * 
	 * Ne prend pas en compte les espaces des extremités ni les majuscules
	 * 
	 * @param lhs chaine 1
	 * @param rhs chaine 2
	 * @return distance
	 */
	public static int levenshteinDistance(String lhs, String rhs) throws CalculImpossibleException {

		if (lhs == null || rhs == null) {
//			throw new CalculImpossibleException("impossible de calculer la distance de levenshtein à partir de null !");
			return -1;
		}
		
		//ne pas prendre en compte les espaces des extremités ni les majuscules
		String lhsNS = lhs.toLowerCase().trim();
		String rhsNS = rhs.toLowerCase().trim();
		int len0 = lhsNS.length() + 1;
		int len1 = rhsNS.length() + 1;
		int[] cost = new int[len0];
		int[] newcost = new int[len0];
		for (int i = 0; i < len0; i++) {
			cost[i] = i;
		}
		for (int j = 1; j < len1; j++) {
			newcost[0] = j;
			for (int i = 1; i < len0; i++) {
				int match = (lhsNS.charAt(i - 1) == rhsNS.charAt(j - 1)) ? 0 : 1;
				int costReplace = cost[i - 1] + match;
				int costInsert = cost[i] + 1;
				int costDelete = newcost[i - 1] + 1;
				newcost[i] = Math.min(Math.min(costInsert, costDelete), costReplace);
			}
			int[] swap = cost;
			cost = newcost;
			newcost = swap;
		}
		return cost[len0 - 1];
	}

}
