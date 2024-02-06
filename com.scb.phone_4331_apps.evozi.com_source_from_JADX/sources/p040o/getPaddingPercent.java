package p040o;

import p040o.MicrParser;
import p040o.PlaceFilter;

/* renamed from: o.getPaddingPercent */
public final /* synthetic */ class getPaddingPercent implements FundFactSheetActivity {
    private final /* synthetic */ C10829Sizeof read;

    public /* synthetic */ getPaddingPercent(C10829Sizeof sizeof) {
        this.read = sizeof;
    }

    public final Object invoke(Object obj) {
        boolean z;
        PlaceFilter.zzb zzb;
        C10829Sizeof sizeof = this.read;
        FileLogStore fileLogStore = (FileLogStore) obj;
        boolean z2 = true;
        if (fileLogStore.read) {
            String str = fileLogStore.write;
            if (!(str == null || str.length() == 0)) {
                zzwi MediaBrowserCompat$CustomActionResultReceiver = sizeof.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
                if (MediaBrowserCompat$CustomActionResultReceiver == null || (zzb = MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper) == null) {
                    z = false;
                } else {
                    z = zzb.MediaMetadataCompat;
                }
                if (z) {
                    fit fit = fit.write;
                    if (sizeof.RatingCompat == null) {
                        z2 = false;
                    }
                    if (z2) {
                        fit.IconCompatParcelizer(sizeof.RatingCompat);
                    }
                    return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
            }
        }
        MicrParser.C36571 r5 = MicrParser.C36571.MediaBrowserCompat$CustomActionResultReceiver;
        if (sizeof.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            r5.IconCompatParcelizer(sizeof.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
