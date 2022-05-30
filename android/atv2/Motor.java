class Motor
{

    String  modelo;
    float   potencia;
    boolean ativo;
    
    String getModelo()
    {
        return this.modelo;
    }

    void setModelo(String newModelo)
    {
        this.modelo = newModelo;
        return;
    }

    float getPotencia()
    {
        return this.potencia;
    }

    void setPotencia(float newPotencia)
    {
        this.potencia = newPotencia;
        return;
    }

    boolean getAtivo()
    {
        return this.ativo;
    }

    void setAtivo(boolean newAtivo)
    {
        this.ativo = newAtivo;
    }

    void ligar()
    {
        setAtivo(true);
        System.out.println("VRUMM...");
    }

    void desligar()
    {
        setAtivo(false);
        System.out.println("mmmmmm....");
    }

    Motor(String model, float pot){
        setModelo(model);
        setPotencia(pot);
        setAtivo(false);
    }
}