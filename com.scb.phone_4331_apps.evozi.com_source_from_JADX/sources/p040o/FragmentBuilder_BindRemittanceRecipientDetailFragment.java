package p040o;

/* renamed from: o.FragmentBuilder_BindRemittanceRecipientDetailFragment */
public final class FragmentBuilder_BindRemittanceRecipientDetailFragment {
    final boolean IconCompatParcelizer;
    final boolean MediaBrowserCompat$CustomActionResultReceiver;
    final boolean MediaBrowserCompat$ItemReceiver;
    final Long write;

    public FragmentBuilder_BindRemittanceRecipientDetailFragment() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindRemittanceRecipientDetailFragment)) {
            return false;
        }
        FragmentBuilder_BindRemittanceRecipientDetailFragment fragmentBuilder_BindRemittanceRecipientDetailFragment = (FragmentBuilder_BindRemittanceRecipientDetailFragment) obj;
        return this.MediaBrowserCompat$ItemReceiver == fragmentBuilder_BindRemittanceRecipientDetailFragment.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindRemittanceRecipientDetailFragment.write) && this.IconCompatParcelizer == fragmentBuilder_BindRemittanceRecipientDetailFragment.IconCompatParcelizer && this.MediaBrowserCompat$CustomActionResultReceiver == fragmentBuilder_BindRemittanceRecipientDetailFragment.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        Long l = this.write;
        int hashCode = l != null ? l.hashCode() : 0;
        boolean z3 = this.IconCompatParcelizer;
        if (z3) {
            z3 = true;
        }
        boolean z4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (!z4) {
            z2 = z4;
        }
        return ((((((z ? 1 : 0) * true) + hashCode) * 31) + (z3 ? 1 : 0)) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppInstallState(appInstallSent=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", appInstallTime=");
        sb.append(this.write);
        sb.append(", sendingAppInstall=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", loadingAppInstallSent=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    private FragmentBuilder_BindRemittanceRecipientDetailFragment(boolean z, Long l, boolean z2, boolean z3) {
        this.MediaBrowserCompat$ItemReceiver = z;
        this.write = l;
        this.IconCompatParcelizer = z2;
        this.MediaBrowserCompat$CustomActionResultReceiver = z3;
    }

    public /* synthetic */ FragmentBuilder_BindRemittanceRecipientDetailFragment(byte b) {
        this(false, (Long) null, false, true);
    }

    public static /* synthetic */ FragmentBuilder_BindRemittanceRecipientDetailFragment MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindRemittanceRecipientDetailFragment fragmentBuilder_BindRemittanceRecipientDetailFragment, boolean z, Long l, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = fragmentBuilder_BindRemittanceRecipientDetailFragment.MediaBrowserCompat$ItemReceiver;
        }
        if ((i & 2) != 0) {
            l = fragmentBuilder_BindRemittanceRecipientDetailFragment.write;
        }
        if ((i & 4) != 0) {
            z2 = fragmentBuilder_BindRemittanceRecipientDetailFragment.IconCompatParcelizer;
        }
        if ((i & 8) != 0) {
            z3 = fragmentBuilder_BindRemittanceRecipientDetailFragment.MediaBrowserCompat$CustomActionResultReceiver;
        }
        return new FragmentBuilder_BindRemittanceRecipientDetailFragment(z, l, z2, z3);
    }
}
