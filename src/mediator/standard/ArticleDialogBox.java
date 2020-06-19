package mediator.standard;

public class ArticleDialogBox extends DialogBox {

    private final ListBox articleListBox = new ListBox(this);
    private final TextBox titleTextBox = new TextBox(this);
    private final Button saveButton = new Button(this);

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

    @Override
    public void changed(UIControl uiControl) {
        if (uiControl == articleListBox) {
            articleSelected();
        } else if (uiControl == titleTextBox) {
            titleChanged();
        }
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
