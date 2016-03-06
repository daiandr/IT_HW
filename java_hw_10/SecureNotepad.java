package notebook;

import java.util.Scanner;

public class SecureNotepad extends SimpleNotepad implements INotepad {

    public static final String WRONG_PASSWORD = "Wrong password!";
    private String password;
    private Scanner sc = new Scanner(System.in);

    SecureNotepad(String password,int numberOfPages) {
        super(numberOfPages);
        this.password = password;
    }

    private String enterPassword() {
        System.out.println("Enter password");
        String enterKey = sc.nextLine();
        return enterKey;
    }

    private boolean verifyPassword(String enterKey) {
        if (enterKey.equals(this.password)) {
            return true;
        }
        return false;
    }

    @Override
    public void addTextToPage(int pageNumber, String text) {
        if (verifyPassword(enterPassword()) == true) {
            super.addTextToPage(pageNumber, text);
        } else {
            System.out.println(WRONG_PASSWORD);
            addTextToPage(pageNumber, text);
        }
    }

    @Override
    public void overwriteText(int pageNumber, String text) {
        if (verifyPassword(enterPassword()) == true) {
            super.overwriteText(pageNumber, text);
        } else {
            System.out.println(WRONG_PASSWORD);
            overwriteText(pageNumber, text);
        }
    }

    @Override
    public void deleteText(int pageNumber) {
        if (verifyPassword(enterPassword()) == true) {
            super.deleteText(pageNumber);
        } else {
            System.out.println(WRONG_PASSWORD);
            deleteText(pageNumber);
        }
    }

    @Override
    public void printPages() {
        if (verifyPassword(enterPassword()) == true) {
            super.printPages();
        }else {
            System.out.println(WRONG_PASSWORD);
            printPages();
        }
    }
}
