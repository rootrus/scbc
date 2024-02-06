package p040o;

import p040o.C4193ck;

/* renamed from: o.bP */
public final /* synthetic */ class C4075bP implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ C4193ck IconCompatParcelizer;

    public /* synthetic */ C4075bP(C4193ck ckVar) {
        this.IconCompatParcelizer = ckVar;
    }

    public final boolean write(Object obj) {
        boolean z;
        C4193ck ckVar = this.IconCompatParcelizer;
        setGenerator setgenerator = (setGenerator) obj;
        if (setgenerator == null) {
            return false;
        }
        if (!(setgenerator instanceof setCrashed)) {
            return true;
        }
        getGeoDataClient IconCompatParcelizer2 = getGeoDataClient.IconCompatParcelizer(setgenerator.MediaMetadataCompat.MediaSessionCompat$ResultReceiverWrapper);
        if (IconCompatParcelizer2 == null) {
            return false;
        }
        int i = C4193ck.C41942.MediaBrowserCompat$ItemReceiver[IconCompatParcelizer2.ordinal()];
        if (i == 1) {
            z = ckVar.read.MediaBrowserCompat$CustomActionResultReceiver();
        } else if (i != 2) {
            z = i == 3 || i == 4;
        } else {
            z = ckVar.read.read();
        }
        if (z) {
            return true;
        }
        return false;
    }
}
