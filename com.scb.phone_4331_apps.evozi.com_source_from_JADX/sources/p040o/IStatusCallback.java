package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.TextLayer;

/* renamed from: o.IStatusCallback */
public final class IStatusCallback extends FragmentBuilder_BindSummaryFragment {

    /* renamed from: o.IStatusCallback$Stub */
    public final class Stub extends FragmentBuilder_BindSummaryFragment {

        /* renamed from: o.IStatusCallback$Stub$zaa */
        public final class zaa implements OPRStatusRewardsLandingActivity_ViewBinding<IStatusCallback> {
            private final HmlReviewDocumentActivity<Stub> MediaBrowserCompat$ItemReceiver;

            private zaa(HmlReviewDocumentActivity<Stub> hmlReviewDocumentActivity) {
                this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
            }

            public static zaa MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<Stub> hmlReviewDocumentActivity) {
                return new zaa(hmlReviewDocumentActivity);
            }

            public final /* synthetic */ Object get() {
                return new IStatusCallback(this.MediaBrowserCompat$ItemReceiver.get());
            }
        }
    }

    @HmlPinActivity
    public IStatusCallback(Stub stub) {
        onGetStartedClick.write((Object) stub, "answerEntityMapper");
    }

    public static getViewport write(filenameForUrl filenameforurl, List<NetworkCache> list) {
        String str;
        Object obj;
        boolean z;
        onGetStartedClick.write((Object) filenameforurl, "questionEntity");
        onGetStartedClick.write((Object) list, "summaryQuestions");
        int parseInt = Integer.parseInt(filenameforurl.IconCompatParcelizer);
        String str2 = filenameforurl.MediaBrowserCompat$ItemReceiver;
        Iterator it = list.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            NetworkCache networkCache = (NetworkCache) obj;
            if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) networkCache.read, (Object) filenameforurl.MediaBrowserCompat$CustomActionResultReceiver) || !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) networkCache.MediaBrowserCompat$ItemReceiver, (Object) filenameforurl.IconCompatParcelizer)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        NetworkCache networkCache2 = (NetworkCache) obj;
        if (networkCache2 != null) {
            str = networkCache2.IconCompatParcelizer;
        }
        if (str == null) {
            str = "";
        }
        Iterable<TextLayer.C38593> iterable = filenameforurl.write;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (TextLayer.C38593 r2 : iterable) {
            onGetStartedClick.write((Object) r2, "answerEntity");
            arrayList.add(new getAttributions(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) r2.IconCompatParcelizer, (Object) DiskLruCache.VERSION_1), r2.MediaBrowserCompat$CustomActionResultReceiver, r2.MediaBrowserCompat$ItemReceiver));
        }
        return new getViewport(parseInt, str2, str, (List) arrayList);
    }
}
