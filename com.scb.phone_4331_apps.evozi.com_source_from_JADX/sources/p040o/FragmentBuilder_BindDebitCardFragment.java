package p040o;

import android.content.Context;

/* renamed from: o.FragmentBuilder_BindDebitCardFragment */
public final class FragmentBuilder_BindDebitCardFragment {
    public final String IconCompatParcelizer;
    public final Context MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaMetadataCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindDebitCardFragment)) {
            return false;
        }
        FragmentBuilder_BindDebitCardFragment fragmentBuilder_BindDebitCardFragment = (FragmentBuilder_BindDebitCardFragment) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindDebitCardFragment.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindDebitCardFragment.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindDebitCardFragment.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) fragmentBuilder_BindDebitCardFragment.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) fragmentBuilder_BindDebitCardFragment.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fragmentBuilder_BindDebitCardFragment.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fragmentBuilder_BindDebitCardFragment.read);
    }

    public final int hashCode() {
        Context context = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = context != null ? context.hashCode() : 0;
        String str = this.write;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaMetadataCompat;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashNcbConsent(context=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", productGroup=");
        sb.append(this.write);
        sb.append(", flowType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", productType=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", productProgram=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", applicationId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", ncbTransactionId=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindDebitCardFragment(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "productGroup");
        onGetStartedClick.write((Object) str2, "flowType");
        onGetStartedClick.write((Object) str3, "productType");
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaMetadataCompat = str3;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.IconCompatParcelizer = str5;
        this.read = str6;
    }
}
