package org.bouncycastle.asn1.eac;

import java.util.Enumeration;
import java.util.Hashtable;

public class Flags {
    int value = 0;

    class StringJoiner {
        boolean First = true;

        /* renamed from: b */
        StringBuffer f5593b = new StringBuffer();
        String mSeparator;

        public StringJoiner(String str) {
            this.mSeparator = str;
        }

        public void add(String str) {
            if (this.First) {
                this.First = false;
            } else {
                this.f5593b.append(this.mSeparator);
            }
            this.f5593b.append(str);
        }

        public String toString() {
            return this.f5593b.toString();
        }
    }

    public Flags() {
    }

    public Flags(int i) {
        this.value = i;
    }

    /* access modifiers changed from: package-private */
    public String decode(Hashtable hashtable) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            if (isSet(num.intValue())) {
                stringJoiner.add((String) hashtable.get(num));
            }
        }
        return stringJoiner.toString();
    }

    public int getFlags() {
        return this.value;
    }

    public boolean isSet(int i) {
        return (i & this.value) != 0;
    }

    public void set(int i) {
        this.value = i | this.value;
    }
}
