package p040o;

import android.text.TextUtils;
import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.FlagRegistry */
public final /* synthetic */ class FlagRegistry implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindSummaryFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ FlagRegistry(FragmentBuilder_BindSummaryFragment fragmentBuilder_BindSummaryFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindSummaryFragment;
    }

    public final Object write(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        List<setJustifyContent> list;
        String str8;
        List list2;
        List<ItemListIntents> list3;
        Iterator it;
        String str9;
        String str10;
        String str11;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) flexboxLayoutManager, "portfolioDetailsEntity");
        setShowDividerVertical setshowdividervertical = flexboxLayoutManager.IconCompatParcelizer;
        setShowDividerHorizontal setshowdividerhorizontal = flexboxLayoutManager.MediaBrowserCompat$CustomActionResultReceiver;
        String str12 = flexboxLayoutManager.write;
        String str13 = flexboxLayoutManager.read;
        String str14 = setshowdividervertical != null ? setshowdividervertical.write : null;
        String str15 = setshowdividervertical != null ? setshowdividervertical.read : null;
        String str16 = setshowdividervertical != null ? setshowdividervertical.MediaBrowserCompat$ItemReceiver : null;
        if (setshowdividervertical != null) {
            str = setshowdividervertical.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str = null;
        }
        String str17 = setshowdividerhorizontal != null ? setshowdividerhorizontal.write : null;
        if (setshowdividerhorizontal != null) {
            str2 = setshowdividerhorizontal.MediaBrowserCompat$ItemReceiver;
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        if (setshowdividerhorizontal != null) {
            str3 = setshowdividerhorizontal.MediaBrowserCompat$ItemReceiver;
        } else {
            str3 = null;
        }
        if (TextUtils.isEmpty(str3)) {
            str4 = "0.0";
        } else {
            if (str3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            str4 = str3;
        }
        if (setshowdividerhorizontal != null) {
            str5 = setshowdividerhorizontal.read;
        } else {
            str5 = null;
        }
        boolean isEmpty2 = TextUtils.isEmpty(str5);
        if (setshowdividerhorizontal != null) {
            str6 = setshowdividerhorizontal.read;
        } else {
            str6 = null;
        }
        if (TextUtils.isEmpty(str6)) {
            str7 = "0.0";
        } else {
            if (str6 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            str7 = str6;
        }
        String str18 = setshowdividerhorizontal != null ? setshowdividerhorizontal.IconCompatParcelizer : null;
        if (setshowdividerhorizontal != null) {
            list = setshowdividerhorizontal.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            list = null;
        }
        if (list != null) {
            Iterable iterable = list;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                setJustifyContent setjustifycontent = (setJustifyContent) it2.next();
                String str19 = setjustifycontent != null ? setjustifycontent.write : null;
                String str20 = setjustifycontent != null ? setjustifycontent.MediaBrowserCompat$CustomActionResultReceiver : null;
                if (setjustifycontent != null) {
                    it = it2;
                    str9 = setjustifycontent.read;
                } else {
                    it = it2;
                    str9 = null;
                }
                if (setjustifycontent != null) {
                    str11 = setjustifycontent.MediaBrowserCompat$ItemReceiver;
                    str10 = str13;
                } else {
                    str10 = str13;
                    str11 = null;
                }
                arrayList.add(new StreetViewPanorama(str19, str20, str9, str11));
                it2 = it;
                str13 = str10;
            }
            str8 = str13;
            list2 = (List) arrayList;
        } else {
            str8 = str13;
            list2 = null;
        }
        if (setshowdividerhorizontal != null) {
            list3 = setshowdividerhorizontal.MediaBrowserCompat$MediaItem;
        } else {
            list3 = null;
        }
        return DebitCardResetOtpActivity.just(new fromScreenLocation(str14, str15, str16, str, new isUserNavigationEnabled(str17, !isEmpty, str4, !isEmpty2, str7, str18, list2, isMeasurementEnabled.read(list3)), str12, str8));
    }
}
