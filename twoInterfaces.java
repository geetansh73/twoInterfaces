interface printable
{
void print();
}
interface showable
{
void show();
}
class A implements printable,showable
{
public void print()
{
System.out.print("Hello");
}
public void show()
{
System.out.print("Welcome");
}
public static void main(String geetu[])
{
A obj=new A();
obj.print();
obj.show();
}
}
