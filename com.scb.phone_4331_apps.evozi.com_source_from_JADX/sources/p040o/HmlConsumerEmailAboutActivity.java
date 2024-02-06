package p040o;

/* renamed from: o.HmlConsumerEmailAboutActivity */
public final class HmlConsumerEmailAboutActivity<T> {
    public T[] IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    public final float read;
    public int write;

    public HmlConsumerEmailAboutActivity() {
        this((byte) 0);
    }

    private HmlConsumerEmailAboutActivity(byte b) {
        this.read = 0.75f;
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
        this.MediaBrowserCompat$CustomActionResultReceiver = numberOfLeadingZeros - 1;
        this.write = (int) (((float) numberOfLeadingZeros) * 0.75f);
        this.IconCompatParcelizer = (Object[]) new Object[numberOfLeadingZeros];
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.MediaBrowserCompat$ItemReceiver--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int hashCode = t.hashCode() * -1640531527;
                int i5 = (hashCode ^ (hashCode >>> 16)) & i2;
                if (i <= i3) {
                    if (i >= i5 || i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= i5 && i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }
}
