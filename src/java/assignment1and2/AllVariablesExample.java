package java.assignment1and2;

public class AllVariablesExample {
    private byte byteValue;
    private short shortValue;
    private int intValue;
    private long longValue;
    private float floatValue;
    private double doubleValue;
    private char charValue;
    private boolean booleanValue;
    private String stringValue;
    private Object objectValue; // This can hold any object type

    // Constructor
    public AllVariablesExample(byte byteValue, short shortValue, int intValue, long longValue,
                               float floatValue, double doubleValue, char charValue,
                               boolean booleanValue, String stringValue, Object objectValue) {
        this.byteValue = byteValue;
        this.shortValue = shortValue;
        this.intValue = intValue;
        this.longValue = longValue;
        this.floatValue = floatValue;
        this.doubleValue = doubleValue;
        this.charValue = charValue;
        this.booleanValue = booleanValue;
        this.stringValue = stringValue;
        this.objectValue = objectValue;
    }

    // Getter and Setter methods for each field

    public byte getByteValue() {
        return byteValue;
    }

    public void setByteValue(byte byteValue) {
        this.byteValue = byteValue;
    }

    public short getShortValue() {
        return shortValue;
    }

    public void setShortValue(short shortValue) {
        this.shortValue = shortValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(float floatValue) {
        this.floatValue = floatValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public char getCharValue() {
        return charValue;
    }

    public void setCharValue(char charValue) {
        this.charValue = charValue;
    }

    public boolean isBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Object getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(Object objectValue) {
        this.objectValue = objectValue;
    }

    // Main method for testing
    public static void main(String[] args) {
        AllVariablesExample example = new AllVariablesExample(
                (byte) 1, (short) 2, 3, 4L, 5.5f, 6.6, 'A', true, "Hello, World!", new java.util.Date()
        );

        // Displaying values
        System.out.println("Byte Value: " + example.getByteValue());
        System.out.println("Short Value: " + example.getShortValue());
        System.out.println("Int Value: " + example.getIntValue());
        System.out.println("Long Value: " + example.getLongValue());
        System.out.println("Float Value: " + example.getFloatValue());
        System.out.println("Double Value: " + example.getDoubleValue());
        System.out.println("Char Value: " + example.getCharValue());
        System.out.println("Boolean Value: " + example.isBooleanValue());
        System.out.println("String Value: " + example.getStringValue());
        System.out.println("Object Value: " + example.getObjectValue());
    }
}
