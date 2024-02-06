package p040o;

/* renamed from: o.FragmentBuilder_BindPrepaidCashOutLandingAndInputToAccountFragment */
public abstract class C6643x9654e915 {

    /* renamed from: o.FragmentBuilder_BindPrepaidCashOutLandingAndInputToAccountFragment$MediaMetadataCompat */
    public static final class MediaMetadataCompat extends C6643x9654e915 {
        final String read;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((MediaMetadataCompat) obj).read);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.read;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateTid(tid=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public MediaMetadataCompat(String str) {
            super((byte) 0);
            this.read = str;
        }
    }

    private C6643x9654e915() {
    }

    public /* synthetic */ C6643x9654e915(byte b) {
        this();
    }

    /* renamed from: o.FragmentBuilder_BindPrepaidCashOutLandingAndInputToAccountFragment$write */
    public static final class write extends C6643x9654e915 {
        public static final write read = new write();

        private write() {
            super((byte) 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindPrepaidCashOutLandingAndInputToAccountFragment$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat extends C6643x9654e915 {
        final FragmentBuilder_BindMerchantWalletSelectorFragment MediaBrowserCompat$CustomActionResultReceiver;
        final Throwable read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaDescriptionCompat)) {
                return false;
            }
            MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) mediaDescriptionCompat.read);
        }

        public final int hashCode() {
            FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = fragmentBuilder_BindMerchantWalletSelectorFragment != null ? fragmentBuilder_BindMerchantWalletSelectorFragment.hashCode() : 0;
            Throwable th = this.read;
            if (th != null) {
                i = th.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PersistTidFailure(systemCode=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", throwable=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MediaDescriptionCompat(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th) {
            super((byte) 0);
            onGetStartedClick.write((Object) fragmentBuilder_BindMerchantWalletSelectorFragment, "systemCode");
            this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindMerchantWalletSelectorFragment;
            this.read = th;
        }
    }

    /* renamed from: o.FragmentBuilder_BindPrepaidCashOutLandingAndInputToAccountFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends C6643x9654e915 {
        final String MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LoadTIDSuccess(tid=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public IconCompatParcelizer(String str) {
            super((byte) 0);
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }
    }

    /* renamed from: o.FragmentBuilder_BindPrepaidCashOutLandingAndInputToAccountFragment$read */
    public static final class read extends C6643x9654e915 {
        private final FragmentBuilder_BindMerchantWalletSelectorFragment IconCompatParcelizer;
        private final Throwable read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read2 = (read) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) read2.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) read2.read);
        }

        public final int hashCode() {
            FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = fragmentBuilder_BindMerchantWalletSelectorFragment != null ? fragmentBuilder_BindMerchantWalletSelectorFragment.hashCode() : 0;
            Throwable th = this.read;
            if (th != null) {
                i = th.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LoadTIDFailure(systemCode=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", throwable=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public read(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th) {
            super((byte) 0);
            this.IconCompatParcelizer = fragmentBuilder_BindMerchantWalletSelectorFragment;
            this.read = th;
        }
    }
}
