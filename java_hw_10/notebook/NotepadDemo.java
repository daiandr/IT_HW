package notebook;

public class NotepadDemo {

    public static void main(String[] args) {

//        SimpleNotepad notepad1 = new SimpleNotepad();
//        notepad1.addTextToPage(1, "asdf");
//        notepad1.addTextToPage(1, " sfzm");
//        notepad1.overwriteText(1, "bazinga");
//        notepad1.printPages();


       SecureNotepad notepad2 = new SecureNotepad("pokemon",10);
        notepad2.addTextToPage(10, "sdaa");
        notepad2.printPages();


    }
}
