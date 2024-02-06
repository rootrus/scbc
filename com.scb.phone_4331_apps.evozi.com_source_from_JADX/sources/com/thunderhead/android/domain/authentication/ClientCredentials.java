package com.thunderhead.android.domain.authentication;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import p040o.FragmentBuilder_BindMailingAddressLandingFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.RewardsHomeActivity;
import p040o.setRootView;

public final class ClientCredentials {
    private String hostName;
    private String password;
    private String siteKey;
    private String username;

    public ClientCredentials(String str, String str2) {
        this(str, str2, "", "");
    }

    public ClientCredentials(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.username = str;
            if (str2 != null) {
                this.password = str2;
                if (str3 != null) {
                    this.siteKey = str3;
                    if (str4 != null) {
                        this.hostName = str4;
                        return;
                    }
                    throw new IllegalArgumentException("Null argument provided");
                }
                throw new IllegalArgumentException("Null argument provided");
            }
            throw new IllegalArgumentException("Null argument provided");
        }
        throw new IllegalArgumentException("Null argument provided");
    }

    public ClientCredentials(ClientCredentials clientCredentials) {
        if (clientCredentials != null) {
            this.username = clientCredentials.username;
            this.password = clientCredentials.password;
            this.siteKey = clientCredentials.siteKey;
            this.hostName = clientCredentials.hostName;
        }
    }

    public static ClientCredentials findCredentialsBySiteKeyAndHost(List<ClientCredentials> list, String str, String str2) {
        ClientCredentials clientCredentials;
        if (list != null && !list.isEmpty()) {
            Iterator<ClientCredentials> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                clientCredentials = it.next();
                if (clientCredentials.hasSiteKeyAndHost(str, str2)) {
                    break;
                }
            }
            if (clientCredentials == null || list == null || list.size() != 1) {
                return clientCredentials;
            }
            ClientCredentials clientCredentials2 = list.get(0);
            if (!clientCredentials2.getHostName().isEmpty() || !clientCredentials2.getSiteKey().isEmpty()) {
                return clientCredentials;
            }
            clientCredentials2.setSiteKey(str);
            clientCredentials2.setHostName(str2);
            return clientCredentials2;
        }
        clientCredentials = null;
        return clientCredentials == null ? clientCredentials : clientCredentials;
    }

    public final void setSiteKey(String str) {
        this.siteKey = str;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getSiteKey() {
        return this.siteKey;
    }

    public final String getHostName() {
        return this.hostName;
    }

    public final void setHostName(String str) {
        this.hostName = str;
    }

    public final boolean hasSiteKeyAndHost(ClientCredentials clientCredentials) {
        return hasSiteKeyAndHost(clientCredentials.siteKey, clientCredentials.hostName);
    }

    private boolean hasSiteKeyAndHost(String str, String str2) {
        return str.equals(this.siteKey) && str2.equals(this.hostName);
    }

    public final void tryEncryptingPassword(setRootView setrootview) {
        this.password = tryEncryption(setrootview, this.password, true);
    }

    public final void tryEncryptingUsername(setRootView setrootview) {
        this.username = tryEncryption(setrootview, this.username, false);
    }

    private String performLegacyPasswordEncryption(Context context) {
        return RewardsHomeActivity.MediaBrowserCompat$ItemReceiver(context, this.password);
    }

    private String performLegacyPasswordDecryption(Context context) {
        return RewardsHomeActivity.MediaBrowserCompat$CustomActionResultReceiver(context, this.password);
    }

    public final void tryDecryptingPassword(setRootView setrootview) {
        this.password = tryDecryption(setrootview, this.password, true);
    }

    public final void tryDecryptingUsername(setRootView setrootview) {
        this.username = tryDecryption(setrootview, this.username, false);
    }

    private String tryDecryption(setRootView setrootview, String str, boolean z) {
        try {
            setrootview.MediaBrowserCompat$ItemReceiver();
            String read = setrootview.read(str);
            if (!read.isEmpty()) {
                return read;
            }
            if (setrootview.MediaBrowserCompat$ItemReceiver.get() != null && z) {
                return performLegacyPasswordDecryption(setrootview.MediaBrowserCompat$ItemReceiver.get());
            }
            return str;
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMailingAddressLandingFragment.ERROR_DECRYPTING_VALUE);
            try {
                if (setrootview.MediaBrowserCompat$ItemReceiver.get() != null && z) {
                    return performLegacyPasswordDecryption(setrootview.MediaBrowserCompat$ItemReceiver.get());
                }
            } catch (Exception e2) {
                MyECouponActivity_ViewBinding.read(e2, FragmentBuilder_BindMailingAddressLandingFragment.ERROR_DECRYPTING_VALUE);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClientCredentials{username='");
        sb.append(this.username);
        sb.append('\'');
        sb.append(", password='");
        sb.append(this.password);
        sb.append('\'');
        sb.append(", siteKey='");
        sb.append(this.siteKey);
        sb.append('\'');
        sb.append(", hostName='");
        sb.append(this.hostName);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientCredentials)) {
            return false;
        }
        ClientCredentials clientCredentials = (ClientCredentials) obj;
        if (!this.username.equals(clientCredentials.username) || !this.password.equals(clientCredentials.password) || !this.siteKey.equals(clientCredentials.siteKey) || !this.hostName.equals(clientCredentials.hostName)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.username.hashCode();
        return (((((hashCode * 31) + this.password.hashCode()) * 31) + this.siteKey.hashCode()) * 31) + this.hostName.hashCode();
    }

    private String tryEncryption(setRootView setrootview, String str, boolean z) {
        WeakReference<Context> weakReference = setrootview.MediaBrowserCompat$ItemReceiver;
        try {
            setrootview.MediaBrowserCompat$ItemReceiver();
            String MediaBrowserCompat$ItemReceiver = setrootview.MediaBrowserCompat$ItemReceiver(str);
            if (!MediaBrowserCompat$ItemReceiver.isEmpty()) {
                return MediaBrowserCompat$ItemReceiver;
            }
            if (weakReference.get() != null && z) {
                return performLegacyPasswordEncryption(weakReference.get());
            }
            return str;
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMailingAddressLandingFragment.ERROR_ENCRYPTING_VALUE);
            try {
                if (weakReference.get() != null && z) {
                    return performLegacyPasswordEncryption(weakReference.get());
                }
            } catch (Exception e2) {
                MyECouponActivity_ViewBinding.read(e2, FragmentBuilder_BindMailingAddressLandingFragment.ERROR_ENCRYPTING_VALUE);
            }
        }
    }
}
