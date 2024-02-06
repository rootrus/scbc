package p040o;

/* renamed from: o.BNNM */
public class BNNM implements Comparable<BNNM> {
    public final int IconCompatParcelizer;
    public final int read;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        BNNM bnnm = (BNNM) obj;
        int i = this.IconCompatParcelizer * this.read;
        int i2 = bnnm.IconCompatParcelizer * bnnm.read;
        if (i2 < i) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    public BNNM(int i, int i2) {
        this.read = i;
        this.IconCompatParcelizer = i2;
    }

    public final BNNM MediaBrowserCompat$ItemReceiver(BNNM bnnm) {
        int i = this.read;
        int i2 = bnnm.IconCompatParcelizer;
        int i3 = bnnm.read;
        int i4 = this.IconCompatParcelizer;
        int i5 = i * i2;
        int i6 = i3 * i4;
        if (i5 >= i6) {
            return new BNNM(i3, i6 / i);
        }
        return new BNNM(i5 / i4, i2);
    }

    public final BNNM IconCompatParcelizer(BNNM bnnm) {
        int i = this.read;
        int i2 = bnnm.IconCompatParcelizer;
        int i3 = bnnm.read;
        int i4 = this.IconCompatParcelizer;
        int i5 = i * i2;
        int i6 = i3 * i4;
        if (i5 <= i6) {
            return new BNNM(i3, i6 / i);
        }
        return new BNNM(i5 / i4, i2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read);
        sb.append("x");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BNNM bnnm = (BNNM) obj;
        if (this.read == bnnm.read && this.IconCompatParcelizer == bnnm.IconCompatParcelizer) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.read * 31) + this.IconCompatParcelizer;
    }
}
