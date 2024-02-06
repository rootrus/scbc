package p040o;

import p040o.access$2300;

/* renamed from: o.setTorchListener */
public final /* synthetic */ class setTorchListener implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ setBoolValue read;

    public /* synthetic */ setTorchListener(setBoolValue setboolvalue) {
        this.read = setboolvalue;
    }

    public final void IconCompatParcelizer(Object obj) {
        setBoolValue setboolvalue = this.read;
        Throwable th = (Throwable) obj;
        boolean z = true;
        if (setboolvalue.RatingCompat != null) {
            setboolvalue.RatingCompat.aj_();
        }
        if (writeUInt64NoTag.read(th)) {
            setboolvalue.MediaBrowserCompat$ItemReceiver(setboolvalue.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
        } else if (setboolvalue.MediaBrowserCompat$SearchResultReceiver(th)) {
            setboolvalue.MediaBrowserCompat$ItemReceiver(setboolvalue.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        } else {
            setTorchOff settorchoff = new setTorchOff(setboolvalue, th);
            if (setboolvalue.RatingCompat == null) {
                z = false;
            }
            if (z) {
                settorchoff.IconCompatParcelizer(setboolvalue.RatingCompat);
            }
        }
    }
}
