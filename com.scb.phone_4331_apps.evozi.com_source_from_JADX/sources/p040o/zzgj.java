package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.activity.hml.HmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.AbstractMultimap;
import p040o.Constraints;
import p040o.zzqj;
import p040o.zzqp;
import p040o.zzrc;
import p040o.zztx;

/* renamed from: o.zzgj */
public final class zzgj implements AbstractMultimap.MultisetKeyIterator {
    private final setProductListSource IconCompatParcelizer;
    private final HmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private final zzac MediaBrowserCompat$ItemReceiver;
    private final zzl MediaDescriptionCompat;
    private final Promotion read;
    private final setTransactionShipping write;

    /* renamed from: o.zzgj$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            return (beginSection) singleDataEntity.getData();
        }
    }

    /* renamed from: o.zzgj$MediaDescriptionCompat */
    static final class MediaDescriptionCompat<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        public static final MediaDescriptionCompat IconCompatParcelizer = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            return (enableOrDisableHardwareLayer) singleDataEntity.getData();
        }
    }

    /* renamed from: o.zzgj$MediaMetadataCompat */
    static final /* synthetic */ class MediaMetadataCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<beginSection, zzqj.zzd> {
        MediaMetadataCompat(Promotion promotion) {
            super(1, promotion);
        }

        public final String getName() {
            return "transform";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(Promotion.class);
        }

        public final String getSignature() {
            return "transform(Lcom/scb/phone/data/entity/ccrredemption/ecoupon/ECouponDetailEntity;)Lcom/scb/phone/domain/entity/ccrredemption/ecoupon/ECouponDetail;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            beginSection beginsection = (beginSection) obj;
            onGetStartedClick.write((Object) beginsection, "p1");
            return Promotion.MediaBrowserCompat$CustomActionResultReceiver(beginsection);
        }
    }

    /* renamed from: o.zzgj$RatingCompat */
    static final /* synthetic */ class RatingCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<setTraceEnabled, zzqj.zze> {
        RatingCompat(zzac zzac) {
            super(1, zzac);
        }

        public final String getName() {
            return "transform";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(zzac.class);
        }

        public final String getSignature() {
            return "transform(Lcom/scb/phone/data/entity/ccrredemption/ecoupon/ECouponTransactionEntity;)Lcom/scb/phone/domain/entity/ccrredemption/ecoupon/ECouponTransaction;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int i;
            int i2;
            int i3;
            boolean z;
            Boolean bool;
            Boolean bool2;
            Integer num;
            Integer num2;
            int i4;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            setTraceEnabled settraceenabled = (setTraceEnabled) obj;
            onGetStartedClick.write((Object) settraceenabled, "p1");
            onGetStartedClick.write((Object) settraceenabled, "entity");
            Integer num3 = settraceenabled.IconCompatParcelizer;
            boolean z2 = false;
            if (num3 != null) {
                i = num3.intValue();
            } else {
                i = 0;
            }
            List<C1224L> list = settraceenabled.MediaBrowserCompat$CustomActionResultReceiver;
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (C1224L l : list) {
                    Collection collection = arrayList;
                    String str8 = l.write;
                    String str9 = str8 == null ? "" : str8;
                    Integer num4 = l.IconCompatParcelizer;
                    if (num4 != null) {
                        i4 = num4.intValue();
                    } else {
                        i4 = 0;
                    }
                    String str10 = l.MediaBrowserCompat$CustomActionResultReceiver;
                    if (str10 == null) {
                        str = "";
                    } else {
                        str = str10;
                    }
                    String str11 = l.read;
                    if (str11 == null) {
                        str2 = "";
                    } else {
                        str2 = str11;
                    }
                    String str12 = l.MediaBrowserCompat$SearchResultReceiver;
                    if (str12 == null) {
                        str3 = "";
                    } else {
                        str3 = str12;
                    }
                    String str13 = l.MediaBrowserCompat$MediaItem;
                    if (str13 == null) {
                        str4 = "";
                    } else {
                        str4 = str13;
                    }
                    String str14 = l.MediaMetadataCompat;
                    if (str14 == null) {
                        str5 = "";
                    } else {
                        str5 = str14;
                    }
                    String str15 = l.MediaDescriptionCompat;
                    if (str15 == null) {
                        str6 = "";
                    } else {
                        str6 = str15;
                    }
                    String str16 = l.MediaBrowserCompat$ItemReceiver;
                    if (str16 == null) {
                        str7 = "";
                    } else {
                        str7 = str16;
                    }
                    collection.add(new zzqj.zzc(str9, i4, str, str2, str3, str4, str5, str6, str7));
                }
            }
            List list2 = arrayList;
            cancelLoaderTask cancelloadertask = settraceenabled.write;
            if (cancelloadertask == null || (num2 = cancelloadertask.write) == null) {
                i2 = 0;
            } else {
                i2 = num2.intValue();
            }
            if (cancelloadertask == null || (num = cancelloadertask.IconCompatParcelizer) == null) {
                i3 = 0;
            } else {
                i3 = num.intValue();
            }
            if (cancelloadertask == null || (bool2 = cancelloadertask.MediaBrowserCompat$ItemReceiver) == null) {
                z = false;
            } else {
                z = bool2.booleanValue();
            }
            if (!(cancelloadertask == null || (bool = cancelloadertask.MediaBrowserCompat$CustomActionResultReceiver) == null)) {
                z2 = bool.booleanValue();
            }
            return new zzqj.zze(i, list2, new zzrc.zzd(i2, i3, z, z2));
        }
    }

    /* renamed from: o.zzgj$read */
    static final /* synthetic */ class read extends InvestmentFundDetailsActivity implements FundFactSheetActivity<fetchBitmap, zzqp.zza> {
        read(setTransactionShipping settransactionshipping) {
            super(1, settransactionshipping);
        }

        public final String getName() {
            return "transform";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(setTransactionShipping.class);
        }

        public final String getSignature() {
            return "transform(Lcom/scb/phone/data/entity/ccrredemption/ecoupon/DeactivateEntity;)Lcom/scb/phone/domain/entity/ccrredemption/ecoupon/Deactivate;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            fetchBitmap fetchbitmap = (fetchBitmap) obj;
            onGetStartedClick.write((Object) fetchbitmap, "p1");
            return setTransactionShipping.IconCompatParcelizer(fetchbitmap);
        }
    }

    /* renamed from: o.zzgj$write */
    static final class write<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        public static final write write = new write();

        write() {
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            return (BuildConfig) singleDataEntity.getData();
        }
    }

    @HmlPinActivity
    public zzgj(HmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver hmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver, zzl zzl, setTransactionShipping settransactionshipping, Promotion promotion, zzac zzac, setProductListSource setproductlistsource) {
        onGetStartedClick.write((Object) hmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver, "api");
        onGetStartedClick.write((Object) zzl, "quotaLimitEntityMapper");
        onGetStartedClick.write((Object) settransactionshipping, "deactivateECouponMapper");
        onGetStartedClick.write((Object) promotion, "detailEntityMapper");
        onGetStartedClick.write((Object) zzac, "eCouponTransactionEntityMapper");
        onGetStartedClick.write((Object) setproductlistsource, "myECouponDeepLinkEntityMapper");
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver;
        this.MediaDescriptionCompat = zzl;
        this.write = settransactionshipping;
        this.read = promotion;
        this.MediaBrowserCompat$ItemReceiver = zzac;
        this.IconCompatParcelizer = setproductlistsource;
    }

    public final BScanCNotificationDeepLinkActivity<zzqj.zze> MediaBrowserCompat$ItemReceiver(String str, nullEntry nullentry) {
        onGetStartedClick.write((Object) str, "cardRef");
        onGetStartedClick.write((Object) nullentry, "request");
        HmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver hmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) str, "cardRef");
        onGetStartedClick.write((Object) nullentry, "request");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<setTraceEnabled>> eCouponTransaction = hmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver.read.getECouponTransaction(str, nullentry);
        onGetStartedClick.IconCompatParcelizer((Object) eCouponTransaction, "service.getECouponTransaction(cardRef, request)");
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = zzgj$MediaBrowserCompat$MediaItem.IconCompatParcelizer;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(eCouponTransaction, directDebitDeepLinkActivity);
        DirectDebitDeepLinkActivity zzgr = new zzgr(new RatingCompat(this.MediaBrowserCompat$ItemReceiver));
        HmlLatestPersonalInformationDeepLinkActivity.write(zzgr, "mapper is null");
        onCopy oncopy2 = new onCopy(oncopy, zzgr);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy2, "api.getECouponTransactio…nEntityMapper::transform)");
        return oncopy2;
    }

    public final BScanCNotificationDeepLinkActivity<zztx.zza> read(String str, int i, String str2) {
        onGetStartedClick.write((Object) str, "cardRef");
        onGetStartedClick.write((Object) str2, "itemCode");
        HmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver hmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) str, "cardRef");
        onGetStartedClick.write((Object) str2, "itemCode");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<enableOrDisableHardwareLayer>> quotaLimit = hmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver.read.getQuotaLimit(str, Integer.valueOf(i), str2);
        onGetStartedClick.IconCompatParcelizer((Object) quotaLimit, "service.getQuotaLimit(ca…ef, relationId, itemCode)");
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = MediaDescriptionCompat.IconCompatParcelizer;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(quotaLimit, directDebitDeepLinkActivity);
        DirectDebitDeepLinkActivity zzgr = new zzgr(new zzgj$MediaBrowserCompat$SearchResultReceiver(this.MediaDescriptionCompat));
        HmlLatestPersonalInformationDeepLinkActivity.write(zzgr, "mapper is null");
        onCopy oncopy2 = new onCopy(oncopy, zzgr);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy2, "api.getQuotaLimit(cardRe…tEntityMapper::transform)");
        return oncopy2;
    }

    public final BScanCNotificationDeepLinkActivity<zzqp.zza> read(String str, Constraints.ConstrainedRandomAccessList constrainedRandomAccessList) {
        onGetStartedClick.write((Object) str, "cardRef");
        onGetStartedClick.write((Object) constrainedRandomAccessList, "request");
        HmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver hmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) str, "cardRef");
        onGetStartedClick.write((Object) constrainedRandomAccessList, "request");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<fetchBitmap>> deactivateECoupon = hmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver.read.deactivateECoupon(str, constrainedRandomAccessList);
        onGetStartedClick.IconCompatParcelizer((Object) deactivateECoupon, "service.deactivateECoupon(cardRef, request)");
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = zzgj$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(deactivateECoupon, directDebitDeepLinkActivity);
        DirectDebitDeepLinkActivity zzgr = new zzgr(new read(this.write));
        HmlLatestPersonalInformationDeepLinkActivity.write(zzgr, "mapper is null");
        onCopy oncopy2 = new onCopy(oncopy, zzgr);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy2, "api.deactivateECoupon(ca…ECouponMapper::transform)");
        return oncopy2;
    }

    public final BScanCNotificationDeepLinkActivity<zzqj.zzd> MediaBrowserCompat$ItemReceiver(String str, Constraints.ConstrainedRandomAccessList constrainedRandomAccessList) {
        onGetStartedClick.write((Object) str, "cardRef");
        onGetStartedClick.write((Object) constrainedRandomAccessList, "request");
        HmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver hmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) str, "cardRef");
        onGetStartedClick.write((Object) constrainedRandomAccessList, "request");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<beginSection>> eCouponDetail = hmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver.read.getECouponDetail(str, constrainedRandomAccessList);
        onGetStartedClick.IconCompatParcelizer((Object) eCouponDetail, "service.getECouponDetail(cardRef, request)");
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(eCouponDetail, directDebitDeepLinkActivity);
        DirectDebitDeepLinkActivity zzgr = new zzgr(new MediaMetadataCompat(this.read));
        HmlLatestPersonalInformationDeepLinkActivity.write(zzgr, "mapper is null");
        onCopy oncopy2 = new onCopy(oncopy, zzgr);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy2, "api.getECouponDetail(car…lEntityMapper::transform)");
        return oncopy2;
    }

    public final BScanCNotificationDeepLinkActivity<zzrc.zzc> MediaBrowserCompat$ItemReceiver(String str) {
        onGetStartedClick.write((Object) str, "deepLinkId");
        HmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver hmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) str, "deepLinkId");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<BuildConfig>> cardRefFromDeepLinkId = hmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver.read.getCardRefFromDeepLinkId(str);
        onGetStartedClick.IconCompatParcelizer((Object) cardRefFromDeepLinkId, "service.getCardRefFromDeepLinkId(deepLinkId)");
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = write.write;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(cardRefFromDeepLinkId, directDebitDeepLinkActivity);
        DirectDebitDeepLinkActivity zzgr = new zzgr(new zzgj$MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer));
        HmlLatestPersonalInformationDeepLinkActivity.write(zzgr, "mapper is null");
        onCopy oncopy2 = new onCopy(oncopy, zzgr);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy2, "api.getCardRefFromDeepLi…kEntityMapper::transform)");
        return oncopy2;
    }
}
