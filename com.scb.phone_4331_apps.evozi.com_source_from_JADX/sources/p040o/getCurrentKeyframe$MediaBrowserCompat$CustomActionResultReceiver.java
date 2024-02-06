package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.zzwe;

/* renamed from: o.getCurrentKeyframe$MediaBrowserCompat$CustomActionResultReceiver */
public final class getCurrentKeyframe$MediaBrowserCompat$CustomActionResultReceiver {
    @SerializedName("groupConditionCode")
    private final String IconCompatParcelizer;
    @SerializedName("groupConditionDesc")
    private final String read;
    @SerializedName("types")
    private final List<getCurrentKeyframe$MediaBrowserCompat$ItemReceiver> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrentKeyframe$MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        getCurrentKeyframe$MediaBrowserCompat$CustomActionResultReceiver getcurrentkeyframe_mediabrowsercompat_customactionresultreceiver = (getCurrentKeyframe$MediaBrowserCompat$CustomActionResultReceiver) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getcurrentkeyframe_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getcurrentkeyframe_mediabrowsercompat_customactionresultreceiver.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcurrentkeyframe_mediabrowsercompat_customactionresultreceiver.write);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        List<getCurrentKeyframe$MediaBrowserCompat$ItemReceiver> list = this.write;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HMLDocumentEntity(groupConditionCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", groupConditionDesc=");
        sb.append(this.read);
        sb.append(", types=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public final zzwe.write IconCompatParcelizer() {
        String str = this.IconCompatParcelizer;
        String str2 = this.read;
        Iterable<getCurrentKeyframe$MediaBrowserCompat$ItemReceiver> iterable = this.write;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (getCurrentKeyframe$MediaBrowserCompat$ItemReceiver getcurrentkeyframe_mediabrowsercompat_itemreceiver : iterable) {
            zzwe.IconCompatParcelizer iconCompatParcelizer = r6;
            zzwe.IconCompatParcelizer iconCompatParcelizer2 = new zzwe.IconCompatParcelizer(getcurrentkeyframe_mediabrowsercompat_itemreceiver.MediaMetadataCompat, getcurrentkeyframe_mediabrowsercompat_itemreceiver.read, getcurrentkeyframe_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver, getcurrentkeyframe_mediabrowsercompat_itemreceiver.IconCompatParcelizer, getcurrentkeyframe_mediabrowsercompat_itemreceiver.write, getcurrentkeyframe_mediabrowsercompat_itemreceiver.MediaBrowserCompat$MediaItem, getcurrentkeyframe_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver, getcurrentkeyframe_mediabrowsercompat_itemreceiver.MediaDescriptionCompat, getcurrentkeyframe_mediabrowsercompat_itemreceiver.RatingCompat, getcurrentkeyframe_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver);
            arrayList.add(iconCompatParcelizer);
        }
        return new zzwe.write(str, str2, (List) arrayList);
    }
}
