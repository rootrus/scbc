package p040o;

/* renamed from: o.FragmentBuilder_BindOPRStatusUnregisteredUserFragment */
public interface FragmentBuilder_BindOPRStatusUnregisteredUserFragment {
    Object MediaBrowserCompat$CustomActionResultReceiver(write write2, HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity> hmlNTBPromptPayNotFoundActivity);

    Object write(write write2, HmlNTBPromptPayNotFoundActivity<? super Boolean> hmlNTBPromptPayNotFoundActivity);

    /* renamed from: o.FragmentBuilder_BindOPRStatusUnregisteredUserFragment$write */
    public static final class write {
        final FragmentBuilder_BindHmlNtbOutcomeRejectFragment IconCompatParcelizer;
        final Boolean MediaBrowserCompat$ItemReceiver;
        final FragmentBuilder_BindHmlOperatingBankFragment read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write write = (write) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) write.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) write.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) write.read);
        }

        public final int hashCode() {
            Boolean bool = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = bool != null ? bool.hashCode() : 0;
            FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment = this.IconCompatParcelizer;
            int hashCode2 = fragmentBuilder_BindHmlNtbOutcomeRejectFragment != null ? fragmentBuilder_BindHmlNtbOutcomeRejectFragment.hashCode() : 0;
            FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment = this.read;
            if (fragmentBuilder_BindHmlOperatingBankFragment != null) {
                i = fragmentBuilder_BindHmlOperatingBankFragment.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Specification(rememberMe=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", siteKey=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", thinstance=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public write(Boolean bool, FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
            this.MediaBrowserCompat$ItemReceiver = bool;
            this.IconCompatParcelizer = fragmentBuilder_BindHmlNtbOutcomeRejectFragment;
            this.read = fragmentBuilder_BindHmlOperatingBankFragment;
        }

        public /* synthetic */ write(FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
            this((Boolean) null, fragmentBuilder_BindHmlNtbOutcomeRejectFragment, fragmentBuilder_BindHmlOperatingBankFragment);
        }
    }
}
