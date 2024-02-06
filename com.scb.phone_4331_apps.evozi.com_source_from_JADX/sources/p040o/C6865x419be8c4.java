package p040o;

/* renamed from: o.FragmentBuilder_BindTransferToPromptPayStep1Fragment$MediaBrowserCompat$ItemReceiver */
public final class C6865x419be8c4 extends FragmentBuilder_BindTransferToPromptPayStep1Fragment {
    public final FragmentBuilder_BindVerifyIdentityFragment MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C6865x419be8c4) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((C6865x419be8c4) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return true;
    }

    public final int hashCode() {
        FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindVerifyIdentityFragment != null) {
            return fragmentBuilder_BindVerifyIdentityFragment.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeMode(sdkMode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6865x419be8c4(FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment) {
        super((byte) 0);
        onGetStartedClick.write((Object) fragmentBuilder_BindVerifyIdentityFragment, "sdkMode");
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindVerifyIdentityFragment;
    }
}
