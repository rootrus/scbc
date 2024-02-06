package p040o;

import com.scb.phone.view.activity.prepaid.reset.PrepaidResetOtpActivity;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.isLoggable */
public final /* synthetic */ class isLoggable implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ onBackClicked write;

    public /* synthetic */ isLoggable(onBackClicked onbackclicked) {
        this.write = onbackclicked;
    }

    public final Object write(Object obj) {
        List<codePointToString> list = ((TextLayer) obj).MediaBrowserCompat$CustomActionResultReceiver;
        ArrayList arrayList = new ArrayList();
        for (codePointToString next : list) {
            arrayList.add(new PrepaidResetOtpActivity.write(next.MediaBrowserCompat$ItemReceiver, next.write, "", next.MediaBrowserCompat$CustomActionResultReceiver, DiskLruCache.VERSION_1, 0));
        }
        return arrayList;
    }
}
