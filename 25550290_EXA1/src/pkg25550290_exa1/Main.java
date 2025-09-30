
package pkg25550290_exa1;

import java.util.Scanner;


public class Main {
    


    public static void main(String[] args) {
    int pin, saldo=5000, menu = 0, retiro, deposito;
    Scanner input= new Scanner(System.in);
    
    System.out.print("Ingresar PIN: ");
    pin = input.nextInt();
    
    if (pin==1234){
    System.out.println("1. Consultar saldo, 2. Reitrar dinero, 3. Dpoesitar dinero ");
    System.out.println("Elegir 1, 2 o 3");
    menu = input.nextInt();}
    else {
    System.out.println("Acceso denegado ");}
    
    if (menu == 1){
    System.out.println("Tu saldo actual es de: " + saldo);}
    
    if (menu == 2){
    System.out.println("Cuanto deseas retirar? ");}
    retiro = input.nextInt();
    if (saldo >= retiro ){
    saldo = saldo - retiro;
    System.out.println("Retiro hecho, tu saldo ahora es de: " + saldo);}
    else{
    System.out.println("No cuentas con suficiente saldo para hacer el retiro");}
    
    if (menu == 3){
    System.out.println("Cantidad a depositar: ");}
    deposito = input.nextInt();
    if (deposito >= 0){
    saldo = saldo + deposito;
    System.out.println("El saldo de tu cuenta ahora es de: " + saldo);}
    else{
    System.out.println("No se puede hacer el deposito");}
    }
    
}
