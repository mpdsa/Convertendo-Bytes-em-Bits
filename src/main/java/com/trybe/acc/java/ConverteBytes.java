package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

/** Informa o valor de bytes em bits. */
public class ConverteBytes {

  /** Ler a entrada de um número pelo console. */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    StringBuilder stringBuilder = new StringBuilder();

    System.out.println("Digite um número:");
    byte valor = scan.nextByte();
    
    scan.close();
    
    int qtdBits = valor * 8;
    
    StringBuilder frase = stringBuilder.append(valor)
                                       .append(" bytes correspondem a ")
                                       .append(qtdBits)
                                       .append(" bits");

    System.out.println(frase);

  }
}
