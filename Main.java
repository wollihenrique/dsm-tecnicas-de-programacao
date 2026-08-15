public class Main {
    public static void main(String[] args) {
       int segundos_totais = 45087;
       int horas = segundos_totais / 3600;
       int resto = segundos_totais % 3600, minutos = resto / 60, segundos = resto % 60;


       System.out.println(segundos_totais + " segundos são " + horas + " horas " + minutos + " minutos " + segundos + " segundos");
    }
}