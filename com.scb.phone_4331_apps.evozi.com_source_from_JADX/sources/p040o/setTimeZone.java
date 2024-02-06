package p040o;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import p040o.C10823Script;

/* renamed from: o.setTimeZone */
public final class setTimeZone extends C10823Script.FieldBase {
    public setTimeZone(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate) {
        super(rsnscriptintrinsiccreate);
    }

    public final String write() throws NotFoundException, FormatException {
        if (MediaBrowserCompat$CustomActionResultReceiver().read >= 48) {
            StringBuilder sb = new StringBuilder();
            read(sb, 8);
            int read = MediaBrowserCompat$ItemReceiver().read(48, 2);
            sb.append("(392");
            sb.append(read);
            sb.append(')');
            sb.append(MediaBrowserCompat$ItemReceiver().IconCompatParcelizer(50, (String) null).write);
            return sb.toString();
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
