package visitor;

public class Main {

    public static void main(String[] args) {
        HtmlDocument htmlDocument = new HtmlDocument();
        htmlDocument.add(new HeadingNode());
        htmlDocument.add(new AnchorNode());
        htmlDocument.execute(new HighlightOperation());
    }
}
