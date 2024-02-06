package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.EnumHashBiMap */
public final class EnumHashBiMap {
    @SerializedName("periodId")
    private final String IconCompatParcelizer;
    @SerializedName("pageNumber")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("pageSize")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("typeOfFundId")
    private final List<String> MediaBrowserCompat$MediaItem;
    @SerializedName("searchString")
    private final String MediaDescriptionCompat;
    @SerializedName("sortById")
    private final String RatingCompat;
    @SerializedName("brokerId")
    private final List<String> read;
    @SerializedName("riskLevelId")
    private final List<String> write;

    public EnumHashBiMap(String str, List<String> list, List<String> list2, List<String> list3, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str4, "pageNumber");
        onGetStartedClick.write((Object) str5, "pageSize");
        this.MediaDescriptionCompat = str;
        this.MediaBrowserCompat$MediaItem = list;
        this.write = list2;
        this.read = list3;
        this.RatingCompat = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
    }
}
