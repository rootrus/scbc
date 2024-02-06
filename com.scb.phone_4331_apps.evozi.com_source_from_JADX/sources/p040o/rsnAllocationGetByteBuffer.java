package p040o;

import java.io.Serializable;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* renamed from: o.rsnAllocationGetByteBuffer */
public final class rsnAllocationGetByteBuffer implements Serializable {
    private static final TimeZone IconCompatParcelizer = TimeZone.getTimeZone("GMT");
    private final long MediaBrowserCompat$CustomActionResultReceiver;
    private final boolean read;
    private final int write;

    static {
        Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d{1,9})?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    }

    public rsnAllocationGetByteBuffer(long j) {
        this(0, (byte) 0);
    }

    private rsnAllocationGetByteBuffer(long j, byte b) {
        this.read = false;
        this.MediaBrowserCompat$CustomActionResultReceiver = 0;
        this.write = TimeZone.getDefault().getOffset(0) / 60000;
    }

    public final String read() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(IconCompatParcelizer);
        gregorianCalendar.setTimeInMillis(this.MediaBrowserCompat$CustomActionResultReceiver + (((long) this.write) * 60000));
        MediaBrowserCompat$CustomActionResultReceiver(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        MediaBrowserCompat$CustomActionResultReceiver(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        MediaBrowserCompat$CustomActionResultReceiver(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        MediaBrowserCompat$CustomActionResultReceiver(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        MediaBrowserCompat$CustomActionResultReceiver(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        MediaBrowserCompat$CustomActionResultReceiver(sb, gregorianCalendar.get(13), 2);
        if (gregorianCalendar.isSet(14)) {
            sb.append('.');
            MediaBrowserCompat$CustomActionResultReceiver(sb, gregorianCalendar.get(14), 3);
        }
        int i = this.write;
        if (i == 0) {
            sb.append(Matrix.MATRIX_TYPE_ZERO);
        } else {
            if (i > 0) {
                sb.append('+');
            } else {
                sb.append('-');
                i = -i;
            }
            MediaBrowserCompat$CustomActionResultReceiver(sb, i / 60, 2);
            sb.append(':');
            MediaBrowserCompat$CustomActionResultReceiver(sb, i % 60, 2);
        }
        return sb.toString();
    }

    public final String toString() {
        return read();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rsnAllocationGetByteBuffer)) {
            return false;
        }
        rsnAllocationGetByteBuffer rsnallocationgetbytebuffer = (rsnAllocationGetByteBuffer) obj;
        if (this.MediaBrowserCompat$CustomActionResultReceiver == rsnallocationgetbytebuffer.MediaBrowserCompat$CustomActionResultReceiver && this.write == rsnallocationgetbytebuffer.write) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new long[]{this.MediaBrowserCompat$CustomActionResultReceiver, 0, (long) this.write});
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            i = -i;
        }
        int i3 = i;
        while (i3 > 0) {
            i3 /= 10;
            i2--;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append('0');
        }
        if (i != 0) {
            sb.append(i);
        }
    }
}
