import java.io.*;
public class Test {
public static void main(String[] args) throws IOException {
File f=new File("people.dat");
if (f.exists()) f.delete(); //Ако файлът съществува - изтрива се
//Нов файл за произволен достъп
FileEditor fe = new FileEditor("people.dat");
//Добавяне на записи
fe.addRecord(new PersonRecord(1, "Ivan", "0887657553",
"ivan@abv.com"));
fe.addRecord(new PersonRecord(2, "Pesho", "0888638455",
"pesho@mail.bg"));
fe.addRecord(new PersonRecord(3, "Mimi", "0876377609",
"mimi@gmail.com"));
fe.addRecord(new PersonRecord(4, "Чочо", "0877778209",
"choch@hotmail.com"));
fe.showAllRecords(); //Извеждане на всички записи
System.out.println("----------------------------------");
//Промяна на запис с ID=4
fe.updateRecord(new PersonRecord(4,"Anna","0899202034",
"an_234@abv.bg"));
fe.showAllRecords();//Извеждане на всички записи
System.out.println("----------------------------------");
//Изтриване на запис по данни
fe.deleteRecord(new PersonRecord(3, "Mimi", "0876377609",
"mimi@gmail.com"));
fe.showAllRecords();//Извеждане на всички записи
fe.close();
}
}
