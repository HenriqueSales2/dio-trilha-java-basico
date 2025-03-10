public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(7);

        System.out.println("Volume atual : " + smartTv.volume);

        System.out.println("Tv está ligada : " + smartTv.ligada);
        System.out.println("Volume atual : " + smartTv.volume);
        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.ligar ();

        System.out.println("Novo Status --> Tv está ligada : " + smartTv.ligada);

        smartTv.desligar();

        System.out.println("Novo Status --> Tv está ligada : " + smartTv.ligada);
    }
}
