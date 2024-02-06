package p040o;

import com.google.zxing.NotFoundException;
import p040o.C10823Script;

/* renamed from: o.setIncSupp */
public final class setIncSupp extends C10823Script.FieldID {
    private final String IconCompatParcelizer;
    private final String read;

    public setIncSupp(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, String str, String str2) {
        super(rsnscriptintrinsiccreate);
        this.IconCompatParcelizer = str2;
        this.read = str;
    }

    public final String write() throws NotFoundException {
        if (MediaBrowserCompat$CustomActionResultReceiver().read == 84) {
            StringBuilder sb = new StringBuilder();
            read(sb, 8);
            MediaBrowserCompat$ItemReceiver(sb, 48, 20);
            int read2 = MediaBrowserCompat$ItemReceiver().read(68, 16);
            if (read2 != 38400) {
                sb.append('(');
                sb.append(this.IconCompatParcelizer);
                sb.append(')');
                int i = read2 % 32;
                int i2 = read2 / 32;
                int i3 = (i2 % 12) + 1;
                int i4 = i2 / 12;
                if (i4 / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i4);
                if (i3 / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i3);
                if (i / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i);
            }
            return sb.toString();
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.read);
        sb.append(i / 100000);
        sb.append(')');
    }

    /* access modifiers changed from: protected */
    public final int read(int i) {
        return i % 100000;
    }
}
