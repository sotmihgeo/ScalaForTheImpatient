// Type these commands into the REPL, or run scala script.scala

//Java:
public class Car {
  private String manufacturer;
  private String model;
  private int year;
  private String licensePlate;
  
  public Car(String manufacturer, String model, int year, String licensePlate) {
    this.manufacturer = manufacturer;
	this.model = model;
	this.year = year;
	this.licensePlate = licensePlate;
  }
  
  public Car(String manufacturer, String model, int year){
    this(manufacturer, model, year, "");
  }
  
  public Car(String manufacturer, String model, String licensePlate) {
    this(manufacturer, model, -1, licensePlate);
  }
  
  public Car(String manufacturer, String model) {
    this(manufacturer, model, -1, "");
  }
  
  public String getManufacturer() {
    return this.manufacturer;
  }
  
  public String getModel() {
    return this.model;
  }
  
  public int getYear() {
    return this.year;
  }
  
  public String getLicensePlate() {
    return this.licensePlate;
  }
  
  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }
}

//c#
public class Car {
  private string manufacturer;
  private string model;
  private int year;
  private string licensePlate;
  
  public Car(string manufacturer, string model, int year, string licensePlate) {
    this.manufacturer = manufacturer;
	this.model = model;
	this.year = year;
	this.licensePlate = licensePlate;
  }
  
  pubic Car(string manufacturer, string model, int year): this(manufacturer, model, year, "") { }
  
  pubic Car(string manufacturer, string model, string licensePlate): this(manufacturer, model, -1, licensePlate) { }
  
  pubic Car(string manufacturer, string model): this(manufacturer, model, -1, "") { }
  
  public string Manufacturer {
    get { return manufacturer; }
  }
  
  public string Model {
    get { return model; }
  }
  
  public int Year {
    get { return year; }
  }
  
  public string LicensePlate {
    get { return licensePlate; }
	set { licensePlate = value; }
  }
}