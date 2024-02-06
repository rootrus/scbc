package p040o;

/* renamed from: o.FragmentBuilder_BindTabDebitCardServiceFragment */
public final class FragmentBuilder_BindTabDebitCardServiceFragment {
    final boolean MediaBrowserCompat$ItemReceiver;
    final boolean read;
    final Boolean write;

    public FragmentBuilder_BindTabDebitCardServiceFragment() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindTabDebitCardServiceFragment)) {
            return false;
        }
        FragmentBuilder_BindTabDebitCardServiceFragment fragmentBuilder_BindTabDebitCardServiceFragment = (FragmentBuilder_BindTabDebitCardServiceFragment) obj;
        return this.MediaBrowserCompat$ItemReceiver == fragmentBuilder_BindTabDebitCardServiceFragment.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindTabDebitCardServiceFragment.write) && this.read == fragmentBuilder_BindTabDebitCardServiceFragment.read;
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        Boolean bool = this.write;
        int hashCode = bool != null ? bool.hashCode() : 0;
        boolean z3 = this.read;
        if (!z3) {
            z2 = z3;
        }
        return ((((z ? 1 : 0) * true) + hashCode) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PokerchipState(isInvalidMessageOpen=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", isDrawOverPermissionDenied=");
        sb.append(this.write);
        sb.append(", isRequestingRequiredPermissions=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    private FragmentBuilder_BindTabDebitCardServiceFragment(boolean z, Boolean bool, boolean z2) {
        this.MediaBrowserCompat$ItemReceiver = z;
        this.write = bool;
        this.read = z2;
    }

    public /* synthetic */ FragmentBuilder_BindTabDebitCardServiceFragment(byte b) {
        this(false, (Boolean) null, false);
    }

    public static /* synthetic */ FragmentBuilder_BindTabDebitCardServiceFragment MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindTabDebitCardServiceFragment fragmentBuilder_BindTabDebitCardServiceFragment, boolean z, Boolean bool, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = fragmentBuilder_BindTabDebitCardServiceFragment.MediaBrowserCompat$ItemReceiver;
        }
        if ((i & 2) != 0) {
            bool = fragmentBuilder_BindTabDebitCardServiceFragment.write;
        }
        if ((i & 4) != 0) {
            z2 = fragmentBuilder_BindTabDebitCardServiceFragment.read;
        }
        return new FragmentBuilder_BindTabDebitCardServiceFragment(z, bool, z2);
    }
}
