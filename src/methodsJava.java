public class methodsJava {
    public static void main(String[] args) {
        var cadena1 = "Helo world";

        var len = cadena1.length();
        System.out.println(len);


        //reemplazar caracteres

        var nuevaCadena = cadena1.replace('o','e');
        System.out.println(nuevaCadena);

        //crear substring
        var subchain = nuevaCadena.substring(0,4);
        System.out.println(subchain);


        // find subcaDENAS
        var subCadenaX = cadena1.indexOf("world");
        System.out.println("Position:" + subCadenaX);
    }
}
