package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.showHighlights */
public final /* synthetic */ class showHighlights implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ jsonToUserData MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ LevelnessListener write;

    public /* synthetic */ showHighlights(LevelnessListener levelnessListener, jsonToUserData jsontouserdata) {
        this.write = levelnessListener;
        this.MediaBrowserCompat$CustomActionResultReceiver = jsontouserdata;
    }

    public final void IconCompatParcelizer(Object obj) {
        LevelnessListener levelnessListener = this.write;
        jsonToUserData jsontouserdata = this.MediaBrowserCompat$CustomActionResultReceiver;
        newPassportParameters newpassportparameters = (newPassportParameters) obj;
        newpassportparameters.MediaBrowserCompat$ItemReceiver(jsontouserdata.write);
        newpassportparameters.IconCompatParcelizer(jsontouserdata.MediaBrowserCompat$ItemReceiver);
        newpassportparameters.IconCompatParcelizer(levelnessListener.write.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
