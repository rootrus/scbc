package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.easycash.EasycashCommonReviewFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.writeBigDecimal */
public final /* synthetic */ class writeBigDecimal implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ EasycashCommonReviewFragment.IconCompatParcelizer IconCompatParcelizer;

    public /* synthetic */ writeBigDecimal(EasycashCommonReviewFragment.IconCompatParcelizer iconCompatParcelizer) {
        this.IconCompatParcelizer = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        List list;
        List list2;
        getMaskAndMatteCount getmaskandmattecount = (getMaskAndMatteCount) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) getmaskandmattecount, "depositProductInfoEntity");
        List<getWarnings> list3 = getmaskandmattecount.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 10;
        if (list3 != null) {
            Iterable<getWarnings> iterable = list3;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (getWarnings getwarnings : iterable) {
                arrayList.add(new DividendSummaryAdapter$ChildViewHolder(getwarnings.RatingCompat, getwarnings.read, getwarnings.MediaBrowserCompat$CustomActionResultReceiver, getwarnings.IconCompatParcelizer, getwarnings.write, getwarnings.MediaBrowserCompat$ItemReceiver));
            }
            list = (List) arrayList;
        } else {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        List<fromInputStreamSync> list4 = getmaskandmattecount.read;
        if (list4 != null) {
            Iterable<fromInputStreamSync> iterable2 = list4;
            onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
            if (iterable2 instanceof Collection) {
                i = ((Collection) iterable2).size();
            }
            Collection arrayList2 = new ArrayList(i);
            for (fromInputStreamSync read : iterable2) {
                arrayList2.add(setHintPickerConfig.read(read));
            }
            list2 = (List) arrayList2;
        } else {
            list2 = HmlNationalIdActivity.IconCompatParcelizer;
        }
        return new getDefaultLevelIndex(list, list2);
    }
}
