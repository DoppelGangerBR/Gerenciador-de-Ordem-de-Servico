/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Alvaro
 */
public class DatasHoras {
    private int DiaAtual,MesAtual,AnoAtual;
    public String retornaData(){
        GregorianCalendar calendario = new GregorianCalendar();
        DiaAtual = calendario.get(Calendar.DAY_OF_MONTH);
        MesAtual = calendario.get(Calendar.MONTH);
        MesAtual = MesAtual + 1; //Segundo a documentação da classe Calendar do java, ele começa a contar os meses pelo numero 0, logo ao selecionar o mês de janeiro, ele retornava o numero 0
        AnoAtual = calendario.get(Calendar.YEAR);
        return (DiaAtual+"-"+MesAtual+"-"+AnoAtual);
    }

    
}
