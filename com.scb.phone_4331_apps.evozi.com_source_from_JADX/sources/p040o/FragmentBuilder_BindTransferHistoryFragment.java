package p040o;

/* renamed from: o.FragmentBuilder_BindTransferHistoryFragment */
public final class FragmentBuilder_BindTransferHistoryFragment {
    final boolean IconCompatParcelizer;
    final boolean MediaBrowserCompat$ItemReceiver;
    final boolean write;

    public FragmentBuilder_BindTransferHistoryFragment() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindTransferHistoryFragment)) {
            return false;
        }
        FragmentBuilder_BindTransferHistoryFragment fragmentBuilder_BindTransferHistoryFragment = (FragmentBuilder_BindTransferHistoryFragment) obj;
        return this.IconCompatParcelizer == fragmentBuilder_BindTransferHistoryFragment.IconCompatParcelizer && this.MediaBrowserCompat$ItemReceiver == fragmentBuilder_BindTransferHistoryFragment.MediaBrowserCompat$ItemReceiver && this.write == fragmentBuilder_BindTransferHistoryFragment.write;
    }

    public final int hashCode() {
        boolean z = this.IconCompatParcelizer;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.MediaBrowserCompat$ItemReceiver;
        if (z3) {
            z3 = true;
        }
        boolean z4 = this.write;
        if (!z4) {
            z2 = z4;
        }
        return ((((z ? 1 : 0) * true) + (z3 ? 1 : 0)) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PreviewPanelVisibleInformation(enableInTheWorks=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", enableLaunchPad=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", enableLive=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindTransferHistoryFragment(boolean z, boolean z2, boolean z3) {
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompat$ItemReceiver = z2;
        this.write = z3;
    }

    public /* synthetic */ FragmentBuilder_BindTransferHistoryFragment(byte b) {
        this(false, false, false);
    }
}
