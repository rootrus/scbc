package p040o;

import android.net.Network;
import android.os.Build;

/* renamed from: o.FragmentBuilder_RegistrationFingerprintFragment$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver */
final class C9750x2d88531b extends CheckEligibilityActivity implements BaseDiscoverFundFilterActivity<Network, Network, Boolean> {
    public static final C9750x2d88531b MediaBrowserCompat$CustomActionResultReceiver = new C9750x2d88531b();

    C9750x2d88531b() {
        super(2);
    }

    public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        Network network = (Network) obj;
        Network network2 = (Network) obj2;
        onGetStartedClick.write((Object) network, "activeNetwork");
        onGetStartedClick.write((Object) network2, "network");
        return Boolean.valueOf(Build.VERSION.SDK_INT < 23 ? network.hashCode() == network2.hashCode() : network.getNetworkHandle() == network2.getNetworkHandle());
    }
}
