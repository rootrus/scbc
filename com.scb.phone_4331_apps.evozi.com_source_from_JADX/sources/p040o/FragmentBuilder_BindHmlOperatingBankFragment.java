package p040o;

import java.net.URI;

/* renamed from: o.FragmentBuilder_BindHmlOperatingBankFragment */
public final class FragmentBuilder_BindHmlOperatingBankFragment {
    public final URI write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FragmentBuilder_BindHmlOperatingBankFragment) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((FragmentBuilder_BindHmlOperatingBankFragment) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        URI uri = this.write;
        if (uri != null) {
            return uri.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Thinstance(uri=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindHmlOperatingBankFragment(URI uri) {
        onGetStartedClick.write((Object) uri, "uri");
        this.write = uri;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentBuilder_BindHmlOperatingBankFragment(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
        this(fragmentBuilder_BindHmlOperatingBankFragment.write);
        onGetStartedClick.write((Object) fragmentBuilder_BindHmlOperatingBankFragment, "other");
    }
}
