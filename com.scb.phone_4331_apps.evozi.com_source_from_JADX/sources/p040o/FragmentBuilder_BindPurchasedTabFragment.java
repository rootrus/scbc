package p040o;

/* renamed from: o.FragmentBuilder_BindPurchasedTabFragment */
public abstract class FragmentBuilder_BindPurchasedTabFragment {
    private FragmentBuilder_BindPurchasedTabFragment() {
    }

    public /* synthetic */ FragmentBuilder_BindPurchasedTabFragment(byte b) {
        this();
    }

    /* renamed from: o.FragmentBuilder_BindPurchasedTabFragment$write */
    public static final class write extends FragmentBuilder_BindPurchasedTabFragment {
        final FragmentBuilder_BindMerchantWalletSelectorFragment MediaBrowserCompat$CustomActionResultReceiver;
        final Throwable write;

        public write() {
            this((FragmentBuilder_BindMerchantWalletSelectorFragment) null, (Throwable) null, 3);
        }

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
            sb.append("FetchFailure(systemCode=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", throwable=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ write(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th, int i) {
            this((i & 1) != 0 ? null : fragmentBuilder_BindMerchantWalletSelectorFragment, (i & 2) != 0 ? null : th);
        }

        public write(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th) {
            super((byte) 0);
            this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindMerchantWalletSelectorFragment;
            this.write = th;
        }
    }

    /* renamed from: o.FragmentBuilder_BindPurchasedTabFragment$read */
    public static final class read extends FragmentBuilder_BindPurchasedTabFragment {
        final FragmentBuilder_BindPurchaseProfileManagementFragment IconCompatParcelizer;

        public read() {
            this((byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((read) obj).IconCompatParcelizer);
            }
            return true;
        }

        public final int hashCode() {
            FragmentBuilder_BindPurchaseProfileManagementFragment fragmentBuilder_BindPurchaseProfileManagementFragment = this.IconCompatParcelizer;
            if (fragmentBuilder_BindPurchaseProfileManagementFragment != null) {
                return fragmentBuilder_BindPurchaseProfileManagementFragment.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FetchSuccess(allowedInteractions=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        private /* synthetic */ read(byte b) {
            this((FragmentBuilder_BindPurchaseProfileManagementFragment) null);
        }

        public read(FragmentBuilder_BindPurchaseProfileManagementFragment fragmentBuilder_BindPurchaseProfileManagementFragment) {
            super((byte) 0);
            this.IconCompatParcelizer = fragmentBuilder_BindPurchaseProfileManagementFragment;
        }
    }

    /* renamed from: o.FragmentBuilder_BindPurchasedTabFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends FragmentBuilder_BindPurchasedTabFragment {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super((byte) 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindPurchasedTabFragment$RatingCompat */
    public static final class RatingCompat extends FragmentBuilder_BindPurchasedTabFragment {
        public static final RatingCompat MediaBrowserCompat$CustomActionResultReceiver = new RatingCompat();

        private RatingCompat() {
            super((byte) 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindPurchasedTabFragment$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat extends FragmentBuilder_BindPurchasedTabFragment {
        final FragmentBuilder_BindPurchaseProfileManagementFragment read;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((MediaDescriptionCompat) obj).read);
            }
            return true;
        }

        public final int hashCode() {
            FragmentBuilder_BindPurchaseProfileManagementFragment fragmentBuilder_BindPurchaseProfileManagementFragment = this.read;
            if (fragmentBuilder_BindPurchaseProfileManagementFragment != null) {
                return fragmentBuilder_BindPurchaseProfileManagementFragment.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LoadSuccess(allowedInteractions=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public MediaDescriptionCompat(FragmentBuilder_BindPurchaseProfileManagementFragment fragmentBuilder_BindPurchaseProfileManagementFragment) {
            super((byte) 0);
            this.read = fragmentBuilder_BindPurchaseProfileManagementFragment;
        }
    }

    /* renamed from: o.FragmentBuilder_BindPurchasedTabFragment$MediaMetadataCompat */
    public static final class MediaMetadataCompat extends FragmentBuilder_BindPurchasedTabFragment {
        public static final MediaMetadataCompat MediaBrowserCompat$CustomActionResultReceiver = new MediaMetadataCompat();

        private MediaMetadataCompat() {
            super((byte) 0);
        }
    }
}
