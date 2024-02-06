package p040o;

import p040o.CreditCard;
import p040o.RegularImmutableMap;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeCreateImageFromRaw */
public final /* synthetic */ class nativeCreateImageFromRaw implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ finalizePreviousNativeSession MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ releaseFileBuffer write;

    public /* synthetic */ nativeCreateImageFromRaw(releaseFileBuffer releasefilebuffer, finalizePreviousNativeSession finalizepreviousnativesession) {
        this.write = releasefilebuffer;
        this.MediaBrowserCompat$CustomActionResultReceiver = finalizepreviousnativesession;
    }

    public final void IconCompatParcelizer(Object obj) {
        finalizePreviousNativeSession finalizepreviousnativesession = this.MediaBrowserCompat$CustomActionResultReceiver;
        CreditCard.C11681 r2 = (CreditCard.C11681) obj;
        r2.IconCompatParcelizer();
        r2.MediaBrowserCompat$CustomActionResultReceiver();
        r2.write(RegularImmutableMap.Values.IconCompatParcelizer(finalizepreviousnativesession));
    }
}
