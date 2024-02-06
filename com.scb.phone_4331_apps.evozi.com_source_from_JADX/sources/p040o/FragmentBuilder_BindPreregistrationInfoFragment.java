package p040o;

/* renamed from: o.FragmentBuilder_BindPreregistrationInfoFragment */
public abstract class FragmentBuilder_BindPreregistrationInfoFragment {
    private FragmentBuilder_BindPreregistrationInfoFragment() {
    }

    public /* synthetic */ FragmentBuilder_BindPreregistrationInfoFragment(byte b) {
        this();
    }

    /* renamed from: o.FragmentBuilder_BindPreregistrationInfoFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends FragmentBuilder_BindPreregistrationInfoFragment {
        final FragmentBuilder_BindHmlOutcomeCounterOfferFragment MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver);
            }
            return true;
        }

        public final int hashCode() {
            FragmentBuilder_BindHmlOutcomeCounterOfferFragment fragmentBuilder_BindHmlOutcomeCounterOfferFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (fragmentBuilder_BindHmlOutcomeCounterOfferFragment != null) {
                return fragmentBuilder_BindHmlOutcomeCounterOfferFragment.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateConfiguration(identityTransferConfiguration=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(FragmentBuilder_BindHmlOutcomeCounterOfferFragment fragmentBuilder_BindHmlOutcomeCounterOfferFragment) {
            super((byte) 0);
            onGetStartedClick.write((Object) fragmentBuilder_BindHmlOutcomeCounterOfferFragment, "identityTransferConfiguration");
            this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindHmlOutcomeCounterOfferFragment;
        }
    }
}
