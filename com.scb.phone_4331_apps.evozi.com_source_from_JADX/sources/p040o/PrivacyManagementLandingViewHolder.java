package p040o;

import java.io.Serializable;
import java.net.InetAddress;
import java.util.Locale;

/* renamed from: o.PrivacyManagementLandingViewHolder */
public final class PrivacyManagementLandingViewHolder implements Cloneable, Serializable {
    private String IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public InetAddress MediaBrowserCompat$ItemReceiver;
    public String read;
    public String write;

    public PrivacyManagementLandingViewHolder(String str, int i, String str2) {
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Host name");
            sb.append(" may not be null");
            throw new IllegalArgumentException(sb.toString());
        } else if (str.length() == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Host name");
            sb2.append(" may not be empty");
            throw new IllegalArgumentException(sb2.toString());
        } else if (!FatcaQuestionnaireAdapter$ViewHolder.IconCompatParcelizer(str)) {
            this.write = str;
            this.IconCompatParcelizer = str.toLowerCase(Locale.ROOT);
            if (str2 != null) {
                this.read = str2.toLowerCase(Locale.ROOT);
            } else {
                this.read = "http";
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            this.MediaBrowserCompat$ItemReceiver = null;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Host name");
            sb3.append(" may not contain blanks");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public PrivacyManagementLandingViewHolder(String str, int i) {
        this(str, i, (String) null);
    }

    public PrivacyManagementLandingViewHolder(InetAddress inetAddress, int i, String str) {
        this((InetAddress) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(inetAddress, "Inet address"), inetAddress.getHostName(), i, str);
    }

    private PrivacyManagementLandingViewHolder(InetAddress inetAddress, String str, int i, String str2) {
        this.MediaBrowserCompat$ItemReceiver = (InetAddress) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(inetAddress, "Inet address");
        String str3 = (String) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "Hostname");
        this.write = str3;
        this.IconCompatParcelizer = str3.toLowerCase(Locale.ROOT);
        if (str2 != null) {
            this.read = str2.toLowerCase(Locale.ROOT);
        } else {
            this.read = "http";
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final String write() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == -1) {
            return this.write;
        }
        StringBuilder sb = new StringBuilder(this.write.length() + 6);
        sb.append(this.write);
        sb.append(":");
        sb.append(Integer.toString(this.MediaBrowserCompat$CustomActionResultReceiver));
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyManagementLandingViewHolder)) {
            return false;
        }
        PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder = (PrivacyManagementLandingViewHolder) obj;
        if (this.IconCompatParcelizer.equals(privacyManagementLandingViewHolder.IconCompatParcelizer) && this.MediaBrowserCompat$CustomActionResultReceiver == privacyManagementLandingViewHolder.MediaBrowserCompat$CustomActionResultReceiver && this.read.equals(privacyManagementLandingViewHolder.read)) {
            InetAddress inetAddress = this.MediaBrowserCompat$ItemReceiver;
            InetAddress inetAddress2 = privacyManagementLandingViewHolder.MediaBrowserCompat$ItemReceiver;
            if (inetAddress == null) {
                if (inetAddress2 == null) {
                    return true;
                }
            } else if (inetAddress.equals(inetAddress2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.IconCompatParcelizer;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = ((i + 629) * 37) + this.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = this.read;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 * 37) + i2;
        InetAddress inetAddress = this.MediaBrowserCompat$ItemReceiver;
        if (inetAddress == null) {
            return i5;
        }
        if (inetAddress != null) {
            i3 = inetAddress.hashCode();
        }
        return (i5 * 37) + i3;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read);
        sb.append("://");
        sb.append(this.write);
        if (this.MediaBrowserCompat$CustomActionResultReceiver != -1) {
            sb.append(':');
            sb.append(Integer.toString(this.MediaBrowserCompat$CustomActionResultReceiver));
        }
        return sb.toString();
    }
}
