package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.LottieDrawable;
import p040o.zzin;

/* renamed from: o.getEventCode$MediaBrowserCompat$ItemReceiver */
final class getEventCode$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final getEventCode$MediaBrowserCompat$ItemReceiver IconCompatParcelizer = new getEventCode$MediaBrowserCompat$ItemReceiver();

    getEventCode$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ Object write(Object obj) {
        List list;
        List write;
        LottieDrawable.LazyCompositionTask lazyCompositionTask = (LottieDrawable.LazyCompositionTask) obj;
        onGetStartedClick.write((Object) lazyCompositionTask, "it");
        String str = lazyCompositionTask.IconCompatParcelizer;
        String str2 = lazyCompositionTask.read;
        if (str2 == null) {
            str2 = "";
        }
        List<LottieDrawable.C36279> list2 = lazyCompositionTask.write;
        if (list2 == null || (write = HmlNTBBusinessURLInformationActivity.write(list2, new LottieDrawable.LazyCompositionTask.IconCompatParcelizer())) == null) {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        } else {
            Iterable<LottieDrawable.C36279> iterable = write;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (LottieDrawable.C36279 MediaBrowserCompat$CustomActionResultReceiver : iterable) {
                arrayList.add(MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver());
            }
            list = (List) arrayList;
        }
        return new zzin.zzd(str, str2, list);
    }
}
