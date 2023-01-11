import java.util.List;

import subjects.Subject;

public class App {

  public static void main(String[] args) throws Exception {
    List<Subject> subjects = FillSubjects.fill();
    Menu menu = new Menu(subjects);

    while (true) {
      menu.handle();
    }
  }
}
