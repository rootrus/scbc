package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.zzcz;

/* renamed from: o.KeyframeAnimation */
public final class KeyframeAnimation {
    @SerializedName("endOfListFlag")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName(alternate = {"business"}, value = "company")
    private final List<write> MediaBrowserCompat$ItemReceiver;
    @SerializedName("nextPageNumber")
    private final Integer write;

    /* renamed from: o.KeyframeAnimation$write */
    public static final class write {
        @SerializedName(alternate = {"merchantId"}, value = "companyId")
        final String MediaBrowserCompat$ItemReceiver;
        @SerializedName(alternate = {"merchantName"}, value = "companyName")
        final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write write2 = (write) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) write2.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) write2.write);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CompanyEntity(companyId=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", companyName=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyframeAnimation)) {
            return false;
        }
        KeyframeAnimation keyframeAnimation = (KeyframeAnimation) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) keyframeAnimation.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) keyframeAnimation.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) keyframeAnimation.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        List<write> list = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        Integer num = this.write;
        int hashCode2 = num != null ? num.hashCode() : 0;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str != null) {
            i = str.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlCompanyListPageEntity(company=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", nextPageNumber=");
        sb.append(this.write);
        sb.append(", endOfListFlag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final zzcz.zzi IconCompatParcelizer() {
        Integer num = this.write;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) str, "$this$toBooleanFlag");
        boolean z = Integer.parseInt(str) == 1;
        Iterable<write> iterable = this.MediaBrowserCompat$ItemReceiver;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (write write2 : iterable) {
            arrayList.add(new zzcz.zzi.read(write2.MediaBrowserCompat$ItemReceiver, write2.write));
        }
        return new zzcz.zzi((List) arrayList, num, !z);
    }
}
