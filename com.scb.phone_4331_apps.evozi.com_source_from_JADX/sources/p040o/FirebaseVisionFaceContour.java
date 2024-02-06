package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionFaceContour */
public final /* synthetic */ class FirebaseVisionFaceContour implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ access$2200 read;
    private final /* synthetic */ constrainedMultiset write;

    public /* synthetic */ FirebaseVisionFaceContour(access$2200 access_2200, constrainedMultiset constrainedmultiset) {
        this.read = access_2200;
        this.write = constrainedmultiset;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getAddress5) obj).MediaBrowserCompat$ItemReceiver(this.read, this.write);
    }
}
