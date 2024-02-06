package p040o;

import java.net.URI;

/* renamed from: o.FragmentBuilder_BindOnboardingInputAddressFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6615x9cf03373 extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindHmlOperatingBankFragment, Boolean> {
    public static final C6615x9cf03373 write = new C6615x9cf03373();

    C6615x9cf03373() {
        super(1);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        URI uri;
        String scheme;
        FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment = (FragmentBuilder_BindHmlOperatingBankFragment) obj;
        if (fragmentBuilder_BindHmlOperatingBankFragment != null) {
            uri = fragmentBuilder_BindHmlOperatingBankFragment.write;
        } else {
            uri = null;
        }
        boolean z = false;
        if (uri != null) {
            String obj2 = uri.toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj2, "thinstanceURI.toString()");
            if ((obj2.length() > 0) && (scheme = uri.getScheme()) != null && !scheme.equals("http")) {
                CharSequence authority = uri.getAuthority();
                if (!(authority == null || authority.length() == 0)) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
