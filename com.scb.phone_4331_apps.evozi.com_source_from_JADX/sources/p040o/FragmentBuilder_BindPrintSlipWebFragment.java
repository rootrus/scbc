package p040o;

/* renamed from: o.FragmentBuilder_BindPrintSlipWebFragment */
public abstract class FragmentBuilder_BindPrintSlipWebFragment {

    /* renamed from: o.FragmentBuilder_BindPrintSlipWebFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends FragmentBuilder_BindPrintSlipWebFragment {
        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) null, (Object) null);
            }
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateLocation(location=");
            sb.append((Object) null);
            sb.append(")");
            return sb.toString();
        }
    }

    private FragmentBuilder_BindPrintSlipWebFragment() {
    }

    public /* synthetic */ FragmentBuilder_BindPrintSlipWebFragment(byte b) {
        this();
    }

    /* renamed from: o.FragmentBuilder_BindPrintSlipWebFragment$read */
    public static final class read extends FragmentBuilder_BindPrintSlipWebFragment {
        final Throwable MediaBrowserCompat$CustomActionResultReceiver;
        final FragmentBuilder_BindMerchantWalletSelectorFragment read;

        public read() {
            this((FragmentBuilder_BindMerchantWalletSelectorFragment) null, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read2 = (read) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) read2.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) read2.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.read;
            int i = 0;
            int hashCode = fragmentBuilder_BindMerchantWalletSelectorFragment != null ? fragmentBuilder_BindMerchantWalletSelectorFragment.hashCode() : 0;
            Throwable th = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (th != null) {
                i = th.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FetchDeviceInformationFailure(systemCode=");
            sb.append(this.read);
            sb.append(", error=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ read(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, int i) {
            this((i & 1) != 0 ? null : fragmentBuilder_BindMerchantWalletSelectorFragment, (Throwable) null);
        }

        public read(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th) {
            super((byte) 0);
            this.read = fragmentBuilder_BindMerchantWalletSelectorFragment;
            this.MediaBrowserCompat$CustomActionResultReceiver = th;
        }
    }
}
