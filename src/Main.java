public class Main
{
    public static void main(String[] args)
    {
        Student s = new Student("Larry", 52);

        System.out.println(s);
        System.out.println(s.getName());
        System.out.println(s.getAge());

        s.setName("Lawrence");
        s.setAge(3);
        s.birthday();

        System.out.println(s.getName());
        System.out.println(s.getAge());

        s.addNickname("Lazza");
        s.addNickname("Big Lar");
        s.printNicknames();

        /*Student s2 = new Student("Curly", 54);
        System.out.println(s2);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());

        Module m = new Module("Calculus", 3);

        String aString = m.getName();
        System.out.println(aString);
        System.out.println(m.getName()); */


    }



}