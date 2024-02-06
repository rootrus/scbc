package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.api.insurance.InsuranceApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.AbstractMultimap;
import p040o.CustomConcurrentHashMap;

/* renamed from: o.zzjy */
public final class zzjy implements AbstractMultimap.WrappedCollection {
    final zah MediaBrowserCompat$CustomActionResultReceiver;
    final getSignInResultFromIntent MediaBrowserCompat$ItemReceiver;
    private final InsuranceApi read;
    final zac write;

    /* renamed from: o.zzjy$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ zzjy MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(zzjy zzjy) {
            this.MediaBrowserCompat$CustomActionResultReceiver = zzjy;
        }

        public final /* synthetic */ Object write(Object obj) {
            List list;
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            zah zah = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            Object data = singleDataEntity.getData();
            onGetStartedClick.IconCompatParcelizer(data, "it.data");
            getMiterLimit getmiterlimit = (getMiterLimit) data;
            onGetStartedClick.write((Object) getmiterlimit, "entity");
            List<getHighlightAngle> list2 = getmiterlimit.MediaBrowserCompat$ItemReceiver;
            if (list2 != null) {
                Iterable<getHighlightAngle> iterable = list2;
                GoogleSignInClient googleSignInClient = zah.IconCompatParcelizer;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i);
                for (getHighlightAngle MediaBrowserCompat$ItemReceiver : iterable) {
                    arrayList.add(googleSignInClient.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver));
                }
                list = (List) arrayList;
            } else {
                list = null;
            }
            return new GeofenceStatusCodes(list);
        }
    }

    /* renamed from: o.zzjy$read */
    static final class read<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ zzjy write;

        read(zzjy zzjy) {
            this.write = zzjy;
        }

        public final /* synthetic */ Object write(Object obj) {
            GeofencingEvent geofencingEvent;
            List list;
            ambientEnabled ambientenabled;
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            Object data = singleDataEntity.getData();
            onGetStartedClick.IconCompatParcelizer(data, "it.data");
            getHighlightLength gethighlightlength = (getHighlightLength) data;
            onGetStartedClick.write((Object) gethighlightlength, "entity");
            String str = gethighlightlength.write;
            String str2 = gethighlightlength.MediaDescriptionCompat;
            String str3 = gethighlightlength.read;
            Double d = gethighlightlength.MediaBrowserCompat$CustomActionResultReceiver;
            getDashOffset getdashoffset = gethighlightlength.IconCompatParcelizer;
            if (getdashoffset != null) {
                geofencingEvent = GoogleSignInOptions.MediaBrowserCompat$ItemReceiver(getdashoffset);
            } else {
                geofencingEvent = null;
            }
            List<setNoDataTextTypeface> list2 = gethighlightlength.MediaBrowserCompat$ItemReceiver;
            if (list2 != null) {
                Collection arrayList = new ArrayList();
                for (setNoDataTextTypeface setnodatatexttypeface : list2) {
                    if (setnodatatexttypeface.IconCompatParcelizer == null || setnodatatexttypeface.read == null) {
                        ambientenabled = null;
                    } else {
                        ambientenabled = new ambientEnabled(setnodatatexttypeface.IconCompatParcelizer, setnodatatexttypeface.read);
                    }
                    if (ambientenabled != null) {
                        arrayList.add(ambientenabled);
                    }
                }
                list = (List) arrayList;
            } else {
                list = null;
            }
            return new setTransitionTypes(str, str2, str3, d, geofencingEvent, list);
        }
    }

    @HmlPinActivity
    public zzjy(InsuranceApi insuranceApi, zah zah, zac zac, getSignInResultFromIntent getsigninresultfromintent) {
        onGetStartedClick.write((Object) insuranceApi, "insuranceApi");
        onGetStartedClick.write((Object) zah, "portfolioSummaryEntityMapper");
        onGetStartedClick.write((Object) zac, "initiatePaymentEntityMapper");
        onGetStartedClick.write((Object) getsigninresultfromintent, "insurancePaymentConfirmationEntityMapper");
        this.read = insuranceApi;
        this.MediaBrowserCompat$CustomActionResultReceiver = zah;
        this.write = zac;
        this.MediaBrowserCompat$ItemReceiver = getsigninresultfromintent;
    }

    public final BScanCNotificationDeepLinkActivity<GeofenceStatusCodes> write() {
        BScanCNotificationDeepLinkActivity<SingleDataEntity<getMiterLimit>> portfolioSummary = this.read.portfolioSummary();
        DirectDebitDeepLinkActivity iconCompatParcelizer = new IconCompatParcelizer(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(iconCompatParcelizer, "mapper is null");
        onCopy oncopy = new onCopy(portfolioSummary, iconCompatParcelizer);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "insuranceApi.portfolioSu…sform(entity = it.data) }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<setExpirationDuration> MediaBrowserCompat$CustomActionResultReceiver(CustomConcurrentHashMap.WeakEntry weakEntry) {
        onGetStartedClick.write((Object) weakEntry, "request");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<getStartPoint>> initiatePayment = this.read.initiatePayment(weakEntry);
        DirectDebitDeepLinkActivity zzjy_mediabrowsercompat_itemreceiver = new zzjy$MediaBrowserCompat$ItemReceiver(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(zzjy_mediabrowsercompat_itemreceiver, "mapper is null");
        onCopy oncopy = new onCopy(initiatePayment, zzjy_mediabrowsercompat_itemreceiver);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "insuranceApi.initiatePay…sform(entity = it.data) }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<setTransitionTypes> MediaBrowserCompat$CustomActionResultReceiver(CustomConcurrentHashMap.Values values) {
        onGetStartedClick.write((Object) values, "request");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<getHighlightLength>> confirmPayment = this.read.confirmPayment(values);
        DirectDebitDeepLinkActivity read2 = new read(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(read2, "mapper is null");
        onCopy oncopy = new onCopy(confirmPayment, read2);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "insuranceApi.confirmPaym…sform(entity = it.data) }");
        return oncopy;
    }
}
