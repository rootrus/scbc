package p040o;

/* renamed from: o.FragmentBuilder_BindSetDetailFragment */
public final class FragmentBuilder_BindSetDetailFragment {
    private final boolean IconCompatParcelizer;
    final FragmentBuilder_BindSelectPurposeFragment MediaBrowserCompat$CustomActionResultReceiver;
    final Boolean MediaBrowserCompat$ItemReceiver;
    final String read;
    final boolean write;

    public FragmentBuilder_BindSetDetailFragment() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindSetDetailFragment)) {
            return false;
        }
        FragmentBuilder_BindSetDetailFragment fragmentBuilder_BindSetDetailFragment = (FragmentBuilder_BindSetDetailFragment) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindSetDetailFragment.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindSetDetailFragment.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fragmentBuilder_BindSetDetailFragment.read) && this.IconCompatParcelizer == fragmentBuilder_BindSetDetailFragment.IconCompatParcelizer && this.write == fragmentBuilder_BindSetDetailFragment.write;
    }

    public final int hashCode() {
        FragmentBuilder_BindSelectPurposeFragment fragmentBuilder_BindSelectPurposeFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = fragmentBuilder_BindSelectPurposeFragment != null ? fragmentBuilder_BindSelectPurposeFragment.hashCode() : 0;
        Boolean bool = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = bool != null ? bool.hashCode() : 0;
        String str = this.read;
        if (str != null) {
            i = str.hashCode();
        }
        boolean z = this.IconCompatParcelizer;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.write;
        if (!z3) {
            z2 = z3;
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + i) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MessagingState(messagingConfiguration=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", isRequestedMessagingEnabled=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", pushToken=");
        sb.append(this.read);
        sb.append(", isSendingPushToken=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", hasPushTokenBeenSent=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    private FragmentBuilder_BindSetDetailFragment(FragmentBuilder_BindSelectPurposeFragment fragmentBuilder_BindSelectPurposeFragment, Boolean bool, String str, boolean z, boolean z2) {
        onGetStartedClick.write((Object) fragmentBuilder_BindSelectPurposeFragment, "messagingConfiguration");
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindSelectPurposeFragment;
        this.MediaBrowserCompat$ItemReceiver = bool;
        this.read = str;
        this.IconCompatParcelizer = z;
        this.write = z2;
    }

    public /* synthetic */ FragmentBuilder_BindSetDetailFragment(byte b) {
        this(new FragmentBuilder_BindSelectPurposeFragment((byte) 0), (Boolean) null, (String) null, false, false);
    }

    public static /* synthetic */ FragmentBuilder_BindSetDetailFragment read(FragmentBuilder_BindSetDetailFragment fragmentBuilder_BindSetDetailFragment, FragmentBuilder_BindSelectPurposeFragment fragmentBuilder_BindSelectPurposeFragment, Boolean bool, String str, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            fragmentBuilder_BindSelectPurposeFragment = fragmentBuilder_BindSetDetailFragment.MediaBrowserCompat$CustomActionResultReceiver;
        }
        FragmentBuilder_BindSelectPurposeFragment fragmentBuilder_BindSelectPurposeFragment2 = fragmentBuilder_BindSelectPurposeFragment;
        if ((i & 2) != 0) {
            bool = fragmentBuilder_BindSetDetailFragment.MediaBrowserCompat$ItemReceiver;
        }
        Boolean bool2 = bool;
        if ((i & 4) != 0) {
            str = fragmentBuilder_BindSetDetailFragment.read;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z = fragmentBuilder_BindSetDetailFragment.IconCompatParcelizer;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = fragmentBuilder_BindSetDetailFragment.write;
        }
        onGetStartedClick.write((Object) fragmentBuilder_BindSelectPurposeFragment2, "messagingConfiguration");
        return new FragmentBuilder_BindSetDetailFragment(fragmentBuilder_BindSelectPurposeFragment2, bool2, str2, z3, z2);
    }
}
