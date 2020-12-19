package day2;

public class Password {
    private int len1;
    private int len2;
    private char delim;
    private String passwd;

    public Password(int len1, int len2, char delim, String passwd) {
        this.len1 = len1;
        this.len2 = len2;
        this.passwd = passwd;
        this.delim = delim;
    }

    public int getLen1() {
        return len1;
    }

    public int getLen2() {
        return len2;
    }

    public char getDelim() {
        return delim;
    }

    public String getPasswd() {
        return passwd;
    }
}