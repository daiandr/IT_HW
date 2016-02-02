package notebook;

public class SimpleNotepad implements INotepad {

    protected int numberOfPages;
    protected Page[] pages;


    SimpleNotepad(int numberOfPages) {
        this.numberOfPages = numberOfPages;
        this.pages = new Page[numberOfPages];

        for (int i = 0; i < pages.length; i++) {
            this.pages[i] = new Page(i + 1);
        }
    }


    @Override
    public void addTextToPage(int pageNumber, String text) {
        if (pageNumber > 0 && pageNumber <= numberOfPages) {
            if (text != null) {
                if (pages[pageNumber - 1].getText() == null) {
                    pages[pageNumber - 1].setText(text);
                } else {
                    pages[pageNumber - 1].setText(pages[pageNumber - 1].getText() + text);
                }
            }
        } else {
            System.out.println("Non-valid page number!");
        }
    }

    @Override
    public void overwriteText(int pageNumber, String text) {
        if (pageNumber > 0 && pageNumber < numberOfPages) {
            if (text != null) {
                pages[pageNumber - 1].setText(text);
            }
        } else {
            System.out.println("Non-valid page number!");
        }
    }

    @Override
    public void deleteText(int pageNumber) {
        if (pageNumber > 0 && pageNumber < numberOfPages) {
            pages[pageNumber - 1].setText(null);
        } else {
            System.out.println("Non-valid page number!");
        }
    }

    @Override
    public void printPages() {
        for (int i = 0; i < pages.length; i++) {
            if (pages[i].getText() == null) {
                System.out.println("Page Number: " + pages[i].getNumber());
                System.out.println("Empty Page");
            } else {
                System.out.println("Page Number: " + pages[i].getNumber());
                System.out.println("Title: " + pages[i].getTitle());
                System.out.println("Text: " + pages[i].getText());
            }
        }
    }
}
