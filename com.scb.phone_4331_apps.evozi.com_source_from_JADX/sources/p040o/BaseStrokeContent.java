package p040o;

import com.google.gson.annotations.SerializedName;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.zzca;

/* renamed from: o.BaseStrokeContent */
public class BaseStrokeContent extends setCurrentItemInternal {
    @SerializedName("objective")
    private String IconCompatParcelizer;
    @SerializedName("objectiveId")
    private String read;

    /* renamed from: o.BaseStrokeContent$PathGroup */
    public final class PathGroup {
        @SerializedName("incrementalAmount")
        private final double IconCompatParcelizer;
        @SerializedName("code")
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("productSalesSheet")
        private final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("subAttribute")
        private final String MediaBrowserCompat$MediaItem;
        @SerializedName("salesSheetFlag")
        private final String MediaMetadataCompat;
        @SerializedName("sortSequence")
        private final Integer RatingCompat;
        @SerializedName("maxAmount")
        private final double read;
        @SerializedName("minAmount")
        private final double write;

        public PathGroup() {
            this((byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PathGroup)) {
                return false;
            }
            PathGroup pathGroup = (PathGroup) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) pathGroup.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) pathGroup.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) pathGroup.MediaBrowserCompat$MediaItem) && Double.compare(this.write, pathGroup.write) == 0 && Double.compare(this.read, pathGroup.read) == 0 && Double.compare(this.IconCompatParcelizer, pathGroup.IconCompatParcelizer) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) pathGroup.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) pathGroup.MediaMetadataCompat);
        }

        public final int hashCode() {
            Integer num = this.RatingCompat;
            int i = 0;
            int hashCode = num != null ? num.hashCode() : 0;
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$MediaItem;
            int hashCode3 = str2 != null ? str2.hashCode() : 0;
            long doubleToLongBits = Double.doubleToLongBits(this.write);
            int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
            long doubleToLongBits2 = Double.doubleToLongBits(this.read);
            int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
            long doubleToLongBits3 = Double.doubleToLongBits(this.IconCompatParcelizer);
            int i4 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaMetadataCompat;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode4) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SubProductEntity(sortSequence=");
            sb.append(this.RatingCompat);
            sb.append(", code=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", subAttribute=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", minAmount=");
            sb.append(this.write);
            sb.append(", maxAmount=");
            sb.append(this.read);
            sb.append(", incrementalAmount=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", productSalesSheet=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", salesSheetFlag=");
            sb.append(this.MediaMetadataCompat);
            sb.append(")");
            return sb.toString();
        }

        private PathGroup(Integer num, String str, String str2, double d, double d2, double d3, String str3, String str4) {
            this.RatingCompat = num;
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$MediaItem = null;
            this.write = 0.0d;
            this.read = 0.0d;
            this.IconCompatParcelizer = 0.0d;
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaMetadataCompat = null;
        }

        private /* synthetic */ PathGroup(byte b) {
            this(0, (String) null, (String) null, 0.0d, 0.0d, 0.0d, (String) null, (String) null);
        }
    }

    /* renamed from: o.BaseStrokeContent$1 */
    public final class C31231 {
        @SerializedName("items")
        private final List<setContents> MediaBrowserCompat$ItemReceiver;
        @SerializedName("header")
        private final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31231)) {
                return false;
            }
            C31231 r3 = (C31231) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            List<setContents> list = this.MediaBrowserCompat$ItemReceiver;
            if (list != null) {
                i = list.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LongDescListEntity(header=");
            sb.append(this.write);
            sb.append(", items=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public final zzca.zzb read() {
            String str = this.write;
            if (str != null) {
                List<setContents> list = this.MediaBrowserCompat$ItemReceiver;
                if (list != null) {
                    Iterable<setContents> iterable = list;
                    int i = 10;
                    onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                    if (iterable instanceof Collection) {
                        i = ((Collection) iterable).size();
                    }
                    Collection arrayList = new ArrayList(i);
                    for (setContents setcontents : iterable) {
                        String str2 = setcontents.read;
                        if (str2 != null) {
                            arrayList.add(new zzca.zzb.zza(str2));
                        } else {
                            throw new EntityMappingException("Some mandatory is missing.");
                        }
                    }
                    return new zzca.zzb(str, (List) arrayList);
                }
                throw new EntityMappingException("Some mandatory is missing.");
            }
            throw new EntityMappingException("Some mandatory is missing.");
        }
    }
}
