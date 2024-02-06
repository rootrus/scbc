package p040o;

import com.adobe.xmp.XMPException;
import com.adobe.xmp.XMPIterator;
import com.adobe.xmp.XMPMeta;
import com.adobe.xmp.properties.XMPPropertyInfo;
import java.util.HashMap;
import okhttp3.internal.http2.Settings;

/* renamed from: o.getVectorSize */
public class getVectorSize extends createFromBitmapResource {
    private static HashMap<Integer, String> read;
    public XMPMeta write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "XMP";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(Integer.valueOf(Settings.DEFAULT_INITIAL_WINDOW_SIZE), "XMP Value Count");
    }

    public getVectorSize() {
        read((createCubemapFromCubeFaces) new getSubElementName(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }

    public final void MediaBrowserCompat$ItemReceiver(XMPMeta xMPMeta) {
        this.write = xMPMeta;
        try {
            XMPIterator it = xMPMeta.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((XMPPropertyInfo) it.next()).getPath() != null) {
                    i++;
                }
            }
            IconCompatParcelizer(Settings.DEFAULT_INITIAL_WINDOW_SIZE, Integer.valueOf(i));
        } catch (XMPException unused) {
        }
    }
}
