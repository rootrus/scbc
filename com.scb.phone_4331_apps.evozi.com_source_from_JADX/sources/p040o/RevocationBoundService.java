package p040o;

import java.util.ArrayList;
import p040o.PolystarShape;

/* renamed from: o.RevocationBoundService */
public final class RevocationBoundService extends FragmentBuilder_BindSummaryFragment {
    public static getExpirationTime MediaBrowserCompat$ItemReceiver(PolystarShape.Type type) {
        ArrayList arrayList = new ArrayList();
        for (PolystarShape$Type$MediaBrowserCompat$CustomActionResultReceiver next : type.MediaBrowserCompat$CustomActionResultReceiver) {
            arrayList.add(new getExpirationTime$MediaBrowserCompat$CustomActionResultReceiver(next.MediaBrowserCompat$ItemReceiver, next.IconCompatParcelizer));
        }
        return new getExpirationTime(type.read, type.MediaBrowserCompat$ItemReceiver, type.IconCompatParcelizer, arrayList, type.write);
    }
}
