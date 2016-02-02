package notebook;

public interface INotepad {
    void addTextToPage(int pageNumber, String text);

    void overwriteText(int pageNumber, String text);

    void deleteText(int pageNumber);

    void printPages();
}
