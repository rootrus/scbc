package p040o;

import android.webkit.JavascriptInterface;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import java.util.Arrays;

/* renamed from: o.FragmentBuilder_BindEasycashLoanAccountFragment */
public final class FragmentBuilder_BindEasycashLoanAccountFragment extends C6511x9873a16a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentBuilder_BindEasycashLoanAccountFragment(FragmentBuilder_BindEasycashFeaturesTopUpInformationFragment... fragmentBuilder_BindEasycashFeaturesTopUpInformationFragmentArr) {
        super((FragmentBuilder_BindEasycashFeaturesTopUpInformationFragment[]) Arrays.copyOf(fragmentBuilder_BindEasycashFeaturesTopUpInformationFragmentArr, 2));
        onGetStartedClick.write((Object) fragmentBuilder_BindEasycashFeaturesTopUpInformationFragmentArr, "callbacks");
    }

    @JavascriptInterface
    public final void onSlipRender(String str) {
        onGetStartedClick.write((Object) str, "toast");
        if (MediaBrowserCompat$CustomActionResultReceiver().length > 0) {
            MediaBrowserCompat$CustomActionResultReceiver()[0].IconCompatParcelizer.invoke(str);
        }
    }

    @JavascriptInterface
    public final void onTracking(String str) {
        onGetStartedClick.write((Object) str, "toast");
        if (MediaBrowserCompat$CustomActionResultReceiver().length > 1) {
            MediaBrowserCompat$CustomActionResultReceiver()[1].IconCompatParcelizer.invoke(str);
        }
    }

    @JavascriptInterface
    public final void onRecieved(String str) {
        onGetStartedClick.write((Object) str, "toast");
        if (MediaBrowserCompat$CustomActionResultReceiver().length > 2) {
            MediaBrowserCompat$CustomActionResultReceiver()[2].IconCompatParcelizer.invoke(str);
        }
    }

    @JavascriptInterface
    public final void requestExternalLogin(String str) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        if (MediaBrowserCompat$CustomActionResultReceiver().length > 3) {
            MediaBrowserCompat$CustomActionResultReceiver()[3].IconCompatParcelizer.invoke(str);
        }
    }

    @JavascriptInterface
    public final void getCurrentLocation(String str) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        if (MediaBrowserCompat$CustomActionResultReceiver().length > 4) {
            MediaBrowserCompat$CustomActionResultReceiver()[4].IconCompatParcelizer.invoke(str);
        }
    }

    @JavascriptInterface
    public final void onRequestFundData(String str) {
        onGetStartedClick.write((Object) str, "params");
        if (MediaBrowserCompat$CustomActionResultReceiver().length > 5) {
            MediaBrowserCompat$CustomActionResultReceiver()[5].IconCompatParcelizer.invoke(str);
        }
    }

    @JavascriptInterface
    public final void onRequestHistoricalData(String str) {
        onGetStartedClick.write((Object) str, "params");
        if (MediaBrowserCompat$CustomActionResultReceiver().length > 6) {
            MediaBrowserCompat$CustomActionResultReceiver()[6].IconCompatParcelizer.invoke(str);
        }
    }

    @JavascriptInterface
    public final void onInvestFund(String str) {
        onGetStartedClick.write((Object) str, "params");
        if (MediaBrowserCompat$CustomActionResultReceiver().length > 7) {
            MediaBrowserCompat$CustomActionResultReceiver()[7].IconCompatParcelizer.invoke(str);
        }
    }

    @JavascriptInterface
    public final void onOpenPDF(String str) {
        onGetStartedClick.write((Object) str, "params");
        if (MediaBrowserCompat$CustomActionResultReceiver().length > 8) {
            MediaBrowserCompat$CustomActionResultReceiver()[8].IconCompatParcelizer.invoke(str);
        }
    }
}
