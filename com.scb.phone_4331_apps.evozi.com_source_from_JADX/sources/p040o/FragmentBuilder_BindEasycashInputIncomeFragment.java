package p040o;

import android.webkit.JavascriptInterface;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.activity.additionaldocument.C5561xfdfcc7cf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.Api;
import p040o.IResolveAccountCallbacks;
import p040o.ServerProjectProvider;
import p040o.getDocumentRectangle;
import p040o.nativeIsGuidanceAvailable;

/* renamed from: o.FragmentBuilder_BindEasycashInputIncomeFragment */
public final class FragmentBuilder_BindEasycashInputIncomeFragment {
    private final FragmentBuilder_BindEasycashFeaturesMHMCInformationFragment MediaBrowserCompat$ItemReceiver;

    public FragmentBuilder_BindEasycashInputIncomeFragment(FragmentBuilder_BindEasycashFeaturesMHMCInformationFragment fragmentBuilder_BindEasycashFeaturesMHMCInformationFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindEasycashFeaturesMHMCInformationFragment, "callbacks");
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindEasycashFeaturesMHMCInformationFragment;
    }

    @JavascriptInterface
    public final void onAppScript(String str, String str2) {
        onGetStartedClick.write((Object) str, "bridgeKey");
        onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.MediaBrowserCompat$ItemReceiver.write(str, str2);
    }

    @JavascriptInterface
    public final void onSlipRender(String str) {
        onGetStartedClick.write((Object) str, "toast");
        this.MediaBrowserCompat$ItemReceiver.write("onSlipRender", str);
    }

    @JavascriptInterface
    public final void onTracking(String str) {
        onGetStartedClick.write((Object) str, "toast");
        this.MediaBrowserCompat$ItemReceiver.write("onTracking", str);
    }

    @JavascriptInterface
    public final void onRecieved(String str) {
        onGetStartedClick.write((Object) str, "toast");
        this.MediaBrowserCompat$ItemReceiver.write("onRecieved", str);
    }

    @JavascriptInterface
    public final void requestExternalLogin(String str) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        this.MediaBrowserCompat$ItemReceiver.write("requestExternalLogin", str);
    }

    @JavascriptInterface
    public final void getCurrentLocation(String str) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        this.MediaBrowserCompat$ItemReceiver.write("getCurrentLocation", str);
    }

    @JavascriptInterface
    public final void onRequestFundData(String str) {
        onGetStartedClick.write((Object) str, "params");
        this.MediaBrowserCompat$ItemReceiver.write("onRequestFundData", str);
    }

    @JavascriptInterface
    public final void onRequestHistoricalData(String str) {
        onGetStartedClick.write((Object) str, "params");
        this.MediaBrowserCompat$ItemReceiver.write("onRequestHistoricalData", str);
    }

    @JavascriptInterface
    public final void onInvestFund(String str) {
        onGetStartedClick.write((Object) str, "params");
        this.MediaBrowserCompat$ItemReceiver.write("onInvestFund", str);
    }

    @JavascriptInterface
    public final void onOpenPDF(String str) {
        onGetStartedClick.write((Object) str, "params");
        this.MediaBrowserCompat$ItemReceiver.write("onOpenPDF", str);
    }

    @JavascriptInterface
    public final void onGeneralCSentLoaded(String str) {
        onGetStartedClick.write((Object) str, "params");
        this.MediaBrowserCompat$ItemReceiver.write("onGeneralCSentLoaded", str);
    }

    @JavascriptInterface
    public final void onGeneralCSentSubmitted(String str) {
        onGetStartedClick.write((Object) str, "params");
        this.MediaBrowserCompat$ItemReceiver.write("onGeneralCSentSubmitted", str);
    }

    @JavascriptInterface
    public final void onPrivacyNoticeCSentLoaded(String str) {
        onGetStartedClick.write((Object) str, "params");
        this.MediaBrowserCompat$ItemReceiver.write("onPrivacyNoticeCSentLoaded", str);
    }

    /* renamed from: o.FragmentBuilder_BindEasycashInputIncomeFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements ServerProjectProvider.C70673 {
        private final zaj IconCompatParcelizer;
        private final nativeIsGuidanceAvailable.read MediaBrowserCompat$CustomActionResultReceiver;
        public final Api.zab MediaBrowserCompat$ItemReceiver;
        private final C5561xfdfcc7cf read;
        private final areEdgesInView$MediaBrowserCompat$ItemReceiver write;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(C5561xfdfcc7cf ntbHmlApiBasedDocumentInstructionsActivity$MediaBrowserCompat$ItemReceiver, Api.zab zab, zaj zaj, nativeIsGuidanceAvailable.read read2, areEdgesInView$MediaBrowserCompat$ItemReceiver areedgesinview_mediabrowsercompat_itemreceiver) {
            this.read = ntbHmlApiBasedDocumentInstructionsActivity$MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$ItemReceiver = zab;
            this.IconCompatParcelizer = zaj;
            this.MediaBrowserCompat$CustomActionResultReceiver = read2;
            this.write = areedgesinview_mediabrowsercompat_itemreceiver;
        }

        public final BScanCNotificationDeepLinkActivity<List<addCircle>> IconCompatParcelizer() {
            BScanCNotificationDeepLinkActivity<SingleDataEntity<last>> firstOrError = this.read.MediaBrowserCompat$ItemReceiver.getNotificationPreferences().firstOrError();
            MapUtils mapUtils = MapUtils.write;
            HmlLatestPersonalInformationDeepLinkActivity.write(mapUtils, "mapper is null");
            onCopy oncopy = new onCopy(firstOrError, mapUtils);
            isAtLeastIceCreamSandwich isatleasticecreamsandwich = isAtLeastIceCreamSandwich.IconCompatParcelizer;
            HmlLatestPersonalInformationDeepLinkActivity.write(isatleasticecreamsandwich, "mapper is null");
            return new NTBLandingActivity_ViewBinding(oncopy, isatleasticecreamsandwich).map(new IResolveAccountCallbacks.Stub.Proxy(this.MediaBrowserCompat$CustomActionResultReceiver)).toList();
        }

        public final DebitCardResetOtpActivity<addTileOverlay> MediaBrowserCompat$ItemReceiver() {
            return this.read.MediaBrowserCompat$ItemReceiver.getNotificationUnreadCount().map(new isBound(this.IconCompatParcelizer));
        }

        public final DebitCardResetOtpActivity<addPolyline> read() {
            return this.read.MediaBrowserCompat$ItemReceiver.getNotifications().map(new escapeString(this));
        }

        public final DebitCardResetOtpActivity<addPolyline> IconCompatParcelizer(String str) {
            return this.read.MediaBrowserCompat$ItemReceiver.getNotifications(str).map(new unescapeString(this));
        }

        public final DebitCardCoachMarkActivity read(List<addCircle> list) {
            C5561xfdfcc7cf ntbHmlApiBasedDocumentInstructionsActivity$MediaBrowserCompat$ItemReceiver = this.read;
            onGetStartedClick.write((Object) list, "channelList");
            Iterable<addCircle> iterable = list;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (addCircle MediaBrowserCompat$CustomActionResultReceiver2 : iterable) {
                arrayList.add(getDocumentRectangle.write.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2));
            }
            return ntbHmlApiBasedDocumentInstructionsActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.updateNotificationPreferences(new last((List) arrayList)).flatMapCompletable(begin.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }
}
