package p040o;

/* renamed from: o.FragmentBuilder_BindHmlNtbCalculatorFragment */
public final class FragmentBuilder_BindHmlNtbCalculatorFragment {
    public final String MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FragmentBuilder_BindHmlNtbCalculatorFragment) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((FragmentBuilder_BindHmlNtbCalculatorFragment) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiKey(key=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindHmlNtbCalculatorFragment(String str) {
        onGetStartedClick.write((Object) str, "key");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }
}
