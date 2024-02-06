package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.CustomConcurrentHashMap;

/* renamed from: o.sizeImpl */
public final class sizeImpl {
    public final String MediaBrowserCompat$CustomActionResultReceiver = "%.2f";
    private final String write = DiskLruCache.VERSION_1;

    public final CustomConcurrentHashMap.EntryFactory.C32935 MediaBrowserCompat$ItemReceiver(asGzippedBytes asgzippedbytes) {
        String str;
        String str2;
        onGetStartedClick.write((Object) asgzippedbytes, "display");
        String str3 = this.write;
        String str4 = asgzippedbytes.read;
        if (str4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("totalLoanAmount");
        }
        String str5 = asgzippedbytes.IconCompatParcelizer;
        if (str5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ncbAcceptedFlag");
        }
        List<getLevel> list = asgzippedbytes.write;
        if (list == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("product");
        }
        Iterable<getLevel> iterable = list;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (getLevel getlevel : iterable) {
            String str6 = getlevel.MediaBrowserCompat$CustomActionResultReceiver;
            String format = String.format(this.MediaBrowserCompat$CustomActionResultReceiver, Arrays.copyOf(new Object[]{Double.valueOf(getlevel.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver)}, 1));
            onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(this, *args)");
            String format2 = String.format(this.MediaBrowserCompat$CustomActionResultReceiver, Arrays.copyOf(new Object[]{Double.valueOf(getlevel.MediaDescriptionCompat.write)}, 1));
            onGetStartedClick.IconCompatParcelizer((Object) format2, "java.lang.String.format(this, *args)");
            RestrictedComponentContainer restrictedComponentContainer = (RestrictedComponentContainer) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(getlevel.IconCompatParcelizer, 1);
            if (restrictedComponentContainer != null) {
                str = restrictedComponentContainer.MediaBrowserCompat$ItemReceiver;
            } else {
                str = null;
            }
            String str7 = getlevel.MediaBrowserCompat$SearchResultReceiver;
            RestrictedComponentContainer restrictedComponentContainer2 = (RestrictedComponentContainer) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(getlevel.IconCompatParcelizer, 0);
            if (restrictedComponentContainer2 != null) {
                str2 = restrictedComponentContainer2.MediaBrowserCompat$ItemReceiver;
            } else {
                str2 = null;
            }
            arrayList.add(new getPreviousExpirable(str6, format, format2, str, str7, str2));
        }
        return new Object(str3, str4, str5, (List) arrayList) {
            @SerializedName("totalLoanAmount")
            public String IconCompatParcelizer;
            @SerializedName("status")
            private final String MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("ncbAcceptedFlag")
            public final String MediaBrowserCompat$ItemReceiver;
            @SerializedName("product")
            public final List<getPreviousExpirable> write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C32935)) {
                    return false;
                }
                C32935 r3 = (C32935) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write);
            }

            public final int hashCode() {
                String str = this.MediaBrowserCompat$CustomActionResultReceiver;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.IconCompatParcelizer;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                List<getPreviousExpirable> list = this.write;
                if (list != null) {
                    i = list.hashCode();
                }
                return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("CreditPowerLoanRequest(status=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", totalLoanAmount=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", ncbAcceptedFlag=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", product=");
                sb.append(this.write);
                sb.append(")");
                return sb.toString();
            }

            {
                onGetStartedClick.write((Object) r2, "status");
                onGetStartedClick.write((Object) r4, "ncbAcceptedFlag");
                this.MediaBrowserCompat$CustomActionResultReceiver = r2;
                this.IconCompatParcelizer = r3;
                this.MediaBrowserCompat$ItemReceiver = r4;
                this.write = r5;
            }
        };
    }
}
