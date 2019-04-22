public class Player {
    int uang;
    String nama="";

    public  Player(String vNama){
        nama = vNama;
    }

    public static int randomDadu(){
        int x = (int)(Math.random()*((6-0)+1))+0;
        return x;
    }

    public void Jalan(Player player){
        int hasilDadu=0;
        hasilDadu = hasilDadu + randomDadu();
        hasilDadu = hasilDadu + randomDadu();
    }
}
