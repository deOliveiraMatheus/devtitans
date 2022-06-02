class MotorTurbinado extends Motor
{
    MotorTurbinado(String model, float pot)
    {
        super(model, pot);
    }

    public void ligar()
    {
        setAtivo(true);
        System.out.println("TRUMMMM...");
    }

    public float getPotencia()
    {
        double res = this.potencia * 1.2;
        return (float)res;
    }
}