package model;

import java.util.ArrayList;

/**
 * <b> DES: </b> the next class instance attributes of an Legion, creating its constructor methods and modifiers.plus controls the other classes which are angel and candle.<br>
 * @author kevin Andrés Fernández Nougera.<br>
 * @version 1.0
 */
public class Legion{
    
    ////////////////////////////////////////////////////////////////////////////

	private ArrayList<Angel> angels;

	/**
	 * <b> DES: </b> the method analyzes whether a text string ends with "el". <br>
	 * @param name this parameter indicates the name to which the last two letters will be revised. !=null.<br>
	 * @return a logical value is returned which tells us that if it is true it ends in "el" and if it is false it does not end in "el".<br>
	 */
	public boolean valueNameEL(String name) {
		boolean value = false;
		char primerletra= name.charAt(name.length()-2);
		char secondletra= name.charAt(name.length()-1);
		
		if(primerletra== 'e' && secondletra=='l') {
			value=true;
		}
		
		return value;
	}
	
	/**
	 * <b> DES: </b> this method evaluates if there is an angel with that power.<br>
	 * <b> PRE: </b> the list of angels must be created.<br>
	 * @param power is the name of the power that is to be compared to each of the powers of other angels. != null.<br>
	 * @return a logical value is returned which if true means that there is no angel with that power, and if it is false it means that if there are angels with that power.<br>
	 */
	public boolean valuePower(String power) {
		boolean value = true;
		
		for(int i=0; i<= angels.size();i++) {
			String powerPositioni =  angels.get(i).getPower();
			
			if (powerPositioni.equalsIgnoreCase(power) == true){
				value = false;
			}
			
		}
		
		return value;
	}
	
	/**
	 * <b> DES: </b> this method evaluates if there is an angel with the same name.<br>
	 * <b> PRE: </b> the list of angels must be created.<br>
	 * @param name is the name that will compare with the name of each of the other angels. !=null.<br>
	 * @return this method returns a logical value which if true would indicate that there is no angel with that name, and if it returns a false it means that that name already has an angel.<br>
	 */
	public boolean valueName(String name) {
		boolean value = true;
		
		for(int i=0; i<= angels.size();i++) {
			String namePositioni =  angels.get(i).getName();
			
			if (namePositioni.equalsIgnoreCase(name) == true){
				value = false;
			}
			
		}
		
		return value;
	}

	/**
	 * <b> DES: </b> this method creates an angel with all its characteristics.<br>
	 * @param name the name of the angel. !=null.<br>
	 * @param picture is the direction where the angel image is located. !=null<br>
	 * @param prayer is the prayer of the angel. !=null.<br>
	 * @param power is the power of the angel. !=null.<br>
	 * @param month is the month that celebrates the angel. !=null.<br>
	 * @param day  is the day that celebrates the angel. !=null.<br>
	 * @param candle are the characteristics of the angel candle.!=null.<br>
	 * @return returns a message that tells us if the angel was created or not.<br>
	 */
	public String createAngel(String name, String picture, String prayer, String power, String month, int day, Candle candle) {
		String message = "angel no se creo, por fallos cuando ingreso los datos";
		if(valueNameEL(name)==true && valuePower(power)==true && valueName(name)==true) {
			Angel angels1 = new Angel(name, picture, prayer, power, month, day, candle); 
			angels.add(angels1);
			message = "angel fue creado, correctamente";
			
		}
		
		return message;
    }
	
	/**
	 * <b> DES: </b> este método elimina el ángel de acuerdo con un nombre ingresado.<br>
	 * <b> PRE: </b> the list of angels must be created.<br>
	 * @param name is the name of the angel to be erased.<br>
	 * @return returns a message whether the angel was deleted or not.<br>
	 */
	public String removeAngel(String name) {
		String message = "angel no se borro";
		
		String namePositioni;
		for(int i=0; i<= angels.size();i++) {
			namePositioni =  angels.get(i).getName();
			
			if (namePositioni.equalsIgnoreCase(name) == true){
				angels.remove(i);
				message = "angel fue borrado";
			}
		}
		
		return message;
		
	}	

	/**
	 * <b> DES: </b> calculates the number of angels created.<br>
	 * @return we return an integer number of created angels.<br>
	 */
	public int getAngelSize() {
		int size = angels.size();		
		return size; 
	}
	
	/**
	 * <b> DES: </b> this method collects all the information of an angel in specific by name.<br>
	 * <b> PRE: </b> the list of angels must be created.<br>
	 * @param name is the name of the angel to be found. !=null.<br>
	 * @return  all the information of the angel.<br>
	 */
	public String getInformationAngelName(String name) {
		String information = "Angel no encontrado";
		
		for(int i=0; i<= angels.size();i++) {
			
			String namePositioni =  angels.get(i).getName();
			
			if (namePositioni.equalsIgnoreCase(name) == true){
				information = "El angel tiene:/nNommbre: "+name+
						"/nDireccion de imagen: "+angels.get(i).getPicture()+
						"/nOracion: "+angels.get(i).getPrayer()+
						"/nPoder: "+angels.get(i).getPower()+
						"/nMes y dia de celebracion:/n"+angels.get(i).getMonth()+"/n"+angels.get(i).getDay()+
						"/nVela del angel tiene las siguientes caracteristicas:/n"+
						"/nColor: "+angels.get(i).getCandle().getColor()+
						"/nTamaño de: "+angels.get(i).getCandle().getSize()+" Cm"+
						"/nEsencia de: "+ angels.get(i).getCandle().getEssence()+
						"/nGrado de iluminancia de: "+ angels.get(i).getCandle().getIlluminance()+"/n";
			}
			
		}
		
		return information;
	}
	
	/**
	 * <b> DES: </b> this method collects all the information of an angel in specific by power.<br>
	 * <b> PRE: </b> the list of angels must be created.<br>
	 * @param power is the power of the angel to be found. !=null.<br>
	 * @return all the information of the angel.<br>
	 */
	public String getInformationAngelPower(String power) {
		String information = "Angel no encontrado";
		
		for(int i=0; i<= angels.size();i++) {
			
			String powerPositioni =  angels.get(i).getName();
			
			if (powerPositioni.equalsIgnoreCase(power) == true){
				information = "El angel tiene:/nNommbre: "+angels.get(i).getName()+
						"/nDireccion de imagen: "+angels.get(i).getPicture()+
						"/nOracion: "+angels.get(i).getPrayer()+
						"/nPoder: "+angels.get(i).getPower()+
						"/nMes y dia de celebracion:/n"+angels.get(i).getMonth()+"/n"+angels.get(i).getDay()+
						"/nVela del angel tiene las siguientes caracteristicas:/n"+
						"/nColor: "+angels.get(i).getCandle().getColor()+
						"/nTamaño de: "+angels.get(i).getCandle().getSize()+" Cm"+
						"/nEsencia de: "+ angels.get(i).getCandle().getEssence()+
						"/nGrado de iluminancia de: "+ angels.get(i).getCandle().getIlluminance()+"/n";
			}
			
		}
		
		return information;
	}
	
	/**
	 * <b> DES: </b> this method gives the celebrations of a month.<br>
	 * <b> PRE: </b> the list of angels must be created.<br>
	 * @param month is the month we will look for. !=null.<br>
	 * @return all the celebrations of one month.<br>
	 */
	public String getInformationCelebration(String month) {
		String information = "Mes no encontrado, o no hay celebraciones";
        for(int i=0; i<= angels.size();i++) {
			
			String monthPositioni =  angels.get(i).getMonth();
			
			if (monthPositioni.equalsIgnoreCase(month) == true){
				information = "";
				information = ""+information+"El angel tiene:/nNommbre: "+angels.get(i).getName()+
						"/nDireccion de imagen: "+angels.get(i).getPicture()+
						"/nMes y dia de celebracion:/n"+angels.get(i).getMonth()+"/n"+angels.get(i).getDay()+
						"/nVela del angel tiene las siguientes caracteristicas:/n"+
						"/nColor: "+angels.get(i).getCandle().getColor()+
						"/nEsencia de: "+ angels.get(i).getCandle().getEssence()+"/n";
			}
			
		}
		
		return information;
	}
	
	/**
	 * <b> DES: </b> .<br>
	 * <b> PRE: </b> the list of angels must be created.<br>
	 * @return returns all the celebrations of all angels.<br>
	 */
	public String getInformationAllCelebration() {
		String information = "";
        for(int i=0; i<= angels.size();i++) {
			
			information = information+"El angel se llama:/n"+angels.get(i).getName()+
					"/nMes y dia de celebracion:/n"+angels.get(i).getMonth()+"/n"+angels.get(i).getDay()+"/n";
		}
		
		return information;
	}

    /**
     * @param angels the angels to set
     */
    public void setAngels(ArrayList<Angel> angels) {
        this.angels = angels;
    }
	/**
     * @return the angels
     */
    public ArrayList<Angel> getAngels() {
        return angels;
    }

    ////////////////////////////////////////////////////////////////////////////
    
}