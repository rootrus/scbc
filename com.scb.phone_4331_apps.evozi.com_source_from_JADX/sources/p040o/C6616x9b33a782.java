package p040o;

import java.net.URI;

/* renamed from: o.FragmentBuilder_BindOnboardingInputAddressFragment$MediaBrowserCompat$ItemReceiver */
final class C6616x9b33a782 extends CheckEligibilityActivity implements BaseDiscoverSearchActivity<String, URI, FragmentBuilder_BindHmlOperatingBankFragment, String, String, String, FragmentBuilder_BindHmlNTBAccountConsentFragment, FragmentBuilder_BindHmlNTBManageEmailVerificationFragment> {
    public static final C6616x9b33a782 IconCompatParcelizer = new C6616x9b33a782();

    C6616x9b33a782() {
        super(7);
    }

    public final /* synthetic */ Object read(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        final String str = (String) obj;
        final URI uri = (URI) obj2;
        final FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment = (FragmentBuilder_BindHmlOperatingBankFragment) obj3;
        final String str2 = (String) obj4;
        final String str3 = (String) obj5;
        final String str4 = (String) obj6;
        final FragmentBuilder_BindHmlNTBAccountConsentFragment fragmentBuilder_BindHmlNTBAccountConsentFragment = (FragmentBuilder_BindHmlNTBAccountConsentFragment) obj7;
        FundFactSheetActivity r9 = new FundFactSheetActivity<C1190x3ac82dc9, HmlVerifyPhoneValidateOtpActivity>() {
            public final /* synthetic */ Object invoke(Object obj) {
                URI uri;
                C1190x3ac82dc9 fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver = (C1190x3ac82dc9) obj;
                onGetStartedClick.write((Object) fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver, "$receiver");
                fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver.write = str;
                FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment = fragmentBuilder_BindHmlOperatingBankFragment;
                if (fragmentBuilder_BindHmlOperatingBankFragment != null) {
                    uri = fragmentBuilder_BindHmlOperatingBankFragment.write;
                } else {
                    uri = null;
                }
                fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver.read = uri;
                fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = str2;
                fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = str3;
                fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = str4;
                fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = uri;
                fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = fragmentBuilder_BindHmlNTBAccountConsentFragment;
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        };
        onGetStartedClick.write((Object) r9, "initializer");
        C1190x3ac82dc9 fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver = new C1190x3ac82dc9();
        r9.invoke(fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver);
        return fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
