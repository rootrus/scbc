package p040o;

/* renamed from: o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment */
public final class FragmentBuilder_BindHmlNtbOutcomeRejectFragment {
    public final String read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FragmentBuilder_BindHmlNtbOutcomeRejectFragment) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((FragmentBuilder_BindHmlNtbOutcomeRejectFragment) obj).read);
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
        sb.append("SiteKey(key=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindHmlNtbOutcomeRejectFragment(String str) {
        onGetStartedClick.write((Object) str, "key");
        this.read = str;
    }
}
