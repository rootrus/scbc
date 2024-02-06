package p040o;

/* renamed from: o.FragmentBuilder_BindSuitabilityQuestionsPart2Fragment */
public abstract class FragmentBuilder_BindSuitabilityQuestionsPart2Fragment {

    /* renamed from: o.FragmentBuilder_BindSuitabilityQuestionsPart2Fragment$MediaMetadataCompat */
    public static final class MediaMetadataCompat extends FragmentBuilder_BindSuitabilityQuestionsPart2Fragment {
        public static final MediaMetadataCompat IconCompatParcelizer = new MediaMetadataCompat();

        private MediaMetadataCompat() {
            super((byte) 0);
        }
    }

    private FragmentBuilder_BindSuitabilityQuestionsPart2Fragment() {
    }

    public /* synthetic */ FragmentBuilder_BindSuitabilityQuestionsPart2Fragment(byte b) {
        this();
    }

    /* renamed from: o.FragmentBuilder_BindSuitabilityQuestionsPart2Fragment$read */
    public static final class read extends FragmentBuilder_BindSuitabilityQuestionsPart2Fragment {
        public static final read read = new read();

        private read() {
            super((byte) 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindSuitabilityQuestionsPart2Fragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends FragmentBuilder_BindSuitabilityQuestionsPart2Fragment {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super((byte) 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindSuitabilityQuestionsPart2Fragment$write */
    public static final class write extends FragmentBuilder_BindSuitabilityQuestionsPart2Fragment {
        private final FragmentBuilder_BindMerchantWalletSelectorFragment read;
        private final Throwable write;

        public write() {
            this((byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write write2 = (write) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) write2.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) write2.write);
        }

        public final int hashCode() {
            FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.read;
            int i = 0;
            int hashCode = fragmentBuilder_BindMerchantWalletSelectorFragment != null ? fragmentBuilder_BindMerchantWalletSelectorFragment.hashCode() : 0;
            Throwable th = this.write;
            if (th != null) {
                i = th.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RequestRequiredPermissionsFailure(systemCode=");
            sb.append(this.read);
            sb.append(", throwable=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        private /* synthetic */ write(byte b) {
            this((FragmentBuilder_BindMerchantWalletSelectorFragment) null, (Throwable) null);
        }

        private write(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th) {
            super((byte) 0);
            this.read = null;
            this.write = null;
        }
    }
}
