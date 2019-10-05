package model;

/**
 * <b> DES: </b> the next class instance attributes of an angel, creating its constructor methods and modifiers.<br>
 * @author kevin Andrés Fernández Nougera.<br>
 * @version 1.0
 */
public class Angel{

	private Candle candle;
	////////////////////////////////////////////////////////////////////////////
	
	private String power;
	
	private String name;
	private String picture;
	private String prayer;
	private String month;
	private int day;
	
	////////////////////////////////////////////////////////////////////////////

	/**
	 * <b> DES: </b> is the construction method of the angel class, defining each of the attributes that the angel has.<br>
	 * <b> PRE: </b> the sailing class must be instantiated, to use it.<br>
	 * @param candle the candle to set, != null.<br>
	 * @param day the day to set, != null.<br>
	 * @param month the month set, != null.<br>
	 * @param power the power set, != null.<br>
	 * @param prayer the prayer set, != null.<br>
	 * @param picture the picture set, != null.<br>
	 * @param name the name set, != null.<br>
	 */
	public Angel(String name, String picture, String prayer, String power, String month, int day, Candle candle) {
		this.name = name;
		this.picture = picture;
		this.prayer = prayer;
		this.power = power; 
		this.month = month;
		this.day = day;
		this.candle = candle;
	}
	

	/**
	 * @return the candle
	 */
	public Candle getCandle() {
		return candle;
	}
	/**
	 * @param candle the candle to set
	 */
	public void setCandle(Candle candle) {
		this.candle = candle;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}
	/**
	 * @param picture the picture to set
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}
	/**
	 * @return the prayer
	 */
	public String getPrayer() {
		return prayer;
	}
	/**
	 * @param prayer the prayer to set
	 */
	public void setPrayer(String prayer) {
		this.prayer = prayer;
	}
	/**
	 * @return the month
	 */
	public String getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(String month) {
		this.month = month;
	}
	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}
	/**
	 * @return the power
	 */
	public String getPower() {
		return power;
	}
	/**
	 * @param power the power to set
	 */
	public void setPower(String power) {
		this.power = power;
	}
	
	////////////////////////////////////////////////////////////////////////////

 }
