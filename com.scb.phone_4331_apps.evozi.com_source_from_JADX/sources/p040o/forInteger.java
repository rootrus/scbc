package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.remittance.C6150x69d72700;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.CompositionLayer;

/* renamed from: o.forInteger */
public final /* synthetic */ class forInteger implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C6150x69d72700 write;

    public /* synthetic */ forInteger(C6150x69d72700 remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver) {
        this.write = remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        getWebsiteUri getwebsiteuri;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        newInstance newinstance = this.write.MediaBrowserCompat$MediaItem;
        onGetStartedClick.write((Object) singleDataEntity, "entity");
        setOnPageChangeListener status = singleDataEntity.getStatus();
        getRefId getrefid = (getRefId) singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer((Object) status, "statusEntity");
        List list = null;
        if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("9200", status.write(), true)) {
            getWebsiteUri$MediaBrowserCompat$CustomActionResultReceiver getwebsiteuri_mediabrowsercompat_customactionresultreceiver = new getWebsiteUri$MediaBrowserCompat$CustomActionResultReceiver();
            getwebsiteuri_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = status.MediaBrowserCompat$ItemReceiver();
            getwebsiteuri_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = status.IconCompatParcelizer();
            getWebsiteUri getwebsiteuri2 = new getWebsiteUri(getwebsiteuri_mediabrowsercompat_customactionresultreceiver, (byte) 0);
            onGetStartedClick.IconCompatParcelizer((Object) getwebsiteuri2, "EmptyStatus.newBuider()\n…\n                .build()");
            getwebsiteuri = getwebsiteuri2;
            z = true;
        } else {
            z = false;
            getwebsiteuri = null;
        }
        String str11 = getrefid.MediaSessionCompat$ResultReceiverWrapper;
        String str12 = getrefid.MediaMetadataCompat;
        String str13 = "";
        String str14 = str12 == null ? str13 : str12;
        OffsetDateTime write2 = FragmentBuilder_BindSummaryFragment.write(getrefid.f5541x50fd9e4a, (OffsetDateTime) null);
        if (write2 == null) {
            write2 = OffsetDateTime.now();
            onGetStartedClick.IconCompatParcelizer((Object) write2, "OffsetDateTime.now()");
        }
        OffsetDateTime offsetDateTime = write2;
        CompositionLayer.C31931 r1 = getrefid.MediaBrowserCompat$MediaItem;
        if (r1 == null || (str = r1.write) == null) {
            str = str13;
        }
        if (r1 == null || (str2 = r1.MediaBrowserCompat$CustomActionResultReceiver) == null) {
            str2 = str13;
        }
        if (r1 == null || (str3 = r1.MediaBrowserCompat$ItemReceiver) == null) {
            str3 = str13;
        }
        SettingsClient settingsClient = new SettingsClient(str, str2, str3);
        String str15 = getrefid.MediaDescriptionCompat;
        String str16 = str15 == null ? str13 : str15;
        String str17 = getrefid.MediaBrowserCompat$CustomActionResultReceiver;
        setOnPageChangeListener setonpagechangelistener = getrefid.MediaBrowserCompat$SearchResultReceiver;
        if (setonpagechangelistener != null) {
            str4 = setonpagechangelistener.IconCompatParcelizer();
        } else {
            str4 = null;
        }
        setOnPageChangeListener setonpagechangelistener2 = getrefid.MediaBrowserCompat$SearchResultReceiver;
        if (setonpagechangelistener2 != null) {
            str5 = setonpagechangelistener2.write();
        } else {
            str5 = null;
        }
        OffsetDateTime write3 = FragmentBuilder_BindSummaryFragment.write(getrefid.MediaBrowserCompat$ItemReceiver, (OffsetDateTime) null);
        List<String> list2 = getrefid.read;
        String str18 = getrefid.IconCompatParcelizer;
        String str19 = str18 == null ? str13 : str18;
        String str20 = getrefid.RatingCompat;
        String str21 = getrefid.MediaSessionCompat$QueueItem;
        String str22 = getrefid.MediaSessionCompat$Token;
        List<forId> list3 = getrefid.write;
        if (list3 != null) {
            Iterable iterable = list3;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                forId forid = (forId) it.next();
                Iterator it2 = it;
                if (forid == null || (str7 = forid.IconCompatParcelizer) == null) {
                    str7 = str13;
                }
                String str23 = str13;
                if (forid == null || (str8 = forid.MediaBrowserCompat$ItemReceiver) == null) {
                    str8 = str23;
                }
                if (forid == null || (str10 = forid.write) == null) {
                    str9 = str22;
                    str10 = str23;
                } else {
                    str9 = str22;
                }
                arrayList.add(new setInitialTrigger(str7, str8, str10));
                it = it2;
                str13 = str23;
                str22 = str9;
            }
            str6 = str22;
            list = (List) arrayList;
        } else {
            str6 = str22;
        }
        return DebitCardResetOtpActivity.just(new AddPlaceRequest(z, getwebsiteuri, str11, str14, offsetDateTime, settingsClient, str16, str17, str4, str5, write3, list2, str19, str20, str21, str6, list));
    }
}
