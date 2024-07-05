public class Electrodomesticos {

    private String name;
    private String marca;
    private String model;
    private double consumo;
    private double DeudaC;

    public Electrodomesticos(String name, String model, String marca, double consumo, double DeudaC) {
        this.name = name;
        this.marca = marca;
        this.model = model;
        this.consumo = consumo;
        this.DeudaC=DeudaC;
    }

    public String getname(){
        return this.name;
    }

    public void setname(String name){
        this.name = name;
    }

    public String getmarca(){
        return this.marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public String getmodel(){
        return model;
    }

    public void setmodel(String model){
        this.model = model;
    }

    public double getconsumo(){
        return this.consumo;
    }

    public void setconsumo(double consumo){
        this.consumo = consumo;
    }
    public double getDeudaC(){
        return this.DeudaC;
    }

    public void setDeudaC(double DeudaC){
        this.DeudaC= DeudaC;
    }
}
