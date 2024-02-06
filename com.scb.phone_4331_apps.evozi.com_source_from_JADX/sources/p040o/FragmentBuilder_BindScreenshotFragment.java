package p040o;

/* renamed from: o.FragmentBuilder_BindScreenshotFragment */
final class FragmentBuilder_BindScreenshotFragment {
    final FragmentBuilder_BindHmlOperatingBankFragment IconCompatParcelizer;
    final String read;
    final FragmentBuilder_BindHmlNtbOutcomeRejectFragment write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindScreenshotFragment)) {
            return false;
        }
        FragmentBuilder_BindScreenshotFragment fragmentBuilder_BindScreenshotFragment = (FragmentBuilder_BindScreenshotFragment) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fragmentBuilder_BindScreenshotFragment.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindScreenshotFragment.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindScreenshotFragment.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment = this.write;
        int hashCode2 = fragmentBuilder_BindHmlNtbOutcomeRejectFragment != null ? fragmentBuilder_BindHmlNtbOutcomeRejectFragment.hashCode() : 0;
        FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment = this.IconCompatParcelizer;
        if (fragmentBuilder_BindHmlOperatingBankFragment != null) {
            i = fragmentBuilder_BindHmlOperatingBankFragment.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MessageData(token=");
        sb.append(this.read);
        sb.append(", siteKey=");
        sb.append(this.write);
        sb.append(", thinstance=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindScreenshotFragment(String str, FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
        onGetStartedClick.write((Object) str, "token");
        onGetStartedClick.write((Object) fragmentBuilder_BindHmlNtbOutcomeRejectFragment, "siteKey");
        onGetStartedClick.write((Object) fragmentBuilder_BindHmlOperatingBankFragment, "thinstance");
        this.read = str;
        this.write = fragmentBuilder_BindHmlNtbOutcomeRejectFragment;
        this.IconCompatParcelizer = fragmentBuilder_BindHmlOperatingBankFragment;
    }
}
