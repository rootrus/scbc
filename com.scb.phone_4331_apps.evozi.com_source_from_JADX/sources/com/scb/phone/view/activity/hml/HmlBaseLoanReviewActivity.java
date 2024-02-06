package com.scb.phone.view.activity.hml;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.ThaiTextView;
import java.util.List;
import p040o.CrashlyticsController;
import p040o.DocumentTypeR;
import p040o.ForwardingFuture;
import p040o.HmlPinActivity;
import p040o.Iterables;
import p040o.KtaPassportExtractor;
import p040o.OcrResultData;
import p040o.ZHPR2;
import p040o.ZHPR2$MediaBrowserCompat$ItemReceiver;
import p040o.ZSYR2K;
import p040o.addImage;
import p040o.getICheckDeserializerRtti;
import p040o.getLongEdge;
import p040o.onGetStartedClick;
import p040o.setTRx;
import p040o.writeSessionPartFile;
import p040o.zzct;

public abstract class HmlBaseLoanReviewActivity<T extends addImage> extends BaseActivity implements KtaPassportExtractor {
    @BindView
    public LinearLayout accountsContainer;
    @BindView
    public ThaiTextView attentionBox;
    @BindView
    public Button btnAccept;
    @BindView
    public TextView estatementMail;
    @BindView
    public TextView estatementMailTitle;
    @HmlPinActivity
    public T hmlLoanReviewPresenter;
    @HmlPinActivity
    public Iterables.C351911 itemFactory;
    @BindView
    public LinearLayout loanInformationContainer;
    @BindView
    public TextView netAmount;
    @BindView
    public ConstraintLayout netAmountView;
    @BindView
    public TextView repaymentDate;
    @BindView
    public LinearLayout taxFeesContainer;
    @BindView
    public TextView taxFeesTitle;
    @BindView
    public CheckBox termsConditionsCheckbox;
    @BindView
    public TextView termsConditionsText;

    public /* synthetic */ void IconCompatParcelizer() {
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public abstract String mo14513x50fd9e4a();

    public final /* synthetic */ void IconCompatParcelizer(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        Button button = this.btnAccept;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnAccept");
        }
        button.setEnabled(booleanValue);
    }

    public final /* synthetic */ void read(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        ZSYR2K[] zsyr2kArr = new ZSYR2K[2];
        zsyr2kArr[0] = new ZSYR2K("user_type", mo14513x50fd9e4a());
        zsyr2kArr[1] = new ZSYR2K("loan_type", booleanValue ? "business_owner" : "consumer");
        this.scbAnalytics.write("p10x1_review_confirmation", zsyr2kArr);
    }

    public void onCreate(Bundle bundle) {
        List<ForwardingFuture> list;
        super.onCreate(bundle);
        setContentView(R.layout.f78312131493056);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.hml_review_confirmation_title));
        setTabContainer();
        T t = this.hmlLoanReviewPresenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("hmlLoanReviewPresenter");
        }
        t.MediaBrowserCompat$ItemReceiver(this);
        T t2 = this.hmlLoanReviewPresenter;
        if (t2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("hmlLoanReviewPresenter");
        }
        CrashlyticsController.C322317 r0 = (CrashlyticsController.C322317) getIntent().getParcelableExtra("EXTRA_DISPLAY_INFO");
        boolean z = true;
        if (t2.RatingCompat != null) {
            t2.RatingCompat.AlertController$RecycleListView();
        }
        if (t2.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$SearchResultReceiver() == zzct.zza.CONSUMER) {
            list = t2.read.write(r0);
        } else {
            list = t2.read.read(r0);
            DocumentTypeR documentTypeR = DocumentTypeR.read;
            if (t2.RatingCompat != null) {
                documentTypeR.IconCompatParcelizer(t2.RatingCompat);
            }
        }
        setTRx settrx = new setTRx(t2, list, r0);
        if (t2.RatingCompat != null) {
            settrx.IconCompatParcelizer(t2.RatingCompat);
        }
        if (t2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            t2.RatingCompat.aj_();
        }
        TextView textView = this.termsConditionsText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("termsConditionsText");
        }
        textView.setMovementMethod(new LinkMovementMethod());
        TextView textView2 = this.termsConditionsText;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("termsConditionsText");
        }
        textView2.setText(ZHPR2.MediaBrowserCompat$CustomActionResultReceiver(getString(R.string.hml_review_confirmation_terms_conditions_plain_text), getString(R.string.hml_review_confirmation_terms_conditions_link), getResources(), new IconCompatParcelizer(this), true, 0));
    }

    @OnClick
    public final void onBtnAcceptClicked() {
        T t = this.hmlLoanReviewPresenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("hmlLoanReviewPresenter");
        }
        t.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void write() {
        TextView textView = this.estatementMailTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("estatementMailTitle");
        }
        textView.setText(getString(R.string.hml_bo_review_confirmation_estatement_title));
    }

    static final class IconCompatParcelizer implements ZHPR2$MediaBrowserCompat$ItemReceiver {
        private /* synthetic */ HmlBaseLoanReviewActivity read;

        IconCompatParcelizer(HmlBaseLoanReviewActivity hmlBaseLoanReviewActivity) {
            this.read = hmlBaseLoanReviewActivity;
        }

        public final void read() {
            T t = this.read.hmlLoanReviewPresenter;
            if (t == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("hmlLoanReviewPresenter");
            }
            OcrResultData ocrResultData = OcrResultData.write;
            if (t.RatingCompat != null) {
                ocrResultData.IconCompatParcelizer(t.RatingCompat);
            }
        }
    }

    private final void IconCompatParcelizer(List<? extends ForwardingFuture> list, LinearLayout linearLayout) {
        for (ForwardingFuture forwardingFuture : list) {
            Iterables.C351911 r1 = this.itemFactory;
            if (r1 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("itemFactory");
            }
            ItemCustom MediaBrowserCompat$CustomActionResultReceiver = r1.MediaBrowserCompat$CustomActionResultReceiver(this, forwardingFuture);
            MediaBrowserCompat$CustomActionResultReceiver.setUpWithDisplay(forwardingFuture);
            linearLayout.addView(MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    @OnCheckedChanged
    public final void onCheckboxChanged() {
        T t = this.hmlLoanReviewPresenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("hmlLoanReviewPresenter");
        }
        CheckBox checkBox = this.termsConditionsCheckbox;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("termsConditionsCheckbox");
        }
        getLongEdge getlongedge = new getLongEdge(Boolean.valueOf(checkBox.isChecked()));
        if (t.RatingCompat != null) {
            getlongedge.IconCompatParcelizer(t.RatingCompat);
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.hml_review_confirmation_title));
        setTabContainer();
    }

    public void onDestroy() {
        T t = this.hmlLoanReviewPresenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("hmlLoanReviewPresenter");
        }
        t.onDestroy();
        super.onDestroy();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 5500 && i2 == -1 && intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("EXTRA_IS_ACCEPTED", false);
            CheckBox checkBox = this.termsConditionsCheckbox;
            if (checkBox == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("termsConditionsCheckbox");
            }
            checkBox.setChecked(booleanExtra);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(writeSessionPartFile writesessionpartfile) {
        onGetStartedClick.write((Object) writesessionpartfile, "display");
        List<ForwardingFuture> list = writesessionpartfile.write;
        LinearLayout linearLayout = this.loanInformationContainer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loanInformationContainer");
        }
        IconCompatParcelizer(list, linearLayout);
        List<ForwardingFuture> list2 = writesessionpartfile.read;
        LinearLayout linearLayout2 = this.accountsContainer;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountsContainer");
        }
        IconCompatParcelizer(list2, linearLayout2);
        List<ForwardingFuture> list3 = writesessionpartfile.MediaBrowserCompat$SearchResultReceiver;
        if (list3 != null) {
            TextView textView = this.taxFeesTitle;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("taxFeesTitle");
            }
            textView.setVisibility(0);
            LinearLayout linearLayout3 = this.taxFeesContainer;
            if (linearLayout3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("taxFeesContainer");
            }
            linearLayout3.setVisibility(0);
            LinearLayout linearLayout4 = this.taxFeesContainer;
            if (linearLayout4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("taxFeesContainer");
            }
            IconCompatParcelizer(list3, linearLayout4);
        }
        TextView textView2 = this.netAmount;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("netAmount");
        }
        String str = writesessionpartfile.MediaBrowserCompat$ItemReceiver;
        if (str != null && !str.isEmpty()) {
            str = getICheckDeserializerRtti.IconCompatParcelizer(getICheckDeserializerRtti.ParcelableVolumeInfo(str));
        }
        textView2.setText(str);
        ConstraintLayout constraintLayout = this.netAmountView;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("netAmountView");
        }
        constraintLayout.setVisibility(0);
        TextView textView3 = this.repaymentDate;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentDate");
        }
        textView3.setText(getString(R.string.hml_account_setup_repayment_date, new Object[]{writesessionpartfile.MediaDescriptionCompat, writesessionpartfile.RatingCompat}));
        TextView textView4 = this.estatementMail;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("estatementMail");
        }
        textView4.setText(writesessionpartfile.MediaBrowserCompat$CustomActionResultReceiver);
        ThaiTextView thaiTextView = this.attentionBox;
        if (thaiTextView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("attentionBox");
        }
        thaiTextView.setText(writesessionpartfile.IconCompatParcelizer);
    }
}
