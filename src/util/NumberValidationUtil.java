package util;

import java.util.regex.Pattern;

public class NumberValidationUtil {

	public static final int QTD_MAX_NUMEROS_ENTRADA = 1;
	public static final int POSICAO_ENTRADA = 0;
	public static final int VALOR_MAXIMO = 100000000;
	public static final int VALOR_MINIMO = 0;

	/**
	 * Verifica se o valor informado é um número válido.
	 * 
	 * @param valorNumerico
	 * @return
	 */
	public static final Boolean isValidNumber(String[] valorNumerico) {
		Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

		Boolean retorno = Boolean.FALSE;

		if (valorNumerico != null
				&& (valorNumerico.length <= QTD_MAX_NUMEROS_ENTRADA 
				&& valorNumerico.length > POSICAO_ENTRADA)) {
			Integer parsedValorNumerico = Integer.parseInt(valorNumerico[POSICAO_ENTRADA]);
			
			retorno = pattern.matcher(valorNumerico[POSICAO_ENTRADA]).matches()
					  && parsedValorNumerico <= VALOR_MAXIMO 
					  && parsedValorNumerico >= VALOR_MINIMO;
		}

		return retorno;
	}

}
