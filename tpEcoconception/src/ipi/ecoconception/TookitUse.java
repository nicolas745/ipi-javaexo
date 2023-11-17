package ipi.ecoconception;

import java.util.logging.Logger;

public class TookitUse {
    private static final Logger LOGGER = Logger.getLogger(TookitUse.class.getName());

    public static void main(String[] args) {
    	/*
        LOGGER.info("Ceci est un message d'information");
        LOGGER.warning("Ceci est un message d'avertissement");
        LOGGER.severe("Ceci est un message d'erreur");*/
    	Toolkit kit = new Toolkit();
    	LOGGER.info("test des methode concernant les niveaux de maturité");
    	LOGGER.info("nivau maturite donc le second nom comporte deux A: \n "+kit.getsomeLevelsWhichOtherNameContainingAA());
    	LOGGER.info("Moyenne des scores des niveaux de maturite "+kit.getLevelScoreAverage()+" %");
    	LOGGER.info("trst consernent mes methode outilz");
    	LOGGER.info("Nom des des outils commenant par la lettre S : \n" + kit.getSomeToolNames('s'));
    	LOGGER.info("Nom des outils dont la description comporte le mot Evauation: \n"+ kit.getSomeToolsByWord("Evauation"));
    	LOGGER.info("Tests des méthodes concernant le nombre de bonnes pratiques par domaine");
    	LOGGER.info("recupper les domain ordoner du domain comportant le plus de bonnes pratique au domaine qui coomporte le moins: \n"+ kit.getDomainListOrderedByNumberOfGoodPractices());
    }
}
