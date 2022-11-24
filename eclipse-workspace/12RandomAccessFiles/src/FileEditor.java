import java.io.*;
public class FileEditor {
private RandomAccessFile file;//Обявяваме обект от тип "файл с произволен достъп"
public FileEditor(String fileString) throws IOException {
file = new RandomAccessFile(fileString, "rw"); //Отваряне на файла
//(в случая – за четен И запис
}
public void close() throws IOException {
if (file != null) file.close(); //Затваряне на работния файл
}
//Четене на запис по идентификатор (той съвпада с номера ма записа)
public PersonRecord getRecord(int id) throws IOException {
PersonRecord record = new PersonRecord();
if (id < 1) throw new IllegalArgumentException("Invalid ID");//Решаваме да броим от 1
try{
file.seek((id - 1) * PersonRecord.SIZE);
record.readFromFile(file);
}catch(Exception e){
}
return record;
}
//Метод за добавяне на запис
public void addRecord(PersonRecord record) throws IllegalArgumentException,
IOException{
if (getRecord(record.getID()).getID() != 0)
throw new IllegalArgumentException("Record number exists, adding illegal");
else {
file.seek((record.getID() - 1) * PersonRecord.SIZE);
record.writeToFile(file);
}
}
//Метод за промяна на запис (на практика - по номер)
public void updateRecord(PersonRecord record)throws IllegalArgumentException,
IOException {
if (getRecord(record.getID()).getID() == 0)
throw new IllegalArgumentException("Record does not exist, update illegal");
else {
file.seek((record.getID() - 1) * PersonRecord.SIZE);
record.writeToFile(file);
}
}
//Метод за "изтриване" на запис (на практика - по номер)
public void deleteRecord(PersonRecord record) throws IllegalArgumentException,
IOException {
if (getRecord(record.getID()).getID() == 0)
throw new IllegalArgumentException("Record does not exist, delete illegal");
else {
file.seek((record.getID() - 1) * PersonRecord.SIZE);
record.setID(0);//"Изтириване" на записа
record.writeToFile(file);
}
}
public void showAllRecords() {//Извеждане на всички записи
PersonRecord record = new PersonRecord();
try{
file.seek(0); //В началото на файла
while (true) {
do {
record.readFromFile(file);
} while (record.getID() == 0); //Изтрит запис
System.out.println(record);
}
}catch (EOFException ex1) {
return;
}catch (IOException ex2) {
System.err.println("Error reading file");
}
}
}