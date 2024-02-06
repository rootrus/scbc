package p040o;

import com.thunderhead.android.infrastructure.server.requests.BaseRequest;
import java.net.URI;

/* renamed from: o.FragmentBuilder_BindSetupScheduleFragment */
final class FragmentBuilder_BindSetupScheduleFragment {
    final URI IconCompatParcelizer;
    final FragmentBuilder_BindHmlOperatingBankFragment MediaBrowserCompat$CustomActionResultReceiver;
    final FragmentBuilder_BindHmlNtbOutcomeRejectFragment MediaBrowserCompat$ItemReceiver;
    final BaseRequest read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindSetupScheduleFragment)) {
            return false;
        }
        FragmentBuilder_BindSetupScheduleFragment fragmentBuilder_BindSetupScheduleFragment = (FragmentBuilder_BindSetupScheduleFragment) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fragmentBuilder_BindSetupScheduleFragment.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindSetupScheduleFragment.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindSetupScheduleFragment.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindSetupScheduleFragment.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        BaseRequest baseRequest = this.read;
        int i = 0;
        int hashCode = baseRequest != null ? baseRequest.hashCode() : 0;
        FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = fragmentBuilder_BindHmlNtbOutcomeRejectFragment != null ? fragmentBuilder_BindHmlNtbOutcomeRejectFragment.hashCode() : 0;
        URI uri = this.IconCompatParcelizer;
        int hashCode3 = uri != null ? uri.hashCode() : 0;
        FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindHmlOperatingBankFragment != null) {
            i = fragmentBuilder_BindHmlOperatingBankFragment.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PushTokenData(baseRequest=");
        sb.append(this.read);
        sb.append(", siteKey=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", touchpoint=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", thinstance=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindSetupScheduleFragment(BaseRequest baseRequest, FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, URI uri, FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
        onGetStartedClick.write((Object) baseRequest, "baseRequest");
        onGetStartedClick.write((Object) fragmentBuilder_BindHmlNtbOutcomeRejectFragment, "siteKey");
        onGetStartedClick.write((Object) uri, "touchpoint");
        onGetStartedClick.write((Object) fragmentBuilder_BindHmlOperatingBankFragment, "thinstance");
        this.read = baseRequest;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindHmlNtbOutcomeRejectFragment;
        this.IconCompatParcelizer = uri;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindHmlOperatingBankFragment;
    }
}
