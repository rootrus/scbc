package p040o;

import com.thunderhead.android.domain.authentication.AuthenticationAccessToken;

/* renamed from: o.FragmentBuilder_BindMwShopAddressOnlineFragment$MediaSessionCompat$QueueItem */
public final class C6571x58b78c12 extends FragmentBuilder_BindMwShopAddressOnlineFragment {
    final AuthenticationAccessToken write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C6571x58b78c12) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((C6571x58b78c12) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        AuthenticationAccessToken authenticationAccessToken = this.write;
        if (authenticationAccessToken != null) {
            return authenticationAccessToken.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdateAuthenticationAccessToken(authenticationAccessToken=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public C6571x58b78c12(AuthenticationAccessToken authenticationAccessToken) {
        super((byte) 0);
        this.write = authenticationAccessToken;
    }
}
