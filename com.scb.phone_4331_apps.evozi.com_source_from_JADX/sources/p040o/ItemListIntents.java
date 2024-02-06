package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.ItemListIntents */
public final class ItemListIntents {
    @SerializedName("side")
    public final String IconCompatParcelizer;
    @SerializedName("symbol")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("marketValue")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("unrealizedPercent")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("unrealizedAmt")
    public final String MediaDescriptionCompat;
    @SerializedName("symbolPrice")
    public final SearchIntents MediaMetadataCompat;
    @SerializedName("symbolFullName")
    public final NoteIntents RatingCompat;
    @SerializedName("items")
    public final List<setFlexDirection> read;
    @SerializedName("currency")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemListIntents)) {
            return false;
        }
        ItemListIntents itemListIntents = (ItemListIntents) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) itemListIntents.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) itemListIntents.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) itemListIntents.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) itemListIntents.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) itemListIntents.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) itemListIntents.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) itemListIntents.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) itemListIntents.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) itemListIntents.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaDescriptionCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.IconCompatParcelizer;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        SearchIntents searchIntents = this.MediaMetadataCompat;
        int hashCode7 = searchIntents != null ? searchIntents.hashCode() : 0;
        NoteIntents noteIntents = this.RatingCompat;
        int hashCode8 = noteIntents != null ? noteIntents.hashCode() : 0;
        List<setFlexDirection> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductEntity(symbol=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", marketValue=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", currency=");
        sb.append(this.write);
        sb.append(", unrealizedAmt=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", unrealizedPercent=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", side=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", symbolPrice=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", symbolFullName=");
        sb.append(this.RatingCompat);
        sb.append(", items=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
