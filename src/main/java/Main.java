public class Main {
    String[][] listaEvento = new String[10][5];

    public boolean verificarEdad(String[][] lista, int indice) {
        int edad = Integer.parseInt(lista[indice][1]);
        return edad > 17;
    }
    public String verificarBoleto(String[][] lista, int indice){
        return lista[indice][2];
    }
    public boolean validarInvitados(String[][] lista, int indice){
        int invitados = Integer.parseInt(lista[indice][3]);
        if (lista[indice][2].equals("Vip")) {
            return invitados < 3;
        } else {
            return invitados == 0;
        }
        }
    }



