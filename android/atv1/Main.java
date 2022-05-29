class Main{
    public static void main(String[] args){

        /*
        Aviao latam = new Aviao();
        
        latam.setModelo("monomotor");
        String model = latam.getModelo();
        System.out.println(model);

        latam.setIdentificador("embraer");
        String ident = latam.getIdentificador();
        System.out.println(ident);

        latam.setMotor(true);
        boolean valueMotor = latam.getMotor();
        System.out.println(valueMotor);

        float newAltura = 12;
        latam.setAltura(newAltura);
        float valueAltura = latam.getAltura();
        System.out.println(valueAltura);
        */

        Aviao gol = new Aviao("gol", "monomotor");

        gol.ligarMotor();
        gol.imprimeEstadoMotor();

        //gol.desligarMotor();
        //gol.imprimeEstadoMotor();

        gol.acelerar();
        gol.acelerar();
    }
}