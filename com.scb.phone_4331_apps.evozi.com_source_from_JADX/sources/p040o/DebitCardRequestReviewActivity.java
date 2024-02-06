package p040o;

import java.util.concurrent.TimeUnit;
import p040o.AlertController$RecycleListView;

/* renamed from: o.DebitCardRequestReviewActivity */
public abstract class DebitCardRequestReviewActivity<T> implements InformationPanelAdapter$ItemHolder_ViewBinding<T> {
    public static final int MediaBrowserCompat$ItemReceiver = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* access modifiers changed from: protected */
    public abstract void IconCompatParcelizer(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder);

    public static int write() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public static <T> DebitCardRequestReviewActivity<T> MediaBrowserCompat$ItemReceiver(DebitCardRequestTermsConditionsActivity<T> debitCardRequestTermsConditionsActivity, DebitCardCoachMarkActivity_ViewBinding debitCardCoachMarkActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardRequestTermsConditionsActivity, "source is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardCoachMarkActivity_ViewBinding, "mode is null");
        return new SCBDeepLinkActivity(debitCardRequestTermsConditionsActivity, debitCardCoachMarkActivity_ViewBinding);
    }

    public static DebitCardRequestReviewActivity<Long> write(long j, TimeUnit timeUnit) {
        BankingAgentDeepLinkActivity read = HmlETBLandingActivity.read();
        HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(read, "scheduler is null");
        return new TopUpDeepLinkActivity(Math.max(0, 5000), Math.max(0, 5000), timeUnit, read);
    }

    public final BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver(DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity2, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super SelectProvinceOrDistrictAdapter$ViewHolder> debitCardMarketConductDeepLinkActivity3) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity, "onNext is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity2, "onError is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(dataPrivacyManagementDeepLinkActivity, "onComplete is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity3, "onSubscribe is null");
        setVwConsentBg setvwconsentbg = new setVwConsentBg(debitCardMarketConductDeepLinkActivity, debitCardMarketConductDeepLinkActivity2, dataPrivacyManagementDeepLinkActivity, debitCardMarketConductDeepLinkActivity3);
        MediaBrowserCompat$ItemReceiver(setvwconsentbg);
        return setvwconsentbg;
    }

    public final void write(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder) {
        MediaBrowserCompat$ItemReceiver((DebitCardRequestPayOtpActivity) depositDetailRecyclerViewAdapter$DepositViewHolder);
    }

    public final void MediaBrowserCompat$ItemReceiver(DebitCardRequestPayOtpActivity<? super T> debitCardRequestPayOtpActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardRequestPayOtpActivity, "s is null");
        try {
            HmlLatestPersonalInformationDeepLinkActivity.write(debitCardRequestPayOtpActivity, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            IconCompatParcelizer(debitCardRequestPayOtpActivity);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            AlertController$RecycleListView.read.read(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
