import java.util.ArrayList;
import java.util.List;
import subjects.SubClass;
import subjects.Subject;
import subjects.SubjectMatter;

public class FillSubjects {
  public static List<Subject> fill() {
    List<SubjectMatter> subjectMatters = subjectMatters(subClasses());
    int middle = subjectMatters.size() / 2;
    var FistSM = subjectMatters.subList(0, middle);
    var SecondSM = subjectMatters.subList(middle, subjectMatters.size());

    return new ArrayList<Subject>(List.of(
        new Subject("Algoritmo e Estrutura de Dados", FistSM),
        new Subject("Linguagem de Programação", SecondSM)));
  }

  private static List<SubClass> subClasses() {
    return new ArrayList<SubClass>(List.of(
        new SubClass("JavaScript", "Aprendendo JavaScript..."),
        new SubClass("TypeScript", "Aprendendo TypeScript..."),
        new SubClass("Golang", "Aprendendo Golang..."),
        new SubClass("Java", "Aprendendo Java..."),
        new SubClass("Python", "Aprendendo Python..."),
        new SubClass("C#", "Aprendendo C#..."),
        new SubClass("C++", "Aprendendo C++..."),
        new SubClass("C", "Aprendendo C..."),
        new SubClass("Ruby", "Aprendendo Ruby...")));
  }

  private static List<SubjectMatter> subjectMatters(List<SubClass> subClasses) {
    List<SubjectMatter> subjectMatters = new ArrayList<>();

    SubjectMatter subjectMatter = new SubjectMatter("");
    for (int i = 0; i < subClasses.size(); i++) {
      if (i % 3 == 0) {
        if (i != 0) {
          subjectMatters.add(subjectMatter);
        }
        subjectMatter = new SubjectMatter("Assunto " + i);
      }
      subjectMatter.addSubClass(subClasses.get(i));
    }

    return subjectMatters;
  }
}
