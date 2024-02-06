package p040o;

/* renamed from: o.FragmentBuilder_BindSensitiveCSentFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C1193x41a50793 extends FragmentBuilder_BindSensitiveCSentFragment {
    final FragmentBuilder_BindSelectPurposeFragment read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C1193x41a50793) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((C1193x41a50793) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        FragmentBuilder_BindSelectPurposeFragment fragmentBuilder_BindSelectPurposeFragment = this.read;
        if (fragmentBuilder_BindSelectPurposeFragment != null) {
            return fragmentBuilder_BindSelectPurposeFragment.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdateConfiguration(messagingConfiguration=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1193x41a50793(FragmentBuilder_BindSelectPurposeFragment fragmentBuilder_BindSelectPurposeFragment) {
        super((byte) 0);
        onGetStartedClick.write((Object) fragmentBuilder_BindSelectPurposeFragment, "messagingConfiguration");
        this.read = fragmentBuilder_BindSelectPurposeFragment;
    }
}
