package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import org.threeten.p041bp.OffsetDateTime;
import p040o.MoreExecutors;
import p040o.SignedBytes;

/* renamed from: o.getConcurrencyLevel */
public final class getConcurrencyLevel extends SignedBytes.LexicographicalComparator {

    /* renamed from: o.getConcurrencyLevel$read */
    public static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<zzvo, Boolean> {
        private /* synthetic */ String read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(String str) {
            super(1);
            this.read = str;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            zzvo zzvo = (zzvo) obj;
            onGetStartedClick.IconCompatParcelizer((Object) zzvo, "it");
            return Boolean.valueOf(zzvo.MediaDescriptionCompat.contains(GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(this.read, "D", true) ? "BANKING_AGENT_DEPOSIT" : "BANKING_AGENT_WITHDRAWAL"));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getConcurrencyLevel(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "baseAssetsURL");
    }

    public final MoreExecutors.SameThreadExecutorService MediaBrowserCompat$CustomActionResultReceiver(zzxa zzxa, boolean z) {
        String str;
        zzxa zzxa2 = zzxa;
        onGetStartedClick.write((Object) zzxa2, "transaction");
        String str2 = zzxa2.MediaDescriptionCompat;
        if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(zzxa2.MediaDescriptionCompat, "D", true)) {
            str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.banking_success_deposit_title);
        } else {
            str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.banking_success_withdraw_title);
        }
        String str3 = str;
        onGetStartedClick.IconCompatParcelizer((Object) str3, "if (transaction.postingT…g_success_withdraw_title)");
        String IconCompatParcelizer = IconCompatParcelizer("dd MMM yyyy - HH:mm", OffsetDateTime.parse(zzxa2.MediaBrowserCompat$MediaItem));
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "transformToDateMonthYear…e(transaction.timestamp))");
        String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.banking_success_refID_label, new Object[]{zzxa2.MediaMetadataCompat});
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.banki…label, transaction.refId)");
        String str4 = zzxa2.MediaBrowserCompat$CustomActionResultReceiver;
        String MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(zzxa2.IconCompatParcelizer, z);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "transformDepositAccountN…action.accountNo, isMark)");
        String MediaBrowserCompat$CustomActionResultReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(zzxa2.IconCompatParcelizer, true);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver2, "transformDepositAccountN…er(transaction.accountNo)");
        String c_ = mo26549c_(zzxa2.read);
        onGetStartedClick.IconCompatParcelizer((Object) c_, "transformAssetUrl(transaction.agentLogo)");
        String str5 = zzxa2.write;
        String str6 = zzxa2.MediaBrowserCompat$ItemReceiver;
        String write = write(Double.valueOf(zzxa2.RatingCompat));
        onGetStartedClick.IconCompatParcelizer((Object) write, "transformFund(transaction.amount)");
        return new MoreExecutors.SameThreadExecutorService(str2, str3, IconCompatParcelizer, string, str4, MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$CustomActionResultReceiver2, c_, str5, str6, write, zzxa2.MediaBrowserCompat$SearchResultReceiver);
    }
}
