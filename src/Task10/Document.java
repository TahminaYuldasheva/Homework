package Task10;

public class Document {
    public String documentNumber;

    public Document(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void printFirstTwoBlocks() {
        String firstBlock = documentNumber.substring(0, 4);
        String secondBlock = documentNumber.substring(9, 13);
        System.out.println(firstBlock + " " + secondBlock);
    }
    public void replaceLetterBlocksWithStars() {
        String modifiedLetters = documentNumber.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println(modifiedLetters);
    }

    public String getLettersFromDocument() {
        StringBuilder letters = new StringBuilder();
        for (int i = 0; i < documentNumber.length(); i++) {
            char c = documentNumber.charAt(i);
            if (Character.isLetter(c)) {
                letters.append(c);
            }
        }
        return letters.toString().toLowerCase();
    }

    public void printLettersInLowerCase() {
        String lettersOnly = getLettersFromDocument();
        if (lettersOnly.length() >= 8) {
            System.out.println(lettersOnly.substring(0, 3) + "/" +
                    lettersOnly.substring(3, 6) + "/" +
                    lettersOnly.charAt(6) + "/" +
                    lettersOnly.charAt(7));
        } else {
            System.out.println("Incorrect document format.");
        }
    }

    public void printLettersInUpperCase() {
        String lettersOnly = getLettersFromDocument();
        if (lettersOnly.length() >= 8) {
            StringBuilder sb = new StringBuilder("Letters:");
            sb.append(lettersOnly.substring(0, 3).toUpperCase()).append("/")
                    .append(lettersOnly.substring(3, 6).toUpperCase()).append("/")
                    .append(Character.toUpperCase(lettersOnly.charAt(6))).append("/")
                    .append(Character.toUpperCase(lettersOnly.charAt(7)));
            System.out.println(sb.toString());
        } else {
            System.out.println("Incorrect document format.");
        }
    }

    public void checkContainsLetters() {
        if (documentNumber.toLowerCase().contains("abc")) {
            System.out.println("The document number contains a sequence 'abc'.");
        } else {
            System.out.println("The document number does not contain a sequence 'abc'.");
        }
    }

    public void checkStart() {
        if (documentNumber.startsWith("555")) {
            System.out.println("Document number starts with '555'.");
        } else {
            System.out.println("The document number does not start with'555'.");
        }
    }

    public void checkEnd() {
        if (documentNumber.endsWith("1a2b")) {
            System.out.println("The document number ends with '1a2b'.");
        } else {
            System.out.println("The document number does not end with '1a2b'.");
        }
    }

}