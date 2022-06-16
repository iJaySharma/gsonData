import java.io.*;
import com.google.gson.*;
class Student
{
public int rollNumber;
public String name;
// ----------------
}
class psp2
{
public static void main (String gg[])
{
try
{
FileReader fileReader=new FileReader("student.data");
Gson gson=new Gson();
Student s;
s=gson.fromJson(fileReader,Student.class);
System.out.println(s.rollNumber+","+s.name);
fileReader.close();
FileWriter fileWriter=new FileWriter("stud.data");
gson.toJson(s,fileWriter);
fileWriter.close();
}catch(Exception e)
{
System.out.println(e);
}
}
}