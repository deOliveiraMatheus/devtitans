class Aviao{

    String modelo;
    String identificador;
    boolean motor;
    float altura;
    private float velocidade;

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

    private void setAltura(float newAltura){
        this.altura = newAltura;
    }

    public void setVelocidade(float newVelocidade){
        this.velocidade = newVelocidade;
    }

    public float getVelocidade(){
        return this.velocidade;
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

    public boolean getEstadoMotor(){
        return this.getMotor();
    }

    public void acelerar(){
        if(this.getEstadoMotor()){
            this.setVelocidade(this.getVelocidade() + 50);
            System.out.println("Aviao a "+this.getVelocidade()+" km/h");
        }
        else{
            System.out.println("ERRO: Motor desligado");
        }
    }

    public void desacelerar(){
        if(this.getEstadoMotor()){
            this.setVelocidade(this.getVelocidade() - 50);
            System.out.println("Aviao a "+this.getVelocidade()+" km/h");
        }
        else{
            System.out.println("ERRO: Motor desligado");
        }
    }

}