package p040o;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import p040o.hash;

/* renamed from: o.Script  reason: case insensitive filesystem */
public class C10823Script {
    public final int read;
    public final int write;

    /* renamed from: o.Script$LaunchOptions */
    public final class LaunchOptions {
        public C1268x553f7c5f IconCompatParcelizer = C1268x553f7c5f.NUMERIC;
        public int write = 0;
    }

    public C10823Script(int i, int i2) {
        this.read = i;
        this.write = i2;
    }

    /* renamed from: o.Script$InvokeID */
    public abstract class InvokeID {
        public final int MediaBrowserCompat$ItemReceiver;

        InvokeID(int i) {
            this.MediaBrowserCompat$ItemReceiver = i;
        }
    }

    /* renamed from: o.Script$FieldID */
    abstract class FieldID extends FieldBase {
        /* access modifiers changed from: protected */
        public abstract void IconCompatParcelizer(StringBuilder sb, int i);

        /* access modifiers changed from: protected */
        public abstract int read(int i);

        FieldID(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate) {
            super(rsnscriptintrinsiccreate);
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$ItemReceiver(StringBuilder sb, int i, int i2) {
            int MediaBrowserCompat$CustomActionResultReceiver = hash.write.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$ItemReceiver, i, i2);
            IconCompatParcelizer(sb, MediaBrowserCompat$CustomActionResultReceiver);
            int read = read(MediaBrowserCompat$CustomActionResultReceiver);
            int i3 = 100000;
            for (int i4 = 0; i4 < 5; i4++) {
                if (read / i3 == 0) {
                    sb.append('0');
                }
                i3 /= 10;
            }
            sb.append(read);
        }
    }

    /* renamed from: o.Script$FieldBase */
    abstract class FieldBase extends init {
        FieldBase(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate) {
            super(rsnscriptintrinsiccreate);
        }

        /* access modifiers changed from: package-private */
        public final void read(StringBuilder sb, int i) {
            sb.append("(01)");
            int length = sb.length();
            sb.append('9');
            write(sb, i, length);
        }

        /* access modifiers changed from: package-private */
        public final void write(StringBuilder sb, int i, int i2) {
            for (int i3 = 0; i3 < 4; i3++) {
                int MediaBrowserCompat$CustomActionResultReceiver = hash.write.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$ItemReceiver, (i3 * 10) + i, 10);
                if (MediaBrowserCompat$CustomActionResultReceiver / 100 == 0) {
                    sb.append('0');
                }
                if (MediaBrowserCompat$CustomActionResultReceiver / 10 == 0) {
                    sb.append('0');
                }
                sb.append(MediaBrowserCompat$CustomActionResultReceiver);
            }
            MediaBrowserCompat$ItemReceiver(sb, i2);
        }

        private static void MediaBrowserCompat$ItemReceiver(StringBuilder sb, int i) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < 13; i4++) {
                int charAt = sb.charAt(i4 + i) - '0';
                if ((i4 & 1) == 0) {
                    charAt *= 3;
                }
                i3 += charAt;
            }
            int i5 = 10 - (i3 % 10);
            if (i5 != 10) {
                i2 = i5;
            }
            sb.append(i2);
        }
    }

    /* renamed from: o.Script$KernelID */
    public final class KernelID extends InvokeID {
        public final boolean IconCompatParcelizer;
        public final int read;
        public final String write;

        public KernelID(int i, String str) {
            super(i);
            this.write = str;
            this.IconCompatParcelizer = false;
            this.read = 0;
        }

        public KernelID(int i, String str, int i2) {
            super(i);
            this.IconCompatParcelizer = true;
            this.read = i2;
            this.write = str;
        }
    }

    /* renamed from: o.Script$Builder */
    public final class Builder extends FieldBase {
        public Builder(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate) {
            super(rsnscriptintrinsiccreate);
        }

        public final String write() throws NotFoundException, FormatException {
            if (MediaBrowserCompat$CustomActionResultReceiver().read >= 48) {
                StringBuilder sb = new StringBuilder();
                read(sb, 8);
                int read = MediaBrowserCompat$ItemReceiver().read(48, 2);
                sb.append("(393");
                sb.append(read);
                sb.append(')');
                int read2 = MediaBrowserCompat$ItemReceiver().read(50, 10);
                if (read2 / 100 == 0) {
                    sb.append('0');
                }
                if (read2 / 10 == 0) {
                    sb.append('0');
                }
                sb.append(read2);
                sb.append(MediaBrowserCompat$ItemReceiver().IconCompatParcelizer(60, (String) null).write);
                return sb.toString();
            }
            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read);
        sb.append("(");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10823Script)) {
            return false;
        }
        C10823Script script = (C10823Script) obj;
        if (this.read == script.read && this.write == script.write) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.read ^ this.write;
    }
}
