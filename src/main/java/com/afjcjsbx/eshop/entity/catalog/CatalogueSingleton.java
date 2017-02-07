package com.afjcjsbx.eshop.entity.catalog;

import java.util.ArrayList;

public class CatalogueSingleton {

   /* Si utilizzano espedienti Java per realizzare un'implementazione comunque
    Thread-safe del Singleton, ma più efficiente rispetto ad usare Synchronized sul
	getSingletonIntance().
	Si usa una classe dentro l'altra
	 */

    private ArrayList<Product> singletonCatalogue;


    /**
     * The inner-class LazyCointainer is loaded only at the first invocation of getInstance.
     * This activity results "thread-safe".
     *
     * @author gulyx
     */
    private static class LazyCointainer {
        private final static CatalogueSingleton sigletonInstance = new CatalogueSingleton(null);
    }

    protected CatalogueSingleton(ArrayList<Product> catalogue) {
        this.singletonCatalogue = catalogue;
    }

    public void singletonOperation1() {
    }

    public ArrayList<Product> getSingletonCatalogue() {
        return singletonCatalogue;
    }

    public static final CatalogueSingleton getSingletonInstance() {
        return LazyCointainer.sigletonInstance;
    }

}