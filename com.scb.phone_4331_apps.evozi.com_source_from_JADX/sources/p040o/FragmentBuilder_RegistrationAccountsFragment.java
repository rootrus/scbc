package p040o;

/* renamed from: o.FragmentBuilder_RegistrationAccountsFragment */
public final class FragmentBuilder_RegistrationAccountsFragment {
    final boolean MediaBrowserCompat$CustomActionResultReceiver;

    public FragmentBuilder_RegistrationAccountsFragment() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FragmentBuilder_RegistrationAccountsFragment) && this.MediaBrowserCompat$CustomActionResultReceiver == ((FragmentBuilder_RegistrationAccountsFragment) obj).MediaBrowserCompat$CustomActionResultReceiver;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoginState(isLoginScreenOpen=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_RegistrationAccountsFragment(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public /* synthetic */ FragmentBuilder_RegistrationAccountsFragment(byte b) {
        this(false);
    }
}
