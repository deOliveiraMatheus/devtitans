class Main{
    public static void main(String[] args){

        TorreDeControle tower1 = new TorreDeControle("MAO");
        TorreDeControle tower2 = new TorreDeControle("GIG");

        Motor dir = new MotorTurbinado("EMBD", 50);
        Motor esq = new MotorTurbinado("EMBE", 50);
        
        AguiaGigante animal1 = new AguiaGigante("flamengo", 1000, 200);
        AguiaGigante animal2 = new AguiaGigante("manaus", 1000, 200);

        Aviao gol = new Aviao("gol", "monomotor", animal1, animal2);
        //Aviao gol = new Aviao("gol", "monomotor", esq, dir);

        gol.addObserver(tower1);
        gol.addObserver(tower2);
        gol.atualizarStatusVoo();

        Passageiro pass1 = new Passageiro("matheus","oliveira" , "000.999.888-00");
        Passageiro pass2 = new Passageiro("aser", "alves", "111.888.777-00");
        Passageiro pass3 = new Passageiro("maria", "edineide", "222.777.666-00");

        gol.adicionarPassageiro(pass1);
        gol.adicionarPassageiro(pass2);
        gol.adicionarPassageiro(pass3);

        gol.ligarMotor();
        gol.imprimeEstadoMotor();

        //gol.buscarPassageiroporCPF("032.526.602-61");
        //System.out.println(gol.buscarPassageiroporCPF("032.526.602-61"));
        gol.imprimirListaDePassageiros();
        
        //gol.desligarMotor();
        //gol.imprimeEstadoMotor();

        gol.acelerar();
        //gol.desligarMotor();
        gol.acelerar();
        gol.desembarcarPassageiros();
        gol.desacelerar();

        gol.desligarMotor();
        gol.desembarcarPassageiros();
        gol.imprimirListaDePassageiros();
    }
}