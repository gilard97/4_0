/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner Scanner = new Scanner(System.in);
      boolean wybor = true;

      while (wybor){
        System.out.println("menu");
        System.out.println("1. Dodaj studenta");
        System.out.println("2. Wyświetl studentów");
        System.out.println("3. Wyjdź");
        System.out.print("Wybierz opcję: ");
        int choice = Scanner.nextInt();
        Scanner.nextLine();
      
      switch (choice){
          
        case 1:
      System.out.println("Dodaje nowego studenta");
      System.out.println("Imie: ");
      String name = Scanner.next();
      System.out.println("Nazwisko: ");
      String surname = Scanner.next();
      System.out.println("Wiek: ");
      int wiek = Integer.parseInt(Scanner.next());
      s.addStudent(new Student(name, surname, wiek));
      break;

      case 2:
      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
      break;

      case 3:
          System.out.println("Wychodze z programu");
          Scanner.close();
          return;
          
      }


      }
    } catch (IOException e) {
    
    }
  }
  }
