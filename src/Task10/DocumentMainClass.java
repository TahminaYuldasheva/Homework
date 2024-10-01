package Task10;

public class DocumentMainClass {
    public static void main(String[] args) {
        Document doc = new Document("1234-abc-5678-def-1a2b");

        doc.printFirstTwoBlocks();
        doc.replaceLetterBlocksWithStars();
        doc.printLettersInLowerCase();
        doc.printLettersInUpperCase();
        doc.checkContainsLetters();
        doc.checkStart();
        doc.checkEnd();
    }
}
