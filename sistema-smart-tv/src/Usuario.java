public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv =new SmartTv();

       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.aumentarVolume();

       smartTv.diminuirCanal();
       

       System.out.println("Tv ligada ? "+smartTv.ligada);
       System.out.println("Canal Atual: "+smartTv.canal);
       System.out.println("Volume Atual: "+smartTv.volume);

       smartTv.aumentarCanal();
       smartTv.ligar();
       System.out.println("Novo Status Tv ligada ? "+smartTv.ligada);
       smartTv.desligar();
       System.out.println("Novo Status Tv ligada ? "+smartTv.ligada);
       smartTv.mudarCanal(14);

       System.out.println("Novo Staturs Canal Atual: "+smartTv.canal);
    }
}
