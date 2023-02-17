package carreraMente;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class CarreraMente {

	public static void main(String[] args) {
		
		
		
		
		
		
		int opc = 1;
		int ganador = 0;
		
		
		
		JOptionPane.showMessageDialog(null, "Bienvenido al carrera de mente"
				+ "\n¿Quien sera el primero en terminar la carrera? "
				+ "\nEl juego consiste en contestar preguntas, de temas variados"
				+ "\ny conseguir las 6 estrellas.","Bienvenido al Carrera de Mente",JOptionPane.PLAIN_MESSAGE,
				new ImageIcon(CarreraMente.class.getResource("/img/bienvenida.png")));
		
		
		
		
		do {
			opc=Integer.parseInt((String) JOptionPane.showInputDialog(null, "ingrese una opcion"
					+ "\n ( 1 ) Reglas"
					+ "\n ( 2 ) Comenzar a jugar"
					+ "\n ( 3 ) Salir","Carrera de Mente - opcion",
					
			JOptionPane.PLAIN_MESSAGE,new ImageIcon(CarreraMente.class.getResource("/img/pregunta.png")), null, null));
			
			while(opc != 1 && opc != 2 && opc != 3 && opc != 0) {
				opc=Integer.parseInt((String) JOptionPane.showInputDialog(null, "ingrese una opcion"
						+ "\n ( 1 ) Reglas"
						+ "\n ( 2 ) Comenzar a jugar"
						+ "\n ( 3 ) Salir","Carrera de Mente - opcion",
						JOptionPane.PLAIN_MESSAGE,new ImageIcon(CarreraMente.class.getResource("/img/pregunta.png")), null, null));
			}
		
		
		
			switch (opc) {
			case 1:
				mostrar();
				break;
			case 2:
				jugar(ganador);
				break;
			
			case 3:
				
			default:
				break;
			}
			
		
			
		} while (opc!=3 );
		
		JOptionPane.showMessageDialog(null, "¡¡ Gracias por jugar !!","Carrera de Mente",JOptionPane.PLAIN_MESSAGE,
				new ImageIcon(CarreraMente.class.getResource("/img/gracias.png")));
	}
	
	
	public static void mostrar() {
		JOptionPane.showMessageDialog(null, "Reglas: "
				+ "\n numero de jugadores: 2"
				+ "\n Se eligira al azar el primer jugador en comenzar la carrera"
				+ "\n se tira un dado para avanzar en el tablero, dependiendo de la casilla,"
				+ "\n se elegira el tema , (Deportes, Naturaleza, Entretenimiento, Historia, Cmabalache, Arte)"
				+ "\n si se responde bien continua respondiendo,hay casillas que te dan estrellas,"
				+ "\n al conseguir 6 estrellas terminaras la carrrera, si sos primero y terminaste la carrera el segundo"
				+ "\n jugador podra continuar la carrera hasta que se equvoque , de no equivocarse los jugadores empataran","Reglas",JOptionPane.PLAIN_MESSAGE,
				new ImageIcon(CarreraMente.class.getResource("/img/reglas.png")));
	}
	
	public static void jugar(int ganador) {
		
			
		int tablero[]=new int [50];
		// ingresos de los nombre
		String nombreJugadorA  = (String) JOptionPane.showInputDialog(null, "ingrese nombre del jugador",
				"INGRESO", JOptionPane.PLAIN_MESSAGE,new ImageIcon(CarreraMente.class.getResource("/img/usuario.png")), null, null);
		while(nombreJugadorA.equalsIgnoreCase("")){
			 nombreJugadorA  = (String) JOptionPane.showInputDialog(null, "ingrese nombre del jugador",
					"INGRESO", JOptionPane.PLAIN_MESSAGE,new ImageIcon(CarreraMente.class.getResource("/img/usuario.png")), null, null);
		}
		
		int jugadorA = 0;
		int medalleroJugadorA =0;
		
		String nombreJugadorB = (String) JOptionPane.showInputDialog(null, "ingrese nombre del jugador",
				"INGRESO", JOptionPane.PLAIN_MESSAGE,new ImageIcon(CarreraMente.class.getResource("/img/usuario.png")), null, null);
		while(nombreJugadorB.equalsIgnoreCase("")){
			 nombreJugadorB  = (String) JOptionPane.showInputDialog(null, "ingrese nombre del jugador",
					"INGRESO", JOptionPane.PLAIN_MESSAGE,new ImageIcon(CarreraMente.class.getResource("/img/usuario.png")), null, null);
		}
		
		
		int jugadorB = 0;
		int medalleroJugadorB =0;
		
		int primeraPosicion;
		String nombrePrimerTurno;
		int medalleroPrimerTurno;
		
		int segundaPosicion;
		String nombreSegundoTurno;
		int medalleroSegundoTurno;
		
		
		
		String preguntasCambalache[]=new String [67];
		String correctasCambalache[]=new String [67];
		
		String preguntasHistoria[]=new String [67];
		String correctasHistoria[]=new String [67];
		
		String preguntasEntretenimiento[]=new String [67];
		String correctasEntretenimiento[]=new String [67];
		
		String preguntasDeporte[]=new String [67];
		String correctasDeporte[]=new String [67];
		
		String preguntasNaturaleza[]=new String [67];
		String correctasNaturaleza[]=new String [67];
		
		String preguntasArte[]=new String [67];
		String correctasArte[]=new String [67];
		
		
		//preguntas y respuestas/////////////////////////
		preguntasCambalache[0]="";
		preguntasCambalache[1]="¿De que color es bandera de Qatar?\na. bordo y blanco\nb. azul y verde\nc. marron y violeta";
		preguntasCambalache[2]="¿Cual de estos animale se parece a una lagartija?\na. Salamanca\nb. Mantis\nc. Dragon de Komodo";
		preguntasCambalache[3]="¿De que pais es danza nacional la mazurca?\na. Alemania\nb. Polonia\nc. Suiza";
		preguntasCambalache[4]="¿Osiris era el hermano o el marido de Isis?\na. La dos cosas\nb. marido\nc. hermano";
		preguntasCambalache[5]="¿la pelota de futbol profesional mide 22cm de diametro, mas o menos ?\na. mas\nb. menos\nc. justo 22cm";
		preguntasCambalache[6]="¿La xilografia es el arte de grabar...?\na. madera\nb. aluminio\nc. acero quirurgico";
		
		preguntasCambalache[7]="¿Del promedio de 10 huevos que pone un tiburon blanco¿cuantos llegan a nacer??\na. apenas uno\nb. 3 o 4\nc. 7 u 8";
		preguntasCambalache[8]="La piramide de Keops en Egipto.¿Es mas alta que la torre Eiffel?\na. No\nb. Si\nc. Miden lo mismo";
		preguntasCambalache[9]="¿Como se denomina a la zona de la profundidad submarina en la que logra penetrar la luz solar?\na. Fotica\nb. Luminica\nc. Solacea";
		preguntasCambalache[10]="¿Que ancho tiene una cancha de futbol para un partido internacional?(metros)\na. 64/75\nb. 50/55\nc. 45/48";
		preguntasCambalache[11]="¿Como llamo Colon a la isla de Cuba cuando la descubrio?\na. Isabel\nb. Juana\nc. Cuba";
		preguntasCambalache[12]="¿El nucleo de nuestro planeta a cuanta temperatura se encuentra?\na. 20000ºc\nb. 10000ºc\nc. 6000ºc";
		
		preguntasCambalache[13]="¿Cuantos años estuvo preso Nelson Mandela?\na. 17\nb. 20\nc. 27";
		preguntasCambalache[14]="¿Cuantos años estuvo en pie el muro de Berlin?\na. 24\nb. 27\nc. 28";
		preguntasCambalache[15]="¿El mar muerto es un mar?\na. No\nb. Si \nc. es ficticio";
		preguntasCambalache[16]="¿De que continente es originario la caña de azucar?\na. Asia\nb. America\nc. Europa";
		preguntasCambalache[17]="¿De que deporte la pelota mide 42ml de diametro?\na. Golf\nb. Ping Pong\nc. Badminton";
		preguntasCambalache[18]="¿Cuando visito Mahatma Gandhi America del Sur?\na. 1929\nb. 1932\nc. nunca";
		
		preguntasCambalache[19]="¿Cual es el organo masculino de la flor?\na. pistilo\nb. estambre\nc. raices";
		preguntasCambalache[20]="¿Como se llama el amigo de Martin Fierro?\na. Moreira\nb. Vizcacha\nc. Cruz";
		preguntasCambalache[21]="¿Cuantas islas forman la Polinesia?\na. 10\b. 100\nc. 1000";
		preguntasCambalache[22]="¿En que decada del siglo XX los aviones quebraron la barrera del sonido?\na. 80\nb. 40\nc. 60";
		preguntasCambalache[23]="¿Cuantas piezas tiene el Senku?\na. 18\nb. 25\nc. 32";
		preguntasCambalache[24]="¿En cuantos grados se congela el agua de mar?\na. 0ºc\nb. -2ºc\nc. -10ºc";
		
		preguntasCambalache[25]="La casilla inferior derecha del tablero de ajedrez ¿De que color es?\na. blanca\nb. negra\nc. roja";
		preguntasCambalache[26]="¿Que cadena montañosa es mas larga?\na. Los Alpes\nb. Los Andes\nc. El Himalaya";
		preguntasCambalache[27]="¿Con que papa se entrevisto Eva Peron en su viaje a Europa?\na. Pio X\nb. Pio XII\nc. Juan XXIII";
		preguntasCambalache[28]="¿Cuales son los dos planetas que giran en sentido contrario?\na. Venus y Urano\nb. Marte y Jupiter\nc. Pluton y Neptuno";
		preguntasCambalache[29]="¿En que rama de la ciencia se destaco fundamentalmente Luis Pasteur?\na. Fisica\nb. Quimica\nc. Matematica";
		preguntasCambalache[30]="¿Cuantas veces Mohammad Ali gano el titulo de peso pesados?\na. 5\nb. 1\nc. 3";
		
		preguntasCambalache[31]="¿Quien el presidente de Argentina al comenzar el año 2000?\na. De la Rua\nb. Menem\nc. Rodriguez Saa";
		preguntasCambalache[32]="¿En que pais de Africa el español es idioma oficial?\na. Nigeria\nb. Guinea Ecuatorial\nc. Marruecos";
		preguntasCambalache[33]="¿A que se juega con una pelota con manijas?\na. pato\nb. polo\nc. waterpolo";
		preguntasCambalache[34]="¿El doctor Pelagio Baltasar Luna fue vicepresidente de que pais?\na. Peru\nb. Chile\nc. Argentina";
		preguntasCambalache[35]="¿Que creo el japones Jigoro Kano en el siglo XIX?\na. espada samurai\nb. el judo\nc. el manga";
		preguntasCambalache[36]="¿Los langostinos que son?\na. Crustaceos\nb. Anelidos\nc. Insectos";
		
		preguntasCambalache[37]="¿Que pais lidera el ranking mundial de perros por habitantes?\na. Mexico\nb. Argentina\nc. Rusia";
		preguntasCambalache[38]="¿Que ciudad fundo Patricio Peralta Ramos en febrero de 1874?\na. Dolores\nb. Azul\nc. Mar del Plata";
		preguntasCambalache[39]="¿Quien dirigio la pelicula 'Camila' , la pelicula argentina dominada al Oscar?\na. Leonardo Favio\nb. Maria Luisa Bemberg\nc. Lucrecia Martel";
		preguntasCambalache[40]="¿Que actriz interpreta el papel de Lily en 'How i met your mother'?\na. Jennifer Aniston\nb. Alyson Hannigan\nc. Cobie Smulders";
		preguntasCambalache[41]="¿En que pais queda la ciudad Brujas?\na. Francia\nb. Belgica\nc. Suiza";
		preguntasCambalache[42]="¿Cual es el sinonimo de falaz?\na. Engañoso\nb. Excentrico\nc. Desfachatado";
		
		preguntasCambalache[43]="¿Que se invento primero?\na. Coca-Cola\nb. Pepsi\nc. Crush";
		preguntasCambalache[44]="En el paño de la ruleta ¿Que numero se encuentra entre el 14 y 20?\na.18\nb.17\nc.16";
		preguntasCambalache[45]="¿Que presidente estadounidense ordeno el ataque a Itshima Nagasaki?\na. Roosevelt\nb. Truman\nc. Eisenhower";
		preguntasCambalache[46]="¿El aluminio es una aleacion?\na. Si\nb. No \nc. es una aleacion de otras aleaciones";
		preguntasCambalache[47]="¿A que compositor pertenece el ballet 'El pajaro de fuego'?\na. Tchaikovsky\nb. Stravinski\nc. Schoenberg";
		preguntasCambalache[48]="¿Los protones atraen a los electrones?\na. atraen\nb. repelen\nc. no tienen relacion";
		
		preguntasCambalache[49]="¿En que ciudad obtuvo su primer titulo de campeon mundial de boxeo de la categoria medianos?\na. Las Vegas\nb. Roma\nc. Tokio";
		preguntasCambalache[50]="En la batalla de Lepanto¿Que paso con la mano izquierda de Cervantes?\na. perdio movilidad\nb. se la amputaron\nc. No paso nada";
		preguntasCambalache[51]="¿Cual es el mineral mas abundante en la corteza terrrestre?\na. Cobre\nb. Aluminio\nc. Hierro";
		preguntasCambalache[52]="¿El ambar de que origen es?\na. Mineral\nb. Animal\nc. Vegetal";
		preguntasCambalache[53]="¿Cual es continente mas seco?\na. Oceania\nb. Asia\nc. Antartida";
		preguntasCambalache[54]="¿Que metal es el mejor conductor de electricidad?\na. Cobre\nb. Plata\nc. Hierro";
		
		preguntasCambalache[55]="¿Como se llama la saga literaria creada por Stieg Larsson ?\na. Millenium\nb. Acqua\nc. Wallander";
		preguntasCambalache[56]="¿Cuanto duro la guerra llamada 'la guerra de los treinta años'?\na. 11\nb. 24\nc. 30";
		preguntasCambalache[57]="¿Que filosofo griego fue maestro Alejandro Magno?\na. Aristoteles\nb. Platon\nc. Epicuro";
		preguntasCambalache[58]="¿Que escritor polaco es el autor de las novelas 'Solaris' y 'El congreso de futurologia' ambas llevadas al cine?\na. Philips K. Dick\nb. Thomas Disch\nc. Stanislaw Lem";
		preguntasCambalache[59]="¿Que actor interpreta a 'El Zorro' en la famosa serie de los 50?\na. Guy Williams\nb. Tab Hunter\nc. Yves Montand";
		preguntasCambalache[60]="¿Cuantos jugadores son necesarios para jugar al bridge?\na. 2\nb. 3\nc. 4";
		
		preguntasCambalache[61]="¿Que grado militar es mas alto?\na. comandante\nb. teniente coronel\nc. capitan";
		preguntasCambalache[62]="¿Con las huevas de que pez se hace el caviar?\na. Tiburon\nb. Esturion\nc. Cazon";
		preguntasCambalache[63]="¿Que banda argentina de rock en su album 'Vasos y Besos'?\na. Soda Estereo\nb. Virus\nc. Los Abuelos de la nada";
		preguntasCambalache[64]="¿En que provincia se encuentra el lago Musters?\na. Rio Negro\nb. Chubut\nc. Rio Gallegos";
		preguntasCambalache[65]="¿Que clase se animal es un pudu?\na. Canino\nb. Venado\nc. Roedor";
		preguntasCambalache[66]="¿Como se denomima a los animales que ponen huevos?\na. Ovinicos\nb. Oviparos\nc. La 12";
		
		correctasCambalache[0]="a";
		correctasCambalache[1]="a";
		correctasCambalache[2]="a";	
		correctasCambalache[3]="b";
		correctasCambalache[4]="a";
		correctasCambalache[5]="c";
		correctasCambalache[6]="a";
		
		correctasCambalache[7]="b";
		correctasCambalache[8]="a";
		correctasCambalache[9]="a";
		correctasCambalache[10]="a";
		correctasCambalache[11]="b";
		correctasCambalache[12]="c";
		
		correctasCambalache[13]="c";
		correctasCambalache[14]="c";
		correctasCambalache[15]="b";
		correctasCambalache[16]="a";
		correctasCambalache[17]="a";
		correctasCambalache[18]="c";
		
		correctasCambalache[19]="b";
		correctasCambalache[20]="c";
		correctasCambalache[21]="c";
		correctasCambalache[22]="b";
		correctasCambalache[23]="c";
		correctasCambalache[24]="b";
		
		correctasCambalache[25]="a";
		correctasCambalache[26]="b";
		correctasCambalache[27]="b";
		correctasCambalache[28]="a";
		correctasCambalache[29]="b";
		correctasCambalache[30]="c";
		
		correctasCambalache[31]="a";
		correctasCambalache[32]="b";
		correctasCambalache[33]="a";
		correctasCambalache[34]="c";
		correctasCambalache[35]="b";
		correctasCambalache[36]="b";
		
		correctasCambalache[37]="b";
		correctasCambalache[38]="c";
		correctasCambalache[39]="b";
		correctasCambalache[40]="b";
		correctasCambalache[41]="b";
		correctasCambalache[42]="a";
		
		correctasCambalache[43]="a";
		correctasCambalache[44]="b";
		correctasCambalache[45]="b";
		correctasCambalache[46]="b";
		correctasCambalache[47]="b";
		correctasCambalache[48]="a";
		
		correctasCambalache[49]="a";
		correctasCambalache[50]="a";
		correctasCambalache[51]="b";
		correctasCambalache[52]="c";
		correctasCambalache[53]="c";
		correctasCambalache[54]="b";
		
		correctasCambalache[55]="a";
		correctasCambalache[56]="c";
		correctasCambalache[57]="a";
		correctasCambalache[58]="a";
		correctasCambalache[59]="a";
		correctasCambalache[60]="c";
		
		correctasCambalache[61]="a";
		correctasCambalache[62]="b";
		correctasCambalache[63]="c";
		correctasCambalache[64]="b";
		correctasCambalache[65]="b";
		correctasCambalache[66]="b";
		
		
		////////////////////////////////////////////////
		
		preguntasDeporte[0]="";
		preguntasDeporte[1]="¿Como termino Argetina - Arabia en el mundial 2022?\na. Arabia\nb. Argentina\nc. Empate";
		preguntasDeporte[2]="¿Cuantos toques maximo se puede hacer voley?\na. 3\nb. 2\nc. 1";	
		preguntasDeporte[3]="¿Quien gano el Balon de Oro de la FIFA en 2010?\na. Messi\nb. Ronaldo\nc. Neymar";
		preguntasDeporte[4]="¿Que pais gano la Eurocopa en 1972, 1980 y 1996?\na. Alemania\nb. Francia\nc. Italia";
		preguntasDeporte[5]="¿Cuando le gano Argentina a Colombia en la Copa America 2015?\na. 1º tiempo\nb. 2º tiempo\nc. Penales";
		preguntasDeporte[6]="¿En qu club hizo debut Paulo Dybala?\na. Instituto Cordoba\nb. Banfield\nc. Cerro Porteño";
		
		preguntasDeporte[7]="¿Cuantas tronera tiene una mesa de pool?\na. 4\nb. 6\nc. 8";
		preguntasDeporte[8]="¿Cuantos puntos vale un tiro libre en basquet?\na. 1pto\nb. 2ptos\nc. 4ptos";
		preguntasDeporte[9]="¿Donde se originaron los juegos olimpicos?\na. Grecia\nb. Italia\nc. Estados Unidos";
		preguntasDeporte[10]="¿En que año debuto el basquetbolista Gabriel Deck en la NBA?\na. 2017\nb. 2019\nc. 2021";
		preguntasDeporte[11]="¿Que pais obtuvo la mayor cantidad de medallas en los juegos olimpicos 2012?\na. China\nb. EEUU\nc. Rusia";
		preguntasDeporte[12]="¿Con cuantas bolas se juega al billar de tres bandas?\na. 3\nb. 5\nc. 6";
		
		preguntasDeporte[13]="¿Cuantos hoyos puede alcanzar una vuelta completa de golf?\na. 18\nb. 15\nc. 10";
		preguntasDeporte[14]="¿Con cuantas bolas se juega al snooker?\na. 15\nb. 18\nc. 22";
		preguntasDeporte[15]="En el boxeo profesional masculino ¿Cuantos minutos dura los round?\na. 1 min\nb. 2 min\nc. 3 min";
		preguntasDeporte[16]="¿Cuantos gajos tiene una pelota de rugby?\na. 4\nb. 5\nc. 6";
		preguntasDeporte[17]="¿De que posicion jugo Andres Iniesta?\na. Delantero\nb. Medio\nc. Defensor";
		preguntasDeporte[18]="¿Quien fue el goleador del mundial 2018?\na. Lukaku\nb. Kane\nc. Ronaldo";
		preguntasDeporte[19]="¿Que juego de poker tiene mas valor?\na. POKER\nb. ESCALERA\nc. FULLHOUSE";
		
		preguntasDeporte[20]="¿Como se llama la estera sobre la que practican ciertas artes marciales?\na. tatami\nb. shido\nc. judogi";
		preguntasDeporte[21]="¿En que pais fue inventado el voley?\na. EEUU\nb. Inglaterra\nc. Italia";
		preguntasDeporte[22]="¿Como se llama la mascota de Japon para los juegos Olimpicos?\na. Miratowa\nb. Fuwa\nc. Odori";
		preguntasDeporte[23]="En total ,¿Cuantas bolas se utilizan para jugar al pool?\na. 15\nb. 16\nc. 20";
		preguntasDeporte[24]="¿Cuantos bolos hay en el bowling?\na. 20\nb. 12\nc. 10";
		
		preguntasDeporte[25]="¿Cuantos jugadores componen un equipo de beisbol?\na. 10\nb. 9\nc. 7";
		preguntasDeporte[26]="¿Que equipo gano la medalla de oro en los juegos olimpicos 2012?(atletismo 100m)\na. EEUU\nb. Australia\nc. Jamaica";
		preguntasDeporte[27]="¿De que pais es originario el TAEKWONDO?\na. Corea\nb. Japon\nc. China";
		preguntasDeporte[28]="¿De que nacionalidad es Tiki Gelana? , ganadora de la maraton olimpica de Londres 2012\na. Jamaiquina\nb. Etiope\nc. Ghana";
		preguntasDeporte[29]="¿Cuantas fichas tiene el domino?\na. 28\nb. 30\nc. 18";
		preguntasDeporte[30]="¿En que pais se disputo la Copa Mundial de Rugby 2011?\na. Francia\nb. Sudafrica\nc. Nueva Zelanda";
		
		preguntasDeporte[31]="¿A cuantos tantos se juegan lo partidos de ping-pong?\na. 26\nb. 10\nc. 21";
		preguntasDeporte[32]="¿A que pais maradona le metio su ultimo gol en un mundial?\na. Brasil\nb. Grecia\nc. Nigeria";
		preguntasDeporte[33]="¿A que seleccionado Messi le metio su primer gol?\na. Hungria\nb. Serbia y Montenegro\nc. Holanda";
		preguntasDeporte[34]="¿En judo que color indica mayor categoria?\na. Marron\nb. Negro\nc. Dorado";
		preguntasDeporte[35]="¿De que material son los arcos de polo?\na. mimbre\nb. red\nc. Madera";
		preguntasDeporte[36]="¿Donde llevan el numero los jugadores de waterpolo?\na. en la gorra\nb. en el dorso\nc. en el muslo";
		
		preguntasDeporte[37]="¿Como se llama el area pintada bajo el canasto de basquet?\na. Panel\nb. Tabla\nc. Llave";
		preguntasDeporte[38]="¿Quien tiene el record por haber metido 5 goles en un mismo partido en un mundial?\na. Pele\nb. Salenko\nc. Puscas";
		preguntasDeporte[39]="¿Como se llaman las jaulas desde las que salen los caballos en las carreras?\na. Gatera\nb. Jaulines\nc. Gondola";
		preguntasDeporte[40]="¿De que color es el numero 0 en la ruleta?\na. Rojo\nb. Amarillo\nc. Verde";
		preguntasDeporte[41]="¿Cuantos jugadores componen un equipo de rugby?\na. 15\nb. 12\nc. 10";
		preguntasDeporte[42]="¿Que equipo gano la libertadores en 2011?\na. Corinthians\nb. Santos\nc. Boca Jrs";
		
		preguntasDeporte[43]="¿Cuanto es el maximo de personas que integra un scrum?\na. 8\nb. 7\nc. 6";
		preguntasDeporte[44]="¿Una cancha de badminton es mas grande que la de Tenis?\na. mas grande\nb. mas chica\nc. miden lo mismo";
		preguntasDeporte[45]="¿Cuantos jugadores componen un equipo de hockey sobre patines(en cancha)?\na. 5\nb. 6\nc. 7";
		preguntasDeporte[46]="¿Con cuantas cartas iguale se hace una canasta pura?\na. 7\nb. 8\nc. 9";
		preguntasDeporte[47]="¿Cual es rival clasico de Independiente?\na. San Lorenzo\nb. Banfield\nc. Racing";
		preguntasDeporte[48]="¿En rugby cuantos puntos vale un try?\na. 2\nb. 4\nc. 5";
		
		preguntasDeporte[49]="¿Cuantos games se juegan como minimo en un set de tenis?\na. 4\nb. 6\nc. 7";
		preguntasDeporte[50]="¿Cuantas bolas hay en el juego de croquet?\na. 3\nb. 2\nc. 4";
		preguntasDeporte[51]="¿Cuantos jugadores integran un equipo de futbol americano?\na. 20\nb. 11\nc. 15";
		preguntasDeporte[52]="¿Quien pesa menos en el boxeo?\na. PESO PLUMA\nb. PESO MOSCA\nc. PESO MEDIANO";
		preguntasDeporte[53]="¿Cuantos discos de bronce se usan en el juego del sapo?\na. 6\nb. 8\nc. 10";
		preguntasDeporte[54]="¿Cual cancha es mas larga?\na. tablero de ajedrez\nb. cancha de hockey sobre hielo\nc. cancha de ping-pong";
		
		preguntasDeporte[55]="¿Cuantos saques seguidos tiene un jugador de ping-pong?\na. 3\nb. 5\nc. 2";
		preguntasDeporte[56]="¿El campo de que deporte se juega con pelota es el mas grande?\na. rugby\nb. futbol\nc. golf";
		preguntasDeporte[57]="¿Quien gano el balon de oro en 2010?\na. Messi\nb. Ronaldo\nc. Ibramovich";
		preguntasDeporte[58]="¿Cuantos piques puede haber en Tenis?\na. 1\nb. 2\nc. 3";
		preguntasDeporte[59]="¿A que club le dicen los pinchratas?\na. Gimnasia y Esgrima\nb. Estudiantes de la Plata\nc. Arsenal";
		preguntasDeporte[60]="¿Cuantos treboles hay en un 8 de treboles?(en la carta)\na. 10\nb. 8\nc. 12";
		
		preguntasDeporte[61]="¿Cuantos mundiales tiene Inglaterra?\na. 1\nb. 2\nc. 0";
		preguntasDeporte[62]="¿Hasta  cuantas personas pueden jugar al tenis a la vez?\na. 4\nb. 6\nc. 8";
		preguntasDeporte[63]="¿Cuantas personas hay en un partido de futbol(dentro del campo)?\na. 25\nb. 23\nc. 22";
		preguntasDeporte[64]="¿Como se llaman los anillos con cierre por el que pasan las cuerdas los escaladores?\na. Regatones\nb. Mosquetones\nc. Estribos";
		preguntasDeporte[65]="¿A que cuadro de futnol le dicen 'El Ciclon'?\na. Velez Sarfield\nb. San Lorenzo\nc. Racing";
		preguntasDeporte[66]="¿Cuantos casilleros hay en un tablero de  Ajedrez?\na. 100\nb. 54\nc. 64";
		
		
		correctasDeporte[0]="a";
		correctasDeporte[1]="a";
		correctasDeporte[2]="a";	
		correctasDeporte[3]="a";
		correctasDeporte[4]="a";
		correctasDeporte[5]="c";
		correctasDeporte[6]="a";
		
		correctasDeporte[7]="b";
		correctasDeporte[8]="a";
		correctasDeporte[9]="a";
		correctasDeporte[10]="c";
		correctasDeporte[11]="b";
		correctasDeporte[12]="a";
		
		correctasDeporte[13]="a";
		correctasDeporte[14]="c";
		correctasDeporte[15]="c";
		correctasDeporte[16]="a";
		correctasDeporte[17]="b";
		correctasDeporte[18]="b";
		
		correctasDeporte[19]="a";
		correctasDeporte[20]="a";
		correctasDeporte[21]="a";
		correctasDeporte[22]="a";
		correctasDeporte[23]="a";
		correctasDeporte[24]="c";
		
		correctasDeporte[25]="c";
		correctasDeporte[26]="c";
		correctasDeporte[27]="a";
		correctasDeporte[28]="b";
		correctasDeporte[29]="a";
		correctasDeporte[30]="b";
		
		correctasDeporte[31]="c";
		correctasDeporte[32]="b";
		correctasDeporte[33]="b";
		correctasDeporte[34]="b";
		correctasDeporte[35]="a";
		correctasDeporte[36]="a";
		
		correctasDeporte[37]="c";
		correctasDeporte[38]="b";
		correctasDeporte[39]="a";
		correctasDeporte[40]="c";
		correctasDeporte[41]="a";
		correctasDeporte[42]="b";
		
		correctasDeporte[43]="a";
		correctasDeporte[44]="b";
		correctasDeporte[45]="a";
		correctasDeporte[46]="a";
		correctasDeporte[47]="c";
		
		correctasDeporte[48]="a";
		correctasDeporte[49]="b";
		correctasDeporte[50]="c";
		correctasDeporte[51]="b";
		correctasDeporte[52]="b";
		correctasDeporte[53]="a";
		
		correctasDeporte[54]="b";
		correctasDeporte[55]="b";
		correctasDeporte[56]="c";
		correctasDeporte[57]="a";
		correctasDeporte[58]="a";
		correctasDeporte[59]="b";
		
		correctasDeporte[60]="a";
		correctasDeporte[61]="a";
		correctasDeporte[62]="a";
		correctasDeporte[63]="b";
		correctasDeporte[64]="b";
		correctasDeporte[65]="b";
		correctasDeporte[66]="c";
		////////////////////////////////////////////////
		
		preguntasNaturaleza[0]="¿?\na. \nb. \nc. ";
		preguntasNaturaleza[1]="¿Cuanto es pi 3.....?\na. 3.14\nb. 3.56\nc. 3.10";
		preguntasNaturaleza[2]="¿Cuanto levanta en proporcion d esu peso un hormiga?\na. 5 veces su peso\nb. 3 veces su peso\nc. 1.33 veces su peso";	
		preguntasNaturaleza[3]="¿En que continente vive en libertad el oso panda?\na. America\nb. Asia\nc. Africa";
		preguntasNaturaleza[4]="¿Cuantos bits hay en un byte?\na. 60\nb. 12\nc. 8";
		preguntasNaturaleza[5]="¿A que temen los que sufren anemofobia?\na. al viento\nb. a la anemia\nc. a ciertas flores";
		preguntasNaturaleza[6]="¿De que continente es originario el jacaranda?\na. America\nb. Europa\nc. Oceania";
		
		preguntasNaturaleza[7]="¿Cuantos lados tiene un pentagono?\na. 5\nb. 7\nc. 9";
		preguntasNaturaleza[8]="¿Cuantos dedos tiene un gorila?\na. 16\nb. 20\nc. 12";
		preguntasNaturaleza[9]="¿Donde estan los meniscos?\na. rodilla\nb. cervical\nc. codos";
		preguntasNaturaleza[10]="¿De que continente es originario la planta de coca?\na. Asia\nb. America\nc. Africa";
		preguntasNaturaleza[11]="¿Que es el corazon?\na. Organo\nb. Musculo\nc. Articulacion";
		preguntasNaturaleza[12]="¿Como se llama al angulo de 90º?\na. Obstuso\nb. Agudo\nc. Rectangulo";
		
		preguntasNaturaleza[13]="¿De los moquitos quienes pican?\na. Macho\nb. Hembra\nc. Los dos";
		preguntasNaturaleza[14]="¿Cuanto dura aproximadamente laluz en llegar a la tierra?\na. 15min\nb. 8min\nc. 3min";
		preguntasNaturaleza[15]="¿Que se hiela primero en una laguna?\na. El fondo\nb. La superficie\nc. Todo al mismo tiempo";
		preguntasNaturaleza[16]="¿La 'G' que significa en romano ( en numero romano )?\na. 0\nb. 15\nc. no existia";
		preguntasNaturaleza[17]="¿Cuanto salta un canguro?\na. 3.2m\nb. 9.2m\nc. 5.1m";
		preguntasNaturaleza[18]="¿Como se llama el espacio de aterrizaje de los helcopteros?\na. helipuerto\nb. helispace\nc. estacionamiento";
		
		preguntasNaturaleza[19]="¿De que color es la luz de las lamparas de sodio?\na. amarilla\nb. blanca\nc. azul";
		preguntasNaturaleza[20]="¿Cual fue el primer material plastico que se fabrico?\na. el celuloide\nb. el nylon\nc. el polietileno";
		preguntasNaturaleza[21]="¿Hay particulas mas pequeñas que el atomo?\na. no\nb. si, son las particulas subatomicas\nc. si, se llaman atomitos";
		preguntasNaturaleza[22]="¿Que hierve mas rapido: agua dulce o agua salada?\na. agua dulce\nb. agua salada\nc. al mismo tiempo";
		preguntasNaturaleza[23]="¿Cual es el gas mas abundante?\na. oxigeno\nb. hidrogeno\nc. dioxido de carbono";
		preguntasNaturaleza[24]="¿Que significa AU en la tabla periodica de los elementos?\na. Oxigeno\nb. Oro\nc. Actino";
		
		preguntasNaturaleza[25]="¿De que color es la sangre de los peces?\na. roja\nb. azul\nc. blanca";
		preguntasNaturaleza[26]="¿Cuantos dinetes tiene la tortuga?\na. 11\nb. 8\nc. no tiene";
		preguntasNaturaleza[27]="¿De donde viene la energia eolica?\na. centrales atomicas\nb. viento\nc. agua";
		preguntasNaturaleza[28]="¿Que es la nitroglicerina?\na. Un explosivo\nb. en pequeñas cantidades es medicina\nc. las dos son correctas";
		preguntasNaturaleza[29]="¿Que flor se usa para hacer un condimento y para tintura?\na. azafran\nb. amapola\nc. canela";
		preguntasNaturaleza[30]="¿Donde llega la sangre impura?\na. La derecho del corazon\nb. lado izquierdo del corazon\nc. no existe sangre pura ni impura";
		
		preguntasNaturaleza[31]="¿Quien tiene mas alas?\na. abeja\nb. aguila\nc. tienen la misma cantidad";
		preguntasNaturaleza[32]="¿Que se abre con un 'stent'?\na. venas obstruidas\nb. arterias obstruidas\nc. las dos son correctas";
		preguntasNaturaleza[33]="¿Cuanto puede volar una abeja sin posarse?\na. 200m\nb. 1km\nc. 12km";
		preguntasNaturaleza[34]="¿Que son los huecos popliteos?\na. cavernas subacuaticas\nb. cavidades cerebrales\nc. parte posterior de la rodilla";
		preguntasNaturaleza[35]="¿Cuantos ojos tiene un calamar?\na. 8\nb. 4\nc. 2";
		preguntasNaturaleza[36]="¿El pulgon es el macho de la pulga?\na. son la misma especie\nb. es otra especie\nc. el pulgon no es un animal";
		
		preguntasNaturaleza[37]="¿Donde estan los huesos mas chicos?\na. Oido\nb. dedos\nc. nariz";
		preguntasNaturaleza[38]="¿Con que construyen sus nidos los pinguinos?\na. con ramas\nb. piedras\nc. iglu";
		preguntasNaturaleza[39]="¿Cuantos huesos tiene el gato en la cola ( aproximadamente ) ?\na. 10\nb. 20\nc. no tiene huesos en la cola";
		preguntasNaturaleza[40]="¿De que color es la flor del durazno?\na. Blanca\nb. Rosa\nc. Naranja";
		preguntasNaturaleza[41]="¿Que animal tiene 3 hileras de dientes en su mandibula?\na. ornitorrinco\nb. tiburon\nc. murcielago";
		preguntasNaturaleza[42]="¿Cual es el unico mamifero que vuela?\na. murcielago\nb. todos los animales voladores son mamiferos\nc. no existe mamifero volador";
		
		preguntasNaturaleza[43]="¿Que sintoma se combate con un antipiretico?\na. Eczema\nb. Mareo\nc. Fiebre";
		preguntasNaturaleza[44]="¿Cual es el elemento quimico que se encuentra en las particulas organicas?\na. carbono\nb. oxigeno\nc. nitrogeno";
		preguntasNaturaleza[45]="¿De que elemento se compone mayormente el sol?\na. Nitrogeno\nb. Hidrogeno\nc. Helio";
		preguntasNaturaleza[46]="¿Que se oxida cuando la fruta se pone marron?\na. hierro de la pulpa\nb. no hay proceso de oxidaxion en la fruta\nc. la proteina de las semillas";
		preguntasNaturaleza[47]="¿Que tipo de raza es 'Normando'?\na. Ovinos\nb. Vacunos\nc. Equinos";
		preguntasNaturaleza[48]="¿La jirafa que ruido realiza?\na. muge\nb. grazna\nc. es muda";
		
		preguntasNaturaleza[49]="¿Con que gas cargan los encendedores?\na. Butano\nb. Propano\nc. Etano";
		preguntasNaturaleza[50]="¿Con que se mata la cal viva?\na. agua\nb. vinagre\nc. alcohol";
		preguntasNaturaleza[51]="¿Cual es el pais natal de Marie Curie?\na. Polonia\nb. Francia\nc. Albania";
		preguntasNaturaleza[52]="¿Como se llama a cada pequeño cuadrado que compone una imagen digital?\na. String\nb. Pixel\nc. Byte";
		preguntasNaturaleza[53]="¿Cuantas superficies tiene una bola de billar?\na. 1\nb. 3\nc. 6";
		preguntasNaturaleza[54]="¿Con que parte del cuerpo 'canta' el grillo?\na. antenas\nb. boca\nc. patas y alas";
		
		preguntasNaturaleza[55]="¿Cual fue la primera bebida que pausterizo Pasteur en 1864?\na. vino\nb. leche\nc. agua";
		preguntasNaturaleza[56]="¿Que acido es el que tienen las baterias d elos coches?\na. sulfurico\nb. nitrico\nc. acetico";
		preguntasNaturaleza[57]="¿Que tienen las moscas en las patas que les permite andar por el techo?\na. ganchos\nb. ventosas\nc. secrecion pegajosas";
		preguntasNaturaleza[58]="¿De que continente es originaria la sandia?\na. Asia\nb. America\nc. Africa";
		preguntasNaturaleza[59]="¿Cual es el gas que tienen las heladeras?\na. freon\nb. neon\nc. Argon";
		preguntasNaturaleza[60]="¿Por que nombre es mejor conocido los rayos 'Roentgen'?\na. rayos x\nb. rayos gamma\nc. rayos alfa";
		
		preguntasNaturaleza[61]="¿Donde esta el acueducto de Silvio?\na. en Marte\nb. en Italia\nc. en el cerebro";
		preguntasNaturaleza[62]="¿Cual es mas trasparente?\na. agua\nb. acrilico\nc. vidrio";
		preguntasNaturaleza[63]="¿Cual es el mineral basico para la industria atomica?\na. petroleo\nb. uranio\nc. oro";
		preguntasNaturaleza[64]="¿Que cosa del espacio tiene cabellera, cabeza y cola?\na. anillos de saturno\nb. cometas\nc. Asteorides";
		preguntasNaturaleza[65]="¿Como se llama la mezcla de acidos utilizada para probar si un metal es oro puro?\na. agua regia\nb. agua dura\nc. agua cruda";
		preguntasNaturaleza[66]="¿Para prevenir que enfermedad se aplica la vacuna BCG?\na. sarampion\nb. tuberculosis\nc. gripe";

		correctasNaturaleza[0]="a";
		correctasNaturaleza[1]="a";
		correctasNaturaleza[2]="a";	
		correctasNaturaleza[3]="b";
		correctasNaturaleza[4]="c";
		correctasNaturaleza[5]="a";
		correctasNaturaleza[6]="a";
		
		correctasNaturaleza[7]="a";
		correctasNaturaleza[8]="b";
		correctasNaturaleza[9]="a";
		correctasNaturaleza[10]="b";
		correctasNaturaleza[11]="b";
		correctasNaturaleza[12]="c";
		
		correctasNaturaleza[13]="c";
		correctasNaturaleza[14]="b";
		correctasNaturaleza[15]="b";
		correctasNaturaleza[16]="c";
		correctasNaturaleza[17]="b";
		correctasNaturaleza[18]="a";
		
		correctasNaturaleza[19]="a";
		correctasNaturaleza[20]="a";
		correctasNaturaleza[21]="b";
		correctasNaturaleza[22]="a";
		correctasNaturaleza[23]="b";
		correctasNaturaleza[24]="b";
		
		correctasNaturaleza[25]="a";
		correctasNaturaleza[26]="c";
		correctasNaturaleza[27]="b";
		correctasNaturaleza[28]="c";
		correctasNaturaleza[29]="a";
		correctasNaturaleza[30]="a";
		
		correctasNaturaleza[31]="a";
		correctasNaturaleza[32]="c";
		correctasNaturaleza[33]="c";
		correctasNaturaleza[34]="c";
		correctasNaturaleza[35]="c";
		correctasNaturaleza[36]="a";
		
		correctasNaturaleza[37]="a";
		correctasNaturaleza[38]="b";
		correctasNaturaleza[39]="b";
		correctasNaturaleza[40]="b";
		correctasNaturaleza[41]="b";
		correctasNaturaleza[42]="a";
		
		correctasNaturaleza[43]="c";
		correctasNaturaleza[44]="a";
		correctasNaturaleza[45]="b";
		correctasNaturaleza[46]="a";
		correctasNaturaleza[47]="a";
		correctasNaturaleza[48]="c";
		
		correctasNaturaleza[49]="a";
		correctasNaturaleza[50]="a";
		correctasNaturaleza[51]="a";
		correctasNaturaleza[52]="b";
		correctasNaturaleza[53]="a";
		correctasNaturaleza[54]="c";
		
		correctasNaturaleza[55]="b";
		correctasNaturaleza[56]="a";
		correctasNaturaleza[57]="c";
		correctasNaturaleza[58]="c";
		correctasNaturaleza[59]="a";
		correctasNaturaleza[60]="a";
		
		correctasNaturaleza[61]="c";
		correctasNaturaleza[62]="b";
		correctasNaturaleza[63]="b";
		correctasNaturaleza[64]="b";
		correctasNaturaleza[65]="a";
		correctasNaturaleza[66]="b";
		
		///////////////////////////////////////////////
		
		
		preguntasHistoria[0]="¿? \na. \nb. \nc.";
		preguntasHistoria[1]="¿Quien invento el moviiento Scout? \na. Badem Powell\nb. Riachard Scout\nc.George Peterson";
		preguntasHistoria[2]="¿Quien libero a Peru? \na. San martin\nb. Artigas\nc. Che Guevara";	
		preguntasHistoria[3]="¿En que pais actual murio Magallanes? \na. Filipinas\nb. Chile\nc. India";
		preguntasHistoria[4]="¿Que rio es mas largo? \na. Volga\nb. Danubio\nc. Misisipi";
		preguntasHistoria[5]="¿En que continente esta el Himalaya? \na. Africa\nb. Europa\nc. Asia";
		preguntasHistoria[6]="¿Que ciudad defendia Guemes cuando murio? \na. Chubut\nb. Salta\nc. Cordoba";
		
		preguntasHistoria[7]="¿La ginebra es la bebida nacional de que pais? \na. Belgica\nb. Holanda\nc. Alemania";
		preguntasHistoria[8]="¿Como se lamaba el Sargento Cabral? \na. Juan Bautista\nb. Jose Miguel\nc. Carlos Alberto";
		preguntasHistoria[9]="¿En que actual provincia vivian los onas? \na. Tierra del Fuego\nb. Corrientes\nc. Prov. Buenos Aires";
		preguntasHistoria[10]="¿Con que nombre fue mas conocido el dirigente politico Josip Broz? \na. Stalin\nb. Tito\nc. Trotsky";
		preguntasHistoria[11]="¿Como se llamaba el satelite que dio comienzo a la Era Espacial? \na. Sputnik\nb. Apolo XI\nc. Gamma";
		preguntasHistoria[12]="¿Cual era la profesion de Alicia Moreau de Justo? \na. Abogada\nb. Maestra\nc. Medica";
		
		preguntasHistoria[13]="¿Quien fue el hijo mas famoso de Doña Gregoria Matorras? \na. San Martin\nb. Belgrano\nc. Sarmiento";
		preguntasHistoria[14]="¿Cual de las tres antiguas Guayanas no es independiente? \na. Inglesa\nb. Francesa\nc. Inglesa";
		preguntasHistoria[15]="¿Bucefalo era el caballo de quien? \na. Magno\nb. Gaula\nc. Rey Arturo";
		preguntasHistoria[16]="¿En que pais actual estan las ruinas de Troya? \na. Turquia\nb. Grecia\nc. Israel";
		preguntasHistoria[17]="¿A que provincia Argentina la llaman 'El jardin de la republica'? \na. Salta\nb. Tucuman\nc. Corrientes";
		preguntasHistoria[18]="¿Cuantos km mide una legua? \na. 10\nb. 6\nc. 5";
		
		preguntasHistoria[19]="¿Donde estan las ruinas incaicas? \na. Peru\nb. Mexico\nc. Ecuador";
		preguntasHistoria[20]="¿Que patriota estuvo en los dos triunviratos? \na. Sarratea\nb. Rodriguez Peña\nc. Paso";
		preguntasHistoria[21]="¿Quien dijo 'La suerte esta echada' despues de cruzar un rio? \na. Alejandro\nb. Napoleon\nc. Julio Cesar";
		preguntasHistoria[22]="¿En que provincia esta Bahia Blanca? \na. La pampa\nb. Buenos Aires\nc. Rio Negro";
		preguntasHistoria[23]="¿Cuantos pisos tiene la Torre de Pisa? \na. 3\nb. 7\nc. 25";
		preguntasHistoria[24]="¿Con que choco el Titanic en su primer viaje transatlantico? \na. Iceberg\nb. con otro barco\nc. arrecife";
		
		preguntasHistoria[25]="¿Cual es la obra principal del arquitecto Oscar Niemeyer? \na. La piramide de Louvre\nb. La Puerta del sol\nc. Diseño de Brasilia";
		preguntasHistoria[26]="¿Donde quedan los montes D'Alembert? \na. en la Luna\nb. en Italia\nc. en China";
		preguntasHistoria[27]="¿Cual el es el apellido de Mao Tse Tung? \na. Mao\nb. Tse\nc. Tung";
		preguntasHistoria[28]="¿En que pais murio Cristobal Colon? \na. España\nb. Holanda\nc. Cuba";
		preguntasHistoria[29]="¿Cuantas etrellas tiene la bandera de Cuba? \na. 1\nb. 2\nc. 3";
		preguntasHistoria[30]="¿En que pais esta la ciudad de Haarlem? \na. Estados Unidos\nb. Holanda\nc. Colombia";
		
		preguntasHistoria[31]="¿En que pais nacio Santa Rosa de Lima, la patrona de America? \na. Peru\nb. Argentina\nc. Chile";
		preguntasHistoria[32]="¿Cual es el antiguo nombre de Tailandia? \na. Siam\nb. Bangkok\nc. Malasia";
		preguntasHistoria[33]="¿Cual era el oficio de la madre de Sarmiento? \na. Tejedora\nb. Escritora\nc. Cocinera";
		preguntasHistoria[34]="Napoleon perdio en Waterloo¿Quien comandaba a los que triunfaron? \na. Nelson\nb. Lowe\nc. Wellington";
		preguntasHistoria[35]="Pompeya y Herculano ¿Fueron sepultadas por que erupcion? \na. Etna\nb. Vesubio\nc. Krakatoa";
		preguntasHistoria[36]="¿Donde nacen los monegascos? \na. Monaco\nb. Mongolia\nc. Grascuña";
		
		preguntasHistoria[37]="¿Donde queda el mar de la tranquilidad? \na. La luna\nb. En Marte\nc. En Africa";
		preguntasHistoria[38]="¿A quien asesino Charlotte Corday en una bañadera? \na. Robespierre\nb. Marat\nc. A Sade";
		preguntasHistoria[39]="¿De que nacionalidad fue el primer astronauta? \na. Ruso\nb. Chino\nc. EEUU";
		preguntasHistoria[40]="¿En que isla nacio la emperatriz josefina,esposa de Napoleon? \na. Martinica\nb. Corcega\nc. Irlanda";
		preguntasHistoria[41]="¿Que pueblo antiguo invento los barriletes y los tallarines? \na. Egipcios\nb. Chinos\nc. Griegos";
		preguntasHistoria[42]="¿Que paises une el tunel de Mont Blanc? \na. Suiza y Francia\nb. Francia e Italia\nc. Canda y EEUU";
		
		preguntasHistoria[43]="¿Que isla del caribe mide 1250km? \na. Cuba\nb. Haiti\nc. Panama";
		preguntasHistoria[44]="¿Como esta el mar en 'pleamar'? \na. Alto\nb. Regular\nc. Bajo";
		preguntasHistoria[45]="¿En que pais queda Jauja? \na. Peru\nb. Chile\nc. Bolivia";
		preguntasHistoria[46]="¿En que pais esta el puente de Aviñon? \na. Francia\nb. Italia\nc. Es un puente imaginario";
		preguntasHistoria[47]="¿Como se llama la parte del Atlantico donde estan las Islas Malvinas? \na. Mar Argentino\nb. Mar de Weddell\nc. Mar Malvinense";
		preguntasHistoria[48]="¿Como se llamaba la hija de Juan Miguel de Rosas? \na. Juanita\nb. Manuelita\nc. Rosita";
		
		preguntasHistoria[49]="¿Como se llama el Cabo que marca de extremo sur de Africa? \na. De Hornos\nb. De Buena Esperanza\nc. De San Lucas";
		preguntasHistoria[50]="¿En que ciudad fue asesinado John F. Kennedy? \na. Nueva York\nb. Neuva Orlando\nc. Dallas";
		preguntasHistoria[51]="¿Donde queda Wimbledon? \na. Escocia\nb. Inglaterra\nc. Gales";
		preguntasHistoria[52]="¿Quien dijo 'Despues de mi el Diluvio'? \na. Napoleon\nb. El zar Alejandro I\nc. Luis XV";
		preguntasHistoria[53]="¿Cual es el nombre de Florencia en italiano? \na. Firenze\nb. Fiorenza\nc. Firlensa";
		preguntasHistoria[54]="¿En que mar esta la isla de Malta? \na. Tirreno\nb. Mediterraneo\nc. Adriatico";
		
		preguntasHistoria[55]="¿Como murio Mahatma Gandhi? \na. asesinado\nb. suicidio\nc. infarto";
		preguntasHistoria[56]="¿Quien descubrio el oceano Pacifico? \na. Vasco de Gama\nb. Vasco Nuñez de Balboa\nc. Alvar Nuñez Cabeza de Vaca";
		preguntasHistoria[57]="¿En donde murio Leon Trotski? \na. Mexico\nb. Rusia\nc. Alemania";
		preguntasHistoria[58]="¿Cual es la ciudad mas grande la region italiana de Lombardia? \na. Milan\nb. Turin\nc. Venecia";
		preguntasHistoria[59]="¿Cual es la Ciudad Luz? \na. Paris\nb. Roma\nc. Madrid";
		preguntasHistoria[60]="¿Que ocurrio el 21 de junio de 1944? \na. Desembarco de Normandia\nb. La reconquista de Paris\nc. La toma de Berlin";
		
		preguntasHistoria[61]="¿Que es la isla de Chipre? \na. Una Provincia\nb. Una Colonia\nc. Un Pais";
		preguntasHistoria[62]="¿Cual es la isla mas grande del mundo? \na. Groenlandia\nb. Islandia\nc. Sicilia";
		preguntasHistoria[63]="¿En que provincia esta el Lago San Roque? \na. Corrientes\nb. Neuquen\nc. Cordoba";
		preguntasHistoria[64]="¿Que capital de provincia española esta sobre el Atlantico? \na. Granada\nb. Cadiz\nc. Malaga";
		preguntasHistoria[65]="¿De que nacionalidad era Sandino , el patriota centroamericano que murio asesinado en 1934? \na. Hondureño\nb. Nicaragua\nc. Guatemalteco";
		preguntasHistoria[66]="¿En que continente esta el Kilimanjaro? \na. Africa\nb. Asia\nc. America";

		correctasHistoria[0]="a";
		correctasHistoria[1]="a";
		correctasHistoria[2]="a";	
		correctasHistoria[3]="a";
		correctasHistoria[4]="a";
		correctasHistoria[5]="c";
		correctasHistoria[6]="b";
		
		correctasHistoria[7]="b";
		correctasHistoria[8]="a";
		correctasHistoria[9]="a";
		correctasHistoria[10]="b";
		correctasHistoria[11]="a";
		correctasHistoria[12]="c";
		
		correctasHistoria[13]="a";
		correctasHistoria[14]="b";
		correctasHistoria[15]="a";
		correctasHistoria[16]="a";
		correctasHistoria[17]="b";
		correctasHistoria[18]="c";
		
		correctasHistoria[19]="a";
		correctasHistoria[20]="c";
		correctasHistoria[21]="c";
		correctasHistoria[22]="b";
		correctasHistoria[23]="b";
		correctasHistoria[24]="a";
		
		correctasHistoria[25]="c";
		correctasHistoria[26]="a";
		correctasHistoria[27]="a";
		correctasHistoria[28]="a";
		correctasHistoria[29]="a";
		correctasHistoria[30]="b";
		
		correctasHistoria[31]="a";
		correctasHistoria[32]="a";
		correctasHistoria[33]="a";
		correctasHistoria[34]="c";
		correctasHistoria[35]="b";
		correctasHistoria[36]="a";
		
		correctasHistoria[37]="b";
		correctasHistoria[38]="b";
		correctasHistoria[39]="a";
		correctasHistoria[40]="a";
		correctasHistoria[41]="b";
		correctasHistoria[42]="a";
		
		correctasHistoria[43]="a";
		correctasHistoria[44]="a";
		correctasHistoria[45]="a";
		correctasHistoria[46]="a";
		correctasHistoria[47]="c";
		correctasHistoria[48]="b";
		
		correctasHistoria[49]="b";
		correctasHistoria[50]="c";
		correctasHistoria[51]="b";
		correctasHistoria[52]="c";
		correctasHistoria[53]="a";
		correctasHistoria[54]="b";
		
		correctasHistoria[55]="a";
		correctasHistoria[56]="b";
		correctasHistoria[57]="a";
		correctasHistoria[58]="a";
		correctasHistoria[59]="a";
		correctasHistoria[60]="a";
		
		correctasHistoria[61]="c";
		correctasHistoria[62]="a";
		correctasHistoria[63]="c";
		correctasHistoria[64]="b";
		correctasHistoria[65]="c";
		correctasHistoria[66]="b";
		///////////////////////////////////////////////
		
		preguntasEntretenimiento[0]="¿?\na. \nb. \nc. ";
		preguntasEntretenimiento[1]="¿De que pais es la app TikTok?\na. China\nb. EEUU\nc. Alemana";
		preguntasEntretenimiento[2]="¿A que se dedica Sergio Kun Aguero?(2022)\na. Streamer\nb. Futbol\nc. Snowsurfer";	
		preguntasEntretenimiento[3]="¿Como se llama el actor que represento a James Bond en 'Quantum of Solace'?\na. Pierce Brosman\nb. Guy Pierce\nc. Daniel Craig";
		preguntasEntretenimiento[4]="¿Quien dirigio la pelicula 'El secreto de sus ojos'?\na. Adrian Caetano\nb. Albertina Carri\nc. Juan Jose Campanella";
		preguntasEntretenimiento[5]="¿Como se llama la amiga de Harry Potter?\na. Hermione\nb. Simone\nc. Elsa";
		preguntasEntretenimiento[6]="¿Cuantos Oscar gano Gustavo Santaolalla?\na. 0\nb. 1\nc. 2";
		
		preguntasEntretenimiento[7]="¿Cuantas temporadas tuvo 'Los Soprano'?\na. 3\nb. 6\nc. 10";
		preguntasEntretenimiento[8]="¿Como se llama el canal de television del ministerio de Educacion de la Nacion?\na. Encuentro\nb. Retro\nc. De la ciudad";
		preguntasEntretenimiento[9]="¿Cual es el origen de la historia de Tomb Raider?\na. un cuento para niños\nb. un videojuego\nc. una historieta";
		preguntasEntretenimiento[10]="¿Como se llama la protagonista de 'Los Diarios de un Vampiro'?\na. Elena\nb. Selena\nc. Malena";
		preguntasEntretenimiento[11]="¿Quien protagonizo 'Casanova' de Lasse Hallstrom en 2005?\na. Matt Damon\nb. Heath Ledger\nc. Jude Law";
		preguntasEntretenimiento[12]="¿Quien es el autor de la cancion 'Dale alegria a mi corazon'?\na. Fito Paez\nb. Leon Gieco\nc. Charly Garcia";
		
		preguntasEntretenimiento[13]="¿Como se llama el novio de barbie?\na. Ken\nb. Bruno Diaz\nc. Peter Parker";
		preguntasEntretenimiento[14]="¿Que actriz acompaña a Woody Allen en 'Zelig', 'Broadway Danny Rose'?\na. Diane Keaton\nb. Mia Farrow\nc. Julie Andrews";
		preguntasEntretenimiento[15]="¿Cuanto mide de alto la estatuilla de la academia de Hollywood?\na. 34\nb. 25\nc. 37";
		preguntasEntretenimiento[16]="¿A que se dedica el forense Dexter Morgan en sus ratos libres?\na. Musico\nb. Jardinero\nc. Asesino serial";
		preguntasEntretenimiento[17]="¿Con quien inicia relacion Penny en la 2da temporada de 'The Big Bang Theory'?\na. Howard\nb. Sheldon\nc. Leonard";
		preguntasEntretenimiento[18]="¿Que serie de TV se originaba en la catastrofe del vuelo Oceanic 815?\na. New Tricks\nb. Dawson Creek\nc. Lost";
		
		preguntasEntretenimiento[19]="¿Como se llama la novia de  Popeye el Marino?\na. Olivia\nb. Martina\nc. Lavinia";
		preguntasEntretenimiento[20]="¿En que pais nacio Justin Bieber?\na. EEUU\nb. Canada\nc. UK";
		preguntasEntretenimiento[21]="¿Cuantas son las historias de la pelicula 'Relatos Salvajes'?\na. 2\nb. 4\nc. 6";
		preguntasEntretenimiento[22]="¿De que nacionalidad es el director de 'El señor de los anillos'?\na. Neozelandez\nb. Britanico\nc. Australiano";
		preguntasEntretenimiento[23]="¿La novela de Ray Bradbury era Farenheit...?\na. 451\nb. 541\nc. 756";
		preguntasEntretenimiento[24]="¿Quien el fue el protagonista de la primera pelicula  de 'Planeta de los simios'?\na. Martin Sheen\nb. Charlie Heston\nc. Robert Wagner";
		
		preguntasEntretenimiento[25]="¿Que otra actividad artistica desarrollo Fito Paez ademas de la musica?\na. Actuacion\nb. Direccion de cine\nc. Baile";
		preguntasEntretenimiento[26]="¿Que actor es 'Neo' en 'Matrix'?\na. Tom Cruise\nb. Samuel Jackson\nc. Keanu Reeves";
		preguntasEntretenimiento[27]="¿Que actriz protagoniza la saga de 'Alien'?\na. Melanie Griffith\nb. Sigourney Weaver\nc. Vivian Leigh";
		preguntasEntretenimiento[28]="¿Como se llama la pelicula de 2002 en la que trabajan juntos Tom Hanks y Leonardo Dicaprio?\na. El lobo de Wall Street\nb. Naufrago\nc. Atrapame si puedes";
		preguntasEntretenimiento[29]="¿Quien interpreta a 'Rachel' en 'Friends'?\na. Jennifer Aniston\nb. Jennifer Jason Leigh\nc. Anne Hathaway";
		preguntasEntretenimiento[30]="¿Que son los 'X-MEN'?\na. Mutantes\nb. Extraterrestres\nc. Cyborgs";
		
		preguntasEntretenimiento[31]="¿Como se llama la ardilla de 'La era de Hiela'?\na. Nut\nb. Scrat\nc. Cracker";
		preguntasEntretenimiento[32]="¿Quien es el creador de la serie 'The Office'?\na. Ricky Gervais\nb. Steve Carell\nc. Ben Stiller";
		preguntasEntretenimiento[33]="¿Que actor argentino fue la voz de Chicken Little?\na. Ricardo Darin\nb. Fabian Vena\nc. Guido Kaczka";
		preguntasEntretenimiento[34]="¿Cual de estos es integrante de Soda Estereo?\na. Fabian Quintero\nb. Richard Coleman\nc. Zeta Bosio";
		preguntasEntretenimiento[35]="¿Con que grupo se hizo famoso Phil Collins?\na. The Who\nb. Genesis\nc. Queen";
		preguntasEntretenimiento[36]="¿De que nacionalidad era Luca Prodan?\na. Ingles\nb. Italiano\nc. Argentino";
		
		preguntasEntretenimiento[37]="¿Que trae el Raton Perez?\na. Golosinas\nb. Regalos\nc. Dinero";
		preguntasEntretenimiento[38]="¿Que actriz interpreto a Erin Brocovich y gano un Oscar por ello?\na. Gwyneth Paltrow\nb. Reese Witherpoon\nc. Julia Roberts";
		preguntasEntretenimiento[39]="¿Que clase de animal es 'Larguirucho'?\na. Un Raton\nb. Uron\nc. Oso";
		preguntasEntretenimiento[40]="¿Contra quien pelea y compite Indiana Jones por la calavera Cristal?\na. Rusos\nb. Italianos\nc. Nazis";
		preguntasEntretenimiento[41]="¿En que se convierten los padres de Chihiro en 'El Viaje de Chihiro'?\na. insectos\nb. peces\nc. cerdos";
		preguntasEntretenimiento[42]="¿Donde se mudan los Simpsons en su pelicula?\na. Alaska\nb. Paris\nc. Polo Sur";
		
		preguntasEntretenimiento[43]="¿Que actriz ganadora del Oscar onterpreto a 'Storm' en 'X-MEN'?\na. Nicole Kidman\nb. Halle Berry\nc. Hillary Swank";
		preguntasEntretenimiento[44]="¿Que exitosa serie de television de ficcion cuenta la historia de los empleados de la papelera Duder Miffin?\na. Web Teraphy\nb. In Treatment\nc. The Office";
		preguntasEntretenimiento[45]="¿De que pais es la actriz Carmen Maura?\na. Mexico\nb. Española\nc. Brasil";
		preguntasEntretenimiento[46]="¿Quien dirigio 'Titanic'?\na. Luc Besson\nb. Steven Spielberg\nc. James Cameron";
		preguntasEntretenimiento[47]="¿Que actor interpreta a Wolverine en 'X-MEN'?\na. Christian Bale\nb. Joaquib Phoenix\nc. Hugh Jackman";
		preguntasEntretenimiento[48]="¿Como se llama la chanchita de los 'Muppets'?\na. Piggy\nb. Puguie\nc. Chanchi";
		
		preguntasEntretenimiento[49]="¿De que trabaja Bob Esponja?\na. Cocinero\nb. Lava platos\nc. Paseador de perros";
		preguntasEntretenimiento[50]="¿De que nacionalidad era grupo ABBA?\na. Ingles\nb. Israeli\nc. Sueco";
		preguntasEntretenimiento[51]="¿Como se llama el auto de Batman?\na. Bati 500\nb. Batimovil\nc. Batirun";
		preguntasEntretenimiento[52]="¿Como se llama el primo de 'Dora, la exploradora'?\na. Cachito\nb. Diego\nc. Pablo";
		preguntasEntretenimiento[53]="¿Que actriz gano mas premios Oscar?\na. Meryl Streep\nb. Katharine Hepburn\nc. Jodie Foster";
		preguntasEntretenimiento[54]="¿Como se llama el caballo del Janero Solitario?\na. Silver\nb. Tornado\nc. Rocco";
		
		preguntasEntretenimiento[55]="¿En que banda de rock participaba Roberto Petitinato?\na. Sumo\nb. Virus\nc. La Renga";
		preguntasEntretenimiento[56]="¿Que actriz y bailarina recibio un premio Oscar a los seis años?\na. Shirley Temple\nb. Tatum O'Neal\nc. Anna Paquin";
		preguntasEntretenimiento[57]="¿Que banda argentina grabo el disco 'Cancion Animal'?\na. Los Autenticos Decadentes\nb. Almendra\nc. Soda Estereo";
		preguntasEntretenimiento[58]="¿Contra organizacion del mal lucha el Agente 86?\na. Lios\nb. Kaos\nc. Evil";
		preguntasEntretenimiento[59]="¿A donde se llega en la rayuela?\na. Al cielo\nb. Al Pasado\nc. Al mundo del Reves";
		preguntasEntretenimiento[60]="¿Que clase de pajaros protagonizan la pelicula de animacion 'Rio'?\na. Loros\nb. Tucanes\nc. Guacamayos";
		
		preguntasEntretenimiento[61]="¿Que comia Forest Gump mientras contaba la historia de su vida?\na. Caramelos\nb. Bombones\nc. Por Corn";
		preguntasEntretenimiento[62]="¿En que ciudad transcurre la pelicula 'Ratatouille'?\na. Paris\nb. Londres\nc. Roma";
		preguntasEntretenimiento[63]="¿Quien es la novia del Agente 86?\na. Agente 38\nb. Agente 99\nc. Agente 83";
		preguntasEntretenimiento[64]="En Madagascar ¿Que animal es 'Marty'?\na. Cebra\nb. Leon\nc. Jirafa";
		preguntasEntretenimiento[65]="¿Cual es el numero del departamento de Sheldon en 'The Big Bang Theory'?\na. 2A\nb. 3B\nc. 4A";
		preguntasEntretenimiento[66]="¿Que clase de perro es Bethoven?\na. San Bernardo\nb. Dalmata\nc. Ovejero";

		correctasEntretenimiento[0]="a";
		correctasEntretenimiento[1]="a";
		correctasEntretenimiento[2]="a";	
		correctasEntretenimiento[3]="b";
		correctasEntretenimiento[4]="c";
		correctasEntretenimiento[5]="a";
		correctasEntretenimiento[6]="c";
		
		correctasEntretenimiento[7]="b";
		correctasEntretenimiento[8]="a";
		correctasEntretenimiento[9]="b";
		correctasEntretenimiento[10]="a";
		correctasEntretenimiento[11]="b";
		correctasEntretenimiento[12]="a";
		
		correctasEntretenimiento[13]="a";
		correctasEntretenimiento[14]="b";
		correctasEntretenimiento[15]="b";
		correctasEntretenimiento[16]="c";
		correctasEntretenimiento[17]="c";
		correctasEntretenimiento[18]="c";
		
		correctasEntretenimiento[19]="a";
		correctasEntretenimiento[20]="b";
		correctasEntretenimiento[21]="c";
		correctasEntretenimiento[22]="a";
		correctasEntretenimiento[23]="a";
		correctasEntretenimiento[24]="b";
		
		correctasEntretenimiento[25]="b";
		correctasEntretenimiento[26]="c";
		correctasEntretenimiento[27]="b";
		correctasEntretenimiento[28]="c";
		correctasEntretenimiento[29]="a";
		correctasEntretenimiento[30]="a";
		
		correctasEntretenimiento[31]="b";
		correctasEntretenimiento[32]="c";
		correctasEntretenimiento[33]="c";
		correctasEntretenimiento[34]="c";
		correctasEntretenimiento[35]="b";
		correctasEntretenimiento[36]="b";
		
		correctasEntretenimiento[37]="c";
		correctasEntretenimiento[38]="c";
		correctasEntretenimiento[39]="a";
		correctasEntretenimiento[40]="a";
		correctasEntretenimiento[41]="c";
		correctasEntretenimiento[42]="a";
		
		correctasEntretenimiento[43]="b";
		correctasEntretenimiento[44]="c";
		correctasEntretenimiento[45]="b";
		correctasEntretenimiento[46]="c";
		correctasEntretenimiento[47]="c";
		correctasEntretenimiento[48]="a";
		
		correctasEntretenimiento[49]="a";
		correctasEntretenimiento[50]="c";
		correctasEntretenimiento[51]="b";
		correctasEntretenimiento[52]="b";
		correctasEntretenimiento[53]="b";
		correctasEntretenimiento[54]="a";
		
		correctasEntretenimiento[55]="a";
		correctasEntretenimiento[56]="b";
		correctasEntretenimiento[57]="c";
		correctasEntretenimiento[58]="b";
		correctasEntretenimiento[59]="a";
		correctasEntretenimiento[60]="c";
		
		correctasEntretenimiento[61]="b";
		correctasEntretenimiento[62]="a";
		correctasEntretenimiento[63]="a";
		correctasEntretenimiento[64]="a";
		correctasEntretenimiento[65]="c";
		correctasEntretenimiento[66]="a";
		//////////////////////////////////////////////
		
		preguntasArte[0]="¿?\na. \nb. \nc. ";
		preguntasArte[1]="¿Quien escribio el Martin Fierro?\na. Jose Hernandez\nb. Edouart Roditi\nc. Roberto Fontanarosa";
		preguntasArte[2]="¿Quien escribio 1984?\na. George Orwell\nb. Aldous Huxley\nc. Winston Smith";	
		preguntasArte[3]="¿A quien esperaba Penelope?\na. A Ulises\nb. A Jason\nc. A Aquiles";
		preguntasArte[4]="¿A quien se llama 'el caballero de la triste figura'?\na. Don Quijote\nb. Hamlet\nc. Merlin";
		preguntasArte[5]="¿Que banda lideraba Kurt Cobain?\na. Foo Fighters\nb. Blind Melon\nc. Nirvana";
		preguntasArte[6]="¿De que nacionalidad es el musico Peter Gabriel?\na. Britanico\nb. Canadiense\nc. Australiano";
		
		preguntasArte[7]="¿De que opera de Verdi es el aria 'La donna e mobile'?\na. Rigoletto\nb. La Traviata\nc. Aida";
		preguntasArte[8]="¿Quien escribio la Sirenita?\na. Andersen\nb. Hermanos Grimm\nc. Jacob Prix";
		preguntasArte[9]="¿De que color era la ballena Moby Dick?\na. Blanca\nb. Gris\nc. Azul";
		preguntasArte[10]="¿Como perdio la mano el Capitan Garfio?\na. Peter Pan\nb. La perdio de niño\nc. Un tiburon";
		preguntasArte[11]="¿Como se llaman los hermanos de Wendy en la historia de Peter Pan?\na. Marcos y Miguel\nb. Juan y Miguel\nc. Elias y Miguel";
		preguntasArte[12]="¿De que nacionalidad la banda de musica grunge Nirvana?\na. Cnaadiense\nb. Australiano\nc. EEUU";
		
		preguntasArte[13]="¿Cuantas grullas de hacen falta para cumplir un deseo?\na. cien mil\nb. diez mil\nc. mil";
		preguntasArte[14]="¿De que pais es el vallenato?\na. Costa Rica\nb. Cuba\nc. Colombia";
		preguntasArte[15]="¿Que escritora fue el gran amor de Chopin en sus ultimos años?\na. Cosima Liszt\nb. Sara Bernhardt\nc. George Sand";
		preguntasArte[16]="¿Cuantas novelas hay de Harry Potter?( Novelas, no peliculas )\na. 3\nb. 7\nc. 9";
		preguntasArte[17]="¿De quien era el caballo 'Rocinante'?\na. Sancho Panza\nb. Del Cid\nc. Don Quijote";
		preguntasArte[18]="¿Que famoso personaje creo Ian Fleming?\na. Dracula\nb. Batman\nc. James Bond";
		
		preguntasArte[19]="¿Cuantas moscas mato de un solo golpe el sastrecillo valiente?\na. 2\nb. 20\nc. 7";
		preguntasArte[20]="¿Quien escribio la musica de la opera 'Don Giovani'?\na. Verdi\nb. Mozart\nc. Vivaldi";
		preguntasArte[21]="¿Donde se conocieron Romeo y Julieta?\na. calle\nb. baile\nc. misa";
		preguntasArte[22]="¿En que pais nacio Julio Cortazar?\na. Belgica\nb. Argentina\nc. Francia";
		preguntasArte[23]="¿Quien salva la vida de Blancanieves ?\na. Los Enanitos\nb. Cazador\nc. Lobo";
		preguntasArte[24]="¿En que ciudad trascurre el Eternauta?\na. Paris\nb. Washigton\nc. Buenos Aires";
		
		preguntasArte[25]="¿Donde queda el bosque de Gulubu?\na. Bariloche\nb. Sierra la Ventana\nc. Es ficticio";
		preguntasArte[26]="¿Cual de estos reconocidos compositores fue un prodigio?\na. Haydn\nb. Schumann\nc. Mozart";
		preguntasArte[27]="¿Cual es nombre de pila de Fito Paez?\na. Federico\nb. Adolfo\nc. Rodolfo";
		preguntasArte[28]="¿Quien atormenta al pueblo de Sleepy Hollow?\na. Jack, el destripador\nb. Las brujas de Salem\nc. El jinete sin cabeza";
		preguntasArte[29]="¿Como se llamaba el compañero de Robinson Crusoe?\na. Viernes\nb. Eric\nc. November";
		preguntasArte[30]="¿Como se llamaba la esposa del pintor Salvador Dali?\na. Frida\nb. Sara\nc. Gala";
		
		preguntasArte[31]="¿Que cantante y bailarin gano 8 premios Grammy en 1984?\na. Michael Jackson\nb. Bruce Springteen\nc. Frank Sinatra";
		preguntasArte[32]="¿Cual era la profesion de Tintin?\na. Detective\nb. Arqueologo\nc. Reportero";
		preguntasArte[33]="¿En que disco esta el tema 'Yesterday' de los Beatles?\na. Let it be\nb. La Banda Sargento Peppers\nc. Help!";
		preguntasArte[34]="¿Con que estacion comienza 'las cuatro estaciones' de Vivaldi?\na. Verano\nb. Invierno\nc. Primavera";
		preguntasArte[35]="¿Que es el licantropo que aparece en cuentos y leyendas?\na. Un monstruo marino\nb. Zombie\nc. Hombre Lobo";
		preguntasArte[36]="¿Como se llama el lider de la banda de brit-pop Blur?\na. Thom Yorke\nb. Damon Albarn\nc. Liam Gallagher";
		
		preguntasArte[37]="¿Como se llama el pais de los seres pequeños en 'Los viajes de Gulliver'?\na. Pequeland\nb. Littlecity\nc. Lilliput";
		preguntasArte[38]="¿Cual es el nombre de la bella durmiente en la pelicula de Dysney?\na. Aurora\nb. Angel\nc. Bella";
		preguntasArte[39]="¿En que pais nacio Ruben Blades?\na. Cuba\nb. Panama\nc. Nicaragua";
		preguntasArte[40]="¿Cual era la profesion de Watson?( Compañero de Sherlock Holmes )\na. Abogado\nb. Medico\nc. Policia";
		preguntasArte[41]="¿Como se llama la tierra de Peter Pan?\na. Felizlandia\nb. Nunca Jamas\nc. Mar Diversion";
		preguntasArte[42]="Las negras, corcheas y otras figuras, ¿Que indican?\na. Que hay que cantar mas alto\nb. duracion de notas\nc. Silencio";
		
		preguntasArte[43]="¿Cuantos espacios hay entre las lineas de un pentagrama?\na. 5\nb. 4\nc. 7";
		preguntasArte[44]="¿De que pais es originaria la cumbia?\na. Colombia\nb. Venezuela\nc. Puerto Rico";
		preguntasArte[45]="¿Con que arma ataco David Goliat?\na. Con un puño\nb. Con un hacha\nc. Con una honda";
		preguntasArte[46]="¿Como se llaman los cuadros en que se ve el rostro de una persona?\na. Retratos\nb. Efigies\nc. Personales";
		preguntasArte[47]="¿En que año se separaron los Beatles?\na. 1965\nb. 1970\nc. 1980";
		preguntasArte[48]="¿A que hora tomaban el té el Sombrero Loco y la liebre de Marzo?( Alicia en el pais de las maravillas )\na. 17:00\nb. 16:30\nc. 18:00";
		
		preguntasArte[49]="¿En año nacio Mick Jagger?\na. 1941\nb. 1943\nc. 1955";
		preguntasArte[50]="¿Que es el Martin Fierro?\na. cuento\nb. poema\nc. novela";
		preguntasArte[51]="'El proceso' de Kafka¿Que es?\na. cuento\nb. novela\nc. poema";
		preguntasArte[52]="'El jugador' de Dostoievski ¿a que jugaba?\na. poker\nb. ruleta\nc. caballos";
		preguntasArte[53]="¿A quienes intentaba unir 'La Celestina'?\na. Romeo y Julieta\nb. Paolo y Francesca\nc. Calisto y Melibea";
		preguntasArte[54]="¿Que es un haiku?\na. videojuegos\nb. poema\nc. anime";
		
		preguntasArte[55]="¿Que monstruo fue inventado por Bram Stroker?\na. Frankestein\nb. Alien\nc. Dracula";
		preguntasArte[56]="¿Que quiere decir 'naif'?\na. Nuevo\nb. Alegre\nc. Ingenuo";
		preguntasArte[57]="¿A quien pertenece la letra de la cancion 'Para la libertad'?\na. Joan Manuel Serrat\nb. Antonio Machado\nc. Miguel Hernandez";
		preguntasArte[58]="¿Bajo que arbol estaba sentada la Catalina mirando la frescura de las aguas caer?\na. Un naranjo\nb. Un laurel\nc. Un sauce";
		preguntasArte[59]="¿Quien gano el premio Nobel de Literatura en 1969?\na. Vladimir Nabokov\nb. Andre Malraux\nc. Samuel Beckett";
		preguntasArte[60]="¿De que color es el traje de Peter Pan?\na. Azul\nb. Verde\nc. Peter Pan no usa traje, usa taparabo";
		
		preguntasArte[61]="En el cuento de Peter Pan ¿Que se come el cocodrilo ademas de la mano del pirata?\na. un reloj\nb. un anillo\nc. un sombrero";
		preguntasArte[62]="¿Cuantas hermanastra tiene Cenicienta?\na. 1\nb. 2\nc. 3";
		preguntasArte[63]="¿Cual es el apellido del oso Osofete?\na. Firulete\nb. Estofado\nc. Simenon";
		preguntasArte[64]="¿Cuantos poemas de amor son los de Neruda?( mas una cancion )\na. 17\nb. 14\nc. 20";
		preguntasArte[65]="¿Quien escribio 'las aventuras de Huckleberry Finn'?\na. Louisa May Alcott\nb. Charles Dickens\nc. Mark Twain";
		preguntasArte[66]="¿Quien es el autor de 'El Satiricon'?\na. Petronio\nb. Bocaccio\nc. Cortazar";

		correctasArte[0]="a";
		correctasArte[1]="a";
		correctasArte[2]="a";	
		correctasArte[3]="c";
		correctasArte[4]="a";
		correctasArte[5]="c";
		correctasArte[6]="a";
		
		correctasArte[7]="b";
		correctasArte[8]="a";
		correctasArte[9]="a";
		correctasArte[10]="c";
		correctasArte[11]="a";
		correctasArte[12]="c";
		
		correctasArte[13]="c";
		correctasArte[14]="c";
		correctasArte[15]="c";
		correctasArte[16]="b";
		correctasArte[17]="c";
		correctasArte[18]="a";
		
		correctasArte[19]="b";
		correctasArte[20]="b";
		correctasArte[21]="b";
		correctasArte[22]="a";
		correctasArte[23]="b";
		correctasArte[24]="c";
		
		correctasArte[25]="c";
		correctasArte[26]="c";
		correctasArte[27]="c";
		correctasArte[28]="c";
		correctasArte[29]="a";
		correctasArte[30]="c";
		
		correctasArte[31]="a";
		correctasArte[32]="c";
		correctasArte[33]="c";
		correctasArte[34]="c";
		correctasArte[35]="c";
		correctasArte[36]="b";
		
		correctasArte[37]="c";
		correctasArte[38]="c";
		correctasArte[39]="c";
		correctasArte[40]="b";
		correctasArte[41]="b";
		correctasArte[42]="b";
		
		correctasArte[43]="b";
		correctasArte[44]="a";
		correctasArte[45]="c";
		correctasArte[46]="a";
		correctasArte[47]="b";
		correctasArte[48]="c";
		
		correctasArte[49]="b";
		correctasArte[50]="b";
		correctasArte[51]="b";
		correctasArte[52]="b";
		correctasArte[53]="c";
		correctasArte[54]="b";
		
		correctasArte[55]="a";
		correctasArte[56]="c";
		correctasArte[57]="a";
		correctasArte[58]="b";
		correctasArte[59]="c";
		correctasArte[60]="b";
		
		correctasArte[61]="a";
		correctasArte[62]="b";
		correctasArte[63]="a";
		correctasArte[64]="c";
		correctasArte[65]="c";
		correctasArte[66]="a";
		
		
		/////////////////////////////////////////////
		
		
		
		
		double dadoTurno=(double)(Math.random()*1);
		
		
		if(dadoTurno>0.5) {
			primeraPosicion = jugadorA;
			nombrePrimerTurno = nombreJugadorA;
			medalleroPrimerTurno = medalleroJugadorA; 
			
			segundaPosicion=jugadorB;
			nombreSegundoTurno=nombreJugadorB;
			medalleroSegundoTurno=medalleroJugadorB;
			
			
			JOptionPane.showMessageDialog(null, "El primer jugador:  " + nombrePrimerTurno,"Usuario"+nombrePrimerTurno,JOptionPane.PLAIN_MESSAGE,
					new ImageIcon(CarreraMente.class.getResource("/img/usuario.png")));
			JOptionPane.showMessageDialog(null, "El segundo jugador:  " + nombreSegundoTurno,"Usuario"+nombrePrimerTurno,JOptionPane.PLAIN_MESSAGE,
					new ImageIcon(CarreraMente.class.getResource("/img/usuario.png")));
			
			
			
		}else {
			primeraPosicion=jugadorB;
			nombrePrimerTurno=nombreJugadorB;
			medalleroPrimerTurno = medalleroJugadorB; 
			
			segundaPosicion=jugadorA;
			nombreSegundoTurno=nombreJugadorA;
			medalleroSegundoTurno=medalleroJugadorA;
			
			
			JOptionPane.showMessageDialog(null, "El primer jugador:  " + nombrePrimerTurno,"Usuario"+nombrePrimerTurno,JOptionPane.PLAIN_MESSAGE,
					new ImageIcon(CarreraMente.class.getResource("/img/usuario.png")));
			
			JOptionPane.showMessageDialog(null, "El segundo jugador:  " + nombreSegundoTurno,"Usuario"+nombrePrimerTurno,JOptionPane.PLAIN_MESSAGE,
					new ImageIcon(CarreraMente.class.getResource("/img/usuario.png")));
			
			
			
		}
		
		
		

		 while (medalleroPrimerTurno < 5 && medalleroSegundoTurno < 5) {
			 boolean siguienteTurno = false;
			 
			
			
			 do {
				 JOptionPane.showMessageDialog(null, "Cantidad de estrellas: ","Medallero de "+nombrePrimerTurno,JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/estrella"+ medalleroPrimerTurno + ".png")));
				 
				 JOptionPane.showMessageDialog(null, "le toca a: " + nombrePrimerTurno,"Resultado de Respuesta",JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/usuario.png")));	
				 
				
				 siguienteTurno=false;
				 int dadoParaAvanzar =  (int)(Math.random()*6+1); 
				 
				
				 
				 
				 JOptionPane.showMessageDialog(null, "te toco un :  " + dadoParaAvanzar ,"Carrera de mente - Dado de "+nombrePrimerTurno,JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/dado"+ dadoParaAvanzar + ".png")));
				 
				 
				 primeraPosicion = primeraPosicion + dadoParaAvanzar;
				 
				 if(primeraPosicion >42) {
					 primeraPosicion=primeraPosicion-42;
					 
					 JOptionPane.showMessageDialog(null, "Haz dado la vuelta al tablero","Carrera de mente - posicion",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/vuelta.png")));
					
				 }
				 
				 JOptionPane.showMessageDialog(null, "posicion del: "+ nombrePrimerTurno+" "+ primeraPosicion,"Carrera de mente - posicion",JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/casilla"+primeraPosicion+".png")));	
				 
				
				 
				
				 
				 tablero[primeraPosicion]=1;
				 
				 
				 int pos = primeraPosicion;

					
					int resultado=0;
				
				if(pos==1 || pos==8 || pos==15 || pos==22 || pos==29 || pos==36 ) {
					
					
						JOptionPane.showMessageDialog(null, "te toca Cambalache","tema tocado",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/cambalache.png")));
						
						
						int suma  = (int)(Math.random()*66+1);
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						
						
						
						String res =(String)JOptionPane.showInputDialog(null, preguntasCambalache[suma]);
						while(!res.equalsIgnoreCase("a") && !res.equalsIgnoreCase("b") &&!res.equalsIgnoreCase("c")) {
							res = (String)JOptionPane.showInputDialog(null, preguntasCambalache[suma]);
						}
						
						if(res.equalsIgnoreCase(correctasCambalache[suma])) {
							resultado= 1;
						}else {
							resultado= 2;
						}

				}else if(pos==2 || pos==9 || pos==16 || pos==23 || pos==30 || pos==37 ){
					
						JOptionPane.showMessageDialog(null, "te toca Deportes y Juegos","tema tocado",JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/deporte.png")));
					
						
						
						int suma  = (int)(Math.random()*66+1);
						
						
						
						
						
						String res = (String) JOptionPane.showInputDialog(null, preguntasDeporte[suma]);
						while(!res.equalsIgnoreCase("a") && !res.equalsIgnoreCase("b") &&!res.equalsIgnoreCase("c")) {
							res = (String)JOptionPane.showInputDialog(null, preguntasDeporte[suma]);
						}
						if(res.equalsIgnoreCase(correctasDeporte[suma])) {
							resultado= 1;
						}else {
							resultado= 2;
						}
					
				}else if(pos==3 || pos==10 || pos==17 || pos==24 || pos==31 || pos==38 ){
					
					JOptionPane.showMessageDialog(null, "te toca Historia y Geografia","tema tocado",JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/historia.png")));
					
						
						
						int suma  = (int)(Math.random()*66+1);
						
						
						
				
						
						String res = (String) JOptionPane.showInputDialog(null, preguntasHistoria[suma]);
						while(!res.equalsIgnoreCase("a") && !res.equalsIgnoreCase("b") &&!res.equalsIgnoreCase("c")) {
							res = (String)JOptionPane.showInputDialog(null, preguntasHistoria[suma]);
						}
						if(res.equalsIgnoreCase(correctasHistoria[suma])) {
							resultado= 1;
						}else {
							resultado= 2;
						}
						
				}else if(pos==4 || pos==11 || pos==18 || pos==25 || pos==32 || pos==39 ){
						
					JOptionPane.showMessageDialog(null, "te toca Naturaleza y Ciencia","tema tocado",JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/naturaleza.png")));
						
						
						
						int suma = (int)(Math.random()*66+1);
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						
						
						
						String res = (String)JOptionPane.showInputDialog(null, preguntasNaturaleza[suma]);
						while(!res.equalsIgnoreCase("a") && !res.equalsIgnoreCase("b") &&!res.equalsIgnoreCase("c")) {
							res = (String)JOptionPane.showInputDialog(null, preguntasNaturaleza[suma]);
						}
						if(res.equalsIgnoreCase(correctasNaturaleza[suma])) {
							resultado= 1;
						}else {
							resultado= 2;
						}
						
				}else if(pos==5 || pos==12 || pos==19 || pos==26 || pos==33 || pos==40 ){
						
					JOptionPane.showMessageDialog(null, "te toca Arte","tema tocado",JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/arte.png")));
					
						
						
						int suma =(int)(Math.random()*66+1);
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						
						
						
						String res = (String)JOptionPane.showInputDialog(null, preguntasArte[suma]);
						while(!res.equalsIgnoreCase("a") && !res.equalsIgnoreCase("b") &&!res.equalsIgnoreCase("c")) {
							res = (String)JOptionPane.showInputDialog(null, preguntasArte[suma]);
						}
						
						if(res.equalsIgnoreCase(correctasArte[suma])) {
							resultado= 1;
						}else {
							resultado= 2;
						}
				}else if(pos==6 || pos==13 || pos==20 || pos==27 || pos==34 || pos==41){
					
					JOptionPane.showMessageDialog(null, "te toca Entretenimiento y Espectaculo","tema tocado",JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/entretenimiento.png")));
				
						
						
						int suma =(int)(Math.random()*66+1);
						
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						String res =(String) JOptionPane.showInputDialog(null, preguntasEntretenimiento[suma]);
						while(!res.equalsIgnoreCase("a") && !res.equalsIgnoreCase("b") &&!res.equalsIgnoreCase("c")) {
							res = (String)JOptionPane.showInputDialog(null, preguntasEntretenimiento[suma]);
						}
						
						if(res.equalsIgnoreCase(correctasEntretenimiento[suma])) {
							resultado= 1;
						}else {
							resultado= 2;
						}
						
				}else {
					
					
					JOptionPane.showMessageDialog(null, "esto es por una Estrella","tema tocado",JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/estrellita.gif")));
					
					
					
					int opcion =  (int)(Math.random()*6+1); 
					 JOptionPane.showMessageDialog(null, "te toco un :  " + opcion ,"Carrera de mente - Dado ",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/dado"+ opcion + ".png")));
					
					int suma = (int)(Math.random()*66+1);
					
					switch (opcion) {
					case 1:
						
						JOptionPane.showMessageDialog(null, "te toca Cambalache","tema tocado",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/cambalache.png")));
						
						
						
						
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						String res =(String) JOptionPane.showInputDialog(null, preguntasCambalache[suma]);
						while(!res.equalsIgnoreCase("a") && !res.equalsIgnoreCase("b") &&!res.equalsIgnoreCase("c")) {
							res = (String)JOptionPane.showInputDialog(null, preguntasCambalache[suma]);
						}
						
						if(res.equalsIgnoreCase(correctasCambalache[suma])) {
							resultado=3;
						}else {
							resultado= 2;
						}
						
					case 2:
						
						JOptionPane.showMessageDialog(null, "te toca Deportes y Juegos","tema tocado",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/deporte.png")));
						
						
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						
						
						
						String res5 = (String)JOptionPane.showInputDialog(null, preguntasDeporte[suma]);
						while(!res5.equalsIgnoreCase("a") && !res5.equalsIgnoreCase("b") &&!res5.equalsIgnoreCase("c")) {
							res5 = (String)JOptionPane.showInputDialog(null, preguntasDeporte[suma]);
						}
						
						if(res5.equalsIgnoreCase(correctasDeporte[suma])) {
							resultado=3;
						}else {
							resultado= 2;
						}
						
						
						
					case 3:
						
						JOptionPane.showMessageDialog(null, "te toca Historia y Geografia","tema tocado",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/historia.png")));
						
						
						
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						String res4 = (String)JOptionPane.showInputDialog(null, preguntasHistoria[suma]);
						while(!res4.equalsIgnoreCase("a") && !res4.equalsIgnoreCase("b") &&!res4.equalsIgnoreCase("c")) {
							res4 = (String)JOptionPane.showInputDialog(null, preguntasHistoria[suma]);
						}
						
						if(res4.equalsIgnoreCase(correctasHistoria[suma])) {
							resultado=3;
						}else {
							resultado= 2;
						}
			
					case 4:
						JOptionPane.showMessageDialog(null, "te toca Naturaleza y Ciencia","tema tocado",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/naturaleza.png")));
						
						
						
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						String res3 = (String)JOptionPane.showInputDialog(null, preguntasNaturaleza[suma]);
						while(!res3.equalsIgnoreCase("a") && !res3.equalsIgnoreCase("b") &&!res3.equalsIgnoreCase("c")) {
							res3 = (String)JOptionPane.showInputDialog(null, preguntasNaturaleza[suma]);
						}
						
						if(res3.equalsIgnoreCase(correctasNaturaleza[suma])) {
							resultado=3;
						}else {
							resultado= 2;
						}
			
					case 5:
						JOptionPane.showMessageDialog(null, "te toca Arte","tema tocado",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/arte.png")));
						
						
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						String res2 = (String)JOptionPane.showInputDialog(null, preguntasArte[suma]);
						while(!res2.equalsIgnoreCase("a") && !res2.equalsIgnoreCase("b") &&!res2.equalsIgnoreCase("c")) {
							res2 = (String)JOptionPane.showInputDialog(null, preguntasCambalache[suma]);
						}
						
						if(res2.equalsIgnoreCase(correctasArte[suma])) {
							resultado=3;
						}else {
							resultado= 2;
						}
					case 6:
						
						JOptionPane.showMessageDialog(null, "te toca Entretenimiento y Espectaculo","tema tocado",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/entretenimiento.png")));
						
						
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						String res1 = (String)JOptionPane.showInputDialog(null, preguntasEntretenimiento[suma]);
						while(!res1.equalsIgnoreCase("a") && !res1.equalsIgnoreCase("b") &&!res1.equalsIgnoreCase("c")) {
							res1 = (String)JOptionPane.showInputDialog(null, preguntasCambalache[suma]);
						}
						
						if(res1.equalsIgnoreCase(correctasEntretenimiento[suma])) {
							resultado=3;
						}else {
							resultado= 2;
						}
					default:
						break;
					}
					
					
					
					
					
				}
				

				 
				
				
				if(resultado == 1) {
				
				JOptionPane.showMessageDialog(null, "Haz respondido correctamente","Resultado de Respuesta",JOptionPane.PLAIN_MESSAGE,
				new ImageIcon(CarreraMente.class.getResource("/img/correcto.png")));
				
				
				siguienteTurno = true;
				
					
				}else if(resultado == 3) {
				
				JOptionPane.showMessageDialog(null, "Haz respondido correctamente y ganas una estrella","Resultado de Respuesta",JOptionPane.PLAIN_MESSAGE,
				new ImageIcon(CarreraMente.class.getResource("/img/correcto.png")));	
					
				
				siguienteTurno = true;
				medalleroPrimerTurno++;
				if(medalleroPrimerTurno ==6) {
					siguienteTurno=false;
				}
				 JOptionPane.showMessageDialog(null, "Cantidad de estrellas: ","Medallero de "+nombrePrimerTurno,JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/estrella"+ medalleroPrimerTurno + ".png")));
				
				
					
				}else {
					
				JOptionPane.showMessageDialog(null, "Haz respondido incorrecto","Resultado de Respuesta",JOptionPane.PLAIN_MESSAGE,
				new ImageIcon(CarreraMente.class.getResource("/img/incorrecto.png")));	
				
				
				
				}
				
				
				
				
				
			} while (siguienteTurno );
				
			 
			 
			 
			 
			
			
			JOptionPane.showMessageDialog(null, "sigue el jugador: " + nombreSegundoTurno,"Resultado de Respuesta",JOptionPane.PLAIN_MESSAGE,
					new ImageIcon(CarreraMente.class.getResource("/img/usuario.png")));	
			
			
			
			
			
			do {
				JOptionPane.showMessageDialog(null, "Cantidad de estrellas: ","Medallero de "+nombreSegundoTurno,JOptionPane.PLAIN_MESSAGE,
						new ImageIcon(CarreraMente.class.getResource("/img/estrella"+ medalleroSegundoTurno + ".png"))); 
				 
				siguienteTurno=false;
				
				int dadoParaAvanzar =  (int)(Math.random()*6+1); 
				
				 JOptionPane.showMessageDialog(null, "te toco un :  " + dadoParaAvanzar ,"Carrera de mente - Dado de "+nombreSegundoTurno,JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/dado"+ dadoParaAvanzar + ".png")));
				
				
				
				
				 segundaPosicion = segundaPosicion + dadoParaAvanzar;
				 if(segundaPosicion>42) {
					 segundaPosicion=segundaPosicion-42;
					 JOptionPane.showMessageDialog(null, "haz dado la vuelta al tablero","Carrera de mente - vuelta",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/vuelta.png")));	
					 
				 }
				 
				 JOptionPane.showMessageDialog(null, "posicion del: "+ nombreSegundoTurno+" "+ segundaPosicion,"Carrera de mente - posicion",JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/casilla"+segundaPosicion+".png")));	
				 
				
				
				 tablero[segundaPosicion]=2;
				 
				 
				 
				 int pos = segundaPosicion;
				 
				 

					
					int resultado=0;
				
				if(pos==1 || pos==8 || pos==15 || pos==22 || pos==29 || pos==36 ) {
					
					
						JOptionPane.showMessageDialog(null, "te toca Cambalache","tema tocado",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/cambalache.png")));
						
						
						int suma  = (int)(Math.random()*66+1);
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						
						
						
						String res =(String)JOptionPane.showInputDialog(null, preguntasCambalache[suma]);
						while(!res.equalsIgnoreCase("a") && !res.equalsIgnoreCase("b") &&!res.equalsIgnoreCase("c")) {
							res = (String)JOptionPane.showInputDialog(null, preguntasCambalache[suma]);
						}
						
						if(res.equalsIgnoreCase(correctasCambalache[suma])) {
							resultado= 1;
						}else {
							resultado= 2;
						}

				}else if(pos==2 || pos==9 || pos==16 || pos==23 || pos==30 || pos==37 ){
					
						JOptionPane.showMessageDialog(null, "te toca Deportes y Juegos","tema tocado",JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/deporte.png")));
					
						
						
						int suma  = (int)(Math.random()*66+1);
						
						
						
						String res = (String) JOptionPane.showInputDialog(null, preguntasDeporte[suma]);
						while(!res.equalsIgnoreCase("a") && !res.equalsIgnoreCase("b") &&!res.equalsIgnoreCase("c")) {
							res = (String)JOptionPane.showInputDialog(null, preguntasDeporte[suma]);
						}
						if(res.equalsIgnoreCase(correctasDeporte[suma])) {
							resultado= 1;
						}else {
							resultado= 2;
						}
					
				}else if(pos==3 || pos==10 || pos==17 || pos==24 || pos==31 || pos==38 ){
					
					JOptionPane.showMessageDialog(null, "te toca Historia y Geografia","tema tocado",JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/historia.png")));
					
						
						
						int suma  = (int)(Math.random()*66+1);
						
						
						
						String res = (String) JOptionPane.showInputDialog(null, preguntasHistoria[suma]);
						while(!res.equalsIgnoreCase("a") && !res.equalsIgnoreCase("b") &&!res.equalsIgnoreCase("c")) {
							res = (String)JOptionPane.showInputDialog(null, preguntasHistoria[suma]);
						}
						if(res.equalsIgnoreCase(correctasHistoria[suma])) {
							resultado= 1;
						}else {
							resultado= 2;
						}
						
				}else if(pos==4 || pos==11 || pos==18 || pos==25 || pos==32 || pos==39 ){
						
					JOptionPane.showMessageDialog(null, "te toca Naturaleza y Ciencia","tema tocado",JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/naturaleza.png")));
						
						
						
						int suma = (int)(Math.random()*66+1);
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						String res = (String)JOptionPane.showInputDialog(null, preguntasNaturaleza[suma]);
						while(!res.equalsIgnoreCase("a") && !res.equalsIgnoreCase("b") &&!res.equalsIgnoreCase("c")) {
							res = (String)JOptionPane.showInputDialog(null, preguntasNaturaleza[suma]);
						}
						if(res.equalsIgnoreCase(correctasNaturaleza[suma])) {
							resultado= 1;
						}else {
							resultado= 2;
						}
						
				}else if(pos==5 || pos==12 || pos==19 || pos==26 || pos==33 || pos==40 ){
						
					JOptionPane.showMessageDialog(null, "te toca Arte","tema tocado",JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/arte.png")));
					
						
						
						int suma =(int)(Math.random()*66+1);
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						String res = (String)JOptionPane.showInputDialog(null, preguntasArte[suma]);
						while(!res.equalsIgnoreCase("a") && !res.equalsIgnoreCase("b") &&!res.equalsIgnoreCase("c")) {
							res = (String)JOptionPane.showInputDialog(null, preguntasArte[suma]);
						}
						
						if(res.equalsIgnoreCase(correctasArte[suma])) {
							resultado= 1;
						}else {
							resultado= 2;
						}
				}else if(pos==6 || pos==13 || pos==20 || pos==27 || pos==34 || pos==41){
					
					JOptionPane.showMessageDialog(null, "te toca Entretenimiento y Espectaculo","tema tocado",JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/entretenimiento.png")));
				
						
						
						int suma =(int)(Math.random()*66+1);
						
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						String res =(String) JOptionPane.showInputDialog(null, preguntasEntretenimiento[suma]);
						while(!res.equalsIgnoreCase("a") && !res.equalsIgnoreCase("b") &&!res.equalsIgnoreCase("c")) {
							res = (String)JOptionPane.showInputDialog(null, preguntasEntretenimiento[suma]);
						}
						
						if(res.equalsIgnoreCase(correctasEntretenimiento[suma])) {
							resultado= 1;
						}else {
							resultado= 2;
						}
						
				}else {
					
					
					JOptionPane.showMessageDialog(null, "esto es por una Estrella","tema tocado",JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/estrellita.gif")));
					
					
					int opcion =  (int)(Math.random()*6+1) ;
					
					 JOptionPane.showMessageDialog(null, "te toco un :  " + opcion ,"Carrera de mente - Dado ",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/dado"+ opcion + ".png")));
					
					int suma = (int)(Math.random()*66+1);
					
					switch (opcion) {
					case 1:
						
						JOptionPane.showMessageDialog(null, "te toca Cambalache","tema tocado",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/cambalache.png")));
						
						
						
						
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						String res =(String) JOptionPane.showInputDialog(null, preguntasCambalache[suma]);
						while(!res.equalsIgnoreCase("a") && !res.equalsIgnoreCase("b") &&!res.equalsIgnoreCase("c")) {
							res = (String)JOptionPane.showInputDialog(null, preguntasCambalache[suma]);
						}
						
						if(res.equalsIgnoreCase(correctasCambalache[suma])) {
							resultado=3;
						}else {
							resultado= 2;
						}
						
					case 2:
						
						JOptionPane.showMessageDialog(null, "te toca Deportes y Juegos","tema tocado",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/deporte.png")));
						
						
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						String res5 = (String)JOptionPane.showInputDialog(null, preguntasDeporte[suma]);
						while(!res5.equalsIgnoreCase("a") && !res5.equalsIgnoreCase("b") &&!res5.equalsIgnoreCase("c")) {
							res5 = (String)JOptionPane.showInputDialog(null, preguntasDeporte[suma]);
						}
						
						if(res5.equalsIgnoreCase(correctasDeporte[suma])) {
							resultado=3;
						}else {
							resultado= 2;
						}
						
						
						
					case 3:
						
						JOptionPane.showMessageDialog(null, "te toca Historia y Geografia","tema tocado",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/historia.png")));
						
						
						
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						String res4 = (String)JOptionPane.showInputDialog(null, preguntasHistoria[suma]);
						while(!res4.equalsIgnoreCase("a") && !res4.equalsIgnoreCase("b") &&!res4.equalsIgnoreCase("c")) {
							res4 = (String)JOptionPane.showInputDialog(null, preguntasHistoria[suma]);
						}
						
						if(res4.equalsIgnoreCase(correctasHistoria[suma])) {
							resultado=3;
						}else {
							resultado= 2;
						}
			
					case 4:
						JOptionPane.showMessageDialog(null, "te toca Naturaleza y Ciencia","tema tocado",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/naturaleza.png")));
						
						
						
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						String res3 = (String)JOptionPane.showInputDialog(null, preguntasNaturaleza[suma]);
						while(!res3.equalsIgnoreCase("a") && !res3.equalsIgnoreCase("b") &&!res3.equalsIgnoreCase("c")) {
							res3 = (String)JOptionPane.showInputDialog(null, preguntasNaturaleza[suma]);
						}
						
						if(res3.equalsIgnoreCase(correctasNaturaleza[suma])) {
							resultado=3;
						}else {
							resultado= 2;
						}
			
					case 5:
						JOptionPane.showMessageDialog(null, "te toca Arte","tema tocado",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/arte.png")));
						
						
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						String res2 = (String)JOptionPane.showInputDialog(null, preguntasArte[suma]);
						while(!res2.equalsIgnoreCase("a") && !res2.equalsIgnoreCase("b") &&!res2.equalsIgnoreCase("c")) {
							res2 = (String)JOptionPane.showInputDialog(null, preguntasCambalache[suma]);
						}
						
						if(res2.equalsIgnoreCase(correctasArte[suma])) {
							resultado=3;
						}else {
							resultado= 2;
						}
					case 6:
						
						JOptionPane.showMessageDialog(null, "te toca Entretenimiento y Espectaculo","tema tocado",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/entretenimiento.png")));
						
						
						JOptionPane.showMessageDialog(null, "pregunta nro:  "+ suma);
						
						
						String res1 = (String)JOptionPane.showInputDialog(null, preguntasEntretenimiento[suma]);
						while(!res1.equalsIgnoreCase("a") && !res1.equalsIgnoreCase("b") &&!res1.equalsIgnoreCase("c")) {
							res1 = (String)JOptionPane.showInputDialog(null, preguntasCambalache[suma]);
						}
						
						if(res1.equalsIgnoreCase(correctasEntretenimiento[suma])) {
							resultado=3;
						}else {
							resultado= 2;
						}
					default:
						break;
					}
					
					
					
					
					
				}
				

				
			
				 
				 
				 
				 
				 
				
				
				
				 
				
					if(resultado==1) {
						JOptionPane.showMessageDialog(null, "Haz respondido correctamente","Resultado de Respuesta",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/correcto.png")));
					
					siguienteTurno = true;
					
					
					}else if(resultado==3) {
						JOptionPane.showMessageDialog(null, "Haz respondido correctamente y ganas una estrella","Resultado de Respuesta",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/correcto.png")));		
					
					siguienteTurno = true;
					medalleroSegundoTurno++;
					
					if(medalleroSegundoTurno ==6) {
						siguienteTurno=false;
					}
					
					JOptionPane.showMessageDialog(null, "Cantidad de estrellas: ","Medallero de "+nombreSegundoTurno,JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(CarreraMente.class.getResource("/img/estrella"+ medalleroSegundoTurno + ".png")));
					
					
						
					}else {
						JOptionPane.showMessageDialog(null, "Haz respondido incorrecto","Resultado de Respuesta",JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(CarreraMente.class.getResource("/img/incorrecto.png")));		
					
						
					}
					
				
			} while (siguienteTurno);
			
		
		}
		
		 
		 
		
		
		if(medalleroPrimerTurno>medalleroSegundoTurno) {
			
			JOptionPane.showMessageDialog(null, "Ganador: "+nombrePrimerTurno,"Carrera de mente",JOptionPane.PLAIN_MESSAGE,
					new ImageIcon(CarreraMente.class.getResource("/img/ganador.png")));	
			
		}else if(medalleroSegundoTurno>medalleroPrimerTurno){
			
			JOptionPane.showMessageDialog(null, "Ganador: "+ nombreSegundoTurno,"Carrera de mente",JOptionPane.PLAIN_MESSAGE,
					new ImageIcon(CarreraMente.class.getResource("/img/ganador.png")));	
			
		}else if(medalleroJugadorA==medalleroJugadorB) {
			
			JOptionPane.showMessageDialog(null, "Tenemos dos ganadores: " + nombrePrimerTurno + " y " + nombreSegundoTurno,"Carrera de mente",JOptionPane.PLAIN_MESSAGE,
					new ImageIcon(CarreraMente.class.getResource("/img/empate.png")));	
		
		}
		
		
		JOptionPane.showMessageDialog(null, "termino la carrera","Carrera de mente",JOptionPane.PLAIN_MESSAGE,
				new ImageIcon(CarreraMente.class.getResource("/img/fin.png")));	
		
		
		
		

		
	}
	


	

	
	
	
	

	
}
