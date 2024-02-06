package p040o;

import com.thunderhead.android.domain.authentication.ClientCredentials;

/* renamed from: o.FragmentBuilder_BindOPRStatusFragment */
final class FragmentBuilder_BindOPRStatusFragment {
    final FragmentBuilder_BindHmlNtbOutcomeRejectFragment MediaBrowserCompat$CustomActionResultReceiver;
    final FragmentBuilder_BindHmlOperatingBankFragment MediaBrowserCompat$ItemReceiver;
    final boolean read;
    final ClientCredentials write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindOPRStatusFragment)) {
            return false;
        }
        FragmentBuilder_BindOPRStatusFragment fragmentBuilder_BindOPRStatusFragment = (FragmentBuilder_BindOPRStatusFragment) obj;
        return this.read == fragmentBuilder_BindOPRStatusFragment.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindOPRStatusFragment.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindOPRStatusFragment.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindOPRStatusFragment.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        boolean z = this.read;
        if (z) {
            z = true;
        }
        ClientCredentials clientCredentials = this.write;
        int i = 0;
        int hashCode = clientCredentials != null ? clientCredentials.hashCode() : 0;
        FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = fragmentBuilder_BindHmlNtbOutcomeRejectFragment != null ? fragmentBuilder_BindHmlNtbOutcomeRejectFragment.hashCode() : 0;
        FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment = this.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindHmlOperatingBankFragment != null) {
            i = fragmentBuilder_BindHmlOperatingBankFragment.hashCode();
        }
        return ((((((z ? 1 : 0) * true) + hashCode) * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RememberMeData(remember=");
        sb.append(this.read);
        sb.append(", clientCredentials=");
        sb.append(this.write);
        sb.append(", siteKey=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", thinstance=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindOPRStatusFragment(boolean z, ClientCredentials clientCredentials, FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
        this.read = z;
        this.write = clientCredentials;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindHmlNtbOutcomeRejectFragment;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindHmlOperatingBankFragment;
    }
}
