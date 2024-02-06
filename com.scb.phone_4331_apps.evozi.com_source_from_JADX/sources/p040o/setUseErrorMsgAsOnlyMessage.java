package p040o;

import p040o.ByteStreams;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.setUseErrorMsgAsOnlyMessage */
public final class setUseErrorMsgAsOnlyMessage extends writeUInt64NoTag<PassportCaptureModule> {
    public final TabItem MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final ByteStreams.C31375 read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setUseErrorMsgAsOnlyMessage(RegularImmutableBiMap regularImmutableBiMap, TabItem tabItem, ByteStreams.C31375 r4) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) tabItem, "hmlGetStoredExpiryDateCase");
        onGetStartedClick.write((Object) r4, "dateDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = tabItem;
        this.read = r4;
    }

    /* renamed from: o.setUseErrorMsgAsOnlyMessage$write */
    public static final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<String> {
        final /* synthetic */ setUseErrorMsgAsOnlyMessage MediaBrowserCompat$CustomActionResultReceiver;

        public write(setUseErrorMsgAsOnlyMessage setuseerrormsgasonlymessage) {
            this.MediaBrowserCompat$CustomActionResultReceiver = setuseerrormsgasonlymessage;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "date");
            super.onNext(str);
            setUseErrorMsgAsOnlyMessage setuseerrormsgasonlymessage = this.MediaBrowserCompat$CustomActionResultReceiver;
            writeUInt64NoTag.IconCompatParcelizer setuseerrormsgasonlymessage_write_mediabrowsercompat_customactionresultreceiver = new C5387x29aa4e93(this, str);
            if (setuseerrormsgasonlymessage.RatingCompat != null) {
                setuseerrormsgasonlymessage_write_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(setuseerrormsgasonlymessage.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            super.onError(th);
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }
}
