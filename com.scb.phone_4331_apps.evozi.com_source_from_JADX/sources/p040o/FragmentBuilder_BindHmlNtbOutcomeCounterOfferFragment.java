package p040o;

/* renamed from: o.FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment */
public final class FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment {
    public final boolean IconCompatParcelizer;
    public final boolean MediaBrowserCompat$ItemReceiver;

    public FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment)) {
            return false;
        }
        FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment fragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment = (FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment) obj;
        return this.MediaBrowserCompat$ItemReceiver == fragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment.MediaBrowserCompat$ItemReceiver && this.IconCompatParcelizer == fragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment.IconCompatParcelizer;
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.IconCompatParcelizer;
        if (!z3) {
            z2 = z3;
        }
        return ((z ? 1 : 0) * true) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CodelessInteractionTrackingConfiguration(isInteractionTrackingDisabled=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", isOutboundLinkTrackingDisabled=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    private FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment(boolean z, boolean z2) {
        this.MediaBrowserCompat$ItemReceiver = false;
        this.IconCompatParcelizer = false;
    }

    public /* synthetic */ FragmentBuilder_BindHmlNtbOutcomeCounterOfferFragment(byte b) {
        this(false, false);
    }
}
