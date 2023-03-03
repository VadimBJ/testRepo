import java.io.*;

public class Main {
  /*  Как известно, в США президент выбирается не прямым голосованием,
    а путем двухуровневого голосования.
    Сначала проводятся выборы в каждом штате и определяется победитель выборов в данном штате.
     Затем проводятся государственные выборы: на этих выборах каждый штат имеет определенное
     число голосов — число выборщиков от этого штата.
    На практике, все выборщики от штата голосуют в соответствии с результами голосования внутри
     штата, то есть на заключительной стадии выборов в голосовании участвуют штаты, имеющие
     различное число голосов.
    Входной файл: in.txt
    В первой строке дано количество записей. Далее, каждая запись содержит фамилию кандидата
     и число голосов, отданных за него в одном из штатов. Подведите итоги выборов: для каждого
     из участника голосования определите число отданных за него голосов.
    Пример ввода:
    5
    McCain 10
    McCain 5
    Obama 9
    Obama 8
    McCain 1
    Пример вывода:
    McCain 16
    Obama 17
    public static void main(String[] args) {
      System.out.println("Hello world!");
  */
  public static void main(String[] args) throws IOException {
    File fileInput = new File("res/input.txt");
    BufferedReader fr = new BufferedReader(new FileReader(fileInput));
    Candidate obama = Candidate.Obama;
    Candidate mcCain = Candidate.McCain;

    int quantity = Integer.parseInt(fr.readLine());
    for (int i = 0; i < quantity; i++) {
      String line = fr.readLine();
      int sep = line.indexOf(" ");
      String name = line.substring(0, sep);
      int votes = Integer.parseInt(line.substring(sep+1));
      if (name.equals("McCain")) {
        mcCain.setVotes(mcCain.getVotes() + votes);
      } else if (name.equals("Obama")) {
        obama.setVotes(obama.getVotes() + votes);
      }
    }
    System.out.println("McCain "+mcCain.votes);
    System.out.println("Obama "+obama.votes);



  }
}