package p040o;

import android.net.Uri;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p040o.onNextTutorialButtonClick;

/* renamed from: o.FragmentBuilder_BindProductListFragment */
public final class FragmentBuilder_BindProductListFragment implements FragmentBuilder_BindPreregistrationPinFragment, OnBoardingTutorialActivity_ViewBinding {
    private static /* synthetic */ clickNext[] IconCompatParcelizer;
    private static C6679xc2a7de59 write = new C6679xc2a7de59((byte) 0);
    private final FundPurchaseReviewActivity MediaBrowserCompat$CustomActionResultReceiver;
    private final FundPurchaseReviewActivity MediaBrowserCompat$ItemReceiver;
    private final FundPurchaseReviewActivity read;

    static {
        Class<FragmentBuilder_BindProductListFragment> cls = FragmentBuilder_BindProductListFragment.class;
        IconCompatParcelizer = new clickNext[]{FundOnboardingLandingActivity_ViewBinding.write((CheckEligibilityActivity_ViewBinding) new FundAppFormActivity_ViewBinding(FundOnboardingLandingActivity_ViewBinding.write((Class) cls), "isDesignTime", "isDesignTime()Lcom/thunderhead/android/infrastructure/state/connect/ConnectedStateProperty;")), FundOnboardingLandingActivity_ViewBinding.write((CheckEligibilityActivity_ViewBinding) new FundAppFormActivity_ViewBinding(FundOnboardingLandingActivity_ViewBinding.write((Class) cls), "tid", "getTid()Lcom/thunderhead/android/infrastructure/state/connect/ConnectedStateProperty;")), FundOnboardingLandingActivity_ViewBinding.write((CheckEligibilityActivity_ViewBinding) new FundAppFormActivity_ViewBinding(FundOnboardingLandingActivity_ViewBinding.write((Class) cls), "validConfig", "getValidConfig()Lcom/thunderhead/android/infrastructure/state/connect/ConnectedStateProperty;"))};
    }

    public FragmentBuilder_BindProductListFragment(FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment, "store");
        this.MediaBrowserCompat$CustomActionResultReceiver = new onNextTutorialButtonClick.IconCompatParcelizer(fragmentBuilder_BindJuristicOnboardingLandingFragment, FragmentBuilder_BindTransferToOthersStep1Fragment.MediaBrowserCompat$ItemReceiver());
        this.read = new onNextTutorialButtonClick.IconCompatParcelizer(fragmentBuilder_BindJuristicOnboardingLandingFragment, FragmentBuilder_BindPrepaidTravelConversionSuccessFragment.read());
        this.MediaBrowserCompat$ItemReceiver = new onNextTutorialButtonClick.IconCompatParcelizer(fragmentBuilder_BindJuristicOnboardingLandingFragment, FragmentBuilder_BindOnboardingInputAddressFragment.MediaSessionCompat$ResultReceiverWrapper());
    }

    public final Uri MediaBrowserCompat$CustomActionResultReceiver(Uri uri) {
        URI uri2;
        if (uri == null) {
            uri2 = null;
        } else {
            try {
                uri2 = URI.create(uri.toString());
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return null;
            }
        }
        URI IconCompatParcelizer2 = IconCompatParcelizer(uri2);
        if (IconCompatParcelizer2 != null) {
            return Uri.parse(IconCompatParcelizer2.toString());
        }
        return null;
    }

    private URI IconCompatParcelizer(URI uri) {
        HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity;
        String obj;
        Uri uri2 = null;
        try {
            String str = (String) ((HomeActivity_ViewBinding) this.read.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer[1])).read();
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            Boolean bool = (Boolean) ((HomeActivity_ViewBinding) this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer[2])).read();
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            if (!(uri == null || (obj = uri.toString()) == null)) {
                str2 = obj;
            }
            onGetStartedClick.IconCompatParcelizer((Object) str2, "uri?.toString() ?: \"\"");
            Boolean bool2 = (Boolean) ((HomeActivity_ViewBinding) this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer[0])).read();
            if (!(bool2 != null ? bool2.booleanValue() : false)) {
                if (!(str2.length() == 0)) {
                    if (!(str.length() == 0) && booleanValue) {
                        Uri parse = Uri.parse(String.valueOf(uri));
                        if (parse == null) {
                            return null;
                        }
                        if (parse.getQueryParameter("one-tid") == null) {
                            uri2 = parse.buildUpon().appendQueryParameter("one-tid", str).build();
                        } else if (parse != null) {
                            Set<String> queryParameterNames = parse.getQueryParameterNames();
                            Uri.Builder buildUpon = parse.buildUpon();
                            Uri.Builder clearQuery = buildUpon != null ? buildUpon.clearQuery() : null;
                            onGetStartedClick.IconCompatParcelizer((Object) queryParameterNames, "paramKeys");
                            Iterable<String> iterable = queryParameterNames;
                            int i = 10;
                            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                            if (iterable instanceof Collection) {
                                i = ((Collection) iterable).size();
                            }
                            Collection arrayList = new ArrayList(i);
                            for (String str3 : iterable) {
                                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str3, (Object) "one-tid")) {
                                    hmlVerifyEmailSuccessfulActivity = new HmlVerifyEmailSuccessfulActivity(str3, str);
                                } else {
                                    hmlVerifyEmailSuccessfulActivity = new HmlVerifyEmailSuccessfulActivity(str3, parse.getQueryParameter(str3));
                                }
                                arrayList.add(hmlVerifyEmailSuccessfulActivity);
                            }
                            for (HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity2 : (List) arrayList) {
                                String str4 = (String) hmlVerifyEmailSuccessfulActivity2.MediaBrowserCompat$CustomActionResultReceiver;
                                String str5 = (String) hmlVerifyEmailSuccessfulActivity2.write;
                                if (clearQuery != null) {
                                    clearQuery.appendQueryParameter(str4, str5);
                                }
                            }
                            if (clearQuery != null) {
                                uri2 = clearQuery.build();
                            }
                        }
                        return URI.create(String.valueOf(uri2));
                    }
                }
            }
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManagePromptpaySuccessFragment.APPEND_TID_INVALID_STATE, str2, ((HomeActivity_ViewBinding) this.read.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer[1])).read(), ((HomeActivity_ViewBinding) this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer[2])).read(), ((HomeActivity_ViewBinding) this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer[0])).read());
            return uri;
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return uri;
        }
    }

    public final void disconnect() {
        ((HomeActivity_ViewBinding) this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer[0])).MediaBrowserCompat$CustomActionResultReceiver();
        ((HomeActivity_ViewBinding) this.read.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer[1])).MediaBrowserCompat$CustomActionResultReceiver();
        ((HomeActivity_ViewBinding) this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer[2])).MediaBrowserCompat$CustomActionResultReceiver();
    }
}
