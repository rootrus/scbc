package p040o;

import com.thunderhead.android.infrastructure.data.DataSource$MediaBrowserCompat$CustomActionResultReceiver;
import java.net.URI;

/* renamed from: o.FragmentBuilder_BindQuantityPointsPlusMoneyFragment */
public final class FragmentBuilder_BindQuantityPointsPlusMoneyFragment implements DataSource$MediaBrowserCompat$CustomActionResultReceiver {
    final FragmentBuilder_BindHmlOperatingBankFragment IconCompatParcelizer;
    public final FragmentBuilder_BindHmlNtbOutcomeRejectFragment MediaBrowserCompat$CustomActionResultReceiver;
    public final FragmentBuilder_BindRegistrationLandingFragment MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final URI write;

    public FragmentBuilder_BindQuantityPointsPlusMoneyFragment() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindQuantityPointsPlusMoneyFragment)) {
            return false;
        }
        FragmentBuilder_BindQuantityPointsPlusMoneyFragment fragmentBuilder_BindQuantityPointsPlusMoneyFragment = (FragmentBuilder_BindQuantityPointsPlusMoneyFragment) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindQuantityPointsPlusMoneyFragment.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindQuantityPointsPlusMoneyFragment.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindQuantityPointsPlusMoneyFragment.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindQuantityPointsPlusMoneyFragment.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fragmentBuilder_BindQuantityPointsPlusMoneyFragment.read);
    }

    public final int hashCode() {
        FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = fragmentBuilder_BindHmlOperatingBankFragment != null ? fragmentBuilder_BindHmlOperatingBankFragment.hashCode() : 0;
        FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = fragmentBuilder_BindHmlNtbOutcomeRejectFragment != null ? fragmentBuilder_BindHmlNtbOutcomeRejectFragment.hashCode() : 0;
        URI uri = this.write;
        int hashCode3 = uri != null ? uri.hashCode() : 0;
        FragmentBuilder_BindRegistrationLandingFragment fragmentBuilder_BindRegistrationLandingFragment = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = fragmentBuilder_BindRegistrationLandingFragment != null ? fragmentBuilder_BindRegistrationLandingFragment.hashCode() : 0;
        String str = this.read;
        if (str != null) {
            i = str.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AllowedInteractionsDataSourceKey(thinstance=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", siteKey=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", touchpoint=");
        sb.append(this.write);
        sb.append(", eTag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", releaseId=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindQuantityPointsPlusMoneyFragment(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, URI uri, FragmentBuilder_BindRegistrationLandingFragment fragmentBuilder_BindRegistrationLandingFragment, String str) {
        this.IconCompatParcelizer = fragmentBuilder_BindHmlOperatingBankFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindHmlNtbOutcomeRejectFragment;
        this.write = uri;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindRegistrationLandingFragment;
        this.read = str;
    }

    public /* synthetic */ FragmentBuilder_BindQuantityPointsPlusMoneyFragment(byte b) {
        this((FragmentBuilder_BindHmlOperatingBankFragment) null, (FragmentBuilder_BindHmlNtbOutcomeRejectFragment) null, (URI) null, (FragmentBuilder_BindRegistrationLandingFragment) null, (String) null);
    }
}
