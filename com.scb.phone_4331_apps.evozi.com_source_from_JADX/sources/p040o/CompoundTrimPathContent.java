package p040o;

import com.google.gson.annotations.SerializedName;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.BaseStrokeContent;
import p040o.zzca;

/* renamed from: o.CompoundTrimPathContent */
public final class CompoundTrimPathContent {
    @SerializedName("maxAmount")
    private final Integer IconCompatParcelizer;
    @SerializedName("longDesc")
    private final List<BaseStrokeContent.C31231> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("minAmount")
    private final Integer MediaBrowserCompat$ItemReceiver;
    @SerializedName("subAttribute")
    private final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("sortSequence")
    private final Integer MediaMetadataCompat;
    @SerializedName("productCode")
    private final String RatingCompat;
    @SerializedName("incrementalAmount")
    private final Integer read;
    @SerializedName("defaultFlag")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompoundTrimPathContent)) {
            return false;
        }
        CompoundTrimPathContent compoundTrimPathContent = (CompoundTrimPathContent) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) compoundTrimPathContent.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) compoundTrimPathContent.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) compoundTrimPathContent.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) compoundTrimPathContent.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) compoundTrimPathContent.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) compoundTrimPathContent.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) compoundTrimPathContent.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) compoundTrimPathContent.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.RatingCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        Integer num = this.MediaMetadataCompat;
        int hashCode3 = num != null ? num.hashCode() : 0;
        String str3 = this.write;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        Integer num2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = num2 != null ? num2.hashCode() : 0;
        Integer num3 = this.IconCompatParcelizer;
        int hashCode6 = num3 != null ? num3.hashCode() : 0;
        Integer num4 = this.read;
        int hashCode7 = num4 != null ? num4.hashCode() : 0;
        List<BaseStrokeContent.C31231> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductDetailListEntity(subAttribute=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", productCode=");
        sb.append(this.RatingCompat);
        sb.append(", sortSequence=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", defaultFlag=");
        sb.append(this.write);
        sb.append(", minAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", maxAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", incrementalAmount=");
        sb.append(this.read);
        sb.append(", longDesc=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final zzca.zzb.zzc write() {
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String str3 = this.RatingCompat;
        if (str3 != null) {
            Integer num = this.MediaMetadataCompat;
            if (num != null) {
                int intValue = num.intValue();
                String str4 = this.write;
                Integer num2 = this.MediaBrowserCompat$ItemReceiver;
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    Integer num3 = this.IconCompatParcelizer;
                    if (num3 != null) {
                        int intValue3 = num3.intValue();
                        Integer num4 = this.read;
                        if (num4 != null) {
                            int intValue4 = num4.intValue();
                            List<BaseStrokeContent.C31231> list = this.MediaBrowserCompat$CustomActionResultReceiver;
                            if (list != null) {
                                Iterable<BaseStrokeContent.C31231> iterable = list;
                                int i = 10;
                                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                                if (iterable instanceof Collection) {
                                    i = ((Collection) iterable).size();
                                }
                                Collection arrayList = new ArrayList(i);
                                for (BaseStrokeContent.C31231 read2 : iterable) {
                                    arrayList.add(read2.read());
                                }
                                return new zzca.zzb.zzc(str2, str3, intValue, str4, intValue2, intValue3, intValue4, (List) arrayList);
                            }
                            throw new EntityMappingException("Some mandatory is missing.");
                        }
                        throw new EntityMappingException("Some mandatory is missing.");
                    }
                    throw new EntityMappingException("Some mandatory is missing.");
                }
                throw new EntityMappingException("Some mandatory is missing.");
            }
            throw new EntityMappingException("Some mandatory is missing.");
        }
        throw new EntityMappingException("Some mandatory is missing.");
    }
}
