package p040o;

/* renamed from: o.FragmentBuilder_BindHowToAddAccountFragmentStep2 */
public final class FragmentBuilder_BindHowToAddAccountFragmentStep2 {
    public final boolean IconCompatParcelizer;

    public FragmentBuilder_BindHowToAddAccountFragmentStep2() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FragmentBuilder_BindHowToAddAccountFragmentStep2) && this.IconCompatParcelizer == ((FragmentBuilder_BindHowToAddAccountFragmentStep2) obj).IconCompatParcelizer;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.IconCompatParcelizer;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OptOutConfiguration(optOut=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    private FragmentBuilder_BindHowToAddAccountFragmentStep2(boolean z) {
        this.IconCompatParcelizer = false;
    }

    private /* synthetic */ FragmentBuilder_BindHowToAddAccountFragmentStep2(byte b) {
        this(false);
    }
}
