import java.util.Locale;

public class jan25stringmanipulation {
    public static void main(String[] args) {

      /*  // Literal
        String text1 = "Hello World";
        System.out.println(text1);

        // With new keyword
        String object = new String("Hello World2");
        System.out.println(object);

        System.out.println(text1.length());
*/

      /*  // charAt(); method
        String text = "Hello";
        System.out.println(text.charAt(3));

        // equals () method
        String text3 = "privet";
        System.out.println(text.equals(text3));

        //  equalslgnoreCase() method

        System.out.println(text.equalsIgnoreCase("hello"));

        // lenght () method
        String str = "Java is fun";
        System.out.println(str.length());
*/
        // isEmpty() method

       /* String str2 = "";
        String str3 = "Hi";
        boolean isEmpty = str2.isEmpty();
        System.out.println(isEmpty);

        boolean isemty2 = str3.isEmpty();
        System.out.println(isemty2);*/

/*        // contains() method
        String str = "a world is to big for me";
        boolean contains = str.contains("p");
        System.out.println(contains);*/

        // startWith() method
        String str = "Hello and Welcome";
        boolean startWith = str.contains("Hello");
        System.out.println(startWith);

        //endsWith() method
        String str5 = "World is mine";
        boolean end = str5.endsWith("mine");
        System.out.println(end);

        // toLowerCase()
        String text = "HELLo AND wElcome";
        System.out.println(text.toLowerCase());
        // toUpperCase()
        String touper = "hello and welcome";
        System.out.println(touper.toUpperCase());

        // indexNMumber
        text = "Welcome in mine house";
        int indexNumber = text.indexOf("c");
        System.out.println(indexNumber);

        // last index number
        int lstIndex = text.lastIndexOf("m");
        System.out.println(lstIndex);

        // replace()
        String name = "John Smith";
        String newName = name.replace("i", "oo");
        System.out.println(newName);

        System.out.println("=====================");
        // substring()
        System.out.println(name.substring(4));
        // substring() two parametres
        System.out.println(name.substring(4 , 6));


        // trim() remove the space from beging
        String txt = "        Java is fun     ";
        System.out.println(txt);
        System.out.println(txt.trim());

        //compareTo()
        String txx = "ABCE";
        String txx2 = "ABCE";
        System.out.println(txx2.compareTo(txx));









    }
}
