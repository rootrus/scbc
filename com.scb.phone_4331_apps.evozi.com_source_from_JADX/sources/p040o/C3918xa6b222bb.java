package p040o;

import java.util.List;
import p040o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.TypeAdapters;
import p040o.writeUInt64NoTag;

/* renamed from: o.TypeAdapters$EnumTypeAdapter$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3918xa6b222bb extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzsi> {
    final /* synthetic */ TypeAdapters.EnumTypeAdapter MediaBrowserCompat$CustomActionResultReceiver;

    private C3918xa6b222bb(TypeAdapters.EnumTypeAdapter enumTypeAdapter) {
        this.MediaBrowserCompat$CustomActionResultReceiver = enumTypeAdapter;
    }

    public /* synthetic */ C3918xa6b222bb(TypeAdapters.EnumTypeAdapter enumTypeAdapter, byte b) {
        this(enumTypeAdapter);
    }

    public final /* synthetic */ void onNext(Object obj) {
        zzsi zzsi = (zzsi) obj;
        if (zzsi != null && zzsi.read.size() > 0) {
            TypeAdapters.EnumTypeAdapter enumTypeAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
            List unused = enumTypeAdapter.MediaBrowserCompat$ItemReceiver = enumTypeAdapter.read.MediaBrowserCompat$ItemReceiver(zzsi.read);
            TypeAdapters.EnumTypeAdapter enumTypeAdapter2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            TypeAdapters.C388717 r0 = new writeUInt64NoTag.IconCompatParcelizer() {
                public final void IconCompatParcelizer(Object obj) {
                    ((CheckCaptureModule_GetIJsonExactionHelperRttiFactory.read) obj).MediaBrowserCompat$CustomActionResultReceiver((List<chain>) C3918xa6b222bb.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
                }
            };
            if (enumTypeAdapter2.RatingCompat != null) {
                r0.IconCompatParcelizer(enumTypeAdapter2.RatingCompat);
            }
        }
    }
}
