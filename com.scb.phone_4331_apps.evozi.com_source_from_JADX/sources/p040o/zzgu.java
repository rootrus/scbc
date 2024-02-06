package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.activity.hml.HmlNTBCompanyNameActivity;
import p040o.LottieCompositionFactory;
import p040o.zzbt;

/* renamed from: o.zzgu */
public final class zzgu implements comparator {
    private final HmlNTBCompanyNameActivity.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;
    private final String read;
    final getAccountTypesSet write;

    @HmlPinActivity
    public zzgu(HmlNTBCompanyNameActivity.IconCompatParcelizer iconCompatParcelizer, getAccountTypesSet getaccounttypesset, String str) {
        onGetStartedClick.write((Object) iconCompatParcelizer, "easycashCardInfoApi");
        onGetStartedClick.write((Object) getaccounttypesset, "easycashProductCardOfferEntityMapper");
        onGetStartedClick.write((Object) str, "tilesVersion");
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
        this.write = getaccounttypesset;
        this.read = str;
    }

    public final BScanCNotificationDeepLinkActivity<zzbt.zzf.zzb> MediaBrowserCompat$ItemReceiver(newEntryArray newentryarray) {
        onGetStartedClick.write((Object) newentryarray, "easycashCardInfoInitRequest");
        newentryarray.read = this.read;
        HmlNTBCompanyNameActivity.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) newentryarray, "easycashCardInfoInitRequest");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<LottieCompositionFactory.C36075>> cardInfoInit = iconCompatParcelizer.IconCompatParcelizer.cardInfoInit(newentryarray);
        DirectDebitDeepLinkActivity zzgu_mediabrowsercompat_customactionresultreceiver = new zzgu$MediaBrowserCompat$CustomActionResultReceiver(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(zzgu_mediabrowsercompat_customactionresultreceiver, "mapper is null");
        onCopy oncopy = new onCopy(cardInfoInit, zzgu_mediabrowsercompat_customactionresultreceiver);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "easycashCardInfoApi.card…fferEntity(entity.data) }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<Boolean> MediaBrowserCompat$CustomActionResultReceiver(expireEntries expireentries) {
        onGetStartedClick.write((Object) expireentries, "request");
        expireentries.IconCompatParcelizer = this.read;
        HmlNTBCompanyNameActivity.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) expireentries, "request");
        BScanCNotificationDeepLinkActivity<setCurrentItemInternal> postCardInfo = iconCompatParcelizer.IconCompatParcelizer.postCardInfo(expireentries);
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = zzgu$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(postCardInfo, directDebitDeepLinkActivity);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "easycashCardInfoApi.post…nfo(request).map { true }");
        return oncopy;
    }
}
