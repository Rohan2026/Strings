
public class Arrays
{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String string1 = "I am a string";
        String string2 = string1;
        String string3 = "I am also a string";
        boolean stringsEqual = string1.equals(string3);
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        String[] strArray = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};

        for (int i = 0; i < strArray.length; i++)
        {
            strArray[i] = strArray[i];
            System.out.println(strArray[i]);
        }
        for (String value : strArray)
        {
            System.out.print(value);
        }
        for (int i = 0; i < strArray.length; i++)
        {
            System.out.println(" ");
        }
        for (int i = 0; i < strArray.length; i++)
        {
            System.out.print(strArray[i]);
            if (i < strArray.length - 1) {
                System.out.print("-");
            }
        }
    }
}
