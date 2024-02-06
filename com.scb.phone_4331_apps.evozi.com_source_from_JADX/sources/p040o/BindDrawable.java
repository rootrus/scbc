package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.BindDrawable */
public final class BindDrawable {
    @SerializedName("countryList")
    List<BindColor> read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BindDrawable) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((BindDrawable) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        List<BindColor> list = this.read;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CountryListEntity(countryList=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public final zzwg read() {
        Iterable<BindColor> iterable = this.read;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (BindColor bindColor : iterable) {
            zzwj MediaBrowserCompat$CustomActionResultReceiver = zzwj.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = bindColor.read;
            MediaBrowserCompat$CustomActionResultReceiver.read = bindColor.write;
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = bindColor.MediaBrowserCompat$ItemReceiver;
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver);
        }
        List<zzwj> MediaBrowserCompat$CustomActionResultReceiver2 = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver((List) arrayList);
        zzwg zzwg = new zzwg();
        zzwg.read = MediaBrowserCompat$CustomActionResultReceiver2;
        return zzwg;
    }
}
