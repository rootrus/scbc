package p040o;

import android.net.Network;
import p040o.FragmentBuilder_RegistrationFingerprintFragment;

/* renamed from: o.FragmentBuilder_RegistrationFingerprintFragment$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver */
final class C9749xd0601f4c extends CheckEligibilityActivity implements FundFactSheetActivity<Network, Boolean> {
    private /* synthetic */ Network MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ FragmentBuilder_RegistrationFingerprintFragment.IconCompatParcelizer write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9749xd0601f4c(FragmentBuilder_RegistrationFingerprintFragment.IconCompatParcelizer iconCompatParcelizer, Network network) {
        super(1);
        this.write = iconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = network;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Network network = (Network) obj;
        onGetStartedClick.write((Object) network, "activeNetwork");
        return Boolean.valueOf(this.write.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(network, this.MediaBrowserCompat$CustomActionResultReceiver).booleanValue());
    }
}
