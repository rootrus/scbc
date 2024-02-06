package p040o;

import java.util.Collections;
import p040o.IdCaptureModule;
import p040o.ReflectiveTypeAdapterFactory;
import p040o.StreetViewPanorama;
import p040o.writeUInt64NoTag;

/* renamed from: o.ArrayTypeAdapter */
public final /* synthetic */ class ArrayTypeAdapter implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ReflectiveTypeAdapterFactory.BoundField.C37513 IconCompatParcelizer;
    private final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaLongClickListener MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ArrayTypeAdapter(ReflectiveTypeAdapterFactory.BoundField.C37513 r1, StreetViewPanorama.OnStreetViewPanoramaLongClickListener onStreetViewPanoramaLongClickListener) {
        this.IconCompatParcelizer = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = onStreetViewPanoramaLongClickListener;
    }

    public final void IconCompatParcelizer(Object obj) {
        ReflectiveTypeAdapterFactory.BoundField.C37513 r0 = this.IconCompatParcelizer;
        IdCaptureModule.C6906b bVar = (IdCaptureModule.C6906b) obj;
        bVar.IconCompatParcelizer(ReflectiveTypeAdapterFactory.BoundField.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(Collections.singletonList(this.MediaBrowserCompat$CustomActionResultReceiver), ReflectiveTypeAdapterFactory.BoundField.this.write.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView().MediaSessionCompat$ResultReceiverWrapper > 0, false).get(0));
        bVar.read();
    }
}
