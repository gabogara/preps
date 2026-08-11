public class methodsJava {
    public static void main(String[] args) {
        var cadena1 = "Hello world";

        var len = cadena1.length();
        System.out.println(len);


        //replace characters

        var nuevaCadena = cadena1.replace('o','e');
        System.out.println(nuevaCadena);

        //create substring
        var subchain = nuevaCadena.substring(0,4);
        System.out.println(subchain);


        // find subStrings
        var subCadenaX = cadena1.indexOf("world");
        System.out.println("Position:" + subCadenaX);

        // replace substrings
        var nuevaCadena2 = cadena1.replace("world", "Gabriel");
        System.out.println(nuevaCadena2);

        // concat method
        var str1 = "Hello";
        var str2 = "world";
        var strFinal = str1.concat(" ").concat(str2);
        System.out.println(strFinal);

        // stringBuilder same as stringBuffer (for threads)
        var constString = new StringBuilder();
        constString.append(str1);
        constString.append(" ");
        constString.append(str2);
        var result = constString.toString();
        System.out.println("Resultado del str usando append: " + result);

        // using join
        var finalResult = String.join(" ", str1, str2, "Bye!");
        System.out.println(finalResult);
    }
}
