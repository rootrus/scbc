package p040o;

import com.scb.phone.view.fragment.directdebit.C5907x10730e76;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.createTypedList */
public final /* synthetic */ class createTypedList implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C5907x10730e76 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ createTypedList(C5907x10730e76 directDebitInputBillerListFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = directDebitInputBillerListFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Object write(Object obj) {
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        String str5;
        String str6;
        setMinAndMaxProgress setminandmaxprogress = (setMinAndMaxProgress) obj;
        String str7 = "entity";
        onGetStartedClick.write((Object) setminandmaxprogress, str7);
        String str8 = setminandmaxprogress.MediaBrowserCompat$CustomActionResultReceiver;
        String str9 = setminandmaxprogress.write;
        List<setFrame> list2 = setminandmaxprogress.MediaBrowserCompat$ItemReceiver;
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
                setFrame setframe = (setFrame) it.next();
                onGetStartedClick.write((Object) setframe, str7);
                int i2 = setframe.MediaSessionCompat$Token;
                String str10 = setframe.MediaBrowserCompat$ItemReceiver;
                String str11 = setframe.MediaBrowserCompat$CustomActionResultReceiver;
                String str12 = str11 == null ? "" : str11;
                String str13 = setframe.MediaBrowserCompat$MediaItem;
                if (str13 == null) {
                    str3 = "";
                } else {
                    str3 = str13;
                }
                String str14 = setframe.MediaBrowserCompat$SearchResultReceiver;
                String str15 = setframe.MediaDescriptionCompat;
                String str16 = setframe.RatingCompat;
                String str17 = setframe.PlaybackStateCompat;
                String str18 = setframe.ParcelableVolumeInfo;
                Iterator it2 = it;
                setMinAndMaxFrame setminandmaxframe = setframe.MediaMetadataCompat;
                String str19 = str7;
                String str20 = setminandmaxframe != null ? setminandmaxframe.write : null;
                if (setminandmaxframe != null) {
                    str5 = setminandmaxframe.MediaBrowserCompat$CustomActionResultReceiver;
                    str4 = str8;
                } else {
                    str4 = str8;
                    str5 = null;
                }
                DepositTransactionAdapter$GroupItemViewHolder_ViewBinding depositTransactionAdapter$GroupItemViewHolder_ViewBinding = new DepositTransactionAdapter$GroupItemViewHolder_ViewBinding(str20, str5);
                String[] strArr = setframe.write;
                int i3 = setframe.PlaybackStateCompat$CustomAction;
                String str21 = str9;
                String str22 = setframe.IconCompatParcelizer;
                Collection collection = arrayList;
                String str23 = setframe.setHasDecor;
                String str24 = setframe.f2630x50fd9e4a;
                String str25 = setframe.read;
                String str26 = setframe.Keep;
                String str27 = setframe.MediaSessionCompat$ResultReceiverWrapper;
                String str28 = setframe.MediaSessionCompat$QueueItem;
                String str29 = setframe.MediaBrowserCompat$MediaItem;
                if (str29 == null) {
                    str6 = "";
                } else {
                    str6 = str29;
                }
                arrayList = collection;
                arrayList.add(new C6431x12296157(i2, str10, str12, str3, str14, str15, str16, str17, str18, depositTransactionAdapter$GroupItemViewHolder_ViewBinding, strArr, i3, str22, str23, str24, str25, str26, str27, str28, str6));
                it = it2;
                str7 = str19;
                str8 = str4;
                str9 = str21;
            }
            str2 = str8;
            str = str9;
            Collection arrayList2 = new ArrayList();
            for (Object next : (List) arrayList) {
                if (!(((C6431x12296157) next).MediaBrowserCompat$CustomActionResultReceiver.length() == 0)) {
                    arrayList2.add(next);
                }
            }
            list = (List) arrayList2;
        } else {
            str2 = str8;
            str = str9;
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        return new DepositTransactionAdapter$GroupItemViewHolder(str2, str, list);
    }
}
