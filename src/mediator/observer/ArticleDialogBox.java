package mediator.observer;

public class ArticleDialogBox {

    private final ListBox articleListBox = new ListBox();
    private final TextBox titleTextBox = new TextBox();
    private final Button saveButton = new Button();

    public ArticleDialogBox() {
        articleListBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction() {
        articleListBox.setSelection("Article 1");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
        titleTextBox.setContent("");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
        titleTextBox.setContent("Article 2");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
    }

    private void titleChanged() {
        String content = titleTextBox.getContent();
        boolean isEmpty = content == null || content.isEmpty();
        saveButton.setEnabled(!isEmpty);
    }

    private void articleSelected() {
        titleTextBox.setContent(articleListBox.getSelection());
        saveButton.setEnabled(true);
    }
}
