import java.util.Scanner;

public class AprovacaoDisciplina {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double vetorNotas[] = new double[100];
        int vetorPresenca[] = new int[100];
        int ind1 = 0;
        int ind2 = 0;
        int aprovados = 0;
        int reprovados = 0;
        int gasetadores = 0;

        while(true){
            double valor = scan.nextDouble();
            
            if (valor == -1){
                break;
            }
            vetorNotas[ind1] = valor;
            ind1++;
        }

        while(true){
            int presenca = scan.nextInt();
            
            if(presenca == -1){
                break;
            }
            vetorPresenca[ind2] = presenca;
            ind2++;
        }
        int cargaHoraria = scan.nextInt();
        
        for(int i = 0; i < ind1; i++){
            if(vetorPresenca[i] < cargaHoraria*0.75){
                    gasetadores++;
            }else{
                if(vetorNotas[i] < 5.0){
                    reprovados++;
                }else{
                    aprovados++;
                }
            }
        }
        System.out.printf("%d %d %d", aprovados, reprovados, gasetadores);
        scan.close();
        
    }   
}
