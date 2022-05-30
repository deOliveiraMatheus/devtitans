import java.util.*;

class Aviao{

    String modelo;
    String identificador;
    float altura;
    private float velocidade;
    private Motor motorEsquerdo = new Motor("EMBE", 50);
    private Motor motorDireito = new Motor("EMBD", 50);
    ArrayList<Passageiro> vooMao = new ArrayList<Passageiro>();

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

    void setMotorEsquerdo(Motor motorEsq)
    {
        this.motorEsquerdo = motorEsq;
        return; 
    }

    void setMotorDireito(Motor motorDir)
    {
        this.motorDireito = motorDir;
        return;
    }

    Aviao(String modelo, String identificador, Motor motorEsq, Motor motorDir){
        setModelo(modelo);
        setIdentificador(identificador);
        setAltura(0);
        setMotorEsquerdo(motorEsq);
        setMotorDireito(motorDir);
    }

    public void ligarMotor(){
        motorEsquerdo.ligar();
        motorDireito.ligar();
        return;
    }

    public void desligarMotor(){
        motorEsquerdo.desligar();
        motorDireito.desligar();
        return;
    }

    public void imprimeEstadoMotor()
    {
        if(getEstadoMotor())
        {
            if(motorDireito.getAtivo() && motorEsquerdo.getAtivo())
            {
                System.out.println("Ambos os motores estão ligados");
            }
            else if(motorDireito.getAtivo())
            {
                System.out.println("Apenas o motor está ligado");
            }
            else if(motorEsquerdo.getAtivo())
            {
                System.out.println("Apenas o motor esquerdo está ligado");
            }
            
        }
        else{
            System.out.println("Motor OFF");
        }

        return;
    }

    public boolean getEstadoMotor()
    {
        boolean stateMotor;

        if(motorDireito.getAtivo() || motorEsquerdo.getAtivo())
        {
            stateMotor = true;
        }
        else
        {
            stateMotor = false;
        }

        return stateMotor;
    }

    public void acelerar(){
        if(this.getEstadoMotor())
        {
            if(motorDireito.getAtivo() && motorEsquerdo.getAtivo())
            {
                this.setVelocidade(this.getVelocidade() + motorDireito.getPotencia() + motorEsquerdo.getPotencia());
                System.out.println("Aviao a " + this.getVelocidade() + " km/h");
            }
            else if(motorDireito.getAtivo())
            {
                this.setVelocidade(this.getVelocidade() + motorDireito.getPotencia());
                System.out.println("Aviao a " + this.getVelocidade() + " km/h");
            }
            else
            {
                this.setVelocidade(this.getVelocidade() + motorEsquerdo.getPotencia());
                System.out.println("Aviao a " + this.getVelocidade() + " km/h");
            }
            
        }
        else{
            System.out.println("ERRO: Motor desligado");
        }

        return;
    }

    public void desacelerar(){
        if(this.getEstadoMotor())
        {
            if(motorDireito.getAtivo() && motorEsquerdo.getAtivo())
            {
                this.setVelocidade(this.getVelocidade() - motorDireito.getPotencia() - motorEsquerdo.getPotencia());
                System.out.println("Aviao a " + this.getVelocidade() + " km/h");
            }
            else if(motorDireito.getAtivo())
            {
                this.setVelocidade(this.getVelocidade() - motorDireito.getPotencia());
                System.out.println("Aviao a " + this.getVelocidade() + " km/h");
            }
            else
            {
                this.setVelocidade(this.getVelocidade() - motorEsquerdo.getPotencia());
                System.out.println("Aviao a " + this.getVelocidade() + " km/h");
            }
        }
        else{
            System.out.println("ERRO: Motor desligado");
        }

        return;
    }

    boolean adicionarPassageiro(Passageiro obj)
    {
        boolean addPassageiro;

        if(!getEstadoMotor())
        {
            vooMao.add(obj);
            addPassageiro = true;
        }
        else
        {
            System.out.println("Protocolos de segurança não permitem embarques com a aeronave com a aeronave em movimento");
            addPassageiro = false;
        }
        
        return addPassageiro;
    }

    Passageiro buscarPassageiroporCPF(String cpf)
    {
        Iterator<Passageiro> iterator = this.vooMao.iterator();
        while(iterator.hasNext())
        {
            Passageiro findCpf = iterator.next();
            
            if(cpf == findCpf.getCpf())
            {
                //System.out.println(findCpf.getCpf());
                return findCpf;
            }
        }

        return null;
    }

    void imprimirListaDePassageiros()
    {
        Iterator<Passageiro> iterator = this.vooMao.iterator();
        
        while(iterator.hasNext())
        {
            Passageiro showPassageiro = iterator.next();
            System.out.println("Passageiro(a) " + showPassageiro.getFirstName() + " " + showPassageiro.getLastName() + " - CPF = " + showPassageiro.getCpf());
        }

        return;
    }

    void desembarcarPassageiros()
    {
        if(!getEstadoMotor())
        {

            Iterator<Passageiro> iterator = this.vooMao.iterator();
            
            while(iterator.hasNext())
            {
                Passageiro desembarcarPassageiro = iterator.next();
                System.out.println("O passageiro(a) " + desembarcarPassageiro.getFirstName() + " " + desembarcarPassageiro.getLastName() + " de CPF = " + desembarcarPassageiro.getCpf() + " desembarcou do avião");
                iterator.remove();
            }
        }
        else
        {
            System.out.println("Protocolos de segurança não permitem desembarques com a aeronave com a aeronave em movimento");
        }

        return;
    }

}