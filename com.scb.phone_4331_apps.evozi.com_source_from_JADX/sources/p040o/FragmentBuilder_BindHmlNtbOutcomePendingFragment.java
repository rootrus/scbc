package p040o;

/* renamed from: o.FragmentBuilder_BindHmlNtbOutcomePendingFragment */
public final class FragmentBuilder_BindHmlNtbOutcomePendingFragment {
    public final String write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FragmentBuilder_BindHmlNtbOutcomePendingFragment) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((FragmentBuilder_BindHmlNtbOutcomePendingFragment) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.write;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserId(id=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindHmlNtbOutcomePendingFragment(String str) {
        onGetStartedClick.write((Object) str, Name.MARK);
        this.write = str;
    }
}
