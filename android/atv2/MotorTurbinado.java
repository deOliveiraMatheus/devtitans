class MotorTurbinado extends Motor
{
    MotorTurbinado(String model, float pot)
    {
        super(model, pot);
    }

    void ligar()
    {
        setAtivo(true);
        System.out.println("TRUMMMM...");
    }

    float getPotencia()
    {
        double res = this.potencia * 1.2;
        return (float)res;
    }
}