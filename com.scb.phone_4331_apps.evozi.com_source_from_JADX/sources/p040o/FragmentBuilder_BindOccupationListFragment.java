package p040o;

/* renamed from: o.FragmentBuilder_BindOccupationListFragment */
public abstract class FragmentBuilder_BindOccupationListFragment {
    private FragmentBuilder_BindOccupationListFragment() {
    }

    public /* synthetic */ FragmentBuilder_BindOccupationListFragment(byte b) {
        this();
    }

    /* renamed from: o.FragmentBuilder_BindOccupationListFragment$MediaMetadataCompat */
    public static final class MediaMetadataCompat extends FragmentBuilder_BindOccupationListFragment {
        final FragmentBuilder_BindHmlNoDepositAccountFragment write;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((MediaMetadataCompat) obj).write);
            }
            return true;
        }

        public final int hashCode() {
            FragmentBuilder_BindHmlNoDepositAccountFragment fragmentBuilder_BindHmlNoDepositAccountFragment = this.write;
            if (fragmentBuilder_BindHmlNoDepositAccountFragment != null) {
                return fragmentBuilder_BindHmlNoDepositAccountFragment.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Update(configuration=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(FragmentBuilder_BindHmlNoDepositAccountFragment fragmentBuilder_BindHmlNoDepositAccountFragment) {
            super((byte) 0);
            onGetStartedClick.write((Object) fragmentBuilder_BindHmlNoDepositAccountFragment, "configuration");
            this.write = fragmentBuilder_BindHmlNoDepositAccountFragment;
        }
    }

    /* renamed from: o.FragmentBuilder_BindOccupationListFragment$read */
    public static final class read extends FragmentBuilder_BindOccupationListFragment {
        public static final read read = new read();

        private read() {
            super((byte) 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindOccupationListFragment$RatingCompat */
    public static final class RatingCompat extends FragmentBuilder_BindOccupationListFragment {
        final FragmentBuilder_BindHmlOccupationInfoFragment IconCompatParcelizer;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((RatingCompat) obj).IconCompatParcelizer);
            }
            return true;
        }

        public final int hashCode() {
            FragmentBuilder_BindHmlOccupationInfoFragment fragmentBuilder_BindHmlOccupationInfoFragment = this.IconCompatParcelizer;
            if (fragmentBuilder_BindHmlOccupationInfoFragment != null) {
                return fragmentBuilder_BindHmlOccupationInfoFragment.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FetchWorkspaceSuccess(workspace=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RatingCompat(FragmentBuilder_BindHmlOccupationInfoFragment fragmentBuilder_BindHmlOccupationInfoFragment) {
            super((byte) 0);
            onGetStartedClick.write((Object) fragmentBuilder_BindHmlOccupationInfoFragment, "workspace");
            this.IconCompatParcelizer = fragmentBuilder_BindHmlOccupationInfoFragment;
        }
    }

    /* renamed from: o.FragmentBuilder_BindOccupationListFragment$write */
    public static final class write extends FragmentBuilder_BindOccupationListFragment {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        private write() {
            super((byte) 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindOccupationListFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends FragmentBuilder_BindOccupationListFragment {
        final Throwable read;
        final FragmentBuilder_BindMerchantWalletSelectorFragment write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) iconCompatParcelizer.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) iconCompatParcelizer.read);
        }

        public final int hashCode() {
            FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment = this.write;
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
            sb.append("CreateTouchpointFailure(systemCode=");
            sb.append(this.write);
            sb.append(", throwable=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th) {
            super((byte) 0);
            onGetStartedClick.write((Object) fragmentBuilder_BindMerchantWalletSelectorFragment, "systemCode");
            this.write = fragmentBuilder_BindMerchantWalletSelectorFragment;
            this.read = th;
        }
    }
}
