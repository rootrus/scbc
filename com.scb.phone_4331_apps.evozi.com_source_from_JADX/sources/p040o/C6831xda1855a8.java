package p040o;

/* renamed from: o.FragmentBuilder_BindThirdPartyConsentFragment$MediaBrowserCompat$SearchResultReceiver */
public final class C6831xda1855a8 extends FragmentBuilder_BindThirdPartyConsentFragment {
    final DeejungTransferLandingActivity read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C6831xda1855a8) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((C6831xda1855a8) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        DeejungTransferLandingActivity deejungTransferLandingActivity = this.read;
        if (deejungTransferLandingActivity != null) {
            return deejungTransferLandingActivity.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdateSelectedElement(selectedElementItem=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public C6831xda1855a8(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        super((byte) 0);
        this.read = deejungTransferLandingActivity;
    }
}
