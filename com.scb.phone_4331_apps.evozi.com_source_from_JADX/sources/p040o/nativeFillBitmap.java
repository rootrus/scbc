package p040o;

import p040o.RegularImmutableMap;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeFillBitmap */
public final /* synthetic */ class nativeFillBitmap implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ releaseFileBuffer IconCompatParcelizer;
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ nativeFillBitmap(releaseFileBuffer releasefilebuffer, int i) {
        this.IconCompatParcelizer = releasefilebuffer;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        releaseFileBuffer releasefilebuffer = this.IconCompatParcelizer;
        boolean z = false;
        if (this.MediaBrowserCompat$CustomActionResultReceiver == 1) {
            nativeAllocateFileBuffer nativeallocatefilebuffer = new nativeAllocateFileBuffer(RegularImmutableMap.Values.IconCompatParcelizer(releasefilebuffer.read));
            if (releasefilebuffer.RatingCompat != null) {
                z = true;
            }
            if (z) {
                nativeallocatefilebuffer.IconCompatParcelizer(releasefilebuffer.RatingCompat);
                return;
            }
            return;
        }
        finalizePreviousNativeSession finalizepreviousnativesession = releasefilebuffer.read;
        initImage initimage = new initImage(finalizepreviousnativesession == null || !finalizepreviousnativesession.IconCompatParcelizer);
        if (releasefilebuffer.RatingCompat != null) {
            z = true;
        }
        if (z) {
            initimage.IconCompatParcelizer(releasefilebuffer.RatingCompat);
        }
    }
}
