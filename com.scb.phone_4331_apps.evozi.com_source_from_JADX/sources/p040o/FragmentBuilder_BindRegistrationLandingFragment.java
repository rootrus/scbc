package p040o;

import com.google.gson.annotations.SerializedName;
import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.activity.deeplink.C5585x106633ac;
import com.scb.phone.view.fragment.ntb.selectaccount.EkycProductTermConditionFragment$MediaBrowserCompat$ItemReceiver;
import java.io.Serializable;
import p040o.BaseImplementation;
import p040o.GoogleMap;
import p040o.HmlPromptPayVerificationActivity;
import p040o.ImmutableMultiset;
import p040o.ImmutableSet;

/* renamed from: o.FragmentBuilder_BindRegistrationLandingFragment */
public final class FragmentBuilder_BindRegistrationLandingFragment implements Serializable {
    private static read read = null;
    private static final long write = 22180617104400L;
    @SerializedName("value")
    public String IconCompatParcelizer;

    public FragmentBuilder_BindRegistrationLandingFragment() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FragmentBuilder_BindRegistrationLandingFragment) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((FragmentBuilder_BindRegistrationLandingFragment) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ETag(value=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindRegistrationLandingFragment(String str) {
        this.IconCompatParcelizer = str;
    }

    private /* synthetic */ FragmentBuilder_BindRegistrationLandingFragment(byte b) {
        this((String) null);
    }

    /* renamed from: o.FragmentBuilder_BindRegistrationLandingFragment$read */
    public static final class read implements getDocument$MediaBrowserCompat$CustomActionResultReceiver {
        private final C5585x106633ac IconCompatParcelizer;
        public final HmlPromptPayVerificationActivity.write MediaBrowserCompat$CustomActionResultReceiver;
        public final onBtnSendEmailVerificationClicked MediaBrowserCompat$ItemReceiver;
        private final String MediaMetadataCompat;
        public final zar read;
        public final BaseImplementation.ApiMethodImpl write;

        private read() {
        }

        @HmlPinActivity
        public read(String str, C5585x106633ac nsipPartnerPaymentDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver, EasycashSalesheetIndexActivity easycashSalesheetIndexActivity, BaseImplementation.ApiMethodImpl apiMethodImpl, HmlPromptPayVerificationActivity.write write2, onBtnSendEmailVerificationClicked onbtnsendemailverificationclicked, zar zar) {
            this.MediaMetadataCompat = str;
            this.IconCompatParcelizer = nsipPartnerPaymentDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver;
            this.write = apiMethodImpl;
            this.MediaBrowserCompat$CustomActionResultReceiver = write2;
            this.MediaBrowserCompat$ItemReceiver = onbtnsendemailverificationclicked;
            this.read = zar;
        }

        public final DebitCardResetOtpActivity<onStreetViewPanoramaLongClick> IconCompatParcelizer(ImmutableSet.SerializedForm serializedForm) {
            return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.confirmPurchase(serializedForm).flatMap(new getDelegate(this));
        }

        public final BScanCNotificationDeepLinkActivity<GoogleMap.zza> write(ImmutableSet.ArrayImmutableSet arrayImmutableSet) {
            BScanCNotificationDeepLinkActivity<SingleDataEntity<setOnTouchListener>> purchasePaymentConfirmation = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.purchasePaymentConfirmation(arrayImmutableSet);
            showGooglePlayUnavailableMessage showgoogleplayunavailablemessage = new showGooglePlayUnavailableMessage(this);
            HmlLatestPersonalInformationDeepLinkActivity.write(showgoogleplayunavailablemessage, "mapper is null");
            return new ReviewDeviceActivity(purchasePaymentConfirmation, showgoogleplayunavailablemessage);
        }

        public final BScanCNotificationDeepLinkActivity<createFromAttributes> read(String str) {
            BScanCNotificationDeepLinkActivity<SingleDataEntity<setRenderer>> purchasesPaymentId = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.purchasesPaymentId(str);
            createDelegate createdelegate = new createDelegate(this);
            HmlLatestPersonalInformationDeepLinkActivity.write(createdelegate, "mapper is null");
            return new ReviewDeviceActivity(purchasesPaymentId, createdelegate);
        }

        public final BScanCNotificationDeepLinkActivity<GoogleMap.SnapshotReadyCallback> read(ImmutableMultiset.EntrySet.C35041 r3) {
            String str = this.MediaMetadataCompat;
            onGetStartedClick.write((Object) str, "<set-?>");
            r3.MediaBrowserCompat$CustomActionResultReceiver = str;
            C5585x106633ac nsipPartnerPaymentDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer;
            zabr.IconCompatParcelizer("9003");
            BScanCNotificationDeepLinkActivity<SingleDataEntity<setPaint>> verifyPurchase = nsipPartnerPaymentDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.verifyPurchase(r3);
            handleGooglePlayUnavailable handlegoogleplayunavailable = new handleGooglePlayUnavailable(this);
            HmlLatestPersonalInformationDeepLinkActivity.write(handlegoogleplayunavailable, "mapper is null");
            return new ReviewDeviceActivity(verifyPurchase, handlegoogleplayunavailable);
        }

        public final DebitCardResetOtpActivity<EkycProductTermConditionFragment$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$CustomActionResultReceiver(chooseTableSize choosetablesize) {
            C5585x106633ac nsipPartnerPaymentDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer;
            zabr.IconCompatParcelizer("9003");
            return nsipPartnerPaymentDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.verifyPurchase(choosetablesize).flatMap(new DeferredLifecycleHelper(this));
        }
    }
}
