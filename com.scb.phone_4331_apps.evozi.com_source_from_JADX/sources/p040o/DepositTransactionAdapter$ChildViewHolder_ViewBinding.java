package p040o;

import java.io.Serializable;
import java.nio.CharBuffer;

/* renamed from: o.DepositTransactionAdapter$ChildViewHolder_ViewBinding */
public final class DepositTransactionAdapter$ChildViewHolder_ViewBinding implements CharSequence, Serializable {
    public int IconCompatParcelizer;
    public char[] write;

    public DepositTransactionAdapter$ChildViewHolder_ViewBinding(int i) {
        DepositTransactionAdapter$GroupItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(i, "Buffer capacity");
        this.write = new char[i];
    }

    public final void IconCompatParcelizer(int i) {
        char[] cArr = new char[Math.max(this.write.length << 1, i)];
        System.arraycopy(this.write, 0, cArr, 0, this.IconCompatParcelizer);
        this.write = cArr;
    }

    public final void MediaBrowserCompat$ItemReceiver(char[] cArr, int i, int i2) {
        int i3;
        if (cArr != null) {
            if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) < 0 || i3 > cArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("off: ");
                sb.append(i);
                sb.append(" len: ");
                sb.append(i2);
                sb.append(" b.length: ");
                sb.append(cArr.length);
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i2 != 0) {
                int i4 = this.IconCompatParcelizer + i2;
                if (i4 > this.write.length) {
                    IconCompatParcelizer(i4);
                }
                System.arraycopy(cArr, i, this.write, this.IconCompatParcelizer, i2);
                this.IconCompatParcelizer = i4;
            }
        }
    }

    public final void read(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.IconCompatParcelizer + length;
        if (i > this.write.length) {
            IconCompatParcelizer(i);
        }
        str.getChars(0, length, this.write, this.IconCompatParcelizer);
        this.IconCompatParcelizer = i;
    }

    public final void read(char c) {
        int i = this.IconCompatParcelizer + 1;
        if (i > this.write.length) {
            IconCompatParcelizer(i);
        }
        this.write[this.IconCompatParcelizer] = c;
        this.IconCompatParcelizer = i;
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr != null) {
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("off: ");
                sb.append(i);
                sb.append(" len: ");
                sb.append(i2);
                sb.append(" b.length: ");
                sb.append(bArr.length);
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i2 != 0) {
                int i4 = this.IconCompatParcelizer;
                int i5 = i2 + i4;
                if (i5 > this.write.length) {
                    IconCompatParcelizer(i5);
                }
                while (i4 < i5) {
                    this.write[i4] = (char) (bArr[i] & 255);
                    i++;
                    i4++;
                }
                this.IconCompatParcelizer = i5;
            }
        }
    }

    public final char charAt(int i) {
        return this.write[i];
    }

    public final int length() {
        return this.IconCompatParcelizer;
    }

    public final int write(int i, int i2, int i3) {
        if (i2 < 0) {
            i2 = 0;
        }
        int i4 = this.IconCompatParcelizer;
        if (i3 > i4) {
            i3 = i4;
        }
        if (i2 > i3) {
            return -1;
        }
        while (i2 < i3) {
            if (this.write[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final int MediaBrowserCompat$ItemReceiver(int i) {
        return write(i, 0, this.IconCompatParcelizer);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
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
            return new String(this.write, i, i2 - i);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("beginIndex: ");
            sb3.append(i);
            sb3.append(" > endIndex: ");
            sb3.append(i2);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public final String write(int i, int i2) {
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
            while (i < i2 && CreditCardBilledDetailAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(this.write[i])) {
                i++;
            }
            while (i2 > i && CreditCardBilledDetailAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(this.write[i2 - 1])) {
                i2--;
            }
            return new String(this.write, i, i2 - i);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("beginIndex: ");
            sb3.append(i);
            sb3.append(" > endIndex: ");
            sb3.append(i2);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
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
            return CharBuffer.wrap(this.write, i, i2);
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
        return new String(this.write, 0, this.IconCompatParcelizer);
    }
}
