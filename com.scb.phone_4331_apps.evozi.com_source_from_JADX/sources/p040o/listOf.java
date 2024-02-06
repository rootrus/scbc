package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.activity.bscanc.MyQRMenuActivity$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.activity.juristic.C5653x8f5d302a;
import com.scb.phone.view.activity.juristic.JuristicRequestFormActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.listOf */
public final /* synthetic */ class listOf implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindECouponQuantityFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ listOf(FragmentBuilder_BindECouponQuantityFragment fragmentBuilder_BindECouponQuantityFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindECouponQuantityFragment;
    }

    public final Object write(Object obj) {
        int i;
        findByEntry findbyentry = (findByEntry) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) findbyentry, "entity");
        Iterable<skipQuotedValue> iterable = findbyentry.read;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        int i2 = 10;
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (skipQuotedValue IconCompatParcelizer : iterable) {
            arrayList.add(isConnected.IconCompatParcelizer(IconCompatParcelizer));
        }
        List list = (List) arrayList;
        Iterable iterable2 = findbyentry.write;
        onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
        Collection arrayList2 = new ArrayList(iterable2 instanceof Collection ? ((Collection) iterable2).size() : 10);
        Iterator it = iterable2.iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            find find = (find) it.next();
            Integer num = find.RatingCompat;
            if (num != null) {
                i3 = num.intValue();
            }
            arrayList2.add(new JuristicRequestFormActivity.read(i3, find.MediaBrowserCompat$ItemReceiver, find.MediaBrowserCompat$CustomActionResultReceiver, find.read, find.write, find.MediaMetadataCompat, find.IconCompatParcelizer));
        }
        List list2 = (List) arrayList2;
        Iterable<skipToEndOfLine> iterable3 = findbyentry.IconCompatParcelizer;
        onGetStartedClick.write((Object) iterable3, "$this$collectionSizeOrDefault");
        if (iterable3 instanceof Collection) {
            i2 = ((Collection) iterable3).size();
        }
        Collection arrayList3 = new ArrayList(i2);
        for (skipToEndOfLine skiptoendofline : iterable3) {
            Integer num2 = skiptoendofline.MediaBrowserCompat$CustomActionResultReceiver;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = 0;
            }
            arrayList3.add(new MyQRMenuActivity$MediaBrowserCompat$CustomActionResultReceiver(i, skiptoendofline.read, skiptoendofline.IconCompatParcelizer, skiptoendofline.MediaBrowserCompat$ItemReceiver, skiptoendofline.write));
        }
        return new C5653x8f5d302a(list, list2, (List) arrayList3);
    }
}
