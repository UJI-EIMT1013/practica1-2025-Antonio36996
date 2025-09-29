package practica1;

import java.util.*;

public class Practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos (Iterator<Integer> it) {
        Set<Integer> multiplos = new HashSet<>();

        List<Integer> numeros = new ArrayList<>();

        while (it.hasNext()) {
            int n1 = it.next();
            if (n1 != 0) {
                numeros.add(n1);
            }
        }

        for (Integer num : numeros) {
            for (Integer divisor : numeros) {
                if (!num.equals(divisor) && num % divisor != 0) {
                    multiplos.add(num);
                    break;
                }
            }
        }

        return multiplos;
        //TODO
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
