package io;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import util.NumberValidationUtil;

public class GetNumber {
	
	/**
	 * Inicia a execução.
	 * 
	 * @param valorNumerico
	 */
	public static final void init(String[] valorNumerico) {
		System.out.println(NumberValidationUtil.isValidNumber(valorNumerico) ? formarMaiorNumeroIrmao(valorNumerico) : "-1");
	}

	/**
	 * Retorna o maior número irmão, após a validaão.
	 * 
	 * @param valorNumerico
	 * @return
	 */
	public static String formarMaiorNumeroIrmao(String[] valorNumerico) {
		String stringValorNumberico = String.valueOf(Integer.parseInt(valorNumerico[NumberValidationUtil.POSICAO_ENTRADA]));
		List<Integer> array = new ArrayList<Integer>();
 		
		for (int i = 0; i < stringValorNumberico.length(); i++) {
			array.add(Integer.valueOf(Character.toString(stringValorNumberico.charAt(i))));
		}
		
		Collections.sort(array);
		Collections.reverse(array);
		
		return array.toString().replaceAll("\\D*", "").trim();
	}

}
