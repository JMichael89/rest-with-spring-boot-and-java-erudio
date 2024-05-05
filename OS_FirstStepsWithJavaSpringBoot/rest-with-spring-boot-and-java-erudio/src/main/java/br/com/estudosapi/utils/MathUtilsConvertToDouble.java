package br.com.estudosapi.utils;

public class MathUtilsConvertToDouble {
	
	public static Double convertToDouble(String strNumber) {
		MathUtilsIsNumeric mathUtilsIsNumeric = new MathUtilsIsNumeric();
		if (strNumber == null) return 0D;
		
		String number = strNumber.replaceAll(",", ".");
		
		if(mathUtilsIsNumeric.isNumeric(number)) return Double.parseDouble(number);
		
		return 0D;
	}

}
