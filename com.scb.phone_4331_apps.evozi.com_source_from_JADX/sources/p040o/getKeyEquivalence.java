package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import org.threeten.p041bp.OffsetDateTime;
import p040o.zzxc;

/* renamed from: o.getKeyEquivalence */
public final class getKeyEquivalence extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getKeyEquivalence(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    /* renamed from: o.getKeyEquivalence$read */
    public static final class read implements findFragmentByWho {
        private final /* synthetic */ newTaskFor MediaBrowserCompat$CustomActionResultReceiver;

        private read() {
        }

        public /* synthetic */ read(newTaskFor newtaskfor) {
            this.MediaBrowserCompat$CustomActionResultReceiver = newtaskfor;
        }

        public final Object IconCompatParcelizer(Object obj) {
            return FragmentBuilder_BindSummaryFragment.write((String) obj, (OffsetDateTime) null);
        }
    }

    public final endTask MediaBrowserCompat$ItemReceiver(zzxc.zzc zzc) {
        String str;
        onGetStartedClick.write((Object) zzc, "qrBarcode");
        String str2 = "";
        if (zzc.MediaBrowserCompat$CustomActionResultReceiver == null) {
            str = str2;
        } else {
            str = IconCompatParcelizer("dd MMM yyyy", zzc.MediaBrowserCompat$CustomActionResultReceiver);
        }
        if (zzc.MediaBrowserCompat$CustomActionResultReceiver != null) {
            str2 = IconCompatParcelizer("HH:mm", zzc.MediaBrowserCompat$CustomActionResultReceiver);
        }
        int i = zzc.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) str, "date");
        onGetStartedClick.IconCompatParcelizer((Object) str2, "time");
        String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.banking_generate_qr_expire_message, new Object[]{Integer.valueOf(i), str, str2});
        onGetStartedClick.IconCompatParcelizer((Object) string, "getExpiredTimeMessage(qr…alidDuration, date, time)");
        return new endTask(string, (long) (((zzc.IconCompatParcelizer * 60) * 1000) - 20000), zzc.read, zzc.write);
    }
}
