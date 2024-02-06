package p040o;

import android.graphics.Rect;
import com.scb.phone.data.network.service.MerchantWalletService;
import com.scb.phone.view.activity.chequemanagement.C5579x61d4c5a4;
import com.scb.phone.view.activity.csent.MarketingCSentWebViewActivity;
import com.scb.phone.view.activity.debitcard.reset.DebitCardResetPinActivity;
import com.scb.phone.view.activity.juristic.C5653x8f5d302a;
import com.scb.phone.view.activity.juristic.JuristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver;
import p040o.Api;
import p040o.OnDeviceIdExtractor;
import p040o.zzcg;
import p040o.zzfd;

/* renamed from: o.FragmentBuilder_BindECouponQuantityFragment */
public final class FragmentBuilder_BindECouponQuantityFragment implements OnDeviceIdExtractor.C6966a.C69693 {
    public FragmentBuilder_BindRemittanceReviewFragment IconCompatParcelizer;
    public getEndpointPackageName MediaBrowserCompat$CustomActionResultReceiver;
    public FragmentBuilder_BindPurchaseFromTabSelectionFragment MediaBrowserCompat$ItemReceiver;
    private final getAvailableFeatures MediaBrowserCompat$MediaItem;
    private final Api.ApiOptions.Optional MediaBrowserCompat$SearchResultReceiver;
    private final isConnected MediaDescriptionCompat;
    private final MerchantWalletService MediaMetadataCompat;
    public FragmentBuilder_BindSelectPurchaseFragment read;
    public Api.Client write;

    public FragmentBuilder_BindECouponQuantityFragment() {
    }

    public static Rect MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, int i4) {
        double d;
        double d2;
        int i5;
        long j;
        double d3 = i3 < i ? ((double) i3) / ((double) i) : Double.POSITIVE_INFINITY;
        double d4 = i4 < i2 ? ((double) i4) / ((double) i2) : Double.POSITIVE_INFINITY;
        if (Double.compare(d3, Double.POSITIVE_INFINITY) == 0 && Double.compare(d4, Double.POSITIVE_INFINITY) == 0) {
            d2 = (double) i2;
            d = (double) i;
        } else if (d3 <= d4) {
            double d5 = (double) i3;
            double d6 = (((double) i2) * d5) / ((double) i);
            d = d5;
            d2 = d6;
        } else {
            d2 = (double) i4;
            d = (((double) i) * d2) / ((double) i2);
        }
        double d7 = (double) i3;
        int i6 = 0;
        if (Double.compare(d, d7) == 0) {
            j = Math.round((((double) i4) - d2) / 2.0d);
        } else {
            double d8 = (double) i4;
            if (Double.compare(d2, d8) == 0) {
                i5 = (int) Math.round((d7 - d) / 2.0d);
                return new Rect(i5, i6, ((int) Math.ceil(d)) + i5, ((int) Math.ceil(d2)) + i6);
            }
            i6 = (int) Math.round((d7 - d) / 2.0d);
            j = Math.round((d8 - d2) / 2.0d);
        }
        int i7 = i6;
        i6 = (int) j;
        i5 = i7;
        return new Rect(i5, i6, ((int) Math.ceil(d)) + i5, ((int) Math.ceil(d2)) + i6);
    }

    @HmlPinActivity
    public FragmentBuilder_BindECouponQuantityFragment(getAvailableFeatures getavailablefeatures, Api.ApiOptions.Optional optional, MerchantWalletService merchantWalletService, isConnected isconnected, Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions, getEndpointPackageName getendpointpackagename, FragmentBuilder_BindRemittanceReviewFragment fragmentBuilder_BindRemittanceReviewFragment, FragmentBuilder_BindSelectPurchaseFragment fragmentBuilder_BindSelectPurchaseFragment, Api.Client client, FragmentBuilder_BindPurchaseFromTabSelectionFragment fragmentBuilder_BindPurchaseFromTabSelectionFragment) {
        this.MediaBrowserCompat$SearchResultReceiver = optional;
        this.MediaMetadataCompat = merchantWalletService;
        this.MediaDescriptionCompat = isconnected;
        this.MediaBrowserCompat$MediaItem = getavailablefeatures;
        this.MediaBrowserCompat$CustomActionResultReceiver = getendpointpackagename;
        this.IconCompatParcelizer = fragmentBuilder_BindRemittanceReviewFragment;
        this.write = client;
        this.read = fragmentBuilder_BindSelectPurchaseFragment;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindPurchaseFromTabSelectionFragment;
    }

    public final DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$CustomActionResultReceiver(standardSetCount standardsetcount) {
        return this.MediaMetadataCompat.acceptMerchantTermsAndConditions(standardsetcount).flatMap(mutableSetOfWithSize.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final DebitCardResetOtpActivity<newLatLng> MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3, standardPoll standardpoll) {
        return this.MediaMetadataCompat.changeMerchantAccount(str, str2, str3, standardpoll).map(new nanoTime(this));
    }

    public final DebitCardResetOtpActivity<zzuk> read() {
        return this.MediaMetadataCompat.getCheckAccountEligibility().map(new zzcg.zzf(this.MediaBrowserCompat$SearchResultReceiver));
    }

    public final DebitCardResetOtpActivity<scrollBy> read(ForwardingQueue forwardingQueue) {
        return this.MediaMetadataCompat.createQr(forwardingQueue).map(isPackageSide.read);
    }

    public final DebitCardResetOtpActivity<Boolean> write(standardPoll standardpoll) {
        return this.MediaMetadataCompat.editMerchantAccount(standardpoll).map(mapOfKeyValueArrays.MediaBrowserCompat$ItemReceiver);
    }

    public final DebitCardResetOtpActivity<MarketingCSentWebViewActivity.IconCompatParcelizer> MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaMetadataCompat.getMerchantLanding().map(new setOf(this)).onErrorResumeNext(mapOf.write).doOnNext(new elapsedRealtime(this));
    }

    public final MarketingCSentWebViewActivity.IconCompatParcelizer MediaBrowserCompat$ItemReceiver() {
        return this.IconCompatParcelizer.IconCompatParcelizer;
    }

    public final DebitCardResetOtpActivity<C5579x61d4c5a4> MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        return this.MediaMetadataCompat.getMerchantStatic(str, (String) null).map(zzee.IconCompatParcelizer).map(new zzfd.zzb(this.MediaBrowserCompat$MediaItem));
    }

    public final DebitCardResetOtpActivity<MarketingCSentWebViewActivity.IconCompatParcelizer> write() {
        if (this.IconCompatParcelizer.IconCompatParcelizer == null) {
            return MediaBrowserCompat$CustomActionResultReceiver();
        }
        return DebitCardResetOtpActivity.just(this.IconCompatParcelizer.IconCompatParcelizer);
    }

    public final DebitCardResetOtpActivity<C5653x8f5d302a> IconCompatParcelizer() {
        return this.MediaMetadataCompat.getShopInfo().map(new listOf(this)).doOnNext(new Clock(this));
    }

    public final C5653x8f5d302a MediaBrowserCompat$MediaItem() {
        return this.read.read;
    }

    public final DebitCardResetOtpActivity<JuristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver> MediaDescriptionCompat() {
        return this.MediaMetadataCompat.getStandAloneAddress().map(new CollectionUtils(this));
    }

    public final DebitCardResetOtpActivity<DebitCardResetPinActivity.read> MediaBrowserCompat$CustomActionResultReceiver(standardOffer standardoffer) {
        return this.MediaMetadataCompat.reviewConfirmation(standardoffer).map(new Clock$$CC(this)).doOnNext(new currentThreadTimeMillis$$dflt$$(this));
    }

    public final DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$ItemReceiver(ForwardingSet forwardingSet) {
        return this.MediaMetadataCompat.saveMerchantNickname(forwardingSet).map(isEmpty.write);
    }

    public final DebitCardResetOtpActivity<zzuk> MediaMetadataCompat() {
        return this.MediaMetadataCompat.getValidateMerchant().map(new zzcg.zzf(this.MediaBrowserCompat$SearchResultReceiver));
    }

    public final DebitCardResetOtpActivity<getICheckDetector> MediaBrowserCompat$CustomActionResultReceiver(C10833element element) {
        return this.MediaMetadataCompat.verificationBankAccount(element).map(new currentThreadTimeMillis(this));
    }
}
