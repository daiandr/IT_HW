package notebook;

public class Page {

    private String title;
    private String text;
    private int number;

    Page(int newNumber) {
        this.number = newNumber;
        this.text = null;
        this.title = null;

    }

    boolean searchWord(String word) {
        if (this.text.contains(word)) {
            return true;
        }
        return false;
    }

    boolean containsNumbers() {
        if (this.text.matches(".*//d.*")) {
            return true;
        }
        return false;
    }

    void addText(String newText) {
        if (newText != null && !(newText.equals(""))) {
            this.text = newText;
        }
    }

    void deleteText() {
        this.text = null;
    }

    void showPage() {
        System.out.println("Title: " + this.title);
        System.out.println("Text: " + this.text);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !(title.equals(""))) {
            this.title = title;
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        if (text != null && !(text.equals(""))) {
            this.text = text;
        }
    }

    public int getNumber() {
        return number;
    }

}
