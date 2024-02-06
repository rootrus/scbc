package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.NetworkFetcher */
public final class NetworkFetcher {
    @SerializedName("e2eeSid")
    public final String IconCompatParcelizer;
    @SerializedName("oaepHashAlgo")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("pseudoPubKeyIndex")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("serverRandom")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("pseudoSid")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("pubKeyIndex")
    public final int MediaDescriptionCompat;
    @SerializedName("pubKey")
    public final String MediaMetadataCompat;
    @SerializedName("pseudoRandom")
    public final String RatingCompat;
    @SerializedName("pseudoPubKey")
    public final String read;
    @SerializedName("pseudoOaepHashAlgo")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkFetcher)) {
            return false;
        }
        NetworkFetcher networkFetcher = (NetworkFetcher) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) networkFetcher.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) networkFetcher.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) networkFetcher.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) networkFetcher.MediaMetadataCompat) && this.MediaDescriptionCompat == networkFetcher.MediaDescriptionCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) networkFetcher.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) networkFetcher.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) networkFetcher.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) networkFetcher.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) networkFetcher.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaMetadataCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        int i2 = this.MediaDescriptionCompat;
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.RatingCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.write;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$ItemReceiver;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("E2EEEntity(oaepHashAlgo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", e2eeSid=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", serverRandom=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", pubKey=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", pubKeyIndex=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", pseudoSid=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", pseudoRandom=");
        sb.append(this.RatingCompat);
        sb.append(", pseudoPubKey=");
        sb.append(this.read);
        sb.append(", pseudoOaepHashAlgo=");
        sb.append(this.write);
        sb.append(", pseudoPubKeyIndex=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
