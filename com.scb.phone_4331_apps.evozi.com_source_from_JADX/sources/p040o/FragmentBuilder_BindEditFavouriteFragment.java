package p040o;

import android.graphics.Bitmap;
import java.util.List;
import p040o.ServerProjectProvider;
import p040o.notNull;
import p040o.zzfd;

/* renamed from: o.FragmentBuilder_BindEditFavouriteFragment */
public interface FragmentBuilder_BindEditFavouriteFragment {
    Bitmap MediaBrowserCompat$CustomActionResultReceiver(String str);

    void MediaBrowserCompat$ItemReceiver(String str);

    int RatingCompat();

    int write();

    void write(String str, Bitmap bitmap);

    /* renamed from: o.FragmentBuilder_BindEditFavouriteFragment$5 */
    public static final class C65275 implements FragmentBuilder_BindEditFavouriteFragment, ServerProjectProvider.C706515 {
        private final notNull.read IconCompatParcelizer;
        private final eH$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver;
        public final zak MediaBrowserCompat$ItemReceiver;
        public final count$MediaBrowserCompat$CustomActionResultReceiver read;

        public final Bitmap MediaBrowserCompat$CustomActionResultReceiver(String str) {
            return null;
        }

        public final void MediaBrowserCompat$ItemReceiver(String str) {
        }

        public final int RatingCompat() {
            return 0;
        }

        public final int write() {
            return 0;
        }

        public final void write(String str, Bitmap bitmap) {
        }

        C65275() {
        }

        @HmlPinActivity
        public C65275(eH$MediaBrowserCompat$CustomActionResultReceiver eh_mediabrowsercompat_customactionresultreceiver, zak zak, notNull.read read2, count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = eh_mediabrowsercompat_customactionresultreceiver;
            this.MediaBrowserCompat$ItemReceiver = zak;
            this.IconCompatParcelizer = read2;
            this.read = count_mediabrowsercompat_customactionresultreceiver;
        }

        public final DebitCardResetOtpActivity<List<EasycashHeaderAdapter$LoanHeaderViewHolder>> MediaBrowserCompat$ItemReceiver() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.read.getIntroductions().map(new zzfd.zzc(this.MediaBrowserCompat$ItemReceiver));
        }

        public final setBearing read() {
            notNull.read read2 = this.IconCompatParcelizer;
            return (setBearing) read2.MediaBrowserCompat$CustomActionResultReceiver.fromJson(read2.IconCompatParcelizer.getString("com.scb.phone.PREF_KEY_NEW_CUSTOMER_USER_INFO", (String) null), setBearing.class);
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
            return this.IconCompatParcelizer.IconCompatParcelizer.getBoolean("com.scb.phone.PREF_KEY_NEW_CUSTOMER_VIEW_KYC_COACH_MARK", false);
        }

        public final DebitCardResetOtpActivity<List<EasycashHeaderAdapter$LoanHeaderViewHolder>> MediaBrowserCompat$CustomActionResultReceiver(rowMap rowmap) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.read.postUserProfile(rowmap).flatMap(zaab.MediaBrowserCompat$CustomActionResultReceiver).doOnNext(new MurmurHash3(this)).map(new murmurhash3_x86_32(this));
        }

        public final void read(setBearing setbearing) {
            this.IconCompatParcelizer.read(setbearing);
        }

        public final void IconCompatParcelizer() {
            this.IconCompatParcelizer.IconCompatParcelizer.edit().putBoolean("com.scb.phone.PREF_KEY_NEW_CUSTOMER_VIEW_KYC_COACH_MARK", true).commit();
        }
    }
}
