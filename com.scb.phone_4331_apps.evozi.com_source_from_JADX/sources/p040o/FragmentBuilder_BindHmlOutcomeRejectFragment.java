package p040o;

/* renamed from: o.FragmentBuilder_BindHmlOutcomeRejectFragment */
public final class FragmentBuilder_BindHmlOutcomeRejectFragment {
    public String read;

    public /* synthetic */ FragmentBuilder_BindHmlOutcomeRejectFragment() {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FragmentBuilder_BindHmlOutcomeRejectFragment) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((FragmentBuilder_BindHmlOutcomeRejectFragment) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.read;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AllowedInteraction(regex=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindHmlOutcomeRejectFragment(String str) {
        this.read = str;
    }
}
