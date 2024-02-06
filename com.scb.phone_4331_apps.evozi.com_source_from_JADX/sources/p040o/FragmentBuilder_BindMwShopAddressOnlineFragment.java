package p040o;

import com.thunderhead.android.domain.authentication.AuthenticationAccessToken;
import com.thunderhead.android.domain.authentication.ClientCredentials;

/* renamed from: o.FragmentBuilder_BindMwShopAddressOnlineFragment */
public abstract class FragmentBuilder_BindMwShopAddressOnlineFragment {

    /* renamed from: o.FragmentBuilder_BindMwShopAddressOnlineFragment$MediaMetadataCompat */
    public static final class MediaMetadataCompat extends FragmentBuilder_BindMwShopAddressOnlineFragment {
        public static final MediaMetadataCompat write = new MediaMetadataCompat();

        private MediaMetadataCompat() {
            super((byte) 0);
        }
    }

    private FragmentBuilder_BindMwShopAddressOnlineFragment() {
    }

    public /* synthetic */ FragmentBuilder_BindMwShopAddressOnlineFragment(byte b) {
        this();
    }

    /* renamed from: o.FragmentBuilder_BindMwShopAddressOnlineFragment$write */
    public static final class write extends FragmentBuilder_BindMwShopAddressOnlineFragment {
        private final FragmentBuilder_BindMerchantWalletSelectorFragment MediaBrowserCompat$CustomActionResultReceiver;
        private final Throwable read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write write = (write) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) write.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) write.read);
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
            sb.append("FetchRememberMeCredentialsFailure(systemCode=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", throwable=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Throwable th) {
            super((byte) 0);
            onGetStartedClick.write((Object) fragmentBuilder_BindMerchantWalletSelectorFragment, "systemCode");
            this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindMerchantWalletSelectorFragment;
            this.read = th;
        }
    }

    /* renamed from: o.FragmentBuilder_BindMwShopAddressOnlineFragment$ParcelableVolumeInfo */
    public static final class ParcelableVolumeInfo extends FragmentBuilder_BindMwShopAddressOnlineFragment {
        public static final ParcelableVolumeInfo MediaBrowserCompat$ItemReceiver = new ParcelableVolumeInfo();

        private ParcelableVolumeInfo() {
            super((byte) 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindMwShopAddressOnlineFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends FragmentBuilder_BindMwShopAddressOnlineFragment {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super((byte) 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindMwShopAddressOnlineFragment$read */
    public static final class read extends FragmentBuilder_BindMwShopAddressOnlineFragment {
        final AuthenticationAccessToken read;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((read) obj).read);
            }
            return true;
        }

        public final int hashCode() {
            AuthenticationAccessToken authenticationAccessToken = this.read;
            if (authenticationAccessToken != null) {
                return authenticationAccessToken.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AutoLoginSuccess(authenticationAccessToken=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(AuthenticationAccessToken authenticationAccessToken) {
            super((byte) 0);
            onGetStartedClick.write((Object) authenticationAccessToken, "authenticationAccessToken");
            this.read = authenticationAccessToken;
        }
    }

    /* renamed from: o.FragmentBuilder_BindMwShopAddressOnlineFragment$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat extends FragmentBuilder_BindMwShopAddressOnlineFragment {
        public final ClientCredentials MediaBrowserCompat$ItemReceiver;
        public final boolean write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaDescriptionCompat)) {
                return false;
            }
            MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver) && this.write == mediaDescriptionCompat.write;
        }

        public final int hashCode() {
            ClientCredentials clientCredentials = this.MediaBrowserCompat$ItemReceiver;
            int hashCode = clientCredentials != null ? clientCredentials.hashCode() : 0;
            boolean z = this.write;
            if (z) {
                z = true;
            }
            return (hashCode * 31) + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PerformLoginStart(clientCredentials=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", rememberMe=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MediaDescriptionCompat(ClientCredentials clientCredentials, boolean z) {
            super((byte) 0);
            onGetStartedClick.write((Object) clientCredentials, "clientCredentials");
            this.MediaBrowserCompat$ItemReceiver = clientCredentials;
            this.write = z;
        }
    }

    /* renamed from: o.FragmentBuilder_BindMwShopAddressOnlineFragment$RatingCompat */
    public static final class RatingCompat extends FragmentBuilder_BindMwShopAddressOnlineFragment {
        final AuthenticationAccessToken IconCompatParcelizer;
        public final ClientCredentials read;
        public final boolean write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RatingCompat)) {
                return false;
            }
            RatingCompat ratingCompat = (RatingCompat) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ratingCompat.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ratingCompat.read) && this.write == ratingCompat.write;
        }

        public final int hashCode() {
            AuthenticationAccessToken authenticationAccessToken = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = authenticationAccessToken != null ? authenticationAccessToken.hashCode() : 0;
            ClientCredentials clientCredentials = this.read;
            if (clientCredentials != null) {
                i = clientCredentials.hashCode();
            }
            boolean z = this.write;
            if (z) {
                z = true;
            }
            return (((hashCode * 31) + i) * 31) + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PerformLoginSuccess(authenticationAccessToken=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", clientCredentials=");
            sb.append(this.read);
            sb.append(", rememberMe=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RatingCompat(AuthenticationAccessToken authenticationAccessToken, ClientCredentials clientCredentials, boolean z) {
            super((byte) 0);
            onGetStartedClick.write((Object) authenticationAccessToken, "authenticationAccessToken");
            onGetStartedClick.write((Object) clientCredentials, "clientCredentials");
            this.IconCompatParcelizer = authenticationAccessToken;
            this.read = clientCredentials;
            this.write = z;
        }
    }
}
