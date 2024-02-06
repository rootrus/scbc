package p040o;

import p040o.IdExtractor;
import p040o.Iterables;
import p040o.writeUInt64NoTag;
import p040o.zzca;

/* renamed from: o.isAspectRatioWithinLimits$MediaBrowserCompat$ItemReceiver */
public final class isAspectRatioWithinLimits$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<zzca.zza, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ isAspectRatioWithinLimits MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public isAspectRatioWithinLimits$MediaBrowserCompat$ItemReceiver(isAspectRatioWithinLimits isaspectratiowithinlimits) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = isaspectratiowithinlimits;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        zzca.zza zza = (zzca.zza) obj;
        onGetStartedClick.write((Object) zza, "etbCheckActiveCASA");
        this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver(Iterables.C35284.BANKING_SERVICES.name());
        boolean z = false;
        if (zza.read) {
            isAspectRatioWithinLimits isaspectratiowithinlimits = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C48134.MediaBrowserCompat$ItemReceiver;
            if (isaspectratiowithinlimits.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(isaspectratiowithinlimits.RatingCompat);
            }
        } else if (!zza.MediaBrowserCompat$ItemReceiver.isEmpty()) {
            final long j = zza.MediaBrowserCompat$ItemReceiver.get(0).AppCompatViewInflater;
            isAspectRatioWithinLimits isaspectratiowithinlimits2 = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<IdExtractor.C69112>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((IdExtractor.C69112) obj).MediaBrowserCompat$ItemReceiver(j);
                }
            };
            if (isaspectratiowithinlimits2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                r0.IconCompatParcelizer(isaspectratiowithinlimits2.RatingCompat);
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
