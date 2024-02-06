package p040o;

/* renamed from: o.PrepaidActivationCaseModule */
public final class PrepaidActivationCaseModule {
    public final RetrofitException IconCompatParcelizer;
    public final EntityMappingException MediaBrowserCompat$CustomActionResultReceiver;
    public final NsipPaymentCaseModule MediaBrowserCompat$ItemReceiver;
    private final EasycashLoanFeatureInfoCaseModule MediaDescriptionCompat;
    public final PrepaidTravelWalletCaseModule MediaMetadataCompat;
    public final PrepaidResetCaseModule RatingCompat;
    public final int read;
    public final EasycashMHMCDetailCaseModule write;

    public PrepaidActivationCaseModule() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrepaidActivationCaseModule)) {
            return false;
        }
        PrepaidActivationCaseModule prepaidActivationCaseModule = (PrepaidActivationCaseModule) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) prepaidActivationCaseModule.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) prepaidActivationCaseModule.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) prepaidActivationCaseModule.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) prepaidActivationCaseModule.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) prepaidActivationCaseModule.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) prepaidActivationCaseModule.IconCompatParcelizer) && this.read == prepaidActivationCaseModule.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) prepaidActivationCaseModule.write);
    }

    public final int hashCode() {
        EntityMappingException entityMappingException = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = entityMappingException != null ? entityMappingException.hashCode() : 0;
        NsipPaymentCaseModule nsipPaymentCaseModule = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = nsipPaymentCaseModule != null ? nsipPaymentCaseModule.hashCode() : 0;
        EasycashLoanFeatureInfoCaseModule easycashLoanFeatureInfoCaseModule = this.MediaDescriptionCompat;
        int hashCode3 = easycashLoanFeatureInfoCaseModule != null ? easycashLoanFeatureInfoCaseModule.hashCode() : 0;
        PrepaidTravelWalletCaseModule prepaidTravelWalletCaseModule = this.MediaMetadataCompat;
        int hashCode4 = prepaidTravelWalletCaseModule != null ? prepaidTravelWalletCaseModule.hashCode() : 0;
        PrepaidResetCaseModule prepaidResetCaseModule = this.RatingCompat;
        int hashCode5 = prepaidResetCaseModule != null ? prepaidResetCaseModule.hashCode() : 0;
        RetrofitException retrofitException = this.IconCompatParcelizer;
        int hashCode6 = retrofitException != null ? retrofitException.hashCode() : 0;
        int i2 = this.read;
        EasycashMHMCDetailCaseModule easycashMHMCDetailCaseModule = this.write;
        if (easycashMHMCDetailCaseModule != null) {
            i = easycashMHMCDetailCaseModule.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dimensions(statusBar=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", content=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", actionBar=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", windowInsets=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", windowVisibleFrameBounds=");
        sb.append(this.RatingCompat);
        sb.append(", display=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", windowFlags=");
        sb.append(this.read);
        sb.append(", bottomNavigationBar=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public PrepaidActivationCaseModule(EntityMappingException entityMappingException, NsipPaymentCaseModule nsipPaymentCaseModule, EasycashLoanFeatureInfoCaseModule easycashLoanFeatureInfoCaseModule, PrepaidTravelWalletCaseModule prepaidTravelWalletCaseModule, PrepaidResetCaseModule prepaidResetCaseModule, RetrofitException retrofitException, int i, EasycashMHMCDetailCaseModule easycashMHMCDetailCaseModule) {
        this.MediaBrowserCompat$CustomActionResultReceiver = entityMappingException;
        this.MediaBrowserCompat$ItemReceiver = nsipPaymentCaseModule;
        this.MediaDescriptionCompat = easycashLoanFeatureInfoCaseModule;
        this.MediaMetadataCompat = prepaidTravelWalletCaseModule;
        this.RatingCompat = prepaidResetCaseModule;
        this.IconCompatParcelizer = retrofitException;
        this.read = i;
        this.write = easycashMHMCDetailCaseModule;
    }

    private /* synthetic */ PrepaidActivationCaseModule(byte b) {
        this((EntityMappingException) null, (NsipPaymentCaseModule) null, (EasycashLoanFeatureInfoCaseModule) null, (PrepaidTravelWalletCaseModule) null, (PrepaidResetCaseModule) null, (RetrofitException) null, 0, (EasycashMHMCDetailCaseModule) null);
    }
}
