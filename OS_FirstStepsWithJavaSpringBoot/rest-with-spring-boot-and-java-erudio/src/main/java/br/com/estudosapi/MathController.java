package br.com.estudosapi;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudosapi.exceptions.UnsupportedMathOperationException;
import br.com.estudosapi.utils.MathUtilsConvertToDouble;
import br.com.estudosapi.utils.MathUtilsIsNumeric;
import br.com.estudosapi.utils.MathUtilsOperations;

@RestController
public class MathController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
			
		if (!MathUtilsIsNumeric.isNumeric(numberOne) || !MathUtilsIsNumeric.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return MathUtilsOperations.sum(MathUtilsConvertToDouble.convertToDouble(numberOne), MathUtilsConvertToDouble.convertToDouble(numberTwo));
	}
	
	@GetMapping("/subtraction/{numberOne}/{numberTwo}")
	public Double subtraction(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
		if(!MathUtilsIsNumeric.isNumeric(numberOne) || !MathUtilsIsNumeric.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		
		return MathUtilsOperations.subtraction(MathUtilsConvertToDouble.convertToDouble(numberOne), MathUtilsConvertToDouble.convertToDouble(numberTwo));
	}
	
	@GetMapping("/multiplication/{numberOne}/{numberTwo}")
	public Double multiplication(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
		if(!MathUtilsIsNumeric.isNumeric(numberOne) || !MathUtilsIsNumeric.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		
		return MathUtilsOperations.multiplication(MathUtilsConvertToDouble.convertToDouble(numberOne), MathUtilsConvertToDouble.convertToDouble(numberTwo));
	}
	
	@GetMapping("/division/{numberOne}/{numberTwo}")
	public Double division(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
		if(!MathUtilsIsNumeric.isNumeric(numberOne) || !MathUtilsIsNumeric.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		
		return MathUtilsOperations.divisor(MathUtilsConvertToDouble.convertToDouble(numberOne), MathUtilsConvertToDouble.convertToDouble(numberTwo));
	}
	
	@GetMapping("/mean/{numberOne}/{numberTwo}")
	public Double mean(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
		if(!MathUtilsIsNumeric.isNumeric(numberOne) || !MathUtilsIsNumeric.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		
		return MathUtilsOperations.mean(MathUtilsConvertToDouble.convertToDouble(numberOne), MathUtilsConvertToDouble.convertToDouble(numberTwo));
	}
	
	@GetMapping("/squareroot/{numberOne}")
	public Double squareRoot(@PathVariable(value = "numberOne") String number) {
		if(!MathUtilsIsNumeric.isNumeric(number)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		
		return MathUtilsOperations.squareRoot(MathUtilsConvertToDouble.convertToDouble(number));
	}


}
