package p040o;

import p040o.Callables;

/* renamed from: o.returning */
public final /* synthetic */ class returning implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ Callables.C31391 IconCompatParcelizer;
    private final /* synthetic */ boolean read;

    public /* synthetic */ returning(Callables.C31391 r1, boolean z) {
        this.IconCompatParcelizer = r1;
        this.read = z;
    }

    public final boolean write(Object obj) {
        setMyLocationButtonEnabled setmylocationbuttonenabled = (setMyLocationButtonEnabled) obj;
        return (setmylocationbuttonenabled.MediaMetadataCompat == null || setmylocationbuttonenabled.MediaMetadataCompat.write == null || this.read != "1000".equals(setmylocationbuttonenabled.MediaMetadataCompat.write)) ? false : true;
    }
}
