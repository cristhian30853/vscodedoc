package projetogit.br.com.exemplo;

import java.util.Calendar;
import java.util.Date;
import java.text.*;
import java.text.DateFormat;

public class Exercicio01{

    public static void main(String [] args){

        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("S");
        String dataFormatada = formatar.format(data);

        System.out.println(dataFormatada);


    }



}