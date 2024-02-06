package p040o;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import p040o.zzmd;

@HmlSetNTBPinActivity
/* renamed from: o.notNull */
public final class notNull extends IndoorBuilding {
    private final setCvv MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public notNull(setCvv setcvv, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        onGetStartedClick.write((Object) setcvv, "loginRepositoryContractor");
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        this.MediaBrowserCompat$CustomActionResultReceiver = setcvv;
    }

    @HmlSetNTBPinActivity
    /* renamed from: o.notNull$read */
    public static final class read {
        public final SharedPreferences IconCompatParcelizer;
        public final Gson MediaBrowserCompat$CustomActionResultReceiver;

        private read() {
        }

        @HmlPinActivity
        public read(SharedPreferences sharedPreferences, Gson gson) {
            this.IconCompatParcelizer = sharedPreferences;
            this.MediaBrowserCompat$CustomActionResultReceiver = gson;
        }

        public final boolean read(setBearing setbearing) {
            if (setbearing == null) {
                return this.IconCompatParcelizer.edit().remove("com.scb.phone.PREF_KEY_NEW_CUSTOMER_USER_INFO").commit();
            }
            return this.IconCompatParcelizer.edit().putString("com.scb.phone.PREF_KEY_NEW_CUSTOMER_USER_INFO", this.MediaBrowserCompat$CustomActionResultReceiver.toJson((Object) setbearing)).commit();
        }
    }

    public final zzmd.zzm.zzb.zza IconCompatParcelizer() {
        String write = this.MediaBrowserCompat$CustomActionResultReceiver.write();
        if (write != null) {
            int hashCode = write.hashCode();
            if (hashCode == 438800025) {
                write.equals("INDIVIDUAL");
            } else if (hashCode == 664910589 && write.equals("JURISTIC")) {
                return zzmd.zzm.zzb.zza.JURISTIC;
            }
        }
        return zzmd.zzm.zzb.zza.INDIVIDUAL;
    }
}
