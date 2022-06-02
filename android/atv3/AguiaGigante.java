class AguiaGigante implements Motorizavel
{
    
    float weight;
    String name;
    float force;
    boolean awake;

    AguiaGigante( String name, float weight, float force)
    {
        setWeight(weight);
        setName(name);
        setForce(force);
        setAwake(true);

    }

    public boolean getAtivo()
    {
        return getAwake();
    }

    public float getPotencia()
    {
        float response;
        
        if(getAwake())
        {
            response = getForce();
        }
        else
        {
            response = 0;
        }

        return response;
    }

    public void ligar()
    {
        setAwake(true);
        System.out.println("Aguia acordou");
    }

    public void desligar()
    {
        setAwake(false);
        System.out.println("Aguia dormiu");
    }


    /** Getters and Setters **/
    float getWeight()
    {
        return this.weight;
    }

    private void setWeight(float newWeight)
    {
        this.weight = newWeight;
        return;
    }

    String getName()
    {
        return this.name;
    }

    private void setName(String newName)
    {
        this.name = newName;
        return;
    }

    float getForce()
    {
        return this.force;
    }

    private void setForce(float newForce)
    {
        this.force = newForce;
        return;
    }

    boolean getAwake()
    {
        return this.awake;
    }

    private void setAwake(boolean newAwake)
    {
        this.awake = newAwake;
        return;
    }
    
}