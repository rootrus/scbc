package p040o;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import p040o.C10823Script;

/* renamed from: o.updateAllocation */
public final class updateAllocation extends C10823Script.FieldBase {
    public updateAllocation(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate) {
        super(rsnscriptintrinsiccreate);
    }

    public final String write() throws NotFoundException, FormatException {
        StringBuilder sb = new StringBuilder();
        sb.append("(01)");
        int length = sb.length();
        sb.append(MediaBrowserCompat$ItemReceiver().read(4, 4));
        write(sb, 8, length);
        return MediaBrowserCompat$ItemReceiver().write(sb, 48);
    }
}
