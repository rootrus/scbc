package p040o;

/* renamed from: o.FragmentBuilder_BindSelectBankFragment */
final class FragmentBuilder_BindSelectBankFragment {
    final String IconCompatParcelizer;
    final FragmentBuilder_BindHmlNtbOutcomeRejectFragment read;
    final FragmentBuilder_BindHmlOperatingBankFragment write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindSelectBankFragment)) {
            return false;
        }
        FragmentBuilder_BindSelectBankFragment fragmentBuilder_BindSelectBankFragment = (FragmentBuilder_BindSelectBankFragment) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fragmentBuilder_BindSelectBankFragment.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindSelectBankFragment.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindSelectBankFragment.IconCompatParcelizer);
    }

    public final int hashCode() {
        FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment = this.read;
        int i = 0;
        int hashCode = fragmentBuilder_BindHmlNtbOutcomeRejectFragment != null ? fragmentBuilder_BindHmlNtbOutcomeRejectFragment.hashCode() : 0;
        FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment = this.write;
        int hashCode2 = fragmentBuilder_BindHmlOperatingBankFragment != null ? fragmentBuilder_BindHmlOperatingBankFragment.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        if (str != null) {
            i = str.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EnabledData(siteKey=");
        sb.append(this.read);
        sb.append(", thinstance=");
        sb.append(this.write);
        sb.append(", inMemoryToken=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindSelectBankFragment(FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str) {
        this.read = fragmentBuilder_BindHmlNtbOutcomeRejectFragment;
        this.write = fragmentBuilder_BindHmlOperatingBankFragment;
        this.IconCompatParcelizer = str;
    }
}
