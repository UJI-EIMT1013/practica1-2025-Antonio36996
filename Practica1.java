package practica1;

import java.util.*;

public class Practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos (Iterator<Integer> it) {
        Set<Integer> multiplos = new HashSet<>();

        while (it.hasNext()) {
            int n1 = it.next();
            while (it.hasNext()) {
                int n2 = it.next();
                if (n1 % n2 != 0) {
                    multiplos.add(n1);
                    break;
                }
            }

        }
        return multiplos;
        //TODO
        return null;
    }

    //EJERCICIO2
    public static void separate (Set<Integer> cuadrados, Set<Integer> noCuadrados)  {
        //TODO

    }

    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        //TODO
        return null;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        //TODO
        return null;
    }



}
