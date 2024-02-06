package org.bouncycastle.asn1.x509;

public class X509NameTokenizer {
    private StringBuffer buf;
    private int index;
    private char separator;
    private String value;

    public X509NameTokenizer(String str) {
        this(str, ',');
    }

    public X509NameTokenizer(String str, char c) {
        this.buf = new StringBuffer();
        this.value = str;
        this.index = -1;
        this.separator = c;
    }

    public boolean hasMoreTokens() {
        return this.index != this.value.length();
    }

    public String nextToken() {
        if (this.index == this.value.length()) {
            return null;
        }
        int i = this.index + 1;
        this.buf.setLength(0);
        boolean z = false;
        boolean z2 = false;
        while (i != this.value.length()) {
            char charAt = this.value.charAt(i);
            if (charAt == '\"') {
                if (!z2) {
                    z = !z;
                }
            } else if (!z2 && !z) {
                if (charAt != '\\') {
                    if (charAt == this.separator) {
                        break;
                    }
                    this.buf.append(charAt);
                } else {
                    this.buf.append(charAt);
                    z2 = true;
                }
                i++;
            }
            this.buf.append(charAt);
            z2 = false;
            i++;
        }
        this.index = i;
        return this.buf.toString();
    }
}
