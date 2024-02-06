package p040o;

import com.google.zxing.NotFoundException;
import p040o.C10823Script;

/* renamed from: o.setVar */
abstract class setVar extends C10823Script.FieldID {
    setVar(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate) {
        super(rsnscriptintrinsiccreate);
    }

    public final String write() throws NotFoundException {
        if (MediaBrowserCompat$CustomActionResultReceiver().read == 60) {
            StringBuilder sb = new StringBuilder();
            read(sb, 5);
            MediaBrowserCompat$ItemReceiver(sb, 45, 15);
            return sb.toString();
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
