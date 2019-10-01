public class ArrayRunner
{
    public static void main(String[] args)
    {
        Student me = new Student("Mr. Howe","December","blue");
        System.out.println(me);
        Student[] myClass = new Student[12];
        Student studentA = new Student("Isabelle", "April", "pink");
        myClass[2] = studentA;
        Student studentB = new Student("Lydia", "October", "purple");
        myClass[0] = studentB;

        System.out.println(myClass[2]);
        System.out.println(myClass[0]);

        for (int i = 0; i<4; i++)
        {
            System.out.println(myClass[i]);
        }
    }
}
