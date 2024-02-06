package p040o;

/* renamed from: o.FragmentBuilder_BindMileageAirlineFieldDetailsFragment */
public final class FragmentBuilder_BindMileageAirlineFieldDetailsFragment {
    public final int IconCompatParcelizer;
    public final FragmentBuilder_BindMwShopAddressDepartmentFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindMileageAirlineFieldDetailsFragment)) {
            return false;
        }
        FragmentBuilder_BindMileageAirlineFieldDetailsFragment fragmentBuilder_BindMileageAirlineFieldDetailsFragment = (FragmentBuilder_BindMileageAirlineFieldDetailsFragment) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindMileageAirlineFieldDetailsFragment.MediaBrowserCompat$ItemReceiver) && this.IconCompatParcelizer == fragmentBuilder_BindMileageAirlineFieldDetailsFragment.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindMileageAirlineFieldDetailsFragment.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = this.IconCompatParcelizer;
        FragmentBuilder_BindMwShopAddressDepartmentFragment fragmentBuilder_BindMwShopAddressDepartmentFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindMwShopAddressDepartmentFragment != null) {
            i = fragmentBuilder_BindMwShopAddressDepartmentFragment.hashCode();
        }
        return (((hashCode * 31) + i2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityInfo(name=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", hash=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", state=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindMileageAirlineFieldDetailsFragment(String str, int i, FragmentBuilder_BindMwShopAddressDepartmentFragment fragmentBuilder_BindMwShopAddressDepartmentFragment) {
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) fragmentBuilder_BindMwShopAddressDepartmentFragment, "state");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindMwShopAddressDepartmentFragment;
    }
}
