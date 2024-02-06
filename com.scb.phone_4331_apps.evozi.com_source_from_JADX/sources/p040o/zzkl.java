package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.prepaid.PrepaidActivationService;
import org.threeten.p041bp.OffsetDateTime;
import p040o.GoogleApiClient;
import p040o.GoogleMap;
import p040o.ImmutableClassToInstanceMap;

/* renamed from: o.zzkl */
public final class zzkl implements getListDelegate {
    final GoogleApiClient.OnConnectionFailedListener IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    final setViewForPopups MediaBrowserCompat$ItemReceiver;
    private final PrepaidActivationService read;
    final addStatusListener write;

    /* renamed from: o.zzkl$read */
    static final class read<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ zzkl write;

        read(zzkl zzkl) {
            this.write = zzkl;
        }

        public final /* synthetic */ Object write(Object obj) {
            String str;
            String str2;
            String str3;
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            setViewForPopups setviewforpopups = this.write.MediaBrowserCompat$ItemReceiver;
            Object data = singleDataEntity.getData();
            onGetStartedClick.IconCompatParcelizer(data, "it.data");
            getLinearKeyframeProgress getlinearkeyframeprogress = (getLinearKeyframeProgress) data;
            onGetStartedClick.write((Object) getlinearkeyframeprogress, "entity");
            String str4 = getlinearkeyframeprogress.write;
            OffsetDateTime write2 = FragmentBuilder_BindSummaryFragment.write(getlinearkeyframeprogress.read, (OffsetDateTime) null);
            setOnPageChangeListener setonpagechangelistener = getlinearkeyframeprogress.MediaBrowserCompat$CustomActionResultReceiver.write;
            String str5 = "";
            if (setonpagechangelistener == null || (str = setonpagechangelistener.write()) == null) {
                str = str5;
            }
            if (setonpagechangelistener == null || (str2 = setonpagechangelistener.MediaBrowserCompat$ItemReceiver()) == null) {
                str2 = str5;
            }
            if (setonpagechangelistener == null || (str3 = setonpagechangelistener.IconCompatParcelizer()) == null) {
                str3 = str5;
            }
            C3422xa9494867 googleMap$CancelableCallback$MediaBrowserCompat$CustomActionResultReceiver = new C3422xa9494867(new zzvl(str, str2, str3));
            String str6 = getlinearkeyframeprogress.MediaBrowserCompat$ItemReceiver;
            if (str6 != null) {
                str5 = str6;
            }
            return new GoogleMap.CancelableCallback(str4, write2, googleMap$CancelableCallback$MediaBrowserCompat$CustomActionResultReceiver, str5);
        }
    }

    /* renamed from: o.zzkl$write */
    static final class write<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ zzkl MediaBrowserCompat$ItemReceiver;

        write(zzkl zzkl) {
            this.MediaBrowserCompat$ItemReceiver = zzkl;
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            Object data = singleDataEntity.getData();
            onGetStartedClick.IconCompatParcelizer(data, "it.data");
            getEndValue getendvalue = (getEndValue) data;
            onGetStartedClick.write((Object) getendvalue, "entity");
            return new GoogleMap.InfoWindowAdapter(GoogleApiClient.OnConnectionFailedListener.IconCompatParcelizer(getendvalue.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }

    @HmlPinActivity
    public zzkl(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, PrepaidActivationService prepaidActivationService, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, addStatusListener addstatuslistener, setViewForPopups setviewforpopups) {
        onGetStartedClick.write((Object) str, "tileVersion");
        onGetStartedClick.write((Object) prepaidActivationService, "service");
        onGetStartedClick.write((Object) onConnectionFailedListener, "prepaidActivationLandingEntityMapper");
        onGetStartedClick.write((Object) addstatuslistener, "prepaidActivationVerificationEntityMapper");
        onGetStartedClick.write((Object) setviewforpopups, "prepaidActivationOtpConfirmMapper");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = prepaidActivationService;
        this.IconCompatParcelizer = onConnectionFailedListener;
        this.write = addstatuslistener;
        this.MediaBrowserCompat$ItemReceiver = setviewforpopups;
    }

    public final BScanCNotificationDeepLinkActivity<GoogleMap.InfoWindowAdapter> MediaBrowserCompat$ItemReceiver(ImmutableClassToInstanceMap immutableClassToInstanceMap) {
        onGetStartedClick.write((Object) immutableClassToInstanceMap, "request");
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) str, "<set-?>");
        immutableClassToInstanceMap.MediaBrowserCompat$ItemReceiver = str;
        BScanCNotificationDeepLinkActivity<SingleDataEntity<getEndValue>> prepaidActivationLanding = this.read.getPrepaidActivationLanding(immutableClassToInstanceMap);
        DirectDebitDeepLinkActivity write2 = new write(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(write2, "mapper is null");
        onCopy oncopy = new onCopy(prepaidActivationLanding, write2);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "service.getPrepaidActiva…pper.transform(it.data) }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<onFinish> MediaBrowserCompat$CustomActionResultReceiver(ImmutableCollection immutableCollection) {
        onGetStartedClick.write((Object) immutableCollection, "request");
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) str, "<set-?>");
        immutableCollection.IconCompatParcelizer = str;
        BScanCNotificationDeepLinkActivity<SingleDataEntity<getOverallProgress>> prepaidActivationVerification = this.read.getPrepaidActivationVerification(immutableCollection);
        DirectDebitDeepLinkActivity zzkl_mediabrowsercompat_customactionresultreceiver = new zzkl$MediaBrowserCompat$CustomActionResultReceiver(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(zzkl_mediabrowsercompat_customactionresultreceiver, "mapper is null");
        onCopy oncopy = new onCopy(prepaidActivationVerification, zzkl_mediabrowsercompat_customactionresultreceiver);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "service.getPrepaidActiva…pper.transform(it.data) }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<GoogleMap.CancelableCallback> read(ImmutableClassToInstanceMap.Builder builder, String str, String str2) {
        onGetStartedClick.write((Object) builder, "request");
        onGetStartedClick.write((Object) str, "tokenUUID");
        onGetStartedClick.write((Object) str2, "otp");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<getLinearKeyframeProgress>> prepaidActivateOtpConfirm = this.read.getPrepaidActivateOtpConfirm(builder, str, str2);
        DirectDebitDeepLinkActivity read2 = new read(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(read2, "mapper is null");
        onCopy oncopy = new onCopy(prepaidActivateOtpConfirm, read2);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "service.getPrepaidActiva…pper.transform(it.data) }");
        return oncopy;
    }
}
