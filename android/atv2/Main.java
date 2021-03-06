class Main{
    public static void main(String[] args){

        Motor dir = new MotorTurbinado("EMBD", 50);
        Motor esq = new MotorTurbinado("EMBE", 50);
        Aviao gol = new Aviao("gol", "monomotor", esq, dir);

        Passageiro pass1 = new Passageiro("matheus","oliveira" , "000.111.222-00");
        Passageiro pass2 = new Passageiro("aser", "alves", "333.444.555-00");
        Passageiro pass3 = new Passageiro("maria", "edineide", "666.777.888-00");

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