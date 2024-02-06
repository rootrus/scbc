package p040o;

/* renamed from: o.FragmentBuilder_BindWifiSettingsFragment */
public final class FragmentBuilder_BindWifiSettingsFragment {
    final FragmentBuilder_BindVerifyIdentityFragment IconCompatParcelizer;
    final FragmentBuilder_BindVerifyIdentityFragment MediaBrowserCompat$ItemReceiver;

    public FragmentBuilder_BindWifiSettingsFragment() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindWifiSettingsFragment)) {
            return false;
        }
        FragmentBuilder_BindWifiSettingsFragment fragmentBuilder_BindWifiSettingsFragment = (FragmentBuilder_BindWifiSettingsFragment) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindWifiSettingsFragment.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindWifiSettingsFragment.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = fragmentBuilder_BindVerifyIdentityFragment != null ? fragmentBuilder_BindVerifyIdentityFragment.hashCode() : 0;
        FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment2 = this.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindVerifyIdentityFragment2 != null) {
            i = fragmentBuilder_BindVerifyIdentityFragment2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SdkModeState(sdkMode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", previousDesignTimeMode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindWifiSettingsFragment(FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment, FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment2) {
        onGetStartedClick.write((Object) fragmentBuilder_BindVerifyIdentityFragment, "sdkMode");
        this.IconCompatParcelizer = fragmentBuilder_BindVerifyIdentityFragment;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindVerifyIdentityFragment2;
    }

    public /* synthetic */ FragmentBuilder_BindWifiSettingsFragment(byte b) {
        this(FragmentBuilder_BindVerifyIdentityFragment.RUNTIME, (FragmentBuilder_BindVerifyIdentityFragment) null);
    }
}
