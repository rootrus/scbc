package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import kotlin.NoWhenBranchMatchedException;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AccountTransferClient;
import p040o.AlertController$RecycleListView;
import p040o.CrashlyticsController;
import p040o.LottieComposition;
import p040o.SignedBytes;

/* renamed from: o.invert */
public final class invert extends SignedBytes.LexicographicalComparator {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public invert(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "baseAssetsURL");
    }

    /* renamed from: o.invert$read */
    public static final class read implements findFragmentByWho {
        private read() {
        }

        public /* synthetic */ read(AccountTransferClient.zzb zzb) {
        }

        public final Object IconCompatParcelizer(Object obj) {
            LottieComposition.Factory.ListenerAdapter listenerAdapter = (LottieComposition.Factory.ListenerAdapter) obj;
            setSnippet setsnippet = new setSnippet();
            setsnippet.read = listenerAdapter.MediaBrowserCompat$ItemReceiver;
            setsnippet.MediaBrowserCompat$ItemReceiver = listenerAdapter.MediaBrowserCompat$CustomActionResultReceiver;
            setsnippet.MediaBrowserCompat$CustomActionResultReceiver = listenerAdapter.write;
            setsnippet.write = listenerAdapter.IconCompatParcelizer;
            return setsnippet;
        }
    }

    /* access modifiers changed from: package-private */
    public final CrashlyticsController.SendReportRunnable MediaBrowserCompat$ItemReceiver(fromIntent fromintent) {
        OffsetDateTime offsetDateTime = fromintent.IconCompatParcelizer;
        String str = null;
        String read2 = AlertController$RecycleListView.read.read(offsetDateTime != null ? this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_my_insurance_due_date, new Object[]{IconCompatParcelizer("dd MMM", offsetDateTime)}) : null, "-");
        Double d = fromintent.write;
        String read3 = AlertController$RecycleListView.read.read(d != null ? write(Double.valueOf(d.doubleValue())) : null, "-");
        String read4 = AlertController$RecycleListView.read.read(fromintent.MediaMetadataCompat, "-");
        int i = getForIndex.write[fromintent.f2822x50fd9e4a.ordinal()];
        if (i == 1) {
            String read5 = AlertController$RecycleListView.read.read(fromintent.setHasDecor, "-");
            String read6 = AlertController$RecycleListView.read.read(fromintent.PlaybackStateCompat$CustomAction, "-");
            String read7 = AlertController$RecycleListView.read.read(fromintent.MediaBrowserCompat$CustomActionResultReceiver, "-");
            Double d2 = fromintent.Keep;
            if (d2 != null) {
                str = write(Double.valueOf(d2.doubleValue()));
            }
            return new CrashlyticsController.LogFileDirectoryProvider(read5, read6, read7, AlertController$RecycleListView.read.read(str, "-"), read3, read2, read3, read4);
        } else if (i == 2 || i == 3) {
            return new getLogFileDir(read2, read3, read4);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
