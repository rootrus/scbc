package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.prepaid.PrepaidTravelService;
import com.scb.phone.view.fragment.easycash.financialinformation.C5927x768fae8c;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AbstractMultimap;
import p040o.GoogleMap;
import p040o.LottieInterpolatedIntegerValue;
import p040o.PendingResults;
import p040o.onCameraMove;

/* renamed from: o.zzko */
public final class zzko implements AbstractMultimap.WrappedSortedSet {
    final PendingResults.zaa IconCompatParcelizer;
    final canceledPendingResult MediaBrowserCompat$CustomActionResultReceiver;
    private final PrepaidTravelService MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$SearchResultReceiver;
    final PendingResults.zab read;
    final PendingResults.zac write;

    /* renamed from: o.zzko$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ zzko IconCompatParcelizer;

        IconCompatParcelizer(zzko zzko) {
            this.IconCompatParcelizer = zzko;
        }

        public final /* synthetic */ Object write(Object obj) {
            String str;
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            PendingResults.zab zab = this.IconCompatParcelizer.read;
            Object data = singleDataEntity.getData();
            onGetStartedClick.IconCompatParcelizer(data, "it.data");
            getValueInternal getvalueinternal = (getValueInternal) data;
            onGetStartedClick.write((Object) getvalueinternal, "entity");
            OffsetDateTime write = FragmentBuilder_BindSummaryFragment.write(getvalueinternal.IconCompatParcelizer, (OffsetDateTime) null);
            String str2 = getvalueinternal.write;
            String str3 = str2 == null ? "" : str2;
            String str4 = getvalueinternal.read;
            if (str4 == null) {
                str = "";
            } else {
                str = str4;
            }
            return new C5927x768fae8c(write, str3, str, getvalueinternal.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.zzko$read */
    static final class read<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ zzko MediaBrowserCompat$CustomActionResultReceiver;

        read(zzko zzko) {
            this.MediaBrowserCompat$CustomActionResultReceiver = zzko;
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            Object data = singleDataEntity.getData();
            onGetStartedClick.IconCompatParcelizer(data, "it.data");
            LottieInterpolatedIntegerValue lottieInterpolatedIntegerValue = (LottieInterpolatedIntegerValue) data;
            onGetStartedClick.write((Object) lottieInterpolatedIntegerValue, "entity");
            String str = lottieInterpolatedIntegerValue.IconCompatParcelizer;
            String str2 = lottieInterpolatedIntegerValue.MediaDescriptionCompat;
            double d = lottieInterpolatedIntegerValue.read;
            double d2 = lottieInterpolatedIntegerValue.MediaMetadataCompat;
            LottieInterpolatedIntegerValue.IconCompatParcelizer iconCompatParcelizer = lottieInterpolatedIntegerValue.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) iconCompatParcelizer, "currencyEntity");
            onCameraMove.IconCompatParcelizer iconCompatParcelizer2 = new onCameraMove.IconCompatParcelizer(iconCompatParcelizer.write, iconCompatParcelizer.IconCompatParcelizer);
            LottieInterpolatedIntegerValue.IconCompatParcelizer iconCompatParcelizer3 = lottieInterpolatedIntegerValue.RatingCompat;
            onGetStartedClick.write((Object) iconCompatParcelizer3, "currencyEntity");
            onCameraMove.IconCompatParcelizer iconCompatParcelizer4 = new onCameraMove.IconCompatParcelizer(iconCompatParcelizer3.write, iconCompatParcelizer3.IconCompatParcelizer);
            LottieInterpolatedIntegerValue.write write = lottieInterpolatedIntegerValue.write;
            onGetStartedClick.write((Object) write, "conversionRateEntity");
            onCameraMove.write write2 = new onCameraMove.write(write.read, write.MediaBrowserCompat$CustomActionResultReceiver);
            String str3 = lottieInterpolatedIntegerValue.MediaBrowserCompat$ItemReceiver;
            if (str3 == null) {
                str3 = "0";
            }
            return new onCameraMove(str, str2, d, d2, iconCompatParcelizer2, iconCompatParcelizer4, write2, str3);
        }
    }

    /* renamed from: o.zzko$write */
    static final class write<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ zzko write;

        write(zzko zzko) {
            this.write = zzko;
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            return this.write.write.MediaBrowserCompat$ItemReceiver((setCurrentItemInternal) singleDataEntity);
        }
    }

    @HmlPinActivity
    public zzko(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, PrepaidTravelService prepaidTravelService, PendingResults.zac zac, PendingResults.zaa zaa, canceledPendingResult canceledpendingresult, PendingResults.zab zab) {
        onGetStartedClick.write((Object) str, "tileVersion");
        onGetStartedClick.write((Object) prepaidTravelService, "service");
        onGetStartedClick.write((Object) zac, "prepaidTravelBlockStatusEntityMapper");
        onGetStartedClick.write((Object) zaa, "prepaidTravelConversionLandingEntityMapper");
        onGetStartedClick.write((Object) canceledpendingresult, "prepaidTravelConversionVerificationEntityMapper");
        onGetStartedClick.write((Object) zab, "prepaidTravelConversionConfirmEntityMapper");
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = prepaidTravelService;
        this.write = zac;
        this.IconCompatParcelizer = zaa;
        this.MediaBrowserCompat$CustomActionResultReceiver = canceledpendingresult;
        this.read = zab;
    }

    public final BScanCNotificationDeepLinkActivity<zzuk> IconCompatParcelizer(ImmutableEnumSet immutableEnumSet) {
        onGetStartedClick.write((Object) immutableEnumSet, "request");
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        onGetStartedClick.write((Object) str, "<set-?>");
        immutableEnumSet.MediaBrowserCompat$ItemReceiver = str;
        BScanCNotificationDeepLinkActivity<SingleDataEntity<setCurrentItemInternal>> prepaidTravelBlockStatus = this.MediaBrowserCompat$ItemReceiver.getPrepaidTravelBlockStatus(immutableEnumSet);
        DirectDebitDeepLinkActivity write2 = new write(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(write2, "mapper is null");
        onCopy oncopy = new onCopy(prepaidTravelBlockStatus, write2);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "service.getPrepaidTravel…apper.transformBase(it) }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<GoogleMap.OnCameraChangeListener> MediaBrowserCompat$ItemReceiver(construct construct) {
        onGetStartedClick.write((Object) construct, "request");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieInterpolatedPointValue>> prepaidTravelConversionLanding = this.MediaBrowserCompat$ItemReceiver.getPrepaidTravelConversionLanding(construct);
        DirectDebitDeepLinkActivity zzko_mediabrowsercompat_customactionresultreceiver = new zzko$MediaBrowserCompat$CustomActionResultReceiver(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(zzko_mediabrowsercompat_customactionresultreceiver, "mapper is null");
        onCopy oncopy = new onCopy(prepaidTravelConversionLanding, zzko_mediabrowsercompat_customactionresultreceiver);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "service.getPrepaidTravel…pper.transform(it.data) }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<onCameraMove> read(ImmutableList immutableList) {
        onGetStartedClick.write((Object) immutableList, "request");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieInterpolatedIntegerValue>> prepaidTravelConversionVerification = this.MediaBrowserCompat$ItemReceiver.getPrepaidTravelConversionVerification(immutableList);
        DirectDebitDeepLinkActivity read2 = new read(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(read2, "mapper is null");
        onCopy oncopy = new onCopy(prepaidTravelConversionVerification, read2);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "service.getPrepaidTravel…pper.transform(it.data) }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<C5927x768fae8c> write(checkElementNotNull checkelementnotnull) {
        onGetStartedClick.write((Object) checkelementnotnull, "request");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<getValueInternal>> prepaidTravelConversionConfirm = this.MediaBrowserCompat$ItemReceiver.getPrepaidTravelConversionConfirm(checkelementnotnull);
        DirectDebitDeepLinkActivity iconCompatParcelizer = new IconCompatParcelizer(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(iconCompatParcelizer, "mapper is null");
        onCopy oncopy = new onCopy(prepaidTravelConversionConfirm, iconCompatParcelizer);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "service.getPrepaidTravel…pper.transform(it.data) }");
        return oncopy;
    }
}
