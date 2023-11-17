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
    	LOGGER.info("nivau maturite donc le second nom comporte deux A: \n "+kit.getsomeLevelsWhichOtherNameContainingAA().toString());
    	
    }
}
