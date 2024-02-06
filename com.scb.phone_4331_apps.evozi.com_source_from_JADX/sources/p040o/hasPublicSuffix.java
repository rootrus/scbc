package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import org.threeten.p041bp.OffsetDateTime;
import p040o.C3085x7c929f5b;
import p040o.SignedBytes;

/* renamed from: o.hasPublicSuffix */
public final class hasPublicSuffix extends SignedBytes.LexicographicalComparator {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public hasPublicSuffix(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "baseAssetsURL");
    }

    /* renamed from: o.hasPublicSuffix$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements findFragmentByWho {
        private final /* synthetic */ getAccountTypesSet read;

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(getAccountTypesSet getaccounttypesset) {
            this.read = getaccounttypesset;
        }

        public final Object IconCompatParcelizer(Object obj) {
            return getAccountTypesSet.read(this.read, (fromZipStream) obj);
        }
    }

    public final C3088x7e3e3ebd write(C3085x7c929f5b.C30861 r29, scrollGesturesEnabled scrollgesturesenabled, boolean z) {
        int i;
        double d;
        String str;
        char c;
        int i2;
        String str2;
        String str3;
        List<String> list;
        C3085x7c929f5b.C30861 r1 = r29;
        scrollGesturesEnabled scrollgesturesenabled2 = scrollgesturesenabled;
        onGetStartedClick.write((Object) r1, "channelDisplay");
        onGetStartedClick.write((Object) scrollgesturesenabled2, "countryInfoResponse");
        List<rotateGesturesEnabled> list2 = scrollgesturesenabled2.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver;
        double d2 = 0.0d;
        if (list2 != null) {
            Iterable<rotateGesturesEnabled> iterable = list2;
            int i3 = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i3 = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i3);
            d = 0.0d;
            i = 0;
            for (rotateGesturesEnabled rotategesturesenabled : iterable) {
                String str4 = rotategesturesenabled.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode = str4.hashCode();
                if (hashCode != -1786549249) {
                    if (hashCode != 561259739) {
                        if (hashCode == 1585680696 && str4.equals("TIMES_PER_CUSTOMER_PER_MONTH")) {
                            i = (int) rotategesturesenabled.IconCompatParcelizer;
                        }
                    } else if (str4.equals("PER_CUSTOMER_PER_DAY")) {
                        d2 = rotategesturesenabled.IconCompatParcelizer;
                    }
                } else if (str4.equals("PER_CUSTOMER_PER_MONTH")) {
                    d = rotategesturesenabled.IconCompatParcelizer;
                }
                arrayList.add(HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver);
            }
        } else {
            d = 0.0d;
            i = 0;
        }
        boolean z2 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) r1.MediaBrowserCompat$ItemReceiver, (Object) "PAYNOW") && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) r1.read, (Object) "PROMPTPAY");
        String str5 = r1.MediaBrowserCompat$CustomActionResultReceiver;
        String c_ = mo26549c_(scrollgesturesenabled2.RatingCompat);
        onGetStartedClick.IconCompatParcelizer((Object) c_, "transformAssetUrl(countryInfoResponse.flagImage)");
        SpannableStringBuilder MediaBrowserCompat$CustomActionResultReceiver = ZHPR2.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.remittance_input_amount_from_title), this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.remittance_input_amount_from_currency));
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "buildAmountFromTitle()");
        CharSequence charSequence = MediaBrowserCompat$CustomActionResultReceiver;
        String str6 = r1.IconCompatParcelizer;
        String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.remittance_input_amount_to_title, new Object[]{str6});
        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        sb.append(str6);
        sb.append(' ');
        SpannableStringBuilder MediaBrowserCompat$CustomActionResultReceiver2 = ZHPR2.MediaBrowserCompat$CustomActionResultReceiver(string, sb.toString());
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver2, "buildAmountToTitle(channelDisplay.currencyCode)");
        CharSequence charSequence2 = MediaBrowserCompat$CustomActionResultReceiver2;
        double d3 = scrollgesturesenabled2.MediaDescriptionCompat.read;
        String str7 = scrollgesturesenabled2.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver;
        Resources resources = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i4 = Iterables$3$MediaBrowserCompat$MediaItem.remittance_input_rate_detail;
        String str8 = str7;
        double d4 = d3;
        Object[] objArr = new Object[1];
        OffsetDateTime offsetDateTime = scrollgesturesenabled2.MediaDescriptionCompat.write;
        if (offsetDateTime == null || (str = IconCompatParcelizer("dd MMM yyyy - HH:mm", offsetDateTime)) == null) {
            str = "";
        }
        objArr[0] = str;
        String string2 = resources.getString(i4, objArr);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "resources.getString(R.st…                   ?: \"\")");
        CharSequence charSequence3 = charSequence;
        CharSequence charSequence4 = charSequence2;
        String string3 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.remittance_promptpay_limit_message, new Object[]{write(Double.valueOf((double) scrollgesturesenabled2.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver))});
        onGetStartedClick.IconCompatParcelizer((Object) string3, "resources.getString(R.st…tTransaction.toDouble()))");
        if (z2) {
            i2 = 1;
            c = 0;
            str2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.remittance_promptpay_input_remaining_daily_limit_message, new Object[]{write(Double.valueOf(d2))});
            onGetStartedClick.IconCompatParcelizer((Object) str2, "resources.getString(R.st…   transformFund(amount))");
        } else {
            c = 0;
            i2 = 1;
            str2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.remittance_input_remaining_daily_limit_message, new Object[]{write(Double.valueOf(d2))});
            onGetStartedClick.IconCompatParcelizer((Object) str2, "resources.getString(R.st…   transformFund(amount))");
        }
        Resources resources2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i5 = Iterables$3$MediaBrowserCompat$MediaItem.remittance_input_remaining_monthly_limit_message;
        Object[] objArr2 = new Object[i2];
        objArr2[c] = write(Double.valueOf(d));
        String string4 = resources2.getString(i5, objArr2);
        onGetStartedClick.IconCompatParcelizer((Object) string4, "resources.getString(R.st…(remainingAmountMonthly))");
        Resources resources3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i6 = Iterables$3$MediaBrowserCompat$MediaItem.remittance_input_remaining_times_monthly_message;
        Object[] objArr3 = new Object[i2];
        objArr3[c] = String.valueOf(i);
        String string5 = resources3.getString(i6, objArr3);
        onGetStartedClick.IconCompatParcelizer((Object) string5, "resources.getString(R.st…gTimesMonthly.toString())");
        getZoomGesturesEnabled getzoomgesturesenabled = scrollgesturesenabled2.Keep;
        if (getzoomgesturesenabled != null) {
            str3 = getzoomgesturesenabled.write;
        } else {
            str3 = null;
        }
        boolean MediaBrowserCompat$ItemReceiver = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str3, (Object) DiskLruCache.VERSION_1);
        if (getzoomgesturesenabled == null || (list = getzoomgesturesenabled.IconCompatParcelizer) == null) {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        setAddress setaddress = r10;
        setAddress setaddress2 = new setAddress(MediaBrowserCompat$ItemReceiver, list, (String) null);
        return new C3088x7e3e3ebd(str5, c_, charSequence3, charSequence4, d4, str8, string2, string3, str2, string4, string5, z, setaddress, scrollgesturesenabled2.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver, z2);
    }
}
