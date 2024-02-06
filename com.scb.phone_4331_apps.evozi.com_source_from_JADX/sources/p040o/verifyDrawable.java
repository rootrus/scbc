package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p040o.zzwc;

/* renamed from: o.verifyDrawable */
public final class verifyDrawable {
    @SerializedName("documentCode")
    private final String IconCompatParcelizer;
    @SerializedName("sortSequence")
    final int MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("cameraType")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("minQuantity")
    private final Integer MediaBrowserCompat$MediaItem;
    @SerializedName("uploadMethod")
    private final $$Lambda$Unbinder$aAZZEjRDCcxQlrGZAdKWmLXqruY MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("remark")
    private final String MediaDescriptionCompat;
    @SerializedName("maxQuantity")
    private final Integer MediaMetadataCompat;
    @SerializedName("uploads")
    private final List<BindArray> MediaSessionCompat$Token;
    @SerializedName("maxFileSize")
    private final String RatingCompat;
    @SerializedName("documentDesc")
    private final String read;
    @SerializedName("mandatoryFlag")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof verifyDrawable)) {
            return false;
        }
        verifyDrawable verifydrawable = (verifyDrawable) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == verifydrawable.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) verifydrawable.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) verifydrawable.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) verifydrawable.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) verifydrawable.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) verifydrawable.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) verifydrawable.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) verifydrawable.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) verifydrawable.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) verifydrawable.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) verifydrawable.MediaSessionCompat$Token);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = this.IconCompatParcelizer;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        Integer num = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = num != null ? num.hashCode() : 0;
        Integer num2 = this.MediaMetadataCompat;
        int hashCode5 = num2 != null ? num2.hashCode() : 0;
        String str4 = this.RatingCompat;
        int hashCode6 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode7 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaDescriptionCompat;
        int hashCode8 = str6 != null ? str6.hashCode() : 0;
        $$Lambda$Unbinder$aAZZEjRDCcxQlrGZAdKWmLXqruY r10 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode9 = r10 != null ? r10.hashCode() : 0;
        List<BindArray> list = this.MediaSessionCompat$Token;
        if (list != null) {
            i2 = list.hashCode();
        }
        return (((((((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DocumentEntity(sortSequence=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", documentCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", documentDesc=");
        sb.append(this.read);
        sb.append(", mandatoryFlag=");
        sb.append(this.write);
        sb.append(", minQuantity=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", maxQuantity=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", maxFileSize=");
        sb.append(this.RatingCompat);
        sb.append(", cameraType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", remark=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", uploadMethod=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", uploads=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(")");
        return sb.toString();
    }

    public final zzwc.write write() {
        List list;
        String str = this.IconCompatParcelizer;
        String str2 = this.read;
        String str3 = this.write;
        onGetStartedClick.write((Object) str3, "$this$toBooleanFlag");
        boolean z = false;
        boolean z2 = Integer.parseInt(str3) == 1;
        Integer num = this.MediaBrowserCompat$MediaItem;
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = this.MediaMetadataCompat;
        String str4 = this.RatingCompat;
        isInitialized isinitialized = isInitialized.MediaBrowserCompat$ItemReceiver;
        zzwf MediaBrowserCompat$CustomActionResultReceiver2 = isInitialized.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        String str5 = this.MediaDescriptionCompat;
        $$Lambda$Unbinder$aAZZEjRDCcxQlrGZAdKWmLXqruY r1 = this.MediaBrowserCompat$SearchResultReceiver;
        zzwd[] zzwdArr = new zzwd[3];
        zzwd zzwd = zzwd.CAMERA;
        String str6 = r1.write;
        onGetStartedClick.write((Object) str6, "$this$toBooleanFlag");
        zzwd zzwd2 = null;
        if (!(Integer.parseInt(str6) == 1)) {
            zzwd = null;
        }
        zzwdArr[0] = zzwd;
        zzwd zzwd3 = zzwd.GALLERY;
        String str7 = r1.IconCompatParcelizer;
        onGetStartedClick.write((Object) str7, "$this$toBooleanFlag");
        if (!(Integer.parseInt(str7) == 1)) {
            zzwd3 = null;
        }
        zzwdArr[1] = zzwd3;
        zzwd zzwd4 = zzwd.FILE_STORAGE;
        String str8 = r1.read;
        onGetStartedClick.write((Object) str8, "$this$toBooleanFlag");
        if (Integer.parseInt(str8) == 1) {
            z = true;
        }
        if (z) {
            zzwd2 = zzwd4;
        }
        zzwdArr[2] = zzwd2;
        onGetStartedClick.write((Object) zzwdArr, "elements");
        onGetStartedClick.write((Object) zzwdArr, "$this$filterNotNull");
        Set write2 = HmlNTBBusinessURLInformationActivity.write((List) HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$ItemReceiver((T[]) zzwdArr, new ArrayList()));
        List<BindArray> list2 = this.MediaSessionCompat$Token;
        if (list2 != null) {
            Iterable<BindArray> iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (BindArray bindArray : iterable) {
                arrayList.add(new zzwc$MediaBrowserCompat$CustomActionResultReceiver(bindArray.IconCompatParcelizer, bindArray.write));
            }
            list = (List) arrayList;
        } else {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        return new zzwc.write(str, str2, z2, intValue, num2, str4, MediaBrowserCompat$CustomActionResultReceiver2, str5, write2, list);
    }
}
