package p040o;

/* renamed from: o.FragmentBuilder_BindPromptPayQRSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6680xb8275b2c extends FragmentBuilder_BindPromptPayQRSuccessFragment {
    public final boolean MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C6680xb8275b2c) && this.MediaBrowserCompat$ItemReceiver == ((C6680xb8275b2c) obj).MediaBrowserCompat$ItemReceiver;
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
        sb.append("UpdateOnScreenInteractions(updatingOnScreenInteractions=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public C6680xb8275b2c(boolean z) {
        super((byte) 0);
        this.MediaBrowserCompat$ItemReceiver = z;
    }
}
