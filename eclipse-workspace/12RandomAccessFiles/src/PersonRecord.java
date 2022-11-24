import java.io.*;
public class PersonRecord extends Person {
//Константа – големина на записа (в байтове)
public static final int SIZE = Integer.BYTES //Големината на типа Integer в байтове...
+ (3 * (Character.BYTES * 15));//…плюс 3 свойства по 15 пъти
//големината на Character в байтове
//Празен конструктор
public PersonRecord() {
super();
}
//Конструктор по всички данни
public PersonRecord(int id, String name, String phone, String email) {
super(id, name, phone, email);
}
//Четене на запис от файл
public void readFromFile(RandomAccessFile file) throws IOException {
setID(file.readInt());
setName(readString(file));
setPhone(readString(file));
setEmail(readString(file));
}
//Записване на обект във файл
public void writeToFile(RandomAccessFile file) throws IOException {
file.writeInt(getID());
writeString(file, getName());
writeString(file, getPhone());
writeString(file, getEmail());
}
//Четене на низ
private String readString(RandomAccessFile file) throws IOException {
char[] s = new char[15]; //Масив от 15 символа
//Четене на символите от файла
for (int i = 0; i < s.length; i++) s[i] = file.readChar();
return new String(s).replace((char)0, ' '); //Превръщане на масива в низ,
//замествайки празните символи с интервал
}
//Запис на низ
private void writeString(RandomAccessFile file, String s) throws IOException {
StringBuffer buffer = null;//Обект от тип StringBuffer
if (s != null) buffer = new StringBuffer(s);//Ако низът е инициализиран –
//запълваме буфера с него
else buffer = new StringBuffer(15); //иначе – празен буфер с 15 елемента
buffer.setLength(15); //Фиксираме дължината на 15
file.writeChars(buffer.toString()); //Записваме буфера във файла
}
}