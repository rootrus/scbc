package p040o;

/* renamed from: o.FragmentBuilder_BindSmeLoanSelectorFragment */
public abstract class FragmentBuilder_BindSmeLoanSelectorFragment {

    /* renamed from: o.FragmentBuilder_BindSmeLoanSelectorFragment$RatingCompat */
    public static final class RatingCompat extends FragmentBuilder_BindSmeLoanSelectorFragment {
        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) null, (Object) null);
            }
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateOptOut(optOutConfiguration=");
            sb.append((Object) null);
            sb.append(")");
            return sb.toString();
        }
    }

    private FragmentBuilder_BindSmeLoanSelectorFragment() {
    }

    public /* synthetic */ FragmentBuilder_BindSmeLoanSelectorFragment(byte b) {
        this();
    }

    /* renamed from: o.FragmentBuilder_BindSmeLoanSelectorFragment$read */
    public static final class read extends FragmentBuilder_BindSmeLoanSelectorFragment {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        private read() {
            super((byte) 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindSmeLoanSelectorFragment$MediaMetadataCompat */
    public static final class MediaMetadataCompat extends FragmentBuilder_BindSmeLoanSelectorFragment {
        public static final MediaMetadataCompat IconCompatParcelizer = new MediaMetadataCompat();

        private MediaMetadataCompat() {
            super((byte) 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindSmeLoanSelectorFragment$write */
    public static final class write extends FragmentBuilder_BindSmeLoanSelectorFragment {
        final FragmentBuilder_BindMerchantWalletSelectorFragment MediaBrowserCompat$CustomActionResultReceiver;
        final Throwable write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write write2 = (write) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) write2.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) write2.write);
        }

        public final int hashCode() {
            FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
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
            sb.append("PersistOptOutFailure(systemCode=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", throwable=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ write(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment) {
            this(fragmentBuilder_BindMerchantWalletSelectorFragment, (Throwable) null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th) {
            super((byte) 0);
            onGetStartedClick.write((Object) fragmentBuilder_BindMerchantWalletSelectorFragment, "systemCode");
            this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindMerchantWalletSelectorFragment;
            this.write = th;
        }
    }

    /* renamed from: o.FragmentBuilder_BindSmeLoanSelectorFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends FragmentBuilder_BindSmeLoanSelectorFragment {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super((byte) 0);
        }
    }
}
