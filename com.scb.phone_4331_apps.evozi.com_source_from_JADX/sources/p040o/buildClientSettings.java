package p040o;

import com.scb.phone.view.activity.p038tc.JuristicEasyAppTermsAndConditionsActivity;
import com.scb.phone.view.activity.transferandpay.PullSlipActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.transferandpay.billpayment.C5720x28eb755c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.buildClientSettings */
public final class buildClientSettings extends FragmentBuilder_BindSummaryFragment {
    public final PullSlipActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver(LottieFrameInfo lottieFrameInfo) {
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        LottieFrameInfo lottieFrameInfo2 = lottieFrameInfo;
        onGetStartedClick.write((Object) lottieFrameInfo2, "entity");
        String str5 = lottieFrameInfo2.IconCompatParcelizer;
        String str6 = "";
        if (str5 == null) {
            str5 = str6;
        }
        String str7 = lottieFrameInfo2.MediaBrowserCompat$ItemReceiver;
        if (str7 == null) {
            str7 = str6;
        }
        String str8 = lottieFrameInfo2.MediaBrowserCompat$CustomActionResultReceiver;
        if (str8 != null) {
            str6 = str8;
        }
        List<getEndValueFloat> list2 = lottieFrameInfo2.write;
        if (list2 != null) {
            Iterable iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                getEndValueFloat getendvaluefloat = (getEndValueFloat) it.next();
                OffsetDateTime IconCompatParcelizer = IconCompatParcelizer(getendvaluefloat.RatingCompat);
                OffsetDateTime IconCompatParcelizer2 = IconCompatParcelizer(getendvaluefloat.MediaBrowserCompat$MediaItem);
                String str9 = getendvaluefloat.MediaDescriptionCompat;
                String str10 = getendvaluefloat.MediaMetadataCompat;
                String str11 = getendvaluefloat.MediaBrowserCompat$SearchResultReceiver;
                String str12 = getendvaluefloat.MediaBrowserCompat$ItemReceiver;
                String str13 = getendvaluefloat.IconCompatParcelizer;
                String str14 = getendvaluefloat.MediaSessionCompat$ResultReceiverWrapper;
                String str15 = getendvaluefloat.write;
                String str16 = getendvaluefloat.read;
                Iterator it2 = it;
                containsProgress containsprogress = getendvaluefloat.MediaBrowserCompat$CustomActionResultReceiver;
                if (containsprogress != null) {
                    str2 = containsprogress.MediaBrowserCompat$CustomActionResultReceiver;
                } else {
                    str2 = null;
                }
                containsProgress containsprogress2 = getendvaluefloat.MediaBrowserCompat$CustomActionResultReceiver;
                if (containsprogress2 != null) {
                    str4 = containsprogress2.MediaBrowserCompat$ItemReceiver;
                    str3 = str5;
                } else {
                    str3 = str5;
                    str4 = null;
                }
                arrayList.add(new C5720x28eb755c(IconCompatParcelizer, IconCompatParcelizer2, str9, str10, str11, str12, str13, str14, str15, str16, new JuristicEasyAppTermsAndConditionsActivity.read(str2, str4)));
                it = it2;
                str5 = str3;
            }
            str = str5;
            list = (List) arrayList;
        } else {
            str = str5;
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        return new PullSlipActivity$MediaBrowserCompat$ItemReceiver(str, str7, str6, list);
    }
}
