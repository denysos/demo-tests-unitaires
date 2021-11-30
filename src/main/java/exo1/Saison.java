package exo1;

public enum Saison {

	PRINTEMPS("Printemps", 1), ETE("Eté", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private String libelle;
	private int ordre;

	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}

	public static Saison coucouSaison(String libelle) {
		
			Saison[] saisonsss = Saison.values();
		for (Saison saison : saisonsss) {
			if (saison.getLibelle().equals(libelle)) {
				return saison;

			}

		}
		return null;

	}

	public String getLibelle() {
		return libelle;
	}

	public int getOrdre() {
		return ordre;
	}

}
