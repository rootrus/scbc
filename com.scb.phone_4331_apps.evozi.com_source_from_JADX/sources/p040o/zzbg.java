package p040o;

import p040o.zzbn;
import p040o.zzmd;

/* renamed from: o.zzbg */
public final /* synthetic */ class zzbg implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ BankingAgentReviewActivity write;

    public /* synthetic */ zzbg(BankingAgentReviewActivity bankingAgentReviewActivity) {
        this.write = bankingAgentReviewActivity;
    }

    public final Object write(Object obj) {
        BankingAgentReviewActivity bankingAgentReviewActivity = this.write;
        return DebitCardResetOtpActivity.zip(bankingAgentReviewActivity.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver.getStaticTilesV9(new standardRetainAll(bankingAgentReviewActivity.f3124x50fd9e4a, (String) null, (Boolean) null, (Integer) null, bankingAgentReviewActivity.MediaDescriptionCompat.getString("USER_MODE", zzmd.zzm.zzb.zza.INDIVIDUAL.mode))).map(zzeh.MediaBrowserCompat$ItemReceiver), bankingAgentReviewActivity.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver.getDynamicTilesList(new standardRetainAll(bankingAgentReviewActivity.f3124x50fd9e4a, "0", Boolean.FALSE, (Integer) null, bankingAgentReviewActivity.MediaDescriptionCompat.getString("USER_MODE", zzmd.zzm.zzb.zza.INDIVIDUAL.mode))).map(createByteArrayArray.MediaBrowserCompat$ItemReceiver), new zzbn.zzd(bankingAgentReviewActivity));
    }
}
