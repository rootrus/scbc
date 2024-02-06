package p040o;

import p040o.PlaceFilter;
import p040o.ReportUploader;

/* renamed from: o.writeSessionEventDevice */
public final /* synthetic */ class writeSessionEventDevice implements FundFactSheetActivity {
    private final /* synthetic */ getSettingsFile MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ writeSessionEventDevice(getSettingsFile getsettingsfile) {
        this.MediaBrowserCompat$ItemReceiver = getsettingsfile;
    }

    public final Object invoke(Object obj) {
        boolean z;
        PlaceFilter.zzb zzb;
        getSettingsFile getsettingsfile = this.MediaBrowserCompat$ItemReceiver;
        FileLogStore fileLogStore = (FileLogStore) obj;
        boolean z2 = true;
        if (fileLogStore.read) {
            String str = fileLogStore.write;
            if (!(str == null || str.length() == 0)) {
                zzwi MediaBrowserCompat$CustomActionResultReceiver = getsettingsfile.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
                if (MediaBrowserCompat$CustomActionResultReceiver == null || (zzb = MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper) == null) {
                    z = false;
                } else {
                    z = zzb.MediaMetadataCompat;
                }
                if (z) {
                    lambda$sendReport$1 lambda_sendreport_1 = lambda$sendReport$1.read;
                    if (getsettingsfile.RatingCompat == null) {
                        z2 = false;
                    }
                    if (z2) {
                        lambda_sendreport_1.IconCompatParcelizer(getsettingsfile.RatingCompat);
                    }
                    return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
            }
        }
        ReportUploader.Provider provider = ReportUploader.Provider.MediaBrowserCompat$CustomActionResultReceiver;
        if (getsettingsfile.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            provider.IconCompatParcelizer(getsettingsfile.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
