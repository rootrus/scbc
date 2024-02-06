package p040o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;

/* renamed from: o.FragmentBuilder_RegistrationFingerprintFragment */
public final class FragmentBuilder_RegistrationFingerprintFragment {
    public final IconCompatParcelizer IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    public ConnectivityManager read;
    final List<Network> write;

    public FragmentBuilder_RegistrationFingerprintFragment(Context context) {
        onGetStartedClick.write((Object) context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            this.read = (ConnectivityManager) systemService;
            this.write = new ArrayList();
            this.IconCompatParcelizer = new IconCompatParcelizer(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    /* renamed from: o.FragmentBuilder_RegistrationFingerprintFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends ConnectivityManager.NetworkCallback {
        BaseDiscoverFundFilterActivity<? super Network, ? super Network, Boolean> IconCompatParcelizer = C9750x2d88531b.MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ FragmentBuilder_RegistrationFingerprintFragment MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(FragmentBuilder_RegistrationFingerprintFragment fragmentBuilder_RegistrationFingerprintFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_RegistrationFingerprintFragment;
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            onGetStartedClick.write((Object) network, "network");
            onGetStartedClick.write((Object) networkCapabilities, "networkCapabilities");
            super.onCapabilitiesChanged(network, networkCapabilities);
            FragmentBuilder_RegistrationFingerprintFragment.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, network);
        }

        public final void onAvailable(Network network) {
            onGetStartedClick.write((Object) network, "network");
            super.onAvailable(network);
            Iterable iterable = this.MediaBrowserCompat$CustomActionResultReceiver.write;
            boolean z = true;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver((Network) it.next(), network).booleanValue()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                this.MediaBrowserCompat$CustomActionResultReceiver.write.add(network);
            }
            if (Build.VERSION.SDK_INT < 26) {
                FragmentBuilder_RegistrationFingerprintFragment.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, network);
            }
        }

        public final void onLost(Network network) {
            onGetStartedClick.write((Object) network, "network");
            super.onLost(network);
            List<Network> list = this.MediaBrowserCompat$CustomActionResultReceiver.write;
            FundFactSheetActivity fragmentBuilder_RegistrationFingerprintFragment$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver = new C9749xd0601f4c(this, network);
            onGetStartedClick.write((Object) list, "$this$removeAll");
            onGetStartedClick.write((Object) fragmentBuilder_RegistrationFingerprintFragment$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver, "predicate");
            HmlNTBEkycNdidLandingActivity.read(list, fragmentBuilder_RegistrationFingerprintFragment$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver);
            FragmentBuilder_RegistrationFingerprintFragment.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, network);
        }
    }

    private final void MediaBrowserCompat$ItemReceiver(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return;
        }
        if (networkCapabilities.hasTransport(1)) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
        } else if (networkCapabilities.hasTransport(0)) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
        } else if (networkCapabilities.hasTransport(3)) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
        } else if (networkCapabilities.hasCapability(12)) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(FragmentBuilder_RegistrationFingerprintFragment fragmentBuilder_RegistrationFingerprintFragment, Network network) {
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> customView = FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView();
        onGetStartedClick.IconCompatParcelizer((Object) customView, "OneInternalProvider.getStateStore()");
        Boolean invoke = EasycashBusinessAndMaritalInfoCaseModule.MediaBrowserCompat$ItemReceiver().invoke(customView.MediaBrowserCompat$ItemReceiver());
        Boolean invoke2 = EasycashBusinessAndMaritalInfoCaseModule.read().invoke(customView.MediaBrowserCompat$ItemReceiver());
        fragmentBuilder_RegistrationFingerprintFragment.MediaBrowserCompat$ItemReceiver = false;
        fragmentBuilder_RegistrationFingerprintFragment.MediaBrowserCompat$CustomActionResultReceiver = false;
        if (fragmentBuilder_RegistrationFingerprintFragment.write.size() > 0) {
            NetworkCapabilities networkCapabilities = fragmentBuilder_RegistrationFingerprintFragment.read.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                fragmentBuilder_RegistrationFingerprintFragment.MediaBrowserCompat$ItemReceiver = true;
            }
            fragmentBuilder_RegistrationFingerprintFragment.MediaBrowserCompat$ItemReceiver(fragmentBuilder_RegistrationFingerprintFragment.read.getNetworkCapabilities(network));
        }
        if ((!fragmentBuilder_RegistrationFingerprintFragment.MediaBrowserCompat$ItemReceiver || !fragmentBuilder_RegistrationFingerprintFragment.MediaBrowserCompat$CustomActionResultReceiver) && fragmentBuilder_RegistrationFingerprintFragment.write.size() > 1) {
            for (Network network2 : fragmentBuilder_RegistrationFingerprintFragment.write) {
                NetworkCapabilities networkCapabilities2 = fragmentBuilder_RegistrationFingerprintFragment.read.getNetworkCapabilities(network2);
                if (networkCapabilities2 != null && networkCapabilities2.hasTransport(1)) {
                    fragmentBuilder_RegistrationFingerprintFragment.MediaBrowserCompat$ItemReceiver = true;
                }
                fragmentBuilder_RegistrationFingerprintFragment.MediaBrowserCompat$ItemReceiver(fragmentBuilder_RegistrationFingerprintFragment.read.getNetworkCapabilities(network2));
            }
        }
        try {
            if ((!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) Boolean.valueOf(fragmentBuilder_RegistrationFingerprintFragment.MediaBrowserCompat$CustomActionResultReceiver), (Object) invoke)) || (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) Boolean.valueOf(fragmentBuilder_RegistrationFingerprintFragment.MediaBrowserCompat$ItemReceiver), (Object) invoke2))) {
                customView.MediaBrowserCompat$ItemReceiver(new C6875x8f56b680(Boolean.valueOf(fragmentBuilder_RegistrationFingerprintFragment.MediaBrowserCompat$ItemReceiver), Boolean.valueOf(fragmentBuilder_RegistrationFingerprintFragment.MediaBrowserCompat$CustomActionResultReceiver)));
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindManagePromptpayLandingFragment.ERROR_UPDATING_NETWORK_STATE);
        }
    }
}
