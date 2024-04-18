import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cantJugadores, jugadorInicia;
        byte a = 0, b = 0;
        char auxVoltearFicha;
        LinkedList <String> fichas = new LinkedList <String>();
        boolean pusoFicha = false;
        String ficha, fichaVolteada;
        while(fichas.size() < 28){
            if(b == 7){
                a++;
                b = a;
            }
            else{
                fichas.add("[" + a + "|" + b + "]");
                b++;
            }
        }
        //*Listas para cada jugador 
        Vector<String> jugador1 = new Vector<String>();
        Vector<String> jugador2 = new Vector<String>();
        Vector<String> jugador3 = new Vector<String>();
        Vector<String> jugador4 = new Vector<String>();
        Vector<String> jugador5 = new Vector<String>();
        Random aleat = new Random(); //Tomar de forma aleatoria las fichas para cada jugador
        System.out.println("Ingrese la cantidad de jugadores que conformarán el juego (Entre 2 y 5 jugadores)");
        while(true){
            cantJugadores = in.nextInt();
            if(cantJugadores >= 2 && cantJugadores <= 5){
                break;
            }
            else{
                System.out.println("Cantidad de jugadores inválida, por favor no te pases de listo conmigo :C");
                System.out.println("Ingrese una cantidad de jugadores válida (2 a 5 jugadores)");
            }
        }
        if(cantJugadores == 5){
            for(byte i = 0; i < 5; i++){
                jugador1.add(fichas.remove(aleat.nextInt(fichas.size())));
                jugador2.add(fichas.remove(aleat.nextInt(fichas.size())));
                jugador3.add(fichas.remove(aleat.nextInt(fichas.size())));
                jugador4.add(fichas.remove(aleat.nextInt(fichas.size())));
                jugador5.add(fichas.remove(aleat.nextInt(fichas.size())));
            }
        }
        else if(cantJugadores == 4){
            for(byte i = 0; i < 5; i++){
                jugador1.add(fichas.remove(aleat.nextInt(fichas.size())));
                jugador2.add(fichas.remove(aleat.nextInt(fichas.size())));
                jugador3.add(fichas.remove(aleat.nextInt(fichas.size())));
                jugador4.add(fichas.remove(aleat.nextInt(fichas.size())));
            }
        }
        else if(cantJugadores == 3){
            for(byte i = 0; i < 7; i++){
                jugador1.add(fichas.remove(aleat.nextInt(fichas.size())));
                jugador2.add(fichas.remove(aleat.nextInt(fichas.size())));
                jugador3.add(fichas.remove(aleat.nextInt(fichas.size())));
            }
        }
        else{
            for(byte i = 0; i < 7; i++){
                jugador1.add(fichas.remove(aleat.nextInt(fichas.size())));
                jugador2.add(fichas.remove(aleat.nextInt(fichas.size())));
            }
        }
        int jug_may_imp = 0, jug_may_par = 0, suma_impares = 0, suma_mayor_impar = 0;
        int ind_may_imp = 0, ind_may_par = 0; //Seleccionar la ficha con la que se comienza el juego
        String columna, mayor_par = "-1", mayor_impar = "-1"; 
        for (int i = 0; i < jugador1.size(); i ++){ 
           if (jugador1.isEmpty() == false){
                columna = jugador1.get(i);
                if (columna.charAt(1) == columna.charAt(3)){
                    if (columna.charAt(1) > mayor_par.charAt(0)){ 
                        mayor_par = Character.toString(columna.charAt(1));
                        jug_may_par = 1;
                        ind_may_par = i;                       
                    }
                }
                else{
                    suma_impares = Character.getNumericValue((columna.charAt(1))) + Character.getNumericValue((columna.charAt(3)));                           
                    if (suma_impares > suma_mayor_impar){
                        suma_mayor_impar = suma_impares;
                        jug_may_imp = 1;
                        ind_may_imp = i;
                    }
                }
          
            }
            if (jugador2.isEmpty() == false){
                columna = jugador2.get(i);
                if (columna.charAt(1) == columna.charAt(3)){
                    if (columna.charAt(1) > mayor_par.charAt(0)){ 
                        mayor_par = Character.toString(columna.charAt(1));
                        jug_may_par = 2;
                        ind_may_par = i;   
                    }
                }
                else{
                    suma_impares = Character.getNumericValue((columna.charAt(1))) + Character.getNumericValue((columna.charAt(3)));                           
                    if (suma_impares > suma_mayor_impar){
                        suma_mayor_impar = suma_impares;
                        jug_may_imp = 2;
                        ind_may_imp = i;
                    }
                }
            }
            if (jugador3.isEmpty() == false){
                columna = jugador3.get(i);
                if (columna.charAt(1) == columna.charAt(3)){
                    if (columna.charAt(1) > mayor_par.charAt(0)){    
                        mayor_par = Character.toString(columna.charAt(1));
                        jug_may_par = 3;
                        ind_may_par = i;     
                    }
                }
                else{
                    suma_impares = Character.getNumericValue((columna.charAt(1))) + Character.getNumericValue((columna.charAt(3)));                           
                    if (suma_impares > suma_mayor_impar){
                        suma_mayor_impar = suma_impares;
                        jug_may_imp = 3;
                        ind_may_imp = i;
                    }
                }
            }
            if (jugador4.isEmpty() == false){
                columna = jugador4.get(i);
                if (columna.charAt(1) == columna.charAt(3)){
                    if (columna.charAt(1) > mayor_par.charAt(0)){    
                        mayor_par = Character.toString(columna.charAt(1));
                        jug_may_par = 4;
                        ind_may_par = i;     
                    }
                }
                else{
                    suma_impares = Character.getNumericValue((columna.charAt(1))) + Character.getNumericValue((columna.charAt(3)));                           
                    if (suma_impares > suma_mayor_impar){
                        suma_mayor_impar = suma_impares;
                        jug_may_imp = 4;
                        ind_may_imp = i;
                    }
                }
            }
            if (jugador5.isEmpty() == false){
                columna = jugador5.get(i);
                if (columna.charAt(1) == columna.charAt(3)){
                    if (columna.charAt(1) > mayor_par.charAt(0)){    
                        mayor_par = Character.toString(columna.charAt(1));
                        jug_may_par = 5;
                        ind_may_par = i;     
                    }
                }
                else{
                    suma_impares = Character.getNumericValue((columna.charAt(1))) + Character.getNumericValue((columna.charAt(3)));                           
                    if (suma_impares > suma_mayor_impar){
                        suma_mayor_impar = suma_impares;
                        jug_may_imp = 5;
                        ind_may_imp = i;
                    }
                }
            }
        }    
        LinkedList<String> tablero = new LinkedList<String>(); //Seleccionar quién comienza el juego y creación del tablero
        if(jug_may_par != -1){
            if(jug_may_par == 1){
                tablero.add(jugador1.get(ind_may_par));
                jugador1.remove(jugador1.get(ind_may_par));
                System.out.println("El jugador 1 comienza el juego");
            }
            else if(jug_may_par == 2){
                tablero.add(jugador2.get(ind_may_par));
                jugador2.remove(jugador2.get(ind_may_par));
                System.out.println("El jugador 2 comienza el juego");
            }
            else if(jug_may_par == 3){
                tablero.add(jugador3.get(ind_may_par));
                jugador3.remove(jugador3.get(ind_may_par));
                System.out.println("El jugador 3 comienza el juego");
            }
            else if(jug_may_par == 4){
                tablero.add(jugador4.get(ind_may_par));
                jugador4.remove(jugador4.get(ind_may_par));
                System.out.println("El jugador 4 comienza el juego");
            }
            else{
                tablero.add(jugador5.get(ind_may_par));
                jugador5.remove(jugador5.get(ind_may_par));
                System.out.println("El jugador 5 comienza el juego");
            }
            jugadorInicia = jug_may_par;
        }
        else{
            if(jug_may_imp == 1){
                tablero.add(jugador1.get(ind_may_imp));
                jugador1.remove(jugador1.get(ind_may_imp));
                System.out.println("El jugador 1 comienza el juego");
            }
            else if(jug_may_imp == 2){
                tablero.add(jugador2.get(ind_may_imp));
                jugador2.remove(jugador2.get(ind_may_imp));
                System.out.println("El jugador 2 comienza el juego");
            }
            else if(jug_may_imp == 3){
                tablero.add(jugador3.get(ind_may_imp));
                jugador3.remove(jugador3.get(ind_may_imp));
                System.out.println("El jugador 3 comienza el juego");
            }
            else if(jug_may_imp == 4){
                tablero.add(jugador4.get(ind_may_imp));
                jugador4.remove(jugador4.get(ind_may_imp));
                System.out.println("El jugador 4 comienza el juego");
            }
            else{
                tablero.add(jugador5.get(ind_may_imp));
                jugador5.remove(jugador5.get(ind_may_imp));
                System.out.println("El jugador 5 comienza el juego");
            }
            jugadorInicia = jug_may_imp;
        }
        Vector[] jugadores = new Vector[cantJugadores]; //Seleccionamos la lista con los jugadores
        jugadores[0] = jugador1;
        jugadores[1] = jugador2;
        if (!jugador3.isEmpty()){
            jugadores[2] = jugador3;
        }
        if (!jugador4.isEmpty()){
            jugadores[3] = jugador4;
        }
        if (!jugador5.isEmpty()){
            jugadores[4] = jugador5;
        }
        int contPasa = 0;
        boolean juegoBloq = false;
        for (int  i = jugadorInicia; i <= jugadores.length; i ++){ //Parte del código que define el juego
            if(jugador1.isEmpty()){
                System.out.println("¡HAS GANADO EL JUEGO DEL DOMINO DE LOS FINES DE LOS TIEMPOS!");
                System.out.println("F E L I C I T A C I O N E S");
                break;
            }else if(jugador2.isEmpty()){
                System.out.println("¡EL JUGADOR 2 HA GANADO EL DOMINO DE LOS FINES DE LOS TIEMPOS!");
                break;
            }else if(jugador3.isEmpty() && cantJugadores >= 3){
                System.out.println("¡EL JUGADOR 3 HA GANADO EL DOMINO DE LOS FINES DE LOS TIEMPOS!");
                break;
            }else if(jugador4.isEmpty() && cantJugadores >= 4){
                System.out.println("¡EL JUGADOR 4 HA GANADO EL DOMINO DE LOS FINES DE LOS TIEMPOS!");
                break;
            }else if(jugador5.isEmpty() && cantJugadores >= 5){
                System.out.println("¡EL JUGADOR 5 HA GANADO EL DOMINO DE LOS FINES DE LOS TIEMPOS!");
                break;
            }
            if (i == jugadores.length){
                i = 0;
            }
            if (i == 0){ //Jugador 1 HUMANO
                System.out.println("Ingrese 0 para saltar turno (tomas una ficha)");
                System.out.println("Ingrese -1 para tomar una ficha del cementerio");
                System.out.println("Ingrese 1 para tomar una ficha y jugar con ella");
                System.out.println("El tablero es:"); System.out.println(tablero);
                System.out.println("Sus fichas son:");
                System.out.println(jugadores[i]);
                int juego = in.nextInt();
                if(juego == -1){
                    if(fichas.size() > 0){
                        jugadores[i].add(fichas.remove(aleat.nextInt(fichas.size())));
                        System.out.println("El tablero es:");
                        System.out.println(tablero);
                        System.out.println("Sus fichas son:");
                        System.out.println(jugadores[i]);
                        for(int k = 0; k < 2; k++){
                            System.out.println("¿Deseas tomar otra ficha?, presiona 1 si lo deseas, de lo contrario ingresa 0");
                            int cond = in.nextInt();
                            if(cond == 1){
                                if(fichas.size() > 0){ 
                                    jugadores[i].add(fichas.remove(aleat.nextInt(fichas.size())));
                                    System.out.println("Sus fichas son:");
                                    System.out.println(jugadores[i]);
                                }
                                else{
                                    System.out.println("No hay más fichas disponibles en el cementerio");
                                    break;
                                }
                            }else{
                                System.out.println("Ya que has elegido no tomar fichas, no puedes volver a tomar fichas en este turno");
                                break;
                            }
                        }
                        System.out.println("Ingrese 0 para saltar turno (tomas una ficha)");
                        System.out.println("Ingrese 1 para tomar una ficha y jugar con ella");
                        System.out.println("El tablero es:"); System.out.println(tablero);
                        System.out.println("Sus fichas son:");
                        System.out.println(jugadores[i]);
                        juego = in.nextInt();
                    }
                    else{
                        System.out.println("No hay fichas en el cementerio");
                        System.out.println("Ingresa 1 para seleccionar una ficha y jugar");
                        System.out.println("Ingrese 0 para saltar turno");
                        System.out.println(jugadores[i]);
                        juego = in.nextInt();
                    }
                }
                if(juego == 0){
                    contPasa ++;
                    if(fichas.size() > 0){
                        jugadores[i].add(fichas.remove(aleat.nextInt(fichas.size())));
                        System.out.println(jugadores[i]); System.out.println("Pasas turno");
                    }
                    else{
                        System.out.println("No hay fichas en el cementerio para tomar, pero pasas turno");
                    }
                }
                if(juego == 1){
                    while(true){
                        System.out.println("Selecciona una ficha del 1 al " + jugadores[i].size() + " Para moverla");
                        int fich = in.nextInt();
                        if(fich > jugadores[i].size()){
                            System.out.println("Has seleccionado una ficha fuera del rango, por favor, selecciona una ficha válida (Espero que haya sido un error y no me estés intentando estafar :D)");
                        }
                        else{
                            System.out.println("¿Dónde deseas moverla?, ingresa 1 para moverla a la izquierda o 2 para moverla a la derecha");
                            int dire=in.nextInt();
                            ficha = String.valueOf(jugadores[i].get(fich-1));
                            if(dire == 1){
                                if(ficha.charAt(3)==tablero.getFirst().charAt(1)){
                                    tablero.addFirst(ficha);
                                    jugadores[i].remove(fich-1);
                                    break;
                                }
                                else if(ficha.charAt(1)==tablero.getFirst().charAt(1)){
                                    String ficha2 = "[" + ficha.charAt(3) + "|" + ficha.charAt(1) + "]";
                                    tablero.addFirst(ficha2);
                                    jugadores[i].remove(fich-1);
                                    break;
                                }
                                else{
                                    System.out.println("Movimiento inválido, no te quieras pasar de listo conmigo !-.-!");
                                }
                            }
                            else if(dire == 2){
                                if(ficha.charAt(1)==tablero.getLast().charAt(3)){
                                    tablero.addLast(ficha);
                                    jugadores[i].remove(fich-1);
                                    break;
                                }
                                else if(ficha.charAt(3) == tablero.getLast().charAt(3)){
                                    String ficha2 = "[" + ficha.charAt(3) + "|" + ficha.charAt(1) + "]";
                                    tablero.addLast(ficha2);
                                    jugadores[i].remove(fich-1);
                                    break;
                                }
                                else{
                                    System.out.println("Movimiento inválido, no te quieras pasar de listo conmigo !-.-!");
                                }
                            }
                        }
                    }
                }
            }else{ //Jugadores máquinas
                for (int j = 0; j < jugadores[i].size(); j ++){
                    ficha = String.valueOf(jugadores[i].get(j));
                    if (ficha.charAt(1) == tablero.peek().charAt(1)){
                        fichaVolteada = "[" + ficha.charAt(3) + "|" + ficha.charAt(1) + "]";
                        tablero.addFirst(fichaVolteada); jugadores[i].remove(j);                         
                        pusoFicha = true;
                    }else if (ficha.charAt(3) == tablero.peek().charAt(1)){
                        tablero.addFirst(ficha); jugadores[i].remove(j);                                                                                                       
                        pusoFicha = true;
                    }else if (ficha.charAt(1) == tablero.peekLast().charAt(3)){
                        tablero.addLast(ficha); jugadores[i].remove(j);                                                                                                       
                        pusoFicha = true;
                    }else if (ficha.charAt(3) == tablero.peekLast().charAt(3)){
                        fichaVolteada = "[" + ficha.charAt(3) + "|" + ficha.charAt(1) + "]";
                        tablero.addLast(fichaVolteada); jugadores[i].remove(j);                        
                        pusoFicha = true;                                                                                                      
                    }
                    if (pusoFicha == true){
                        System.out.println("El jugador " + (i+1) + " ha puesto su ficha");
                        pusoFicha = false;
                        contPasa = 0;
                        break;                        
                    }
                    if(pusoFicha == false && j == (jugadores[i].size() -1)){
                        if(!fichas.isEmpty()){
                            jugadores[i].add(fichas.poll());
                            j = -1;
                        }else{
                            contPasa ++;
                            System.out.println("El jugador " + (i+1) + " ha saltado turno");
                        }
                    }
                }
                if(contPasa == cantJugadores){ //Juego bloqueado
                    juegoBloq = true;
                    System.out.println("EL JUEGO SE HA BLOQUEADO YA QUE NINGÚN JUGADOR TIENE UNA FICHA PARA JUGAR");
                    break;
                }
            }
        }
        int menor_tam = 10; //Desempate 
        if(juegoBloq == true){
            for(int i = 0; i < jugadores.length; i++){
                if(jugadores[i].size() < menor_tam){
                    menor_tam = i;
                }
            }
            System.out.println("El ganador es el jugador " + (menor_tam+1));
        }
        System.out.println("El tablero final es:");
        System.out.println(tablero);
    }    
}