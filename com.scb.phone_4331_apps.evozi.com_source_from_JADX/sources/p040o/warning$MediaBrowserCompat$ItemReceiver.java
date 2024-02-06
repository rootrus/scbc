package p040o;

import p040o.LottieDrawable;

/* renamed from: o.warning$MediaBrowserCompat$ItemReceiver */
public final class warning$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<LottieDrawable.C36224, setDataCollectionEnabled> {
    public static final warning$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new warning$MediaBrowserCompat$ItemReceiver();

    warning$MediaBrowserCompat$ItemReceiver() {
        super(1);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        LottieDrawable.C36224 r4 = (LottieDrawable.C36224) obj;
        onGetStartedClick.write((Object) r4, "it");
        C5290xc2e3dd44 setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver = new C5290xc2e3dd44((byte) 0);
        setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = r4.MediaBrowserCompat$CustomActionResultReceiver;
        setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.read = r4.MediaBrowserCompat$ItemReceiver;
        setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.write = r4.read;
        setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver = r4.MediaBrowserCompat$MediaItem;
        setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = r4.write;
        setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = r4.IconCompatParcelizer;
        return new setDataCollectionEnabled(setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver, (byte) 0);
    }
}
