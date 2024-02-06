package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p040o.MapConstraints;
import p040o.TaskRunner;
import p040o.writeUInt64NoTag;

/* renamed from: o.TaskRunner$TaskCompletedListener$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3849x5daebc18<T> implements DebitCardMarketConductDeepLinkActivity<zzsj> {
    private /* synthetic */ TaskRunner.TaskCompletedListener IconCompatParcelizer;

    public C3849x5daebc18(TaskRunner.TaskCompletedListener taskCompletedListener) {
        this.IconCompatParcelizer = taskCompletedListener;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        List list;
        boolean z;
        zzsj zzsj = (zzsj) obj;
        MapConstraints.ConstrainedMultimap.C36372 MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.read;
        zzvf RatingCompat = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.RatingCompat();
        if (RatingCompat != null) {
            list = RatingCompat.MediaBrowserCompat$ItemReceiver;
        } else {
            list = new ArrayList();
        }
        makeUninterruptible IconCompatParcelizer2 = MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(zzsj, list, this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.setItemInvoker());
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "depositSummaryDisplay");
        List<immediateCheckedFuture> MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver();
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "depositSummaryDisplay.depositDisplayList");
        Collection arrayList = new ArrayList();
        Iterator it = MediaBrowserCompat$ItemReceiver.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            immediateCheckedFuture immediatecheckedfuture = (immediateCheckedFuture) next;
            String MediaBrowserCompat$ItemReceiver2 = this.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
            onGetStartedClick.IconCompatParcelizer((Object) immediatecheckedfuture, "depositDisplay");
            if ((!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) MediaBrowserCompat$ItemReceiver2, (Object) immediatecheckedfuture.AppCompatViewInflater)) && immediatecheckedfuture.MediaBrowserCompat$MediaItem.contains("MERCHANT_APP_ACCOUNT")) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        final List list2 = (List) arrayList;
        TaskRunner.TaskCompletedListener taskCompletedListener = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<C1219xa97c14d5>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                C1219xa97c14d5 iIdExtractionResult$MediaBrowserCompat$CustomActionResultReceiver = (C1219xa97c14d5) obj;
                iIdExtractionResult$MediaBrowserCompat$CustomActionResultReceiver.aj_();
                Collection collection = list2;
                if (!(collection == null || collection.isEmpty())) {
                    iIdExtractionResult$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(list2);
                } else {
                    iIdExtractionResult$MediaBrowserCompat$CustomActionResultReceiver.read();
                }
            }
        };
        if (taskCompletedListener.RatingCompat != null) {
            z = true;
        }
        if (z) {
            r1.IconCompatParcelizer(taskCompletedListener.RatingCompat);
        }
    }
}
