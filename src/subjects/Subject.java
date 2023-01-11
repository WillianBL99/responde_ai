package subjects;

import java.util.List;

public class Subject {
  private String title;
  private List<SubjectMatter> subjectMatters;

  public Subject(String title, List<SubjectMatter> subjectMatters) {
    this.title = title;
    this.subjectMatters = subjectMatters;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<SubjectMatter> getSubjectMatters() {
    return subjectMatters;
  }

  public void setSubjectMatters(List<SubjectMatter> subjectMatters) {
    this.subjectMatters = subjectMatters;
  }
}
