package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlSelectedOfferReviewActivity;
import com.scb.phone.view.activity.hml.businessowner.C5624xf154595d;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerLoanSetupActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.CrashlyticsController;
import p040o.CrashlyticsReport;
import p040o.ForwardingFuture;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlPinActivity;
import p040o.Iterables;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.getDocumentType;
import p040o.getPersonalShortCuts;
import p040o.getPersonalShortCuts$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.removePage;
import p040o.setClassificationAlternatives;
import p040o.setTapText;
import p040o.zzct;

public class HmlSelectedOfferReviewActivity extends BaseActivity implements PassportCaptureModule_GetIJsonExactionHelperRttiFactory {
    @BindView
    TextView amount;
    @BindView
    Button btnConfirm;
    @BindView
    LinearLayout container;
    @HmlPinActivity
    public Iterables.C351911.C35201 itemFactory;
    @BindView
    TextView repaymentAmount;
    @HmlPinActivity
    public getPersonalShortCuts selectedOfferReviewPresenter;

    public static void write(Context context, CrashlyticsController.C322720 r4) {
        Intent intent = new Intent(context, HmlSelectedOfferReviewActivity.class);
        intent.putExtra("SELECTED_OFFER_REVIEW", r4);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78362131493061);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.selectedOfferReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.hml_offer_review_loan_details_title));
        setTabContainer();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            CrashlyticsController.C322720 r6 = (CrashlyticsController.C322720) extras.getParcelable("SELECTED_OFFER_REVIEW");
            getPersonalShortCuts getpersonalshortcuts = this.selectedOfferReviewPresenter;
            boolean z = true;
            if (getpersonalshortcuts.RatingCompat != null) {
                getpersonalshortcuts.RatingCompat.AlertController$RecycleListView();
            }
            getpersonalshortcuts.read = r6;
            getpersonalshortcuts.MediaDescriptionCompat = r6.MediaMetadataCompat;
            setClassificationAlternatives setclassificationalternatives = new setClassificationAlternatives(getpersonalshortcuts, r6);
            if (getpersonalshortcuts.RatingCompat != null) {
                setclassificationalternatives.IconCompatParcelizer(getpersonalshortcuts.RatingCompat);
            }
            removePage removepage = new removePage(getpersonalshortcuts, r6);
            if (getpersonalshortcuts.RatingCompat != null) {
                removepage.IconCompatParcelizer(getpersonalshortcuts.RatingCompat);
            }
            if (getpersonalshortcuts.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getpersonalshortcuts.RatingCompat.aj_();
            }
        }
        this.btnConfirm.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                HmlSelectedOfferReviewActivity.this.lambda$onCreate$0$HmlSelectedOfferReviewActivity(view);
            }
        });
    }

    public /* synthetic */ void lambda$onCreate$0$HmlSelectedOfferReviewActivity(View view) {
        getPersonalShortCuts getpersonalshortcuts = this.selectedOfferReviewPresenter;
        if (getpersonalshortcuts.RatingCompat != null) {
            getpersonalshortcuts.RatingCompat.AlertController$RecycleListView();
        }
        CrashlyticsController.C322720 r0 = getpersonalshortcuts.read;
        if (!(r0 == null || r0.RatingCompat == null)) {
            CrashlyticsReport.FilesPayload.Builder builder = getpersonalshortcuts.read.RatingCompat;
            if (builder.IconCompatParcelizer != null) {
                HmlNTBBusinessURLInformationActivity.write(builder.IconCompatParcelizer, "#####", "", "", -1, "", getDocumentType.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
        getpersonalshortcuts.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(DiskLruCache.VERSION_1, getpersonalshortcuts.MediaDescriptionCompat);
        getpersonalshortcuts.IconCompatParcelizer.IconCompatParcelizer(new getPersonalShortCuts$MediaBrowserCompat$ItemReceiver(getpersonalshortcuts, (byte) 0));
    }

    public final void IconCompatParcelizer(CrashlyticsController.C322418 r3) {
        this.amount.setText(r3.IconCompatParcelizer);
        this.repaymentAmount.setText(r3.write);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<ForwardingFuture> list) {
        for (ForwardingFuture next : list) {
            ItemCustom MediaBrowserCompat$CustomActionResultReceiver = this.itemFactory.MediaBrowserCompat$CustomActionResultReceiver(this, next);
            MediaBrowserCompat$CustomActionResultReceiver.setUpWithDisplay(next);
            this.container.addView(MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.hml_offer_review_loan_details_title));
        setTabContainer();
    }

    public void onDestroy() {
        this.selectedOfferReviewPresenter.onDestroy();
        super.onDestroy();
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(zzct.zza zza) {
        if (zza == zzct.zza.CONSUMER) {
            HmlETBLoanSetupActivity$MediaBrowserCompat$ItemReceiver hmlETBLoanSetupActivity$MediaBrowserCompat$ItemReceiver = HmlETBLoanSetupActivity.MediaDescriptionCompat;
            onGetStartedClick.write((Object) this, "ctx");
            Intent intent = new Intent(this, HmlETBLoanSetupActivity.class);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, intent).read();
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
        } else {
            C5624xf154595d hmlBusinessOwnerLoanSetupActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlBusinessOwnerLoanSetupActivity.MediaMetadataCompat;
            onGetStartedClick.write((Object) this, "ctx");
            Intent intent2 = new Intent(this, HmlBusinessOwnerLoanSetupActivity.class);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(this, intent2).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb2.append(read2.getData());
                sb2.append("\n with context ");
                sb2.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
                startActivity(read2);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }
}
