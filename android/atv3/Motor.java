

class Motor implements Motorizavel
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

    //@Override
    public float getPotencia()
    {
        return this.potencia;
    }

    void setPotencia(float newPotencia)
    {
        this.potencia = newPotencia;
        return;
    }

    //@Override
    public boolean getAtivo()
    {
        return this.ativo;
    }

    void setAtivo(boolean newAtivo)
    {
        this.ativo = newAtivo;
    }

    //@Override
    public void ligar()
    {
        setAtivo(true);
        System.out.println("VRUMM...");
    }

    //@Override
    public void desligar()
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