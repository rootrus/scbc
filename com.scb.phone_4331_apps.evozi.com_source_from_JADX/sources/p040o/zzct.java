package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.CredentialsOptions;
import p040o.zzbc;

/* renamed from: o.zzct */
public final /* synthetic */ class zzct implements DirectDebitDeepLinkActivity {

    /* renamed from: o.zzct$zza */
    public enum zza {
        CONSUMER,
        BUSINESS_OWNER
    }

    public /* synthetic */ zzct(CredentialsOptions.Builder builder) {
    }

    public final Object write(Object obj) {
        List list;
        List list2;
        logRenderTimes logrendertimes = (logRenderTimes) obj;
        onGetStartedClick.write((Object) logrendertimes, "eligibilityEntity");
        String str = logrendertimes.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null) {
            str = "";
        }
        String str2 = logrendertimes.IconCompatParcelizer;
        if (str2 == null) {
            str2 = "";
        }
        List<removeFrameListener> list3 = logrendertimes.write;
        int i = 10;
        if (list3 != null) {
            Iterable<removeFrameListener> iterable = list3;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (removeFrameListener removeframelistener : iterable) {
                CharSequence charSequence = removeframelistener.MediaBrowserCompat$ItemReceiver;
                String str3 = charSequence == null || GoodToKnowActivity.read(charSequence) ? null : removeframelistener.MediaBrowserCompat$ItemReceiver;
                String str4 = removeframelistener.IconCompatParcelizer;
                if (str4 == null) {
                    str4 = "";
                }
                arrayList.add(new zzbc.zzc(str3, str4));
            }
            list = (List) arrayList;
        } else {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        List<clearRenderTimes> list4 = logrendertimes.MediaBrowserCompat$ItemReceiver;
        if (list4 != null) {
            Iterable<clearRenderTimes> iterable2 = list4;
            onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
            if (iterable2 instanceof Collection) {
                i = ((Collection) iterable2).size();
            }
            Collection arrayList2 = new ArrayList(i);
            for (clearRenderTimes clearrendertimes : iterable2) {
                arrayList2.add(clearrendertimes.MediaBrowserCompat$CustomActionResultReceiver);
            }
            list2 = (List) arrayList2;
        } else {
            list2 = HmlNationalIdActivity.IconCompatParcelizer;
        }
        return new zzbc.zzd(str, str2, list, list2);
    }
}
