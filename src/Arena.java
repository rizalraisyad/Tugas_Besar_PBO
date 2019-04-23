public class Arena {
    private Player player1;
    private Player player2;

    public void tambahPlayer(Player r1, Player r2){
        player1 = r1;
        player2 = r2;
    }
    public void tampilanPetak(){
        int i=0;
        int j=0;
        for(i=0;i<=10;i++){
            System.out.print("|");
            System.out.println("|");
        }
    }
    public void loadPetak(){

    }

    public void bermain(){
        System.out.println(player1.nama+"       "+player1.uang);
        System.out.println(player2.nama+"       "+player2.uang);
        boolean isSelesai = false;
        do{

        }while (!isSelesai);
    }


    // deklarasi kelas
    public static void main(String[] args){
        Arena oArena = new Arena(); // Buat objek arenanya

        Player player1 = new Player("Rizal M"); // siapkan player1
        Player player2 = new Player("Tia H"); // siapkan player2

        //Siapkan asset awal (Uang)
        player1.uang = 250000;
        player1.posisi = 0;
        player2.uang = 250000;
        player2.posisi = 0;

        //tambahkan player ke arena
        oArena.tambahPlayer(player1,player2);
        oArena.bermain();
    }


}
