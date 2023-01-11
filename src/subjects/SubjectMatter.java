package subjects;

import java.util.ArrayList;
import java.util.List;
import subjects.SubClass;

public class SubjectMatter {
  private String title;
  private List<SubClass> subClasses;

  public SubjectMatter(String title) {
    this(title, new ArrayList<SubClass>());
  }

  public SubjectMatter(String title, List<SubClass> subClasses) {
    this.title = title;
    this.subClasses = subClasses;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<SubClass> getsubClasses() {
    return subClasses;
  }

  public void addSubClass(SubClass subClasse) {
    this.subClasses.add(subClasse);
  }
}