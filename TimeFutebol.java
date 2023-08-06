import java.util.Scanner;

public class TimeFutebol {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int vetorTime[] = new int[50];
        int vetorAdversario[] = new int[50];
        
        int indice1 = 0;
        int indice2 = 0;

        int vitoria = 0;
        int empate = 0;
        int derrota = 0;

        while(true){
            int gols = scan.nextInt();
            if(gols == -1){
                break;
            }
            vetorTime[indice1] = gols;
            indice1 += 1;
        }
        while(true){
            int golsAdversario = scan.nextInt();
            if(golsAdversario == -1){
                break;
            }
            vetorAdversario[indice2] = golsAdversario;
            indice2 += 1;
        }

        for(int i = 0; i < indice1; i++){
            if(vetorTime[i] > vetorAdversario[i]){
                vitoria++;
            }else if(vetorTime[i] < vetorAdversario[i]){
                derrota++;
            }else{
                empate++;
            }
        }

        System.out.printf("%d %d %d", vitoria, empate, derrota);
        scan.close();
    }
}
