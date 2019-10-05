package model;
/**
 * <b> DES: </b> the next class instance attributes of an angel candle, creating its constructor methods and modifiers.<br>
 * @author kevin Andrés Fernández Nougera.<br>
 * @version 1.0
 */
public class Candle{

    ////////////////////////////////////////////////////////////////////////////

    private String color;
    private String essence;
    private String illuminance;
    private int size;
    
    ////////////////////////////////////////////////////////////////////////////

    /**
	 * <b> DES: </b> is the construction method of the angel class, defining each of the attributes that the angel has.<br>
	 * @param color describes the color of the candle, the color to set, != null.<br>
	 * @param essence describes the essence of the candle, the essence set, != null.<br>
	 * @param illuminance describes the illuminance of the candle, the illuminance set, != null.<br>
	 * @param size describes the size of the candle, the size set, != null.<br>
	 */
    public Candle(String color, String essence, String illuminance, int size){
        this.color = color;
        this.essence = essence;
        this.illuminance = illuminance;
        this.size = size;
    }
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * @param essence the essence to set
     */
    public void setEssence(String essence) {
        this.essence = essence;
    }
    /**
     * @param illuminance the illuminance to set
     */
    public void setIlluminance(String illuminance) {
        this.illuminance = illuminance;
    }
    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }
    /**
     * @return the essence
     */
    public String getEssence() {
        return essence;
    }
    /**
     * @return the illuminance
     */
    public String getIlluminance() {
        return illuminance;
    }
    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }
    
    ////////////////////////////////////////////////////////////////////////////

}