package java.assignment1and2.src.Assignment

public class CodeConversion {

    private String sourceCode;

    public CodeConversion(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String toUpperCase() {
        return sourceCode.toUpperCase();
    }

    public String toLowerCase() {
        return sourceCode.toLowerCase();
    }

    public String reverse() {
        return new StringBuilder(sourceCode).reverse().toString();
    }

    public String removeWhitespace() {
        return sourceCode.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        CodeConversion codeConversion = new CodeConversion("Aminul Islam Raju !");

        System.out.println("Original Code: " + codeConversion.getSourceCode());
        System.out.println("Uppercase: " + codeConversion.toUpperCase());
        System.out.println("Lowercase: " + codeConversion.toLowerCase());
        System.out.println("Reversed: " + codeConversion.reverse());
        System.out.println("Without Whitespace: " + codeConversion.removeWhitespace());
    }
}
