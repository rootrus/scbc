package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nB$MediaBrowserCompat$MediaItem */
public final class nB$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<setFaceLeftPadding> {
    private /* synthetic */ boolean IconCompatParcelizer;
    private /* synthetic */ C4997nB MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ C3088x7e3e3ebd MediaBrowserCompat$ItemReceiver;

    public nB$MediaBrowserCompat$MediaItem(C4997nB nBVar, C3088x7e3e3ebd autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = nBVar;
        this.MediaBrowserCompat$ItemReceiver = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread;
        this.IconCompatParcelizer = z;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        setFaceLeftPadding setfaceleftpadding = (setFaceLeftPadding) obj;
        if (C4997nB.RatingCompat(this.MediaBrowserCompat$CustomActionResultReceiver).RatingCompat) {
            setAddress setaddress = C4997nB.RatingCompat(this.MediaBrowserCompat$CustomActionResultReceiver).MediaSessionCompat$Token;
            if (setaddress != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.write = setaddress;
                setfaceleftpadding.MediaBrowserCompat$ItemReceiver();
                setfaceleftpadding.MediaBrowserCompat$ItemReceiver(C4997nB.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver), this.MediaBrowserCompat$ItemReceiver);
                setfaceleftpadding.IconCompatParcelizer();
                if (this.IconCompatParcelizer) {
                    setfaceleftpadding.MediaBrowserCompat$CustomActionResultReceiver();
                    return;
                }
                return;
            }
            return;
        }
        setfaceleftpadding.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
    }
}
