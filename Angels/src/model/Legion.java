package model;

import java.util.ArrayList;

public class Legion{
    
    ////////////////////////////////////////////////////////////////////////////

	private ArrayList<Angel> angels;
	
	public boolean valueNameEL(String name) {
		boolean value = false;
		char primerletra= name.charAt(name.length()-2);
		char secondletra= name.charAt(name.length()-1);
		
		if(primerletra== 'e' && secondletra=='l') {
			value=true;
		}
		
		return value;
	}
	
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

	public String createAngel(String name, String picture, String prayer, String power, String month, int day, Candle candle) {
		String message = "angel no se creo, por fallos cuando ingreso los datos";
		if(valueNameEL(name)==true && valuePower(power)==true && valueName(name)==true) {
			Angel angels = new Angel(name, picture, prayer, power, month, day, candle); 
			message = "angel fue creado, correctamente";
			
		}
		
		return message;
    }
    
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
	
	public int getAngelSize() {
		int size = angels.size();		
		return size; 
	}
	
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
						"/nColor: "+angels.get(i).getCandle().getcolor()+
						"/nTamaño de: "+angels.get(i).getCandle().getsize()+" Cm"+
						"/nEsencia de: "+ angels.get(i).getCandle().getessence()+
						"/nGrado de iluminancia de: "+ angels.get(i).getCandle().getilluminance()+"/n";
			}
			
		}
		
		return information;
	}
	
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
						"/nColor: "+angels.get(i).getCandle().getcolor()+
						"/nTamaño de: "+angels.get(i).getCandle().getsize()+" Cm"+
						"/nEsencia de: "+ angels.get(i).getCandle().getessence()+
						"/nGrado de iluminancia de: "+ angels.get(i).getCandle().getilluminance()+"/n";
			}
			
		}
		
		return information;
	}
	
	public String getInformationCelebration(String month) {
		String information = "Mes no encontrado";
        for(int i=0; i<= angels.size();i++) {
			
			String monthPositioni =  angels.get(i).getMonth();
			
			if (monthPositioni.equalsIgnoreCase(month) == true){
				
				information = "El angel tiene:/nNommbre: "+angels.get(i).getName()+
						"/nDireccion de imagen: "+angels.get(i).getPicture()+
						"/nMes y dia de celebracion:/n"+angels.get(i).getMonth()+"/n"+angels.get(i).getDay()+
						"/nVela del angel tiene las siguientes caracteristicas:/n"+
						"/nColor: "+angels.get(i).getCandle().getcolor()+
						"/nEsencia de: "+ angels.get(i).getCandle().getessence()+"/n";
			}
			
		}
		
		return information;
	}
	
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