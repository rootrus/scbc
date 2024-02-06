package p040o;

/* renamed from: o.FragmentBuilder_BindSelectPurposeFragment */
public final class FragmentBuilder_BindSelectPurposeFragment {
    final boolean IconCompatParcelizer;
    final Integer write;

    public FragmentBuilder_BindSelectPurposeFragment() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindSelectPurposeFragment)) {
            return false;
        }
        FragmentBuilder_BindSelectPurposeFragment fragmentBuilder_BindSelectPurposeFragment = (FragmentBuilder_BindSelectPurposeFragment) obj;
        return this.IconCompatParcelizer == fragmentBuilder_BindSelectPurposeFragment.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindSelectPurposeFragment.write);
    }

    public final int hashCode() {
        boolean z = this.IconCompatParcelizer;
        if (z) {
            z = true;
        }
        Integer num = this.write;
        return ((z ? 1 : 0) * true) + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MessagingConfiguration(enabled=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", nonAdaptiveSmallIcon=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindSelectPurposeFragment(boolean z, Integer num) {
        this.IconCompatParcelizer = z;
        this.write = num;
    }

    public /* synthetic */ FragmentBuilder_BindSelectPurposeFragment(byte b) {
        this(false, (Integer) null);
    }
}
