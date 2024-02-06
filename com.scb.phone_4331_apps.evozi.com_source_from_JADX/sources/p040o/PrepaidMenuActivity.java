package p040o;

import java.util.Date;
import java.util.TimeZone;

/* renamed from: o.PrepaidMenuActivity */
final class PrepaidMenuActivity extends TimeZone {
    private final String read;
    private final int write;

    public final boolean inDaylightTime(Date date) {
        return false;
    }

    public final boolean useDaylightTime() {
        return false;
    }

    PrepaidMenuActivity(boolean z, int i, int i2) {
        if (i >= 24) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(" hours out of range");
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < 60) {
            int i3 = ((i * 60) + i2) * 60000;
            this.write = z ? -i3 : i3;
            StringBuilder sb2 = new StringBuilder(9);
            sb2.append("GMT");
            sb2.append(z ? '-' : '+');
            sb2.append((char) ((i / 10) + 48));
            sb2.append((char) ((i % 10) + 48));
            sb2.append(':');
            sb2.append((char) ((i2 / 10) + 48));
            sb2.append((char) ((i2 % 10) + 48));
            this.read = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i2);
            sb3.append(" minutes out of range");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public final int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.write;
    }

    public final void setRawOffset(int i) {
        throw new UnsupportedOperationException();
    }

    public final int getRawOffset() {
        return this.write;
    }

    public final String getID() {
        return this.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[GmtTimeZone id=\"");
        sb.append(this.read);
        sb.append("\",offset=");
        sb.append(this.write);
        sb.append(']');
        return sb.toString();
    }

    public final int hashCode() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PrepaidMenuActivity) && this.read == ((PrepaidMenuActivity) obj).read) {
            return true;
        }
        return false;
    }
}
