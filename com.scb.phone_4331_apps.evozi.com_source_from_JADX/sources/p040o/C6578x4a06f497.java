package p040o;

/* renamed from: o.FragmentBuilder_BindNTBBankingServiceFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6578x4a06f497 {
    final FragmentBuilder_BindHmlNtbOutcomeRejectFragment MediaBrowserCompat$CustomActionResultReceiver;
    final FragmentBuilder_BindHmlOperatingBankFragment MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6578x4a06f497)) {
            return false;
        }
        C6578x4a06f497 fragmentBuilder_BindNTBBankingServiceFragment$MediaBrowserCompat$CustomActionResultReceiver = (C6578x4a06f497) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindNTBBankingServiceFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindNTBBankingServiceFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = fragmentBuilder_BindHmlNtbOutcomeRejectFragment != null ? fragmentBuilder_BindHmlNtbOutcomeRejectFragment.hashCode() : 0;
        FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment = this.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindHmlOperatingBankFragment != null) {
            i = fragmentBuilder_BindHmlOperatingBankFragment.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Specification(siteKey=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", thinstance=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public C6578x4a06f497(FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindHmlNtbOutcomeRejectFragment;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindHmlOperatingBankFragment;
    }
}
