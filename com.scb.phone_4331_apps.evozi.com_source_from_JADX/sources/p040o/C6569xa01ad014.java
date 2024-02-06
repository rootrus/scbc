package p040o;

import com.thunderhead.android.domain.authentication.ClientCredentials;

/* renamed from: o.FragmentBuilder_BindMwShopAddressOnlineFragment$MediaBrowserCompat$SearchResultReceiver */
public final class C6569xa01ad014 extends FragmentBuilder_BindMwShopAddressOnlineFragment {
    final ClientCredentials MediaBrowserCompat$CustomActionResultReceiver;
    final boolean write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6569xa01ad014)) {
            return false;
        }
        C6569xa01ad014 fragmentBuilder_BindMwShopAddressOnlineFragment$MediaBrowserCompat$SearchResultReceiver = (C6569xa01ad014) obj;
        return this.write == fragmentBuilder_BindMwShopAddressOnlineFragment$MediaBrowserCompat$SearchResultReceiver.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindMwShopAddressOnlineFragment$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        boolean z = this.write;
        if (z) {
            z = true;
        }
        ClientCredentials clientCredentials = this.MediaBrowserCompat$CustomActionResultReceiver;
        return ((z ? 1 : 0) * true) + (clientCredentials != null ? clientCredentials.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FetchRememberMeCredentialsSuccess(rememberMe=");
        sb.append(this.write);
        sb.append(", clientCredentials=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public C6569xa01ad014(boolean z, ClientCredentials clientCredentials) {
        super((byte) 0);
        this.write = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = clientCredentials;
    }
}
