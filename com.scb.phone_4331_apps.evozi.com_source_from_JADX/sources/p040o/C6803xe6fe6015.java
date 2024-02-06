package p040o;

/* renamed from: o.FragmentBuilder_BindSmeLoanSelectorFragment$MediaBrowserCompat$ItemReceiver */
public final class C6803xe6fe6015 extends FragmentBuilder_BindSmeLoanSelectorFragment {
    final boolean MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C6803xe6fe6015) && this.MediaBrowserCompat$ItemReceiver == ((C6803xe6fe6015) obj).MediaBrowserCompat$ItemReceiver;
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
        sb.append("FetchOptOutSuccess(optOut=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public C6803xe6fe6015(boolean z) {
        super((byte) 0);
        this.MediaBrowserCompat$ItemReceiver = z;
    }
}
