package p040o;

/* renamed from: o.FragmentBuilder_SelectInvestmentFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6875x8f56b680 extends FragmentBuilder_SelectInvestmentFragment {
    public final Boolean IconCompatParcelizer;
    final Boolean write;

    public C6875x8f56b680() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6875x8f56b680)) {
            return false;
        }
        C6875x8f56b680 fragmentBuilder_SelectInvestmentFragment$MediaBrowserCompat$CustomActionResultReceiver = (C6875x8f56b680) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_SelectInvestmentFragment$MediaBrowserCompat$CustomActionResultReceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_SelectInvestmentFragment$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
    }

    public final int hashCode() {
        Boolean bool = this.write;
        int i = 0;
        int hashCode = bool != null ? bool.hashCode() : 0;
        Boolean bool2 = this.IconCompatParcelizer;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdateConnectivity(hasWifi=");
        sb.append(this.write);
        sb.append(", hasInternet=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    private /* synthetic */ C6875x8f56b680(byte b) {
        this((Boolean) null, (Boolean) null);
    }

    public C6875x8f56b680(Boolean bool, Boolean bool2) {
        super((byte) 0);
        this.write = bool;
        this.IconCompatParcelizer = bool2;
    }
}
