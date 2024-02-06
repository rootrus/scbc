package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import java.text.NumberFormat;
import java.util.Locale;
import okhttp3.internal.cache.DiskLruCache;
import p040o.Futures;
import p040o.SignedBytes;

/* renamed from: o.entriesOnlyOnLeft */
public class entriesOnlyOnLeft extends SignedBytes.LexicographicalComparator {
    @HmlPinActivity
    entriesOnlyOnLeft(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
    }

    public final Futures.C34051 MediaBrowserCompat$CustomActionResultReceiver(zzvn zzvn, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        Futures.C34051 MediaBrowserCompat$CustomActionResultReceiver = Futures.C34051.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = zzvn.read;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = zzvn.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.AppCompatDialogFragment = write(zzvn.PlaybackStateCompat$CustomAction);
        MediaBrowserCompat$CustomActionResultReceiver.AppCompatDelegateImpl$ListMenuDecorView = zzvn.setContentView != null ? String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.account_summary_loan_payment_due), new Object[]{IconCompatParcelizer("dd MMM", zzvn.setContentView)}) : String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.account_summary_loan_payment_due), new Object[]{zzvn.setContentView});
        MediaBrowserCompat$CustomActionResultReceiver.setExpandedFormat = zzvn.setContentView != null ? String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.due), new Object[]{IconCompatParcelizer("dd MMM", zzvn.setContentView)}) : String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.loan_detail_due), new Object[]{zzvn.setContentView});
        MediaBrowserCompat$CustomActionResultReceiver.AppCompatViewInflater = write(zzvn.setBackgroundResource);
        MediaBrowserCompat$CustomActionResultReceiver.setPopupCallback = write(zzvn.ActionMenuItemView);
        MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat = write(zzvn.setHasDecor);
        MediaBrowserCompat$CustomActionResultReceiver.setCheckable = MediaBrowserCompat$ItemReceiver(zzvn.setHasDecor, zzvn.ActionMenuItemView);
        MediaBrowserCompat$CustomActionResultReceiver.read = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(zzvn.MediaBrowserCompat$CustomActionResultReceiver, z);
        MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = write(zzvn.MediaBrowserCompat$ItemReceiver);
        String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.percentage_format);
        Double d = zzvn.MediaMetadataCompat;
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        currencyInstance.setMinimumFractionDigits(2);
        currencyInstance.setMaximumFractionDigits(2);
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = String.format(string, new Object[]{getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(d), this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.percentage)});
        if (TextUtils.isEmpty(zzvn.AppCompatViewInflater) || !DiskLruCache.VERSION_1.equals(zzvn.AppCompatViewInflater)) {
            str = String.valueOf(zzvn.MediaBrowserCompat$SearchResultReceiver);
        } else {
            str = "-";
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem = str;
        MediaBrowserCompat$CustomActionResultReceiver.setItemInvoker = String.valueOf(zzvn.AppCompatActivity);
        String str5 = "error";
        if (zzvn.IconCompatParcelizer() != null) {
            str2 = zzvn.IconCompatParcelizer().MediaBrowserCompat$ItemReceiver;
        } else {
            str2 = str5;
        }
        MediaBrowserCompat$CustomActionResultReceiver.write = Boolean.valueOf("1000".equals(str2)).booleanValue();
        if (zzvn.IconCompatParcelizer() != null) {
            str5 = zzvn.IconCompatParcelizer().MediaBrowserCompat$ItemReceiver;
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = "1001".equals(str5);
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper = zzvn.MediaBrowserCompat$MediaItem;
        int i = C43804.read[zzvn.RatingCompat.ordinal()];
        MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "commercial" : "speedy" : "mortgage" : "carloan";
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = Iterables$3$MediaBrowserCompat$ItemReceiver.ic_loan_default;
        MediaBrowserCompat$CustomActionResultReceiver.setHasDecor = zzvn.ParcelableVolumeInfo;
        if (!TextUtils.isEmpty(zzvn.MediaSessionCompat$ResultReceiverWrapper)) {
            str3 = zzvn.MediaSessionCompat$ResultReceiverWrapper;
        } else {
            str3 = "";
        }
        MediaBrowserCompat$CustomActionResultReceiver.AlertController$RecycleListView = str3;
        MediaBrowserCompat$CustomActionResultReceiver.setChecked = mo26549c_(zzvn.AppCompatDialogFragment);
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = mo26549c_(zzvn.write);
        MediaBrowserCompat$CustomActionResultReceiver.Keep = zzvn.MediaSessionCompat$QueueItem;
        MediaBrowserCompat$CustomActionResultReceiver.setPadding = zzvn.setCheckable;
        MediaBrowserCompat$CustomActionResultReceiver.ActionMenuItemView = zzvn.AppCompatDelegateImpl$ListMenuDecorView;
        MediaBrowserCompat$CustomActionResultReceiver.f2711x50fd9e4a = zzvn.MediaDescriptionCompat;
        if (zzvn.f3001x50fd9e4a == null) {
            str4 = "0.00";
        } else {
            str4 = write(zzvn.f3001x50fd9e4a);
        }
        MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat$CustomAction = str4;
        MediaBrowserCompat$CustomActionResultReceiver.setBackgroundResource = zzvn.PlaybackStateCompat;
        MediaBrowserCompat$CustomActionResultReceiver.setContentView = zzvn.Keep;
        MediaBrowserCompat$CustomActionResultReceiver.AppCompatActivity = zzvn.AlertController$RecycleListView;
        if (!TextUtils.isEmpty(zzvn.MediaSessionCompat$Token)) {
            MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = zzvn.MediaSessionCompat$Token;
        } else if (!TextUtils.isEmpty(zzvn.MediaBrowserCompat$MediaItem)) {
            MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = zzvn.MediaBrowserCompat$MediaItem;
        } else {
            MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = "";
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = Iterables$3$MediaBrowserCompat$ItemReceiver.ic_loan_detail_default;
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* renamed from: o.entriesOnlyOnLeft$4 */
    static /* synthetic */ class C43804 {
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.zzvu[] r0 = p040o.zzvu.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                o.zzvu r1 = p040o.zzvu.CAR_LOAN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.zzvu r1 = p040o.zzvu.MORTGAGE_LOAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.zzvu r1 = p040o.zzvu.SPEEDY_LOAN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.zzvu r1 = p040o.zzvu.COMMERCIAL_LOAN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.entriesOnlyOnLeft.C43804.<clinit>():void");
        }
    }
}
