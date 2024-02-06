package p040o;

/* renamed from: o.FragmentBuilder_BindPrintSlipWebFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6674xb916d335 extends FragmentBuilder_BindPrintSlipWebFragment {
    final FragmentBuilder_BindHmlOutcomeResubmissionFragment IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C6674xb916d335) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((C6674xb916d335) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        FragmentBuilder_BindHmlOutcomeResubmissionFragment fragmentBuilder_BindHmlOutcomeResubmissionFragment = this.IconCompatParcelizer;
        if (fragmentBuilder_BindHmlOutcomeResubmissionFragment != null) {
            return fragmentBuilder_BindHmlOutcomeResubmissionFragment.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FetchDeviceInformationSuccess(deviceInformation=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6674xb916d335(FragmentBuilder_BindHmlOutcomeResubmissionFragment fragmentBuilder_BindHmlOutcomeResubmissionFragment) {
        super((byte) 0);
        onGetStartedClick.write((Object) fragmentBuilder_BindHmlOutcomeResubmissionFragment, "deviceInformation");
        this.IconCompatParcelizer = fragmentBuilder_BindHmlOutcomeResubmissionFragment;
    }
}
