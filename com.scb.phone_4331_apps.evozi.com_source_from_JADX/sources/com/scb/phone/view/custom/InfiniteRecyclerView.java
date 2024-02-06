package com.scb.phone.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p040o.BankingAgentDeepLinkActivity;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C6489x271d6c26;
import p040o.C7087x30442eed;
import p040o.CheckEligibilityActivity;
import p040o.DebitCardRequestReviewActivity;
import p040o.EkycService;
import p040o.FragmentBuilder_BindCreditCardFragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlCalculatorDeepLinkActivity;
import p040o.HmlETBLandingActivity;
import p040o.HmlLatestPersonalInformationDeepLinkActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.IntroductionActivity_ViewBinding;
import p040o.ItemCustom;
import p040o.WebViewDeepLinkActivity;
import p040o.completeSubmission;
import p040o.onGetStartedClick;
import p040o.setGuidelineBegin;
import p040o.setStatusBarBackgroundColor;

public final class InfiniteRecyclerView extends RecyclerView implements EkycService {
    private final HmlVerifyEmailActivity ActionBarContainer;
    private final HmlVerifyEmailActivity setSplitBackground;
    public BulkTransferDeepLinkActivity setStackedBackground;
    /* access modifiers changed from: private */
    public boolean setTabContainer;

    public InfiniteRecyclerView(Context context) {
        this(context, (AttributeSet) null, 6, (byte) 0);
    }

    public InfiniteRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    public final void setOnSnapPositionChangeListener(FragmentBuilder_BindCreditCardFragment.IconCompatParcelizer iconCompatParcelizer) {
        setOnSnapPositionChangeListener$default(this, (C6489x271d6c26) null, iconCompatParcelizer, 1, (Object) null);
    }

    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Integer, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ InfiniteRecyclerView MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(InfiniteRecyclerView infiniteRecyclerView) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = infiniteRecyclerView;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            InfiniteRecyclerView infiniteRecyclerView = this.MediaBrowserCompat$CustomActionResultReceiver;
            boolean z = true;
            if (!(intValue == 1 || intValue == 2)) {
                z = false;
            }
            infiniteRecyclerView.setTabContainer = z;
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ InfiniteRecyclerView(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfiniteRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        FundActionsSuccessActivity fundActionsSuccessActivity = MediaDescriptionCompat.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.setSplitBackground = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
        FundActionsSuccessActivity ratingCompat = new RatingCompat(this, context);
        onGetStartedClick.write((Object) ratingCompat, "initializer");
        this.ActionBarContainer = new HmlVerifyPhoneTermsConditionsActivity(ratingCompat);
    }

    public final void setAdapter(RecyclerView.IconCompatParcelizer<?> iconCompatParcelizer) {
        if (!(iconCompatParcelizer instanceof ItemCustom)) {
            iconCompatParcelizer = null;
        }
        ItemCustom itemCustom = (ItemCustom) iconCompatParcelizer;
        if (itemCustom != null) {
            itemCustom.IconCompatParcelizer.registerObserver(new IconCompatParcelizer(this, itemCustom));
            super.setAdapter(itemCustom);
            ((setStatusBarBackgroundColor) this.setSplitBackground.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$CustomActionResultReceiver(this);
            RecyclerView.ParcelableVolumeInfo infiniteRecyclerView$MediaBrowserCompat$CustomActionResultReceiver = new C5794xb4ec8265(new read(this));
            if (this.setGroupDividerEnabled == null) {
                this.setGroupDividerEnabled = new ArrayList();
            }
            this.setGroupDividerEnabled.add(infiniteRecyclerView$MediaBrowserCompat$CustomActionResultReceiver);
            MediaBrowserCompat$CustomActionResultReceiver(itemCustom.read());
            return;
        }
        throw new IllegalArgumentException("we accept Adapter extends from BaseInfiniteAdapter only");
    }

    public static final class IconCompatParcelizer extends RecyclerView.read {
        private /* synthetic */ ItemCustom MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ InfiniteRecyclerView read;

        IconCompatParcelizer(InfiniteRecyclerView infiniteRecyclerView, ItemCustom itemCustom) {
            this.read = infiniteRecyclerView;
            this.MediaBrowserCompat$CustomActionResultReceiver = itemCustom;
        }

        public final void write() {
            super.write();
            this.read.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.read());
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.setStackedBackground;
        if (bulkTransferDeepLinkActivity != null) {
            bulkTransferDeepLinkActivity.dispose();
        }
    }

    public static /* synthetic */ void setOnSnapPositionChangeListener$default(InfiniteRecyclerView infiniteRecyclerView, C6489x271d6c26 fragmentBuilder_BindCreditCardFragment$MediaBrowserCompat$ItemReceiver, FragmentBuilder_BindCreditCardFragment.IconCompatParcelizer iconCompatParcelizer, int i, Object obj) {
        if ((i & 1) != 0) {
            fragmentBuilder_BindCreditCardFragment$MediaBrowserCompat$ItemReceiver = C6489x271d6c26.NOTIFY_ON_SCROLL;
        }
        infiniteRecyclerView.setOnSnapPositionChangeListener(fragmentBuilder_BindCreditCardFragment$MediaBrowserCompat$ItemReceiver, iconCompatParcelizer);
    }

    public final void setOnSnapPositionChangeListener(C6489x271d6c26 fragmentBuilder_BindCreditCardFragment$MediaBrowserCompat$ItemReceiver, FragmentBuilder_BindCreditCardFragment.IconCompatParcelizer iconCompatParcelizer) {
        onGetStartedClick.write((Object) fragmentBuilder_BindCreditCardFragment$MediaBrowserCompat$ItemReceiver, "behavior");
        onGetStartedClick.write((Object) iconCompatParcelizer, "onSnapPositionChangeListener");
        RecyclerView.ParcelableVolumeInfo fragmentBuilder_BindCreditCardFragment = new FragmentBuilder_BindCreditCardFragment((setStatusBarBackgroundColor) this.setSplitBackground.MediaBrowserCompat$CustomActionResultReceiver(), fragmentBuilder_BindCreditCardFragment$MediaBrowserCompat$ItemReceiver, iconCompatParcelizer);
        if (this.setGroupDividerEnabled == null) {
            this.setGroupDividerEnabled = new ArrayList();
        }
        this.setGroupDividerEnabled.add(fragmentBuilder_BindCreditCardFragment);
    }

    public final void MediaMetadataCompat() {
        DebitCardRequestReviewActivity<Long> write2 = DebitCardRequestReviewActivity.write(5000, TimeUnit.MILLISECONDS);
        BankingAgentDeepLinkActivity IconCompatParcelizer2 = HmlETBLandingActivity.IconCompatParcelizer();
        HmlLatestPersonalInformationDeepLinkActivity.write(IconCompatParcelizer2, "scheduler is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(IconCompatParcelizer2, "scheduler is null");
        IntroductionActivity_ViewBinding introductionActivity_ViewBinding = new IntroductionActivity_ViewBinding(write2, IconCompatParcelizer2, true);
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver = BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
        int write3 = DebitCardRequestReviewActivity.write();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver, "scheduler is null");
        HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(write3, "bufferSize");
        this.setStackedBackground = new WebViewDeepLinkActivity(introductionActivity_ViewBinding, MediaBrowserCompat$ItemReceiver, false, write3).MediaBrowserCompat$ItemReceiver(new InfiniteRecyclerView$MediaBrowserCompat$ItemReceiver(this), HmlCalculatorDeepLinkActivity.write, HmlCalculatorDeepLinkActivity.read, C7087x30442eed.INSTANCE);
    }

    public final class write extends setGuidelineBegin {
        public final int MediaBrowserCompat$CustomActionResultReceiver() {
            return -1;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(Context context) {
            super(context);
            onGetStartedClick.write((Object) context, "context");
        }
    }

    static final class MediaDescriptionCompat extends CheckEligibilityActivity implements FundActionsSuccessActivity<completeSubmission> {
        public static final MediaDescriptionCompat IconCompatParcelizer = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new completeSubmission();
        }
    }

    static final class RatingCompat extends CheckEligibilityActivity implements FundActionsSuccessActivity<write> {
        private /* synthetic */ InfiniteRecyclerView MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ Context write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        RatingCompat(InfiniteRecyclerView infiniteRecyclerView, Context context) {
            super(0);
            this.MediaBrowserCompat$ItemReceiver = infiniteRecyclerView;
            this.write = context;
        }

        public final /* synthetic */ Object invoke() {
            return new write(this.write);
        }
    }

    public static final /* synthetic */ setStatusBarBackgroundColor IconCompatParcelizer(InfiniteRecyclerView infiniteRecyclerView) {
        return (setStatusBarBackgroundColor) infiniteRecyclerView.setSplitBackground.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void RatingCompat(int i) {
        ((write) this.ActionBarContainer.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$MediaItem = i;
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null) {
            recyclerView$MediaBrowserCompat$SearchResultReceiver.write((RecyclerView.PlaybackStateCompat) (write) this.ActionBarContainer.MediaBrowserCompat$CustomActionResultReceiver());
        }
    }
}
