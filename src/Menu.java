import java.util.List;
import java.util.Scanner;

import subjects.*;

public class Menu {
  List<Subject> subjects;

  public Menu(List<Subject> subjects) {
    this.subjects = subjects;
  }

  public void handle() {
    System.out.println("\n ## Menu ## ");

    for (int i = 0; i < this.subjects.size(); i++) {
      System.out.println(i + " - " + this.subjects.get(i).getTitle());
    }

    int opt = this.getOpt(this.subjects.size());

    subjectMattersMenu(opt);
  }

  private void subjectMattersMenu(int subjectNum) {
    System.out.println("\n ## Menu Assunto ## ");
    Subject subject = this.subjects.get(subjectNum);

    for (int i = 0; i < subject.getSubjectMatters().size(); i++) {
      System.out.println(i + " - " + subject.getSubjectMatters().get(i).getTitle());
    }

    int opt = this.getOpt(subject.getSubjectMatters().size());

    subClassesMenu(subjectNum, opt);
  }

  private void subClassesMenu(int subjectNum, int subjectMatterNum) {
    System.out.println("\n ## Menu Aula ## ");
    SubjectMatter subjectMatter = this.subjects.get(subjectNum).getSubjectMatters().get(subjectMatterNum);

    for (int i = 0; i < subjectMatter.getsubClasses()
        .size(); i++) {
      System.out.println(i + " - "
          + subjectMatter.getsubClasses().get(i).getTitle());
    }

    int opt = this.getOpt(subjectMatter.getsubClasses().size());

    showSubClass(subjectMatter.getsubClasses().get(opt));
  }

  private void showSubClass(SubClass subClass) {
    System.out.println("\n ## Conteudo ## ");
    System.out.printf("Titulo: %s%nConteudo: %s%n", subClass.getTitle(), subClass.getContent());
  }

  private int getOpt(int maxOpt) {
    Scanner scanner = new Scanner(System.in);
    int opt = 0;

    try {
      while (true) {
        System.out.print("Opção: ");
        opt = scanner.nextInt();

        if (opt >= 0 && opt < maxOpt) {
          return opt;
        } else {
          System.out.println("Opção inválida!");
        }
      }

    } catch (Exception e) {
      System.err.print("Erro on getOpt: " + e.getMessage());
    }

    return -1;
  }
}
