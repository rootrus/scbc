package p040o;

import com.migcomponents.migbase64.Base64;
import com.thunderhead.android.domain.authentication.ClientCredentials;
import java.io.UnsupportedEncodingException;

/* renamed from: o.FragmentBuilder_BindNsipPaymentAddAccountFragment */
public final class FragmentBuilder_BindNsipPaymentAddAccountFragment {
    private final String MediaBrowserCompat$ItemReceiver;
    private final String read;

    public FragmentBuilder_BindNsipPaymentAddAccountFragment(ClientCredentials clientCredentials) {
        if (clientCredentials != null) {
            String username = clientCredentials.getUsername();
            if (username != null) {
                this.read = username;
                String password = clientCredentials.getPassword();
                if (password != null) {
                    this.MediaBrowserCompat$ItemReceiver = password;
                    return;
                }
                throw new IllegalArgumentException("Null argument provided");
            }
            throw new IllegalArgumentException("Null argument provided");
        }
        throw new IllegalArgumentException("Null argument provided");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindNsipPaymentAddAccountFragment)) {
            return false;
        }
        FragmentBuilder_BindNsipPaymentAddAccountFragment fragmentBuilder_BindNsipPaymentAddAccountFragment = (FragmentBuilder_BindNsipPaymentAddAccountFragment) obj;
        if (!this.MediaBrowserCompat$ItemReceiver.equals(fragmentBuilder_BindNsipPaymentAddAccountFragment.MediaBrowserCompat$ItemReceiver) || !this.read.equals(fragmentBuilder_BindNsipPaymentAddAccountFragment.read)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.MediaBrowserCompat$ItemReceiver.hashCode() * 31) + this.read.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Basic ");
        sb.append(Base64.encodeToString(read(), false));
        return sb.toString();
    }

    private byte[] read() {
        try {
            return String.format("%s:%s", new Object[]{this.read, this.MediaBrowserCompat$ItemReceiver}).getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            MyECouponActivity_ViewBinding.write("Charset UTF-8 not supported by runtime!");
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return new byte[0];
        }
    }
}
