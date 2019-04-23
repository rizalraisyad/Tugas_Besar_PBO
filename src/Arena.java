import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

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


    // deklarasi kelas
    public static void main(String[] args){
        
    }


}
