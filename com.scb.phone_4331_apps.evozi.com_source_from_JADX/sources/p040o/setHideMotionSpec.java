package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import p040o.zzfe;

/* renamed from: o.setHideMotionSpec */
public final class setHideMotionSpec extends any<read> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setHideMotionSpec(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, final getAncestor getancestor) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<read, DebitCardCoachMarkActivity>() {
            public final /* synthetic */ Object invoke(Object obj) {
                read read = (read) obj;
                onGetStartedClick.write((Object) read, "params");
                DebitCardCoachMarkActivity MediaBrowserCompat$CustomActionResultReceiver = getancestor.MediaBrowserCompat$CustomActionResultReceiver(read.MediaBrowserCompat$ItemReceiver, read.write, read.MediaBrowserCompat$CustomActionResultReceiver);
                onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "hmlRepo.putConsentDocume…onsentType, params.value)");
                return MediaBrowserCompat$CustomActionResultReceiver;
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getancestor, "hmlRepo");
    }

    /* renamed from: o.setHideMotionSpec$read */
    public static final class read implements C4602xca7af99c {
        final String MediaBrowserCompat$CustomActionResultReceiver;
        final zzfe.zza MediaBrowserCompat$ItemReceiver;
        final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read = (read) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) read.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) read.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) read.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            zzfe.zza zza = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = zza != null ? zza.hashCode() : 0;
            String str = this.write;
            int hashCode2 = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Params(documentType=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", subConsentType=");
            sb.append(this.write);
            sb.append(", value=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public read(zzfe.zza zza, String str, String str2) {
            onGetStartedClick.write((Object) zza, "documentType");
            onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.MediaBrowserCompat$ItemReceiver = zza;
            this.write = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }
    }
}
