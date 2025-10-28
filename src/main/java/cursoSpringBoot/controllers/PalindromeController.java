package cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
* Controlador para verificar palíndromos.
* */
@RestController //Es un controlador tipo rest
public class PalindromeController {

    /*
    * Endpoint para verificar si una palabra es un palíndromo.
    * @param word la palabra a verificar.
    * @return mensaje indicando si la palabra es un palíndromo o no.
    * */
    @GetMapping("/palindromo/{word}") //Se mapea el endpoint y se le pasa la ruta y el parámetro word
    public String Palindrome(@PathVariable String word){ //Como el método va a recibir una palabra para comprobar, se pasa por parámetro un String + PathVariable
        if(isPalindrome(word)){
            return "La palabra " + word + " es un palíndromo.";
        }else{
            return "La palabra " + word + " no es un palíndromo.";

        }
    }
    /*
     * Método para verificar si una palabra es un palíndromo.
     * @param word la palabra a verificar.
     * @return true si la palabra es un palíndromo, false de lo contrario.
     * */
    //Método separado porque se requiere que esté la lógica encapsulada.
    private boolean isPalindrome(String word){
        int length=word.length();
        for(int i=0;i<length/2;i++){
            if(word.charAt(i)!=word.charAt((length-i-1))){
                return false;
            }
        }return true;
    }
}
