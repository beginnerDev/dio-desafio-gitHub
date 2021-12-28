package controleFluxo;
// com if, exiba o nome do mês do ano de acordo com seu número.
// evite o efeito flecha. faça também outro if que verifique se
// o mês é julho, dezembro ou janeiro, para assim exibir o texto "férias".


public class mesAno {
    public static void main(String[] args) {
        ifSemFlecha();
        switchNumero();
        switchSemana();
        switchFerias();






    }
    private static void ifSemFlecha() {
        int mes = 9;
        if(mes == 1){
            System.out.println("janeiro");
        }else if(mes == 2){
            System.out.println("fevereiro");
        }else if(mes == 3){
            System.out.println("março");
        }else if(mes == 4){
            System.out.println("abril");
        }else if(mes == 5){
            System.out.println("maio");
        }else if(mes == 6){
            System.out.println("junho");
        }else if(mes == 7){
            System.out.println("julho");
        }else if(mes == 8){
            System.out.println("agosto");
        }else if(mes == 9){
            System.out.println("setembro");
        }else if(mes == 10){
            System.out.println("outubro");
        }else if(mes == 11){
            System.out.println("novembro");
        }else if(mes == 12){
            System.out.println("dezembro");
        }else{
            System.out.println("mês indefinido");
        }

    }
    private static void switchNumero(){
        int numero = 4;
        switch (numero){
            case 1:
            case 2:
            case 3:
                System.out.println("certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("talvez");
                break;
            default:
                System.out.println("valor indefinido");
                break;
        }

    }
    private static void switchSemana(){
        String dia = "terça";
        switch (dia){
            case "segunda":
                System.out.println(2);
                break;
            case "terça":
                System.out.println(3);
                break;
            case "quarta":
                System.out.println(4);
                break;
            case "quinta":
                System.out.println(5);
                break;
            case "sexta":
                System.out.println(6);
                break;
            case "sábado":
                System.out.println(7);
                break;
            case "domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("dia inválido");
        }
    }
    private static void switchFerias(){
        String mes = "Dezembro";
        switch (mes){
            case "Dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês indefinido");
                break;
        }
    }
}
