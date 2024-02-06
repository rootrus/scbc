package p040o;

import com.scb.phone.data.network.service.easycash.EasycashEligibilityService;

/* renamed from: o.zzgv */
public final class zzgv implements subMap {
    private final String MediaBrowserCompat$ItemReceiver;
    private final EasycashEligibilityService read;

    /* renamed from: o.zzgv$write */
    static final class write<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        public static final write read = new write();

        write() {
        }

        public final /* bridge */ /* synthetic */ Object write(Object obj) {
            onGetStartedClick.write((Object) (setCurrentItemInternal) obj, "it");
            return Boolean.TRUE;
        }
    }

    @HmlPinActivity
    public zzgv(EasycashEligibilityService easycashEligibilityService, String str) {
        onGetStartedClick.write((Object) easycashEligibilityService, "service");
        onGetStartedClick.write((Object) str, "tilesVersion");
        this.read = easycashEligibilityService;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final BScanCNotificationDeepLinkActivity<Boolean> read(String str, String str2) {
        onGetStartedClick.write((Object) str, "productType");
        onGetStartedClick.write((Object) str2, "flowType");
        BScanCNotificationDeepLinkActivity<setCurrentItemInternal> validateSpeedyLoanEligibility = this.read.validateSpeedyLoanEligibility(str, this.MediaBrowserCompat$ItemReceiver, str2);
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = write.read;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(validateSpeedyLoanEligibility, directDebitDeepLinkActivity);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "service.validateSpeedyLo…            .map { true }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<Boolean> write(String str, String str2) {
        onGetStartedClick.write((Object) str, "productType");
        onGetStartedClick.write((Object) str2, "flowType");
        BScanCNotificationDeepLinkActivity<setCurrentItemInternal> validateCardEligibility = this.read.validateCardEligibility(str, this.MediaBrowserCompat$ItemReceiver, str2);
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = zzgv$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(validateCardEligibility, directDebitDeepLinkActivity);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "service.validateCardElig…            .map { true }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<Boolean> IconCompatParcelizer(String str, String str2) {
        onGetStartedClick.write((Object) str, "productType");
        onGetStartedClick.write((Object) str2, "flowType");
        BScanCNotificationDeepLinkActivity<setCurrentItemInternal> validateMCMCEligibility = this.read.validateMCMCEligibility(str, this.MediaBrowserCompat$ItemReceiver, str2);
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = zzgv$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(validateMCMCEligibility, directDebitDeepLinkActivity);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "service.validateMCMCElig…            .map { true }");
        return oncopy;
    }
}
