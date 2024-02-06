package p040o;

import java.util.Locale;

/* renamed from: o.PromptPayTermsAndConditionsActivity */
public final class PromptPayTermsAndConditionsActivity {
    public static final String read = null;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final int MediaBrowserCompat$ItemReceiver;
    public final String write;

    static {
        new PromptPayTermsAndConditionsActivity((String) null, -1, (String) null, (String) null);
    }

    public PromptPayTermsAndConditionsActivity(String str, int i, String str2, String str3) {
        String str4;
        String str5 = null;
        if (str == null) {
            str4 = null;
        } else {
            str4 = str.toLowerCase(Locale.ROOT);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.MediaBrowserCompat$ItemReceiver = i < 0 ? -1 : i;
        this.write = str2 == null ? null : str2;
        this.IconCompatParcelizer = str3 != null ? str3.toUpperCase(Locale.ROOT) : str5;
    }

    public PromptPayTermsAndConditionsActivity(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, String str, String str2) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingViewHolder, "Host");
        this.MediaBrowserCompat$CustomActionResultReceiver = privacyManagementLandingViewHolder.write.toLowerCase(Locale.ROOT);
        this.MediaBrowserCompat$ItemReceiver = privacyManagementLandingViewHolder.MediaBrowserCompat$CustomActionResultReceiver < 0 ? -1 : privacyManagementLandingViewHolder.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = null;
        this.write = str == null ? null : str;
        this.IconCompatParcelizer = str2 != null ? str2.toUpperCase(Locale.ROOT) : str3;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PromptPayTermsAndConditionsActivity)) {
            return super.equals(obj);
        }
        PromptPayTermsAndConditionsActivity promptPayTermsAndConditionsActivity = (PromptPayTermsAndConditionsActivity) obj;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = promptPayTermsAndConditionsActivity.MediaBrowserCompat$CustomActionResultReceiver;
        if (!(str == null ? str2 == null : str.equals(str2)) || this.MediaBrowserCompat$ItemReceiver != promptPayTermsAndConditionsActivity.MediaBrowserCompat$ItemReceiver) {
            return false;
        }
        String str3 = this.write;
        String str4 = promptPayTermsAndConditionsActivity.write;
        if (!(str3 == null ? str4 == null : str3.equals(str4))) {
            return false;
        }
        String str5 = this.IconCompatParcelizer;
        String str6 = promptPayTermsAndConditionsActivity.IconCompatParcelizer;
        if (str5 == null ? str6 == null : str5.equals(str6)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.IconCompatParcelizer;
        if (str != null) {
            sb.append(str.toUpperCase(Locale.ROOT));
            sb.append(' ');
        }
        if (this.write != null) {
            sb.append('\'');
            sb.append(this.write);
            sb.append('\'');
        } else {
            sb.append("<any realm>");
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            sb.append('@');
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            if (this.MediaBrowserCompat$ItemReceiver >= 0) {
                sb.append(':');
                sb.append(this.MediaBrowserCompat$ItemReceiver);
            }
        }
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = ((i + 629) * 37) + this.MediaBrowserCompat$ItemReceiver;
        String str2 = this.write;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 * 37) + i2;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return (i5 * 37) + i3;
    }
}
