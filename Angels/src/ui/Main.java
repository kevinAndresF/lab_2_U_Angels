package ui;
import java.rmi.registry.Registry;
import java.util.Scanner;
import model.Legion;
import model.Angel;
import model.Candle;

/**
 * <b> DES: </b> the next class is the one that controls the interaction with the user.<br>
 * @author kevin Andrés Fernández Nougera.<br>
 * @version 1.0
 */
public class Main{

	/**
	 * <b> DES: </b> this method is the interface with which the user will interact.<br>
	 * <b> PRE: </b> it is necessary that the classes of legion, angel and sail exist with their respective methods.<br>
	 */
    public static void main(String [] args){

		////////////////////////////////////////////////////////////////////////////

    	String color;
        String essence;
        String illuminance;
        int size;
    	
    	String name;
    	String picture;
    	String prayer;
    	String month;
    	int day;
    	String power ="";
    	
    	String powerProtection = "Protección";
    	String powerHealth = "Salud";
    	String powerAbundance = "Abundancia";
    	String powerJustice = "Justicia";
		String powerLoyalty = "Lealtad";
		
		Legion legion= new Legion();
    	
    	
        int electionPower, electionContinueSoftware, electionFuntionSoftware;
        
        Scanner reader = new Scanner(System.in);
		
		//////////////////////////////////////////////////////////////////////////////
		Candle candle1 = new Candle("Azul", "Vainilla", "Nose bro Disculpa", 15);
		legion.createAngel("Miguel", "https://www.iglesia.info/wp-content/uploads/2017/03/san-miguel-arcangel.jpg", "San Miguel Arcángel, defiéndenos en la lucha. Sé nuestro amparo contra la perversidad y acechanzas del demonio. Que Dios manifieste sobre él su poder, es nuestra humilde súplica. Y tú, oh Príncipe de la Milicia Celestial, con el poder que Dios te ha conferido, arroja al infierno a Satanás, y a los demás espíritus malignos que vagan por el mundo para la perdición de las almas. Amén", powerJustice, "septiembre", 29, candle1);



		Candle candle2 = new Candle("Azul", "Plata", "Nose bro Disculpa", 15);
		legion.createAngel("Gabriel", "http://1.bp.blogspot.com/_zveyeQI-e5M/ScTj9l2UMrI/AAAAAAAAADM/9bvpbFWVBSA/s400/angel_gabriel.jpg", "Oh glorioso Arcángel San Gabriel, llamado fortaleza de Dios, príncipe excelentísimo entre los espíritus angélicos, embajador del Altísimo, que mereciste ser escogido para anunciar a la Santísima Virgen la Encarnación de divino Verbo en sus purísimas entrañas: yo te suplico tengas a bien rogar a Dios por mí, miserable pecador, para que conociendo y adorando este inefable misterio, logre gozar el fruto de la divina redención en la gloria celestial. Amén.", powerAbundance, "marzo", 18, candle2);
		//////////////////////////////////////////////////////////////////////////////

        do {
			System.out.println("Hola, este es el menu");
            System.out.println("por favor ingrese el numero correspondiente a la funcion que desea realizar");
            System.out.println("1.Crear un angel. /n2.Borrar un angel. /n3.Contar angeles ingresados. /n4.Desplegar la información del arcángel dado su nombre. /n5.Desplegar la información del arcángel dado su poder. /n6.Desplegar las celebraciones a realizar dado un mes. /n7.Desplegar todas las celebraciones.");
            electionFuntionSoftware= reader.nextInt();
            switch(electionFuntionSoftware){
                case 1:
                	System.out.println("Usted a elegido la opcion de crear angel ( Arcangel )"
                			+ "/nSe le pedira una serie de caracteristicas que tiene un angel arcangel"
                			+ "/nombre: /n");
                	name = reader.next();
                	
                	System.out.println("Imagen ( lo que se tendra que ingresar es una direccion donde se encuentra la imagen, por ejemplo un link): /n");
                	picture = reader.next();
                	
                	System.out.println("Oracion: /n");
                	prayer = reader.next();
                	
                	System.out.println("Mes de celebración: /n");
                	month = reader.next();
                	
                	System.out.println("Dia de celebración: /n");
                	day = reader.nextInt();
                	do{
                	System.out.println("Ingrese el numero que corresponda a su opcion deseada. /n"
                			+ "En la siguiente linea se le mostraran diferentes tipos de opciones pera agregarle a el angel un poder: /n"
                			+ "1.Protección /n2.Salud /n3.Abundancia /n4.Justicia /n5.Lealtad /n6.Otro");
                	electionPower = reader.nextInt();
                	if(electionPower==1){
                		power = powerProtection;
					}
					else if (electionPower == 2){
						power = powerHealth;
					}
					else if (electionPower ==3){
						power = powerAbundance;
					}
					else if (electionPower == 4){
						power = powerJustice;
					}else if (electionPower == 5){
						power = powerLoyalty;
					}
					else if (electionPower == 6){
							System.out.print("ingrese el poder : /n");
							power = reader.nextLine();
					}
					}while (electionPower!=1 && electionPower!=2 && electionPower!=3 && electionPower!=4 && electionPower!=5 && electionPower!=6);
					
					System.out.println("Color de la vela: /n");
					color = reader.nextLine();
					System.out.println("Esencia de la vela: /n");
					essence = reader.nextLine();
					System.out.println("Iluminancia de la vela: /n");
					illuminance = reader.nextLine();
					System.out.println("Tamaño de la vela: /n");
					size = reader.nextInt();
					Candle candle = new Candle(color, essence, illuminance, size);

					System.out.print(legion.createAngel(name, picture, prayer, power, month, day, candle));

					break;

				case 2:
				
				System.out.println("ingrese el nombre del angel el cual desea borrar: /n");
				name = reader.nextLine();

				System.out.println(legion.removeAngel(name));

				break;

				case 3:

				System.out.println(legion.getAngelSize());

				break;

				case 4:

				System.out.println("ingrese el nombre del angel al cual le desea saber su informacion: /n");
				name = reader.nextLine();

				System.out.println(legion.getInformationAngelName(name));

				break;

				case 5:

				System.out.println("ingrese el poder del angel al cual le desea saber su informacion: /n");
				power = reader.nextLine();

				System.out.println(legion.getInformationAngelPower(power));

				break;

				case 6:

				System.out.println("ingrese el mes para desplegar las celebraciones: /n");
				month = reader.nextLine();

				System.out.println(legion.getInformationCelebration(month));
								

				break;
				
				case 7:

				System.out.println(legion.getInformationAllCelebration());

				break;



            }
            
            
            System.out.println("para poder elegir si seguir utilizando la aplicacion (volver al menú), ingrese los numeros correspondientes");
            System.out.println("1.Si. /n2.No./n");
            electionContinueSoftware= reader.nextInt();


        }while(electionContinueSoftware==1);
		
		//////////////////////////////////////////////////////////////////////////////

        System.out.println("Gracias por utilizar esta maravillosa aplicacion, que si yo le tuviera que dar una nota al que la hizo le pongo 5 en el laboratorio. /nGracias por utilizar aplicaciones de Kevin Fernandez :)");

	}
	
	///////////////////////////////////////////////////////////////////////////

}
