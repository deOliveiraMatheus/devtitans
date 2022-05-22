class Aviao{

    String modelo;
    String identificador;
    boolean motor;
    float altura;

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String newModel){
        this.modelo = newModel;
    }

    public String getIdentificador(){
        return this.identificador;
    }

    public void setIdentificador(String newIdentificador){
        this.identificador = newIdentificador;
    }

    public boolean getMotor(){
        return this.motor;
    }

    public void setMotor(boolean value){
        this.motor = value;
    }

    public float getAltura(){
        return this.altura;
    }

    public void setAltura(float newAltura){
        this.altura = newAltura;
    }

    Aviao(String modelo, String identificador){
        this.modelo = modelo;
        this.identificador = identificador;
        setMotor(false);
        setAltura(0);
    }

    public void ligarMotor(){
        setMotor(true);
        System.out.println("Vruuumm");
    }

    public void desligarMotor(){
        setMotor(false);
    }

    public void imprimeEstadoMotor(){
        if(getMotor()){
            System.out.println("Motor ON");
        }
        else{
            System.out.println("Motor OFF");
        }
    }
}