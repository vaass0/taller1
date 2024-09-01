public class Main {
    public boolean verificarEdad(String[][] lista, int indice) {
        int edad = Integer.parseInt(lista[indice][1]);
        return edad >= 18;
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
    public int aforoDisponible(String[][] lista,String sala, int AforoMAX){
        int aforoGeneral = 0;
        int aforoVip = 0;
        for (String[] persona : lista) {
            if(persona != null) {
                if (persona[2] == "Vip" && persona[4] == "True") {
                    aforoVip++;
                } else if (persona[2] == "General" && persona[4] == "True") {
                    aforoGeneral++;
                }
            }

        }
        if (sala.equals("Vip")){
            return AforoMAX - aforoVip;
        } else if (sala.equals("General")) {
            return AforoMAX - aforoGeneral;
        }else
            return AforoMAX;
    }
    public boolean ingresarPersona(String[][] lista, int indice ){
        if (lista[indice][4] == "False"){
            lista[indice][4] = "True";
            return true;
        } else if (lista[indice][4] == null) {
            return false;
        }
        return true;
    }
    public boolean permitirEntrada(String[][] lista, int indice, int aforo){
        int edad = Integer.parseInt(lista[indice][1]);
        String entrada = lista[indice][2];
        int invitados = Integer.parseInt(lista[indice][3]);
        if (edad >= 18){
            if( entrada == "General" || entrada == "Vip"){
                if(entrada == "General" && aforoDisponible(lista,"General",aforo) >0){
                    return true;
                } else if (entrada == "Vip" && aforoDisponible(lista,"Vip",aforo) > invitados+1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }


    }



