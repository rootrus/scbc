package com.scb.phone.view.fragment.hml;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.hml.CustomLoanSuccessInformation;
import com.scb.phone.view.custom.tierpricing.TierPricingSimplePromotionView;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import com.scb.phone.view.fragment.ScreenShotFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.Calendar;
import java.util.List;
import org.jmrtd.lds.ImageInfo;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.ContentFrameLayout;
import p040o.CrashlyticsController;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingFuture;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.FragmentBuilder_BindEBillSelectedFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.Iterables;
import p040o.MyECouponActivity_ViewBinding;
import p040o.computeFloatSizeNoTag;
import p040o.computeUInt64Size;
import p040o.getDocumentID;
import p040o.getICheckDeserializerRtti;
import p040o.getOversizeImage;
import p040o.getUserId;
import p040o.onGetStartedClick;
import p040o.proxyGetIPassportDeserializerKta;
import p040o.sanitizeAttribute;
import p040o.setExitButtonEnabled;
import p040o.setTapText;
import p040o.standardStartAndWait;
import p040o.verifyRedeem;
import p040o.writeSInt32;
import p040o.writeUInt64NoTag;

public abstract class HmlBaseOnlineSuccessFragment<T extends getDocumentID> extends ScreenShotFragment<standardStartAndWait> implements proxyGetIPassportDeserializerKta {
    private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public Iterables.C352414 componentFactory;
    @BindView
    public CustomLoanSuccessInformation loanInfo;
    @HmlPinActivity
    public T presenter;
    @BindView
    public CustomTransferAndPaySource receivingAccount;
    @BindView
    public TextView referenceId;
    @BindView
    public Button registerButton;
    @BindView
    public TextView remarkTextView;
    @BindView
    public Button returnToHome;
    @BindView
    public Button saveSlip;
    @HmlPinActivity
    public setExitButtonEnabled themesSlipPresenter;
    @BindView
    public TextView transactionDate;

    public /* synthetic */ void IconCompatParcelizer() {
    }

    public final /* synthetic */ void IconCompatParcelizer(List<ForwardingFuture> list) {
    }

    public final /* synthetic */ void IconCompatParcelizer(sanitizeAttribute sanitizeattribute) {
    }

    public final /* synthetic */ void IconCompatParcelizer(boolean z) {
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(List<getUserId> list) {
    }

    public void MediaBrowserCompat$MediaItem() {
    }

    public final /* synthetic */ void read(String str) {
    }

    public final /* synthetic */ void write(int i) {
    }

    public final /* synthetic */ void write(String str) {
    }

    static final class IconCompatParcelizer<T> implements DebitCardMarketConductDeepLinkActivity<Uri> {
        private /* synthetic */ HmlBaseOnlineSuccessFragment MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ boolean write;

        IconCompatParcelizer(HmlBaseOnlineSuccessFragment hmlBaseOnlineSuccessFragment, boolean z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlBaseOnlineSuccessFragment;
            this.write = z;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            Uri uri = (Uri) obj;
            T t = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (t == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String obj2 = uri.toString();
            boolean z = true;
            if (this.write) {
                computeFloatSizeNoTag computefloatsizenotag = new computeFloatSizeNoTag(obj2);
                if (t.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    computefloatsizenotag.IconCompatParcelizer(t.RatingCompat);
                    return;
                }
                return;
            }
            writeSInt32 writesint32 = writeSInt32.IconCompatParcelizer;
            if (t.RatingCompat == null) {
                z = false;
            }
            if (z) {
                writesint32.IconCompatParcelizer(t.RatingCompat);
            }
        }
    }

    static final class write<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        private /* synthetic */ HmlBaseOnlineSuccessFragment read;

        write(HmlBaseOnlineSuccessFragment hmlBaseOnlineSuccessFragment) {
            this.read = hmlBaseOnlineSuccessFragment;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            Throwable th = (Throwable) obj;
            T t = this.read.presenter;
            if (t == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            Log.e("PurSuccessPresenter", "onSaveScreenshotError: ", th);
            computeUInt64Size computeuint64size = computeUInt64Size.MediaBrowserCompat$CustomActionResultReceiver;
            if (t.RatingCompat != null) {
                computeuint64size.IconCompatParcelizer(t.RatingCompat);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void read(standardStartAndWait standardstartandwait, boolean z) {
        verifyRedeem.read(this, standardstartandwait, false, z);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f88082131494035, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        T t = this.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        t.MediaBrowserCompat$ItemReceiver(this);
        T t2 = this.presenter;
        if (t2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        t2.MediaBrowserCompat$ItemReceiver();
        Button button = this.saveSlip;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("saveSlip");
        }
        button.setOnClickListener(new HmlBaseOnlineSuccessFragment$MediaBrowserCompat$ItemReceiver(this));
        return inflate;
    }

    public void IconCompatParcelizer(CrashlyticsController.C322115 r7) {
        onGetStartedClick.write((Object) r7, "data");
        TextView textView = this.transactionDate;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("transactionDate");
        }
        textView.setText(r7.MediaBrowserCompat$ItemReceiver);
        TextView textView2 = this.referenceId;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("referenceId");
        }
        textView2.setText(r7.IconCompatParcelizer);
        CustomLoanSuccessInformation customLoanSuccessInformation = this.loanInfo;
        if (customLoanSuccessInformation == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loanInfo");
        }
        String string = getString(R.string.hml_success_loan_amount_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_success_loan_amount_title)");
        customLoanSuccessInformation.setAmountTitle(string);
        CustomLoanSuccessInformation customLoanSuccessInformation2 = this.loanInfo;
        if (customLoanSuccessInformation2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loanInfo");
        }
        String string2 = getString(R.string.hml_success_principal_amount, r7.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.hml_s…data.loanInfo.loanAmount)");
        customLoanSuccessInformation2.setAmount(string2);
        CustomLoanSuccessInformation customLoanSuccessInformation3 = this.loanInfo;
        if (customLoanSuccessInformation3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loanInfo");
        }
        customLoanSuccessInformation3.setPromotion(r7.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        CustomLoanSuccessInformation customLoanSuccessInformation4 = this.loanInfo;
        if (customLoanSuccessInformation4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loanInfo");
        }
        TierPricingSimplePromotionView tierPricingSimplePromotionView = customLoanSuccessInformation4.promotion;
        if (tierPricingSimplePromotionView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("promotion");
        }
        tierPricingSimplePromotionView.setDisplay(r7.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        CustomLoanSuccessInformation customLoanSuccessInformation5 = this.loanInfo;
        if (customLoanSuccessInformation5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loanInfo");
        }
        String string3 = getString(R.string.hml_success_repayment_amount, r7.MediaBrowserCompat$CustomActionResultReceiver.write, r7.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
        onGetStartedClick.IconCompatParcelizer((Object) string3, "getString(\n             …o.repaymentUnit\n        )");
        customLoanSuccessInformation5.setRepayment(string3);
        CustomTransferAndPaySource customTransferAndPaySource = this.receivingAccount;
        if (customTransferAndPaySource == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("receivingAccount");
        }
        customTransferAndPaySource.setAccountNumber(r7.read);
        CustomTransferAndPaySource customTransferAndPaySource2 = this.receivingAccount;
        if (customTransferAndPaySource2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("receivingAccount");
        }
        customTransferAndPaySource2.setSourceName(r7.write);
        CustomTransferAndPaySource customTransferAndPaySource3 = this.receivingAccount;
        if (customTransferAndPaySource3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("receivingAccount");
        }
        customTransferAndPaySource3.setText(getString(R.string.hml_success_to));
        CustomTransferAndPaySource customTransferAndPaySource4 = this.receivingAccount;
        if (customTransferAndPaySource4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("receivingAccount");
        }
        customTransferAndPaySource4.setAvatar(getICheckDeserializerRtti.write(getContext(), (int) R.drawable.bankicon_scb).toString());
    }

    @OnClick
    public final void onAccountSummaryClick() {
        T t = this.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getDocumentID.write.IconCompatParcelizer;
        if (t.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(t.RatingCompat);
        }
    }

    public void onDestroyView() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (bulkTransferDeepLinkActivity != null) {
            if (!(!bulkTransferDeepLinkActivity.isDisposed())) {
                bulkTransferDeepLinkActivity = null;
            }
            if (bulkTransferDeepLinkActivity != null) {
                bulkTransferDeepLinkActivity.dispose();
            }
        }
        T t = this.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        t.onDestroy();
        super.onDestroyView();
    }

    public final void write(boolean z) {
        Button button = this.saveSlip;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("saveSlip");
        }
        button.setVisibility(z ? 0 : 8);
    }

    public final void write() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        Activity activity2 = activity;
        String string = getString(R.string.saved_slip);
        getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).write(activity2, R.id.root_view, string, getoversizeimage);
        }
    }

    public final void read() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        Activity activity2 = activity;
        String string = getString(R.string.saved_slip_error);
        getOversizeImage getoversizeimage = getOversizeImage.ERROR;
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).write(activity2, R.id.root_view, string, getoversizeimage);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        Button button = this.saveSlip;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("saveSlip");
        }
        button.setBackgroundResource(z ? R.drawable.bg_button : R.drawable.bg_button_transparent);
        Button button2 = this.saveSlip;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("saveSlip");
        }
        button2.setTextColor(ContentFrameLayout.write(getResources(), z ? R.color.f71012131100257 : R.color.f67252131099881, (Resources.Theme) null));
    }

    public final void read(standardStartAndWait standardstartandwait) {
        onGetStartedClick.write((Object) standardstartandwait, "display");
        T t = this.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        t.read(standardstartandwait, (List<getUserId>) null);
    }

    /* renamed from: MediaBrowserCompat$ItemReceiver */
    public final void IconCompatParcelizer(standardStartAndWait standardstartandwait, boolean z, boolean z2) {
        setExitButtonEnabled setexitbuttonenabled = this.themesSlipPresenter;
        if (setexitbuttonenabled == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("themesSlipPresenter");
        }
        read read2 = new read(setexitbuttonenabled);
        String IconCompatParcelizer2 = IconCompatParcelizer(standardstartandwait);
        Iterables.C352414 r7 = this.componentFactory;
        if (r7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("componentFactory");
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(read2, new PurchaseSuccessFragment.PurchaseScreenshotDisplay(R.layout.f91692131494396, IconCompatParcelizer2, standardstartandwait, z, r7, z2), getContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new IconCompatParcelizer(this, z), new write(this));
    }

    private static String IconCompatParcelizer(standardStartAndWait standardstartandwait) {
        if (standardstartandwait != null) {
            Calendar instance = Calendar.getInstance();
            onGetStartedClick.IconCompatParcelizer((Object) instance, "Calendar.getInstance()");
            String IconCompatParcelizer2 = standardstartandwait.IconCompatParcelizer(String.valueOf(instance.getTimeInMillis()));
            return IconCompatParcelizer2 == null ? "" : IconCompatParcelizer2;
        }
    }

    public static final class read extends FragmentBuilder_BindEBillSelectedFragment<PurchaseSuccessFragment.PurchaseScreenshotDisplay> {
        public final /* synthetic */ void write(ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, View view) {
            PurchaseSuccessFragment.PurchaseScreenshotDisplay purchaseScreenshotDisplay = (PurchaseSuccessFragment.PurchaseScreenshotDisplay) simpleForwardingListenableFuture;
            onGetStartedClick.write((Object) purchaseScreenshotDisplay, "display");
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            ButterKnife.IconCompatParcelizer(purchaseScreenshotDisplay, view);
            purchaseScreenshotDisplay.read(view);
        }

        public read() {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(setExitButtonEnabled setexitbuttonenabled) {
            super(setexitbuttonenabled);
            onGetStartedClick.write((Object) setexitbuttonenabled, "themesSlipPresenter");
        }
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "path");
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("share_slip_action");
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(ImageInfo.JPEG_MIME_TYPE);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", Uri.parse(str));
        Intent createChooser = Intent.createChooser(intent, getString(R.string.share_slip));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                createChooser = setTapText.write(activity, createChooser).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(createChooser.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(createChooser);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
