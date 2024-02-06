package p040o;

/* renamed from: o.FragmentBuilder_BindTodayTransactionsTabFragment */
public final class FragmentBuilder_BindTodayTransactionsTabFragment {
    final boolean IconCompatParcelizer;
    final BaseAmortizationActivity MediaBrowserCompat$CustomActionResultReceiver;
    final String MediaBrowserCompat$ItemReceiver;
    private final boolean read;
    final DeejungTransferLandingActivity write;

    public FragmentBuilder_BindTodayTransactionsTabFragment() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindTodayTransactionsTabFragment)) {
            return false;
        }
        FragmentBuilder_BindTodayTransactionsTabFragment fragmentBuilder_BindTodayTransactionsTabFragment = (FragmentBuilder_BindTodayTransactionsTabFragment) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindTodayTransactionsTabFragment.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindTodayTransactionsTabFragment.MediaBrowserCompat$CustomActionResultReceiver) && this.read == fragmentBuilder_BindTodayTransactionsTabFragment.read && this.IconCompatParcelizer == fragmentBuilder_BindTodayTransactionsTabFragment.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindTodayTransactionsTabFragment.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        DeejungTransferLandingActivity deejungTransferLandingActivity = this.write;
        int i = 0;
        int hashCode = deejungTransferLandingActivity != null ? deejungTransferLandingActivity.hashCode() : 0;
        BaseAmortizationActivity baseAmortizationActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = baseAmortizationActivity != null ? baseAmortizationActivity.hashCode() : 0;
        boolean z = this.read;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.IconCompatParcelizer;
        if (!z3) {
            z2 = z3;
        }
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            i = str.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PopOverState(selectedElementItem=");
        sb.append(this.write);
        sb.append(", selectedTab=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", processPopOverChangeTab=");
        sb.append(this.read);
        sb.append(", isOpen=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", selectedElementItemPath=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    private FragmentBuilder_BindTodayTransactionsTabFragment(DeejungTransferLandingActivity deejungTransferLandingActivity, BaseAmortizationActivity baseAmortizationActivity, boolean z, boolean z2, String str) {
        onGetStartedClick.write((Object) baseAmortizationActivity, "selectedTab");
        this.write = deejungTransferLandingActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = baseAmortizationActivity;
        this.read = z;
        this.IconCompatParcelizer = z2;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public /* synthetic */ FragmentBuilder_BindTodayTransactionsTabFragment(byte b) {
        this((DeejungTransferLandingActivity) null, BaseAmortizationActivity.ELEMENT_TAB, false, false, (String) null);
    }

    public static /* synthetic */ FragmentBuilder_BindTodayTransactionsTabFragment MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindTodayTransactionsTabFragment fragmentBuilder_BindTodayTransactionsTabFragment, DeejungTransferLandingActivity deejungTransferLandingActivity, BaseAmortizationActivity baseAmortizationActivity, boolean z, boolean z2, String str, int i) {
        if ((i & 1) != 0) {
            deejungTransferLandingActivity = fragmentBuilder_BindTodayTransactionsTabFragment.write;
        }
        DeejungTransferLandingActivity deejungTransferLandingActivity2 = deejungTransferLandingActivity;
        if ((i & 2) != 0) {
            baseAmortizationActivity = fragmentBuilder_BindTodayTransactionsTabFragment.MediaBrowserCompat$CustomActionResultReceiver;
        }
        BaseAmortizationActivity baseAmortizationActivity2 = baseAmortizationActivity;
        if ((i & 4) != 0) {
            z = fragmentBuilder_BindTodayTransactionsTabFragment.read;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = fragmentBuilder_BindTodayTransactionsTabFragment.IconCompatParcelizer;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            str = fragmentBuilder_BindTodayTransactionsTabFragment.MediaBrowserCompat$ItemReceiver;
        }
        onGetStartedClick.write((Object) baseAmortizationActivity2, "selectedTab");
        return new FragmentBuilder_BindTodayTransactionsTabFragment(deejungTransferLandingActivity2, baseAmortizationActivity2, z3, z4, str);
    }
}
