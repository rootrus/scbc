package p040o;

import p040o.PlacePicker;

/* renamed from: o.setHint */
public final class setHint {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final PlacePicker.IntentBuilder MediaBrowserCompat$MediaItem;
    public final int RatingCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setHint)) {
            return false;
        }
        setHint sethint = (setHint) obj;
        return this.RatingCompat == sethint.RatingCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) sethint.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) sethint.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) sethint.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) sethint.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) sethint.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) sethint.MediaBrowserCompat$MediaItem);
    }

    public final int hashCode() {
        int i = this.RatingCompat;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        PlacePicker.IntentBuilder intentBuilder = this.MediaBrowserCompat$MediaItem;
        if (intentBuilder != null) {
            i2 = intentBuilder.hashCode();
        }
        return (((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressCardListResponse(sortSequence=");
        sb.append(this.RatingCompat);
        sb.append(", applicationId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountNo=");
        sb.append(this.read);
        sb.append(", cardRefNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cardMask=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", productName=");
        sb.append(this.write);
        sb.append(", productType=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(")");
        return sb.toString();
    }

    private setHint(int i, String str, String str2, String str3, String str4, String str5, PlacePicker.IntentBuilder intentBuilder) {
        onGetStartedClick.write((Object) str, "applicationId");
        this.RatingCompat = i;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.write = str5;
        this.MediaBrowserCompat$MediaItem = intentBuilder;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setHint(int i, String str, String str2, String str3, String str4, String str5, PlacePicker.IntentBuilder intentBuilder, int i2) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : intentBuilder);
    }
}
