package p040o;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.scb.phone.R;
import p040o.Api;
import p040o.OnDeviceIdExtractor;
import p040o.inject_permissionChecker;

/* renamed from: o.FragmentBuilder_BindDirectDebitInputMainFragment */
public final class FragmentBuilder_BindDirectDebitInputMainFragment implements OnDeviceIdExtractor.C6966a.C69671 {
    private final Api.ApiOptions.NoOptions IconCompatParcelizer;
    private final inject_permissionChecker.IconCompatParcelizer read;

    private FragmentBuilder_BindDirectDebitInputMainFragment() {
    }

    public static /* synthetic */ CharSequence MediaBrowserCompat$ItemReceiver(Resources resources, String str, String str2, String str3, boolean z, int i, FundActionsSuccessActivity fundActionsSuccessActivity, int i2) {
        return MediaBrowserCompat$CustomActionResultReceiver(resources, str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? false : z, 0, (i2 & 64) != 0 ? R.color.f67252131099881 : i, fundActionsSuccessActivity);
    }

    private static CharSequence MediaBrowserCompat$CustomActionResultReceiver(Resources resources, String str, String str2, String str3, boolean z, int i, int i2, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) str, "clickableString");
        onGetStartedClick.write((Object) str2, "initialString");
        onGetStartedClick.write((Object) str3, "lastString");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "onLinkClick");
        SpannableStringBuilder append = new SpannableStringBuilder().append(str2).append(str);
        append.setSpan(new C6502x8012484e(fundActionsSuccessActivity, z, resources, i2), str2.length(), append.length(), 33);
        append.setSpan(new StyleSpan(0), str2.length(), append.length(), 33);
        SpannableStringBuilder append2 = append.append(str3);
        onGetStartedClick.IconCompatParcelizer((Object) append2, "SpannableStringBuilder()…     }.append(lastString)");
        return append2;
    }

    @HmlPinActivity
    public FragmentBuilder_BindDirectDebitInputMainFragment(inject_permissionChecker.IconCompatParcelizer iconCompatParcelizer, Api.ApiOptions.NoOptions noOptions) {
        this.read = iconCompatParcelizer;
        this.IconCompatParcelizer = noOptions;
    }

    public final DebitCardResetOtpActivity<SupportPlaceAutocompleteFragment> MediaBrowserCompat$CustomActionResultReceiver(standardValues standardvalues) {
        return this.read.read.createImage(standardvalues).flatMap(new BiConsumer(this));
    }
}
