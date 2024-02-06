package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.search.SequentialSearchService;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import com.scb.phone.view.fragment.prepaid.traveltab.PrepaidTravelWalletTabFragment$MediaBrowserCompat$ItemReceiver;
import java.util.HashMap;
import p040o.ImmutableSortedMap;

/* renamed from: o.zzlr */
public final class zzlr implements ByFunctionOrdering {
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final SequentialSearchService write;

    /* renamed from: o.zzlr$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            return (setMaxLine) singleDataEntity.getData();
        }
    }

    /* renamed from: o.zzlr$write */
    static final class write<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
        }

        public final /* synthetic */ Object write(Object obj) {
            setMaxLine setmaxline = (setMaxLine) obj;
            onGetStartedClick.write((Object) setmaxline, "it");
            return new PrepaidTravelWalletTabFragment$MediaBrowserCompat$ItemReceiver(setmaxline.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    @HmlPinActivity
    public zzlr(SequentialSearchService sequentialSearchService, String str) {
        onGetStartedClick.write((Object) sequentialSearchService, "service");
        onGetStartedClick.write((Object) str, "tilesVersion");
        this.write = sequentialSearchService;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final BScanCNotificationDeepLinkActivity<PrepaidTravelWalletTabFragment$MediaBrowserCompat$ItemReceiver> write(String str, HashMap<String, String> hashMap) {
        onGetStartedClick.write((Object) str, "searchType");
        onGetStartedClick.write((Object) hashMap, "mapData");
        String str2 = hashMap.get("KEY_RESULT");
        CharSequence charSequence = str2;
        boolean z = false;
        if (charSequence == null || charSequence.length() == 0) {
            throw new EntityMappingException("KEY_RESULT cannot be empty");
        } else if (str.hashCode() != 66484 || !str.equals("CAR")) {
            throw new EntityMappingException("invalid Search type");
        } else {
            String str3 = hashMap.get("PRODUCT_TYPE");
            CharSequence charSequence2 = str3;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z = true;
            }
            if (!z) {
                BScanCNotificationDeepLinkActivity<SingleDataEntity<setMaxLine>> postCarInquiry = this.write.postCarInquiry(new ImmutableSortedMap.ValuesSerializedForm(this.MediaBrowserCompat$CustomActionResultReceiver, str3, str2, hashMap.get("BRAND"), hashMap.get("MODEL"), hashMap.get("YEAROFMANUFACTURE"), hashMap.get("SUBMODEL")));
                DirectDebitDeepLinkActivity directDebitDeepLinkActivity = IconCompatParcelizer.read;
                HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
                onCopy oncopy = new onCopy(postCarInquiry, directDebitDeepLinkActivity);
                DirectDebitDeepLinkActivity directDebitDeepLinkActivity2 = write.MediaBrowserCompat$ItemReceiver;
                HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity2, "mapper is null");
                onCopy oncopy2 = new onCopy(oncopy, directDebitDeepLinkActivity2);
                onGetStartedClick.IconCompatParcelizer((Object) oncopy2, "service.postCarInquiry(r…   .map { it.toDomain() }");
                return oncopy2;
            }
            throw new EntityMappingException("PRODUCT_TYPE cannot be empty");
        }
    }
}
