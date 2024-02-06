package p040o;

import com.google.zxing.FormatException;
import p040o.C10823Script;

/* renamed from: o.access$100 */
public final class access$100 extends C10823Script.InvokeID {
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    public final int write;

    public access$100(int i, int i2, int i3) throws FormatException {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw FormatException.read();
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = i2;
        this.write = i3;
    }
}
