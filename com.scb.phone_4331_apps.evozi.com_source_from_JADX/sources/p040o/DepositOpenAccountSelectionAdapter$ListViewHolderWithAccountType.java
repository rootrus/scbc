package p040o;

import java.io.Serializable;
import java.nio.CharBuffer;

/* renamed from: o.DepositOpenAccountSelectionAdapter$ListViewHolderWithAccountType */
public final class DepositOpenAccountSelectionAdapter$ListViewHolderWithAccountType implements Serializable, CharSequence {
    public int IconCompatParcelizer;
    public char[] read;

    public DepositOpenAccountSelectionAdapter$ListViewHolderWithAccountType(int i) {
        C6431x12296157.MediaBrowserCompat$CustomActionResultReceiver(i, "Buffer capacity");
        this.read = new char[i];
    }

    public final void write(int i) {
        char[] cArr = new char[Math.max(this.read.length << 1, i)];
        System.arraycopy(this.read, 0, cArr, 0, this.IconCompatParcelizer);
        this.read = cArr;
    }

    public final void read(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.IconCompatParcelizer + length;
        if (i > this.read.length) {
            write(i);
        }
        str.getChars(0, length, this.read, this.IconCompatParcelizer);
        this.IconCompatParcelizer = i;
    }

    public final void write(char c) {
        int i = this.IconCompatParcelizer + 1;
        if (i > this.read.length) {
            write(i);
        }
        this.read[this.IconCompatParcelizer] = c;
        this.IconCompatParcelizer = i;
    }

    public final char charAt(int i) {
        return this.read[i];
    }

    public final int length() {
        return this.IconCompatParcelizer;
    }

    public final CharSequence subSequence(int i, int i2) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Negative beginIndex: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 > this.IconCompatParcelizer) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex: ");
            sb2.append(i2);
            sb2.append(" > length: ");
            sb2.append(this.IconCompatParcelizer);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i <= i2) {
            return CharBuffer.wrap(this.read, i, i2);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("beginIndex: ");
            sb3.append(i);
            sb3.append(" > endIndex: ");
            sb3.append(i2);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public final String toString() {
        return new String(this.read, 0, this.IconCompatParcelizer);
    }
}
