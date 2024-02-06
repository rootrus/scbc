package p040o;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* renamed from: o.loadMultiply$MediaBrowserCompat$CustomActionResultReceiver */
final class loadMultiply$MediaBrowserCompat$CustomActionResultReceiver implements ObjectEncoder<C10885rotate> {
    static final loadMultiply$MediaBrowserCompat$CustomActionResultReceiver read = new loadMultiply$MediaBrowserCompat$CustomActionResultReceiver();

    private loadMultiply$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final void encode(Object obj, Object obj2) throws IOException {
        C10885rotate rotate = (C10885rotate) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add("clientType", (Object) rotate.read());
        objectEncoderContext.add("androidClientInfo", (Object) rotate.IconCompatParcelizer());
    }
}
