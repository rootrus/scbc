package p040o;

import com.scb.phone.view.activity.prepaid.reset.PrepaidResetOtpActivity;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.zzes */
public final /* synthetic */ class zzes implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ onCaptureClicked IconCompatParcelizer;

    public /* synthetic */ zzes(onCaptureClicked oncaptureclicked) {
        this.IconCompatParcelizer = oncaptureclicked;
    }

    public final Object write(Object obj) {
        List<ShapeLayer> list = ((applyJustification) obj).MediaBrowserCompat$CustomActionResultReceiver;
        ArrayList arrayList = new ArrayList();
        for (ShapeLayer next : list) {
            arrayList.add(new PrepaidResetOtpActivity.write(next.read, next.MediaBrowserCompat$ItemReceiver, "", next.IconCompatParcelizer, DiskLruCache.VERSION_1, 0));
        }
        return arrayList;
    }
}
