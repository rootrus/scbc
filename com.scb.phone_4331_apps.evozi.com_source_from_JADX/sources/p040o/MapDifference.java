package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import p040o.Futures;
import p040o.MapConstraints;
import p040o.SignedBytes;

/* renamed from: o.MapDifference */
public final class MapDifference extends SignedBytes.LexicographicalComparator {

    /* renamed from: o.MapDifference$ValueDifference */
    public class ValueDifference extends constrainedSetMultimap<TouchPointInstructionActivity, Futures.C34104> {
        private final String MediaBrowserCompat$ItemReceiver;

        @HmlPinActivity
        public ValueDifference(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str) {
            super(resources, sharedPreferences);
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final Futures.C34104 read(setBearing setbearing) {
            if (setbearing == null) {
                return Futures.C34104.read();
            }
            Futures.C34104 read = Futures.C34104.read();
            read.MediaBrowserCompat$CustomActionResultReceiver = setbearing.IconCompatParcelizer;
            read.RatingCompat = setbearing.write;
            read.read = MediaBrowserCompat$ItemReceiver();
            return read;
        }

        public static String read(TouchPointInstructionActivity touchPointInstructionActivity) {
            StringBuilder sb = new StringBuilder();
            sb.append(touchPointInstructionActivity.write);
            if (!TextUtils.isEmpty(touchPointInstructionActivity.MediaBrowserCompat$ItemReceiver)) {
                sb.append(" ");
                sb.append(touchPointInstructionActivity.MediaBrowserCompat$ItemReceiver);
            }
            sb.append(" ");
            sb.append(touchPointInstructionActivity.read);
            return sb.toString();
        }

        /* renamed from: write */
        public final Futures.C34104 MediaBrowserCompat$ItemReceiver(TouchPointInstructionActivity touchPointInstructionActivity) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(touchPointInstructionActivity.write);
            if (!TextUtils.isEmpty(touchPointInstructionActivity.MediaBrowserCompat$ItemReceiver)) {
                sb.append(" ");
                sb.append(touchPointInstructionActivity.MediaBrowserCompat$ItemReceiver);
            }
            sb.append("\n");
            if (!TextUtils.isEmpty(touchPointInstructionActivity.read)) {
                sb.append(touchPointInstructionActivity.read);
            }
            String obj = sb.toString();
            Futures.C34104 read = Futures.C34104.read();
            String str2 = touchPointInstructionActivity.IconCompatParcelizer;
            if (TextUtils.isEmpty(str2)) {
                str = "";
            } else {
                str = this.write.getString("BASE_URL", this.MediaBrowserCompat$ItemReceiver).concat("v1/").concat(str2.substring(1));
            }
            read.MediaBrowserCompat$ItemReceiver = str;
            read.RatingCompat = touchPointInstructionActivity.write;
            read.IconCompatParcelizer = obj;
            read.read = MediaBrowserCompat$ItemReceiver();
            return read;
        }
    }

    @HmlPinActivity
    public MapDifference(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
    }

    private static String write(String str, BigDecimal bigDecimal) {
        String write = write(Double.valueOf(bigDecimal != null ? bigDecimal.doubleValue() : 0.0d));
        if (str == null || str.length() <= 0) {
            return write;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(write);
        return sb.toString();
    }

    public final Futures.ChainingListenableFuture IconCompatParcelizer(zzvy zzvy) {
        String str;
        String str2;
        double d;
        double d2;
        double d3;
        double d4;
        String str3;
        double d5;
        String str4;
        String str5;
        double d6;
        double d7;
        double d8;
        double d9;
        String str6;
        String str7;
        double d10;
        double d11;
        double d12;
        String str8;
        int i;
        String str9;
        int i2;
        double d13;
        String str10;
        zzvy zzvy2 = zzvy;
        if (zzvy2.MediaBrowserCompat$ItemReceiver != null && !zzvy2.MediaBrowserCompat$ItemReceiver.isEmpty()) {
            str = zzvy2.MediaBrowserCompat$ItemReceiver;
        } else if (zzvy2.MediaSessionCompat$ResultReceiverWrapper == null || zzvy2.MediaSessionCompat$ResultReceiverWrapper.isEmpty()) {
            str = "";
        } else {
            str = zzvy2.MediaSessionCompat$ResultReceiverWrapper;
        }
        String str11 = zzvy2.setChecked;
        char c = 65535;
        int hashCode = str11.hashCode();
        if (hashCode != 2427) {
            if (hashCode != 2558) {
                if (hashCode == 159567045 && str11.equals("COMMERCIAL_LOAN")) {
                    c = 0;
                }
            } else if (str11.equals("PN")) {
                c = 1;
            }
        } else if (str11.equals("LG")) {
            c = 2;
        }
        if (c == 0) {
            String str12 = "";
            String str13 = "error";
            String str14 = zzvy2.setChecked;
            String str15 = zzvy2.MediaSessionCompat$ResultReceiverWrapper;
            int i3 = zzvy2.AppCompatViewInflater;
            String c_ = mo26549c_(zzvy2.setCheckable);
            if (str.isEmpty()) {
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.sme_loan_commercial_nickname);
            }
            String str16 = str;
            String str17 = zzvy2.read;
            String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.account_summary_loan_payment_due);
            Object[] objArr = new Object[1];
            if (zzvy2.AppCompatDialogFragment != null) {
                str2 = IconCompatParcelizer("dd MMM", zzvy2.AppCompatDialogFragment);
            } else {
                str2 = str12;
            }
            objArr[0] = str2;
            String format = String.format(string, objArr);
            if (zzvy2.setBackgroundResource != null) {
                d = zzvy2.setBackgroundResource.doubleValue();
            } else {
                d = 0.0d;
            }
            String write = write(Double.valueOf(d));
            String str18 = zzvy2.AlertController$RecycleListView;
            String str19 = zzvy2.setPadding;
            if (zzvy2.AppCompatDelegateImpl$ListMenuDecorView != null) {
                d2 = zzvy2.AppCompatDelegateImpl$ListMenuDecorView.doubleValue();
            } else {
                d2 = 0.0d;
            }
            String write2 = write(Double.valueOf(d2));
            if (zzvy2.setShortcut != null) {
                d3 = zzvy2.setShortcut.doubleValue();
            } else {
                d3 = 0.0d;
            }
            String write3 = write(Double.valueOf(d3));
            int intValue = (zzvy2.AppCompatDelegateImpl$ListMenuDecorView == null || zzvy2.setShortcut == null) ? 0 : MediaBrowserCompat$CustomActionResultReceiver(Double.valueOf(zzvy2.AppCompatDelegateImpl$ListMenuDecorView.doubleValue()), Double.valueOf(zzvy2.setShortcut.doubleValue())).intValue();
            String string2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.sme_loan_commercial_outstanding_title);
            if (zzvy2.PlaybackStateCompat != null) {
                d4 = zzvy2.PlaybackStateCompat.doubleValue();
            } else {
                d4 = 0.0d;
            }
            String write4 = write(Double.valueOf(d4));
            boolean z = zzvy2.AppCompatActivity;
            if (zzvy2.MediaBrowserCompat$CustomActionResultReceiver != null) {
                str3 = mo26549c_(zzvy2.MediaBrowserCompat$CustomActionResultReceiver);
            } else {
                str3 = str12;
            }
            String str20 = zzvy2.setContentView;
            String str21 = zzvy2.write;
            if (zzvy2.RatingCompat != null) {
                d5 = zzvy2.RatingCompat.doubleValue();
            } else {
                d5 = 0.0d;
            }
            String write5 = write(Double.valueOf(d5));
            String string3 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.percentage_format);
            Object[] objArr2 = new Object[2];
            if (zzvy2.MediaBrowserCompat$SearchResultReceiver != null) {
                Double valueOf = Double.valueOf(zzvy2.MediaBrowserCompat$SearchResultReceiver.doubleValue());
                str4 = str21;
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
                str5 = str20;
                currencyInstance.setMinimumFractionDigits(2);
                currencyInstance.setMaximumFractionDigits(2);
                str12 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(valueOf);
            } else {
                str5 = str20;
                str4 = str21;
            }
            objArr2[0] = str12;
            objArr2[1] = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.percentage);
            return new Futures.ChainingListenableFuture(str14, str15, i3, c_, str16, str17, format, write, str18, str19, write2, write3, 0, Integer.valueOf(intValue), string2, write4, z, str3, str5, str4, write5, String.format(string3, objArr2), String.valueOf(zzvy2.f3003x50fd9e4a), String.valueOf(zzvy2.setExpandedFormat), "1000".equals(zzvy.IconCompatParcelizer() != null ? zzvy.IconCompatParcelizer().MediaBrowserCompat$ItemReceiver : str13));
        } else if (c == 1) {
            String str22 = "";
            String str23 = "error";
            String str24 = zzvy2.setChecked;
            int i4 = zzvy2.AppCompatViewInflater;
            String c_2 = mo26549c_(zzvy2.setCheckable);
            if (str.isEmpty()) {
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.sme_loan_pn_nickname);
            }
            String str25 = str;
            String str26 = zzvy2.read;
            String string4 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.sme_loan_pn_principal);
            if (zzvy2.setItemInvoker != null) {
                d6 = zzvy2.setItemInvoker.doubleValue();
            } else {
                d6 = 0.0d;
            }
            String write6 = write(Double.valueOf(d6));
            String str27 = zzvy2.AlertController$RecycleListView;
            String str28 = zzvy2.setPadding;
            if (zzvy2.setItemInvoker != null) {
                d7 = zzvy2.setItemInvoker.doubleValue();
            } else {
                d7 = 0.0d;
            }
            String write7 = write(Double.valueOf(d7));
            if (zzvy2.MediaMetadataCompat != null) {
                d8 = zzvy2.MediaMetadataCompat.doubleValue();
            } else {
                d8 = 0.0d;
            }
            String write8 = write(Double.valueOf(d8));
            int intValue2 = (zzvy2.setItemInvoker == null || zzvy2.ActionMenuItemView == null) ? 0 : MediaBrowserCompat$CustomActionResultReceiver(Double.valueOf(zzvy2.setItemInvoker.doubleValue()), Double.valueOf(zzvy2.ActionMenuItemView.doubleValue())).intValue();
            String string5 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.sme_loan_pn_outstanding_title);
            if (zzvy2.setItemInvoker != null) {
                d9 = zzvy2.setItemInvoker.doubleValue();
            } else {
                d9 = 0.0d;
            }
            String write9 = write(Double.valueOf(d9));
            String write10 = write(zzvy2.PlaybackStateCompat$CustomAction, zzvy2.ActionMenuItemView);
            if (zzvy2.MediaBrowserCompat$CustomActionResultReceiver != null) {
                str6 = mo26549c_(zzvy2.MediaBrowserCompat$CustomActionResultReceiver);
            } else {
                str6 = str22;
            }
            int i5 = zzvy2.Keep;
            List<Out> MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(zzvy2.setHasDecor, new MapConstraints.ConstrainedAsMapValues(this));
            Integer valueOf2 = Integer.valueOf(intValue2);
            if (zzvy.IconCompatParcelizer() != null) {
                str7 = zzvy.IconCompatParcelizer().MediaBrowserCompat$ItemReceiver;
            } else {
                str7 = str23;
            }
            return new Futures.ChainingListenableFuture(str24, i4, c_2, str25, str26, string4, write6, str27, str28, write7, write8, valueOf2, 0, string5, write9, write10, str6, i5, MediaBrowserCompat$ItemReceiver, "1000".equals(str7));
        } else if (c != 2) {
            return null;
        } else {
            String str29 = zzvy2.setChecked;
            int i6 = zzvy2.AppCompatViewInflater;
            String c_3 = mo26549c_(zzvy2.setCheckable);
            if (str.isEmpty()) {
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.sme_loan_lg_nickname);
            }
            String str30 = str;
            String str31 = zzvy2.read;
            String string6 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.sme_loan_lg_claimed_amount);
            if (zzvy2.setIcon != null) {
                d10 = zzvy2.setIcon.doubleValue();
            } else {
                d10 = 0.0d;
            }
            String write11 = write(Double.valueOf(d10));
            String str32 = zzvy2.AlertController$RecycleListView;
            String str33 = zzvy2.setPadding;
            if (zzvy2.setPopupCallback != null) {
                d11 = zzvy2.setPopupCallback.doubleValue();
            } else {
                d11 = 0.0d;
            }
            String write12 = write(Double.valueOf(d11));
            if (zzvy2.MediaDescriptionCompat != null) {
                d12 = zzvy2.MediaDescriptionCompat.doubleValue();
            } else {
                d12 = 0.0d;
            }
            String write13 = write(Double.valueOf(d12));
            if (zzvy2.MediaBrowserCompat$MediaItem == null || zzvy2.setPopupCallback == null || zzvy2.MediaSessionCompat$Token == null) {
                str8 = str32;
                i = 0;
            } else {
                double doubleValue = zzvy2.MediaBrowserCompat$MediaItem.doubleValue();
                double doubleValue2 = zzvy2.setPopupCallback.doubleValue();
                double doubleValue3 = zzvy2.MediaSessionCompat$Token.doubleValue();
                Double valueOf3 = Double.valueOf(doubleValue + doubleValue2);
                str8 = str32;
                i = MediaBrowserCompat$CustomActionResultReceiver(valueOf3, Double.valueOf(doubleValue3)).intValue();
            }
            if (zzvy2.setPopupCallback == null || zzvy2.MediaSessionCompat$Token == null) {
                str9 = "";
                i2 = 0;
            } else {
                double doubleValue4 = zzvy2.setPopupCallback.doubleValue();
                double doubleValue5 = zzvy2.MediaSessionCompat$Token.doubleValue();
                Double valueOf4 = Double.valueOf(doubleValue4);
                str9 = "";
                i2 = MediaBrowserCompat$CustomActionResultReceiver(valueOf4, Double.valueOf(doubleValue5)).intValue();
            }
            BigDecimal bigDecimal = zzvy2.MediaBrowserCompat$MediaItem;
            String str34 = "error";
            String string7 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.sme_loan_lg_outstanding_title);
            if (zzvy2.setPopupCallback != null) {
                d13 = zzvy2.setPopupCallback.doubleValue();
            } else {
                d13 = 0.0d;
            }
            String write14 = write(Double.valueOf(d13));
            String write15 = write(zzvy2.PlaybackStateCompat$CustomAction, zzvy2.MediaSessionCompat$Token);
            if (zzvy2.MediaBrowserCompat$CustomActionResultReceiver != null) {
                str9 = mo26549c_(zzvy2.MediaBrowserCompat$CustomActionResultReceiver);
            }
            int i7 = zzvy2.ParcelableVolumeInfo;
            List<Out> MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(zzvy2.MediaSessionCompat$QueueItem, new MapConstraints.ConstrainedEntries(this));
            Integer valueOf5 = Integer.valueOf(i);
            Integer valueOf6 = Integer.valueOf(i2);
            if (zzvy.IconCompatParcelizer() != null) {
                str10 = zzvy.IconCompatParcelizer().MediaBrowserCompat$ItemReceiver;
            } else {
                str10 = str34;
            }
            return new Futures.ChainingListenableFuture(str29, i6, c_3, str30, str31, string6, write11, str8, str33, write12, write13, valueOf5, valueOf6, bigDecimal, string7, write14, write15, str9, i7, MediaBrowserCompat$ItemReceiver2, "1000".equals(str10));
        }
    }
}
