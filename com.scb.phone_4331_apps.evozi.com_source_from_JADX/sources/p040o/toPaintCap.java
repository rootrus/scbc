package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.ShapeStroke;

/* renamed from: o.toPaintCap */
public final class toPaintCap {
    @SerializedName("periods")
    private final List<isClosed> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("sortBy")
    private final List<ShapeStroke.LineJoinType> write;

    public final setMaxWaitTime write() {
        List list;
        List list2;
        List<isClosed> list3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 10;
        if (list3 != null) {
            Iterable<isClosed> iterable = list3;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (isClosed IconCompatParcelizer : iterable) {
                arrayList.add(IconCompatParcelizer.IconCompatParcelizer());
            }
            list = (List) arrayList;
        } else {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        List<ShapeStroke.LineJoinType> list4 = this.write;
        if (list4 != null) {
            Iterable<ShapeStroke.LineJoinType> iterable2 = list4;
            onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
            if (iterable2 instanceof Collection) {
                i = ((Collection) iterable2).size();
            }
            Collection arrayList2 = new ArrayList(i);
            for (ShapeStroke.LineJoinType lineJoinType : iterable2) {
                String str = lineJoinType.MediaBrowserCompat$CustomActionResultReceiver;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                String str3 = lineJoinType.write;
                if (str3 == null) {
                    str3 = str2;
                }
                String str4 = lineJoinType.read;
                if (str4 != null) {
                    str2 = str4;
                }
                Boolean bool = lineJoinType.IconCompatParcelizer;
                arrayList2.add(new setDrawable(str, str3, str2, bool != null ? bool.booleanValue() : false));
            }
            list2 = (List) arrayList2;
        } else {
            list2 = HmlNationalIdActivity.IconCompatParcelizer;
        }
        return new setMaxWaitTime(list, list2);
    }
}
