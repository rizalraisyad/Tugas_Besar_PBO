import java.util.Scanner;

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
        for(int i =0 ; i<11;i++){
            System.out.print("|");
            System.out.print("_|");
            if(i==0 || i == 10) {
                for (int j = 0; j < 11; j++) {
                    System.out.print("_|");
                }

                System.out.print("|");
                System.out.println();
            }else{
                for (int j = 0; j < 11; j++) {
                    if(j==10){
                        System.out.print("|_|");
                    }else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }

    public void bermain(){
        System.out.println(player1.nama+"       "+player1.uang);
        System.out.println(player2.nama+"       "+player2.uang);
        loadPetak();
        //turn inisiasi
        Player playerTurn = player1;
        Player playerWait = player2;
        boolean isSelesai = false;
        do{
            System.out.println("\nNama Player "+playerTurn.nama);
            System.out.println("Uang Player "+playerTurn.uang);
            System.out.println("Posisi awal : "+playerTurn.posisi);
            Scanner sc = new Scanner(System.in);
            System.out.println("Masukkan angka 1 untuk kocok dadu : ");
            int input = sc.nextInt();
            if(input == 1){
                playerTurn.Jalan();
                System.out.println("Posisi Akhir : "+playerTurn.posisi);
                if(playerTurn.posisi/40>0){
                    playerTurn.uang = playerTurn.uang +50000;
                }
                playerTurn.posisi=playerTurn.posisi%40;
                Player temp = playerTurn;
                playerTurn = playerWait;
                playerWait = temp;
            }else {
                System.out.println("Retry");
            }
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
