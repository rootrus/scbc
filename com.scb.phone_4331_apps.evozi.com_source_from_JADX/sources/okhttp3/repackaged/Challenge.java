package okhttp3.repackaged;

import okhttp3.repackaged.internal.Util;

public final class Challenge {
    private final String ahh;
    private final String scheme;

    public Challenge(String str, String str2) {
        this.scheme = str;
        this.ahh = str2;
    }

    public final String scheme() {
        return this.scheme;
    }

    public final String realm() {
        return this.ahh;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            return Util.equal(this.scheme, challenge.scheme) && Util.equal(this.ahh, challenge.ahh);
        }
    }

    public final int hashCode() {
        String str = this.ahh;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.scheme;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + 899) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.scheme);
        sb.append(" realm=\"");
        sb.append(this.ahh);
        sb.append("\"");
        return sb.toString();
    }
}
