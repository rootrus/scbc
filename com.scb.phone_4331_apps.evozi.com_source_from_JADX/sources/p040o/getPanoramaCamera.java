package p040o;

import com.google.android.gms.common.Scopes;

/* renamed from: o.getPanoramaCamera */
public final class getPanoramaCamera {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPanoramaCamera)) {
            return false;
        }
        getPanoramaCamera getpanoramacamera = (getPanoramaCamera) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getpanoramacamera.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getpanoramacamera.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getpanoramacamera.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getpanoramacamera.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getpanoramacamera.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SecuritiesRegistrationsOtp(transactionDateTime=");
        sb.append(this.write);
        sb.append(", fullName=");
        sb.append(this.read);
        sb.append(", accountName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountNo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", email=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public getPanoramaCamera(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "transactionDateTime");
        onGetStartedClick.write((Object) str2, "fullName");
        onGetStartedClick.write((Object) str3, "accountName");
        onGetStartedClick.write((Object) str4, "accountNo");
        onGetStartedClick.write((Object) str5, Scopes.EMAIL);
        this.write = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.IconCompatParcelizer = str5;
    }
}
