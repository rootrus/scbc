package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.activity.easycash.CommercialReferralNCBConsentActivity;
import com.scb.phone.view.adapter.remittance.RemittanceCountryListAdapter;
import java.util.ArrayList;
import java.util.List;
import p040o.AbstractMultimap;

/* renamed from: o.zzbn */
public final /* synthetic */ class zzbn implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ BankingAgentReviewActivity MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String read;

    /* renamed from: o.zzbn$zzc */
    public final /* synthetic */ class zzc implements DirectDebitDeepLinkActivity {
        public static final /* synthetic */ zzc MediaBrowserCompat$ItemReceiver = new zzc();

        private /* synthetic */ zzc() {
        }

        public final Object write(Object obj) {
            return (List) obj;
        }
    }

    /* renamed from: o.zzbn$zzd */
    public final /* synthetic */ class zzd implements ChequeManagementDeepLinkActivity {
        private final /* synthetic */ BankingAgentReviewActivity MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ zzd(BankingAgentReviewActivity bankingAgentReviewActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentReviewActivity;
        }

        public final Object read(Object obj, Object obj2) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((jsonToColor) obj, (KeyframeParser) obj2);
        }
    }

    public /* synthetic */ zzbn(BankingAgentReviewActivity bankingAgentReviewActivity, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentReviewActivity;
        this.read = str;
    }

    /* renamed from: o.zzbn$zzb */
    public final /* synthetic */ class zzb implements DirectDebitDeepLinkActivity {
        public static final /* synthetic */ zzb write = new zzb();

        private /* synthetic */ zzb() {
        }

        public final Object write(Object obj) {
            return DebitCardResetOtpActivity.just(((setShouldSkipGmsCoreVersionCheck) ((SingleDataEntity) obj).getData()).MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.zzbn$zze */
    public final /* synthetic */ class zze implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ String IconCompatParcelizer;
        private final /* synthetic */ BankingAgentReviewActivity MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ zze(BankingAgentReviewActivity bankingAgentReviewActivity, String str) {
            this.MediaBrowserCompat$ItemReceiver = bankingAgentReviewActivity;
            this.IconCompatParcelizer = str;
        }

        public final Object write(Object obj) {
            BankingAgentReviewActivity bankingAgentReviewActivity = this.MediaBrowserCompat$ItemReceiver;
            String str = this.IconCompatParcelizer;
            getPlace getplace = (getPlace) obj;
            if ((bankingAgentReviewActivity.MediaBrowserCompat$ItemReceiver == AbstractMultimap.AsMap.AsMapEntries.SUCCESS && bankingAgentReviewActivity.IconCompatParcelizer == AbstractMultimap.AsMap.AsMapEntries.SUCCESS && bankingAgentReviewActivity.MediaBrowserCompat$MediaItem == AbstractMultimap.AsMap.AsMapEntries.SUCCESS && bankingAgentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver == AbstractMultimap.AsMap.AsMapEntries.SUCCESS) || ((bankingAgentReviewActivity.MediaBrowserCompat$ItemReceiver == AbstractMultimap.AsMap.AsMapEntries.LOADING && bankingAgentReviewActivity.IconCompatParcelizer == AbstractMultimap.AsMap.AsMapEntries.LOADING && bankingAgentReviewActivity.MediaBrowserCompat$MediaItem == AbstractMultimap.AsMap.AsMapEntries.LOADING && bankingAgentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver == AbstractMultimap.AsMap.AsMapEntries.LOADING) || !bankingAgentReviewActivity.read || bankingAgentReviewActivity.MediaBrowserCompat$ItemReceiver == null || bankingAgentReviewActivity.IconCompatParcelizer == null || bankingAgentReviewActivity.MediaBrowserCompat$MediaItem == null || bankingAgentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver == null)) {
                return DebitCardResetOtpActivity.just(getplace);
            }
            bankingAgentReviewActivity.read = false;
            DebitCardResetOtpActivity<getPlace> empty = DebitCardResetOtpActivity.empty();
            if (bankingAgentReviewActivity.MediaBrowserCompat$ItemReceiver == AbstractMultimap.AsMap.AsMapEntries.ERROR) {
                empty = empty.mergeWith((DebitCardResetPinSuccessActivity_ViewBinding<? extends getPlace>) bankingAgentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(str));
            }
            if (bankingAgentReviewActivity.IconCompatParcelizer == AbstractMultimap.AsMap.AsMapEntries.ERROR) {
                empty = empty.mergeWith((DebitCardResetPinSuccessActivity_ViewBinding<? extends getPlace>) bankingAgentReviewActivity.MediaBrowserCompat$ItemReceiver(str));
            }
            if (bankingAgentReviewActivity.MediaBrowserCompat$MediaItem == AbstractMultimap.AsMap.AsMapEntries.ERROR) {
                empty = empty.mergeWith((DebitCardResetPinSuccessActivity_ViewBinding<? extends getPlace>) bankingAgentReviewActivity.write(str));
            }
            if (bankingAgentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver != AbstractMultimap.AsMap.AsMapEntries.ERROR) {
                return empty;
            }
            CommercialReferralNCBConsentActivity.read read = bankingAgentReviewActivity.MediaSessionCompat$ResultReceiverWrapper;
            return empty.mergeWith((DebitCardResetPinSuccessActivity_ViewBinding<? extends getPlace>) read.MediaBrowserCompat$ItemReceiver.getBannerTilesList(bankingAgentReviewActivity.f3124x50fd9e4a).map(createByteArrayArray.MediaBrowserCompat$ItemReceiver).doOnNext(new dispatchMessage(bankingAgentReviewActivity)).doOnError(new zza(bankingAgentReviewActivity)).onErrorResumeNext(DebitCardResetOtpActivity.just(bankingAgentReviewActivity.ParcelableVolumeInfo)).map(new zzba(bankingAgentReviewActivity, str)).startWith(DebitCardResetOtpActivity.fromCallable(new RemittanceCountryListAdapter.write(bankingAgentReviewActivity, str))));
        }
    }

    public final Object write(Object obj) {
        BankingAgentReviewActivity bankingAgentReviewActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = this.read;
        getRemoteContext getremotecontext = bankingAgentReviewActivity.write;
        KeyframeParser keyframeParser = bankingAgentReviewActivity.ParcelableVolumeInfo;
        if (keyframeParser == null) {
            getPlace read2 = getPlace.read();
            read2.MediaDescriptionCompat = new ArrayList();
            return read2;
        }
        getremotecontext.read = keyframeParser.MediaBrowserCompat$SearchResultReceiver;
        ArrayList arrayList = new ArrayList();
        getremotecontext.IconCompatParcelizer(arrayList, keyframeParser, str);
        getremotecontext.write((List<PlaceLikelihoodBuffer>) arrayList, keyframeParser, str);
        getremotecontext.read((List<PlaceLikelihoodBuffer>) arrayList, keyframeParser, str);
        getremotecontext.IconCompatParcelizer((List<PlaceLikelihoodBuffer>) arrayList, keyframeParser);
        getPlace read3 = getPlace.read();
        read3.MediaDescriptionCompat = arrayList;
        read3.MediaBrowserCompat$ItemReceiver = keyframeParser.IconCompatParcelizer;
        read3.MediaBrowserCompat$CustomActionResultReceiver = keyframeParser.MediaBrowserCompat$SearchResultReceiver;
        read3.read = keyframeParser.RatingCompat;
        return read3;
    }

    /* renamed from: o.zzbn$zza */
    public final /* synthetic */ class zza implements DebitCardMarketConductDeepLinkActivity {
        private final /* synthetic */ BankingAgentReviewActivity MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ zza(BankingAgentReviewActivity bankingAgentReviewActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentReviewActivity;
        }

        public final void IconCompatParcelizer(Object obj) {
            BankingAgentReviewActivity bankingAgentReviewActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
            synchronized (bankingAgentReviewActivity) {
                bankingAgentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver = AbstractMultimap.AsMap.AsMapEntries.ERROR;
            }
        }
    }
}
