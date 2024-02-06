package p040o;

/* renamed from: o.FragmentBuilder_BindSmeLoanFragment */
public final class FragmentBuilder_BindSmeLoanFragment {
    final boolean MediaBrowserCompat$ItemReceiver;

    public FragmentBuilder_BindSmeLoanFragment() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FragmentBuilder_BindSmeLoanFragment) && this.MediaBrowserCompat$ItemReceiver == ((FragmentBuilder_BindSmeLoanFragment) obj).MediaBrowserCompat$ItemReceiver;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FullScreenNotificationState(isOpen=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ FragmentBuilder_BindSmeLoanFragment(byte b) {
        this(false);
    }

    public FragmentBuilder_BindSmeLoanFragment(boolean z) {
        this.MediaBrowserCompat$ItemReceiver = z;
    }
}
