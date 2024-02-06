package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.easycash.EasycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.juristic.JuristicRequestFormActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.CharMatcher;
import p040o.FieldEventDao;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.IdExtractionParameters;
import p040o.MyECouponActivity_ViewBinding;
import p040o.TaskRunner;
import p040o.ZSYR2K;
import p040o.getChangedValue;
import p040o.getDismissalTime;
import p040o.getEventTime;
import p040o.getNextTransition;
import p040o.isSupportFragmentClass;
import p040o.setInstanceType;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.show;
import p040o.standardOffer;

public class MwReviewActivity extends BaseActivity implements IdExtractionParameters {
    @BindView
    ImageView imgBankLogo;
    @BindView
    ImageView imgShopPhoto;
    @HmlPinActivity
    public TaskRunner.C3843b.C38441 mwReviewPresenter;
    @BindView
    ConstraintLayout shopCoverEmpty;
    @BindView
    TextView tvAcountNumber;
    @BindView
    TextView tvReceivingAccount;
    @BindView
    TextView tvShopName;
    @BindView
    TextView tvShopOwner;
    @BindView
    TextView tvShopType;

    public static Intent IconCompatParcelizer(Context context) {
        return new Intent(context, MwReviewActivity.class);
    }

    public void onCreate(Bundle bundle) {
        isSupportFragmentClass issupportfragmentclass;
        super.onCreate(bundle);
        setContentView(R.layout.f78932131493118);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.mw_review_title);
        setTabContainer();
        this.mwReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
        TaskRunner.C3843b.C38441 r7 = this.mwReviewPresenter;
        String str = r7.read.write().MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper;
        show show = new show(r7.read.IconCompatParcelizer.MediaBrowserCompat$MediaItem().write);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new getEventTime(r7)));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        T t = null;
        T t2 = issupportfragmentclass.IconCompatParcelizer;
        if (t2 != null) {
            t = t2;
        }
        getDismissalTime getdismissaltime = new getDismissalTime(r7, r7.read.write(), str, (JuristicRequestFormActivity.read) t);
        if (r7.RatingCompat != null) {
            getdismissaltime.IconCompatParcelizer(r7.RatingCompat);
        }
    }

    @OnClick
    public void onClickConfirm() {
        TaskRunner.C3843b.C38441 r0 = this.mwReviewPresenter;
        if (!r0.IconCompatParcelizer) {
            boolean z = true;
            r0.IconCompatParcelizer = true;
            if (r0.RatingCompat != null) {
                r0.RatingCompat.AlertController$RecycleListView();
            }
            getChangedValue getchangedvalue = new getChangedValue(r0.read.write().MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo);
            if (r0.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getchangedvalue.IconCompatParcelizer(r0.RatingCompat);
            }
            CharMatcher.LookupTable lookupTable = r0.read;
            lookupTable.read(lookupTable.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(new standardOffer(lookupTable.RatingCompat)), new FieldEventDao(r0), new setInstanceType(r0));
        }
    }

    public final void write(EasycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver) {
        this.tvReceivingAccount.setText(easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver.read);
        this.tvAcountNumber.setText(easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
        this.tvShopOwner.setText(easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver);
        this.tvShopName.setText(easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver.write);
        this.tvShopType.setText(easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem);
        String str = easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        if (str == null || str.isEmpty()) {
            this.imgShopPhoto.setVisibility(8);
            this.shopCoverEmpty.setVisibility(0);
        } else {
            this.shopCoverEmpty.setVisibility(8);
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, this.imgShopPhoto);
        }
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver((Context) this, (int) R.drawable.bankicon_scb, this.imgBankLogo, easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, getResources().getDimensionPixelOffset(R.dimen.f71972131165267), setLastBaselineToBottomHeight.read(getApplicationContext(), R.color.f66402131099796));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder crashlyticsReportSessionEventApplicationExecutionSignalEncoder) {
        Intent IconCompatParcelizer = MwOnBoardSuccessActivity.IconCompatParcelizer(this, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent addFlags = MwBusinessDetailsActivity.IconCompatParcelizer((Context) this).addFlags(67108864);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, addFlags).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(String str) {
        this.scbAnalytics.write("merchant_review_information", new ZSYR2K("shop_type", str));
    }
}
