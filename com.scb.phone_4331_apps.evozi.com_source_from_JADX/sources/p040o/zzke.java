package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.api.paynow.PayNowApi;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import p040o.GoogleApiClient;
import p040o.HashBasedTable;

/* renamed from: o.zzke */
public final class zzke implements getDelegateIterator {
    final GoogleApiClient.Builder IconCompatParcelizer;
    final addApi MediaBrowserCompat$CustomActionResultReceiver;
    private final PayNowApi MediaBrowserCompat$ItemReceiver;
    private final FragmentBuilder_BindStopChequeFragment read;
    final addScope write;

    /* renamed from: o.zzke$write */
    static final class write<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ zzke IconCompatParcelizer;

        write(zzke zzke) {
            this.IconCompatParcelizer = zzke;
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "entity");
            onGetStartedClick.write((Object) singleDataEntity, "singleDataEntity");
            hasZeroScaleAxis haszeroscaleaxis = (hasZeroScaleAxis) singleDataEntity.getData();
            String str = haszeroscaleaxis.MediaMetadataCompat;
            if (str != null) {
                setOnCameraMoveListener write = registerConnectionCallbacks.write(haszeroscaleaxis.MediaBrowserCompat$CustomActionResultReceiver);
                setOnInfoWindowClickListener MediaBrowserCompat$ItemReceiver = stopAutoManage.MediaBrowserCompat$ItemReceiver(haszeroscaleaxis.IconCompatParcelizer);
                setOnMapLongClickListener MediaBrowserCompat$ItemReceiver2 = setHandler.MediaBrowserCompat$ItemReceiver(haszeroscaleaxis.MediaBrowserCompat$SearchResultReceiver);
                String str2 = haszeroscaleaxis.write;
                if (str2 != null) {
                    String str3 = haszeroscaleaxis.MediaBrowserCompat$ItemReceiver;
                    if (str3 != null) {
                        String str4 = haszeroscaleaxis.read;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str5 = str4;
                        setOnPageChangeListener status = singleDataEntity.getStatus();
                        onGetStartedClick.IconCompatParcelizer((Object) status, "singleDataEntity.status");
                        boolean equals = status.write().equals("3017");
                        setOnPageChangeListener status2 = singleDataEntity.getStatus();
                        onGetStartedClick.IconCompatParcelizer((Object) status2, "singleDataEntity.status");
                        String MediaBrowserCompat$ItemReceiver3 = status2.MediaBrowserCompat$ItemReceiver();
                        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver3, "singleDataEntity.status.header");
                        setOnPageChangeListener status3 = singleDataEntity.getStatus();
                        onGetStartedClick.IconCompatParcelizer((Object) status3, "singleDataEntity.status");
                        String IconCompatParcelizer2 = status3.IconCompatParcelizer();
                        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "singleDataEntity.status.description");
                        return new setOnInfoWindowLongClickListener(str, write, MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver2, str2, str3, str5, equals, MediaBrowserCompat$ItemReceiver3, IconCompatParcelizer2);
                    }
                    throw new EntityMappingException("data must not be null or empty");
                }
                throw new EntityMappingException("data must not be null or empty");
            }
            throw new EntityMappingException("data must not be null or empty");
        }
    }

    @HmlPinActivity
    public zzke(PayNowApi payNowApi, addScope addscope, GoogleApiClient.Builder builder, addApi addapi, FragmentBuilder_BindStopChequeFragment fragmentBuilder_BindStopChequeFragment) {
        onGetStartedClick.write((Object) payNowApi, "payNowApi");
        onGetStartedClick.write((Object) addscope, "payNowVerificationEntityMapper");
        onGetStartedClick.write((Object) builder, "payNowConfirmationEntityMapper");
        onGetStartedClick.write((Object) addapi, "payNowTransactionEntityMapper");
        onGetStartedClick.write((Object) fragmentBuilder_BindStopChequeFragment, "cache");
        this.MediaBrowserCompat$ItemReceiver = payNowApi;
        this.write = addscope;
        this.IconCompatParcelizer = builder;
        this.MediaBrowserCompat$CustomActionResultReceiver = addapi;
        this.read = fragmentBuilder_BindStopChequeFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver(HashBasedTable.Factory factory, double d) {
        onGetStartedClick.write((Object) factory, "request");
        this.read.MediaBrowserCompat$CustomActionResultReceiver = new setOnInfoWindowCloseListener(factory.IconCompatParcelizer, factory.write, factory.MediaBrowserCompat$CustomActionResultReceiver, factory.MediaBrowserCompat$ItemReceiver, (float) d, factory.RatingCompat, factory.read, factory.MediaDescriptionCompat);
    }

    public final setOnInfoWindowCloseListener MediaBrowserCompat$CustomActionResultReceiver() {
        return this.read.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void IconCompatParcelizer() {
        this.read.MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [o.zzkd] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.BScanCNotificationDeepLinkActivity<p040o.setOnInfoWindowLongClickListener> read(p040o.HashBasedTable.Factory r3) {
        /*
            r2 = this;
            java.lang.String r0 = "request"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
            java.lang.String r0 = "3017"
            p040o.zabr.IconCompatParcelizer((java.lang.String) r0)
            com.scb.phone.data.network.api.paynow.PayNowApi r0 = r2.MediaBrowserCompat$ItemReceiver
            o.BScanCNotificationDeepLinkActivity r3 = r0.promptPayVerification(r3)
            o.zzke$write r0 = new o.zzke$write
            r0.<init>(r2)
            o.DirectDebitDeepLinkActivity r0 = (p040o.DirectDebitDeepLinkActivity) r0
            java.lang.String r1 = "mapper is null"
            p040o.HmlLatestPersonalInformationDeepLinkActivity.write(r0, r1)
            o.onCopy r1 = new o.onCopy
            r1.<init>(r3, r0)
            o.zzke$IconCompatParcelizer r3 = p040o.zzke.IconCompatParcelizer.read
            o.FundActionsSuccessActivity r3 = (p040o.FundActionsSuccessActivity) r3
            if (r3 == 0) goto L_0x002d
            o.zzkd r0 = new o.zzkd
            r0.<init>(r3)
            r3 = r0
        L_0x002d:
            o.DataPrivacyManagementDeepLinkActivity r3 = (p040o.DataPrivacyManagementDeepLinkActivity) r3
            java.lang.String r0 = "onFinally is null"
            p040o.HmlLatestPersonalInformationDeepLinkActivity.write(r3, r0)
            o.ForgotPinPersonalInfoActivity r0 = new o.ForgotPinPersonalInfoActivity
            r0.<init>(r1, r3)
            java.lang.String r3 = "payNowApi.promptPayVerif…actory::clearSuccessList)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.zzke.read(o.HashBasedTable$Factory):o.BScanCNotificationDeepLinkActivity");
    }

    public final BScanCNotificationDeepLinkActivity<setOnMapLoadedCallback> MediaBrowserCompat$CustomActionResultReceiver(HashBasedTable hashBasedTable) {
        onGetStartedClick.write((Object) hashBasedTable, "request");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<isAtLeastVersion>> promptPayConfirmation = this.MediaBrowserCompat$ItemReceiver.promptPayConfirmation(hashBasedTable);
        DirectDebitDeepLinkActivity zzke_mediabrowsercompat_itemreceiver = new zzke$MediaBrowserCompat$ItemReceiver(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(zzke_mediabrowsercompat_itemreceiver, "mapper is null");
        onCopy oncopy = new onCopy(promptPayConfirmation, zzke_mediabrowsercompat_itemreceiver);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "payNowApi.promptPayConfi….transform(entity.data) }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<setOnMapClickListener> MediaBrowserCompat$ItemReceiver(String str) {
        onGetStartedClick.write((Object) str, "deepLinkId");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<getAnimationScale>> transactions = this.MediaBrowserCompat$ItemReceiver.transactions(str);
        DirectDebitDeepLinkActivity zzke_mediabrowsercompat_customactionresultreceiver = new zzke$MediaBrowserCompat$CustomActionResultReceiver(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(zzke_mediabrowsercompat_customactionresultreceiver, "mapper is null");
        onCopy oncopy = new onCopy(transactions, zzke_mediabrowsercompat_customactionresultreceiver);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "payNowApi.transactions(d…ransaction(entity.data) }");
        return oncopy;
    }

    /* renamed from: o.zzke$IconCompatParcelizer */
    static final /* synthetic */ class IconCompatParcelizer extends InvestmentFundDetailsActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(0);
        }

        public final String getName() {
            return "clearSuccessList";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(zabr.class);
        }

        public final String getSignature() {
            return "clearSuccessList()V";
        }

        public final /* synthetic */ Object invoke() {
            zabr.IconCompatParcelizer();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }
}
