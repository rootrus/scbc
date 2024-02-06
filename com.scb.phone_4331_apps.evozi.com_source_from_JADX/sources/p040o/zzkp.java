package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.prepaid.PrepaidService;
import com.scb.phone.view.activity.transferandpay.C5718x9357954a;
import com.scb.phone.view.activity.transferandpay.PullSlipActivity$MediaBrowserCompat$ItemReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.AbstractMultimap;
import p040o.ImmutableBiMap;
import p040o.ImmutableCollection;

/* renamed from: o.zzkp */
public final class zzkp implements AbstractMultimap.WrappedCollection.WrappedIterator {
    private final String IconCompatParcelizer = "";
    final getCookieValue MediaBrowserCompat$CustomActionResultReceiver;
    final buildClientSettings MediaBrowserCompat$ItemReceiver;
    private final List<setTrafficEnabled> MediaBrowserCompat$MediaItem = HmlNationalIdActivity.IconCompatParcelizer;
    private final PrepaidService MediaBrowserCompat$SearchResultReceiver;
    private final String MediaDescriptionCompat;
    private final String RatingCompat = "";
    private final String read = "";
    final addScopeNames write;

    /* renamed from: o.zzkp$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> {
        private /* synthetic */ List read;
        private /* synthetic */ zzkp write;

        IconCompatParcelizer(zzkp zzkp, List list) {
            this.write = zzkp;
            this.read = list;
        }

        public final /* synthetic */ Object write(Object obj) {
            List list;
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "entity");
            Object data = singleDataEntity.getData();
            onGetStartedClick.IconCompatParcelizer(data, "entity.data");
            resizeBitmapIfNeeded resizebitmapifneeded = (resizeBitmapIfNeeded) data;
            List list2 = this.read;
            onGetStartedClick.write((Object) resizebitmapifneeded, "entity");
            onGetStartedClick.write((Object) list2, "prepaidCardAccounts");
            String str = resizebitmapifneeded.MediaBrowserCompat$ItemReceiver;
            String str2 = resizebitmapifneeded.MediaBrowserCompat$CustomActionResultReceiver;
            String str3 = resizebitmapifneeded.write;
            List<saveLayerCompat> list3 = resizebitmapifneeded.read;
            if (list3 != null) {
                Iterable<saveLayerCompat> iterable = list3;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i);
                for (saveLayerCompat MediaBrowserCompat$ItemReceiver : iterable) {
                    arrayList.add(addScopeNames.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver, list2));
                }
                Collection arrayList2 = new ArrayList();
                for (Object next : (List) arrayList) {
                    if (!(((setTrafficEnabled) next).write.length() == 0)) {
                        arrayList2.add(next);
                    }
                }
                list = (List) arrayList2;
            } else {
                list = HmlNationalIdActivity.IconCompatParcelizer;
            }
            return DebitCardResetOtpActivity.just(new C5718x9357954a(str, str2, str3, list));
        }
    }

    /* renamed from: o.zzkp$write */
    static final class write<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ zzkp MediaBrowserCompat$CustomActionResultReceiver;

        write(zzkp zzkp) {
            this.MediaBrowserCompat$CustomActionResultReceiver = zzkp;
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            return getCookieValue.IconCompatParcelizer((resolveKeyPath) singleDataEntity.getData());
        }
    }

    @HmlPinActivity
    public zzkp(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, PrepaidService prepaidService, addScopeNames addscopenames, getCookieValue getcookievalue, buildClientSettings buildclientsettings) {
        onGetStartedClick.write((Object) str, "tileVersion");
        onGetStartedClick.write((Object) prepaidService, "service");
        onGetStartedClick.write((Object) addscopenames, "prepaidCardSummaryMapper");
        onGetStartedClick.write((Object) getcookievalue, "creditCardRewardMapper");
        onGetStartedClick.write((Object) buildclientsettings, "prepaidTransactionsMapper");
        this.MediaDescriptionCompat = str;
        this.MediaBrowserCompat$SearchResultReceiver = prepaidService;
        this.write = addscopenames;
        this.MediaBrowserCompat$CustomActionResultReceiver = getcookievalue;
        this.MediaBrowserCompat$ItemReceiver = buildclientsettings;
    }

    public final DebitCardResetOtpActivity<isGeodesic> MediaBrowserCompat$ItemReceiver(ImmutableBiMap.Builder builder) {
        onGetStartedClick.write((Object) builder, "request");
        DebitCardResetOtpActivity<R> map = this.MediaBrowserCompat$SearchResultReceiver.getReward(builder).map(new write(this));
        onGetStartedClick.IconCompatParcelizer((Object) map, "service.getReward(reques…pper.transform(it.data) }");
        return map;
    }

    public final DebitCardResetOtpActivity<PullSlipActivity$MediaBrowserCompat$ItemReceiver> read(ImmutableCollection.C34981 r2) {
        onGetStartedClick.write((Object) r2, "request");
        DebitCardResetOtpActivity<R> map = this.MediaBrowserCompat$SearchResultReceiver.getPrepaidTransactions(r2).map(new zzkp$MediaBrowserCompat$CustomActionResultReceiver(this));
        onGetStartedClick.IconCompatParcelizer((Object) map, "service.getPrepaidTransa…pper.transform(it.data) }");
        return map;
    }

    public final String write() {
        return this.MediaDescriptionCompat;
    }

    public final BScanCNotificationDeepLinkActivity<zzuk> MediaBrowserCompat$ItemReceiver(ImmutableEntry immutableEntry, String str, String str2) {
        onGetStartedClick.write((Object) immutableEntry, "request");
        onGetStartedClick.write((Object) str, "tokenUUID");
        onGetStartedClick.write((Object) str2, "otp");
        BScanCNotificationDeepLinkActivity<setCurrentItemInternal> prepaidResetOtpConfirm = this.MediaBrowserCompat$SearchResultReceiver.getPrepaidResetOtpConfirm(immutableEntry, str, str2);
        DirectDebitDeepLinkActivity zzkp_mediabrowsercompat_itemreceiver = new zzkp$MediaBrowserCompat$ItemReceiver(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(zzkp_mediabrowsercompat_itemreceiver, "mapper is null");
        onCopy oncopy = new onCopy(prepaidResetOtpConfirm, zzkp_mediabrowsercompat_itemreceiver);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "service.getPrepaidResetO…apper.transformBase(it) }");
        return oncopy;
    }

    public final DebitCardResetOtpActivity<C5718x9357954a> MediaBrowserCompat$CustomActionResultReceiver(copyOf copyof, List<zzry> list) {
        List<ImmutableBiMap> list2;
        onGetStartedClick.write((Object) list, "prepaidAccounts");
        if (copyof != null) {
            list2 = copyof.read;
        } else {
            list2 = null;
        }
        if (list2 == null || !copyof.read.isEmpty()) {
            PrepaidService prepaidService = this.MediaBrowserCompat$SearchResultReceiver;
            if (copyof == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            DebitCardResetOtpActivity<R> flatMap = prepaidService.getPrePaidCardSummary(copyof).flatMap(new IconCompatParcelizer(this, list));
            onGetStartedClick.IconCompatParcelizer((Object) flatMap, "service.getPrePaidCardSu…s))\n                    }");
            return flatMap;
        }
        DebitCardResetOtpActivity<C5718x9357954a> just = DebitCardResetOtpActivity.just(new C5718x9357954a(this.IconCompatParcelizer, this.read, this.RatingCompat, this.MediaBrowserCompat$MediaItem));
        onGetStartedClick.IconCompatParcelizer((Object) just, "Observable.just(PrepaidC…dError, prepaidCardList))");
        return just;
    }
}
