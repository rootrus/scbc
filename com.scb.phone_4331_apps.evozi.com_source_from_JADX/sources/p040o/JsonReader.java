package p040o;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: o.JsonReader */
public class JsonReader {
    @SerializedName("currency")
    public String IconCompatParcelizer;
    @SerializedName("nextPaymentAmount")
    public BigDecimal MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("endDate")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("paidOffFlag")
    public String MediaBrowserCompat$MediaItem;
    @SerializedName("sortSequence")
    public int MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("noteNo")
    public String MediaDescriptionCompat;
    @SerializedName("startDate")
    public String MediaMetadataCompat;
    @SerializedName("pnPrincipal")
    public BigDecimal RatingCompat;
    @SerializedName("interestRate")
    public BigDecimal read;
    @SerializedName("nextPaymentDate")
    public String write;

    /* renamed from: o.JsonReader$Options */
    public class Options<Model> {
        @SerializedName("walletList")
        public final List<Model> MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* renamed from: o.JsonReader$Token */
    public final class Token extends Options<findName> {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JsonReader jsonReader = (JsonReader) obj;
        if (this.MediaBrowserCompat$SearchResultReceiver != jsonReader.MediaBrowserCompat$SearchResultReceiver) {
            return false;
        }
        String str = this.MediaDescriptionCompat;
        if (str == null ? jsonReader.MediaDescriptionCompat != null : !str.equals(jsonReader.MediaDescriptionCompat)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? jsonReader.MediaBrowserCompat$ItemReceiver != null : !str2.equals(jsonReader.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        BigDecimal bigDecimal = this.RatingCompat;
        if (bigDecimal == null ? jsonReader.RatingCompat != null : !bigDecimal.equals(jsonReader.RatingCompat)) {
            return false;
        }
        BigDecimal bigDecimal2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (bigDecimal2 == null ? jsonReader.MediaBrowserCompat$CustomActionResultReceiver != null : !bigDecimal2.equals(jsonReader.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str3 = this.write;
        if (str3 == null ? jsonReader.write != null : !str3.equals(jsonReader.write)) {
            return false;
        }
        BigDecimal bigDecimal3 = this.read;
        if (bigDecimal3 == null ? jsonReader.read != null : !bigDecimal3.equals(jsonReader.read)) {
            return false;
        }
        String str4 = this.MediaMetadataCompat;
        if (str4 == null ? jsonReader.MediaMetadataCompat != null : !str4.equals(jsonReader.MediaMetadataCompat)) {
            return false;
        }
        String str5 = this.IconCompatParcelizer;
        if (str5 == null ? jsonReader.IconCompatParcelizer != null : !str5.equals(jsonReader.IconCompatParcelizer)) {
            return false;
        }
        String str6 = this.MediaBrowserCompat$MediaItem;
        String str7 = jsonReader.MediaBrowserCompat$MediaItem;
        if (str6 != null) {
            return str6.equals(str7);
        }
        if (str7 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = this.MediaBrowserCompat$SearchResultReceiver;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        BigDecimal bigDecimal = this.RatingCompat;
        int hashCode3 = bigDecimal != null ? bigDecimal.hashCode() : 0;
        BigDecimal bigDecimal2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = bigDecimal2 != null ? bigDecimal2.hashCode() : 0;
        String str3 = this.write;
        int hashCode5 = str3 != null ? str3.hashCode() : 0;
        BigDecimal bigDecimal3 = this.read;
        int hashCode6 = bigDecimal3 != null ? bigDecimal3.hashCode() : 0;
        String str4 = this.MediaMetadataCompat;
        int hashCode7 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        int hashCode8 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$MediaItem;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + i2) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }
}
