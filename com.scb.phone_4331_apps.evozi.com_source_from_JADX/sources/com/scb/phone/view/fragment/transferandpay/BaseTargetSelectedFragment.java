package com.scb.phone.view.fragment.transferandpay;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.ReviewActivity;
import com.scb.phone.view.custom.ScbEditText;
import com.scb.phone.view.custom.ScbTextInputLayout;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.AmountEditText$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayBiller;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.concurrent.TimeUnit;
import p040o.ActivityBuilder_ContributeScbBillPaymentDeeplinkActivity;
import p040o.ActivityBuilder_ContributesEStatementsSuccessfulActivity;
import p040o.ActivityBuilder_ContributesHmlBusinessOwnerLoanSetupActivity;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.CrashlyticsReport;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindBillPaymentTabFragment;
import p040o.FragmentBuilder_BindEasycashContactInformationFragment;
import p040o.HmlETBLandingActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getICheckDeserializerRtti;
import p040o.parseEventSignal;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public abstract class BaseTargetSelectedFragment extends BaseDuplicatedTransferFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer, FragmentBuilder_BindBillPaymentTabFragment, AccountSourceSelectFragment.write {
    public Double IconCompatParcelizer = Double.valueOf(-1.0d);
    public parseEventSignal MediaBrowserCompat$MediaItem;
    public BulkTransferDeepLinkActivity MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String RatingCompat;
    @BindView
    public ScbTextInputLayout mAmountInputLayout;
    @BindView
    public AmountEditText mAmountValue;
    @BindView
    public DefaultButton mButton;
    @BindView
    public CustomTransferAndPayBiller mCustomTransferAndPayBiller;
    @BindView
    public View mDivider;
    @BindView
    protected ViewGroup mLimitProgress;
    @BindView
    public RecyclerView mRecyclerView;
    @BindView
    public ScbEditText mReferenceEditText1;
    @BindView
    public ScbEditText mReferenceEditText2;
    @BindView
    public ScbEditText mReferenceEditText3;
    @BindView
    public TextView mReferenceTextView1;
    @BindView
    public TextView mReferenceTextView2;
    @BindView
    public TextView mReferenceTextView3;
    @BindView
    public TextView mRemainingLimit;
    @BindView
    public NoteEditText noteEditText;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public /* synthetic */ void mo13978c_(boolean z) {
    }

    /* access modifiers changed from: protected */
    public abstract void read(CrashlyticsReport.FilesPayload.File.Builder builder);

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.MediaBrowserCompat$SearchResultReceiver = DebitCardResetOtpActivity.interval(1, TimeUnit.SECONDS).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new ActivityBuilder_ContributeScbBillPaymentDeeplinkActivity(this), ActivityBuilder_ContributesHmlBusinessOwnerLoanSetupActivity.write);
        AmountEditText amountEditText = this.mAmountValue;
        amountEditText.setCurrencyFormattingTextWatcher(new FragmentBuilder_BindEasycashContactInformationFragment(amountEditText, this.mAmountInputLayout, 9.9999999999E8d, 0.0d, getResources().getString(R.string.error_limit), getResources().getString(R.string.not_enough_funds_on_selected_account)));
        this.mAmountValue.setOnPasteListener(new AmountEditText$MediaBrowserCompat$ItemReceiver());
        this.mAmountValue.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                BaseTargetSelectedFragment.this.PlaybackStateCompat$CustomAction();
            }
        });
        this.mAmountValue.setHandleDismissKeyboard(new ActivityBuilder_ContributesEStatementsSuccessfulActivity(this));
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean AppCompatDelegateImpl$ListMenuDecorView() {
        return this.mReferenceEditText1.getText() != null && !this.mReferenceEditText1.getText().toString().isEmpty();
    }

    public boolean AppCompatDialogFragment() {
        String str = this.RatingCompat;
        return str != null && !str.isEmpty() && !this.mAmountInputLayout.MediaBrowserCompat$MediaItem.IconCompatParcelizer && !getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(this.mAmountValue.getText().toString());
    }

    /* access modifiers changed from: protected */
    public void IconCompatParcelizer(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        Intent intent = new Intent(getActivity(), ReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        aj_();
    }

    public void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Builder builder) {
        this.mCustomTransferAndPayBiller.setTitle(builder.read());
        this.mCustomTransferAndPayBiller.setAvatar(builder.MediaBrowserCompat$CustomActionResultReceiver());
        this.mCustomTransferAndPayBiller.setOnCustomTransferAndPayItemListener(this);
    }

    public void aD_() {
        Intent intent = new Intent();
        intent.setAction(this.MediaDescriptionCompat);
        getContext().sendBroadcast(intent);
    }

    /* access modifiers changed from: protected */
    public final void setContentView() {
        ViewGroup viewGroup = this.mLimitProgress;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public final void AppCompatActivity() {
        ViewGroup viewGroup = this.mLimitProgress;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        read(builder);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r4.AppCompatDialogFragment() != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r4.AppCompatDialogFragment() != false) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void read(com.scb.phone.view.fragment.transferandpay.BaseTargetSelectedFragment r4) {
        /*
            o.parseEventSignal r0 = r4.MediaBrowserCompat$MediaItem
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r0.PlaybackStateCompat$CustomAction
            java.lang.String r3 = "PREPAID"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0036
            com.scb.phone.view.custom.ScbEditText r0 = r4.mReferenceEditText1
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x002c
            com.scb.phone.view.custom.ScbEditText r0 = r4.mReferenceEditText1
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r3 = 16
            if (r0 != r3) goto L_0x002c
            r0 = r2
            goto L_0x002d
        L_0x002c:
            r0 = r1
        L_0x002d:
            if (r0 == 0) goto L_0x0043
            boolean r0 = r4.AppCompatDialogFragment()
            if (r0 != 0) goto L_0x0042
            goto L_0x0043
        L_0x0036:
            boolean r0 = r4.AppCompatDelegateImpl$ListMenuDecorView()
            if (r0 == 0) goto L_0x0043
            boolean r0 = r4.AppCompatDialogFragment()
            if (r0 == 0) goto L_0x0043
        L_0x0042:
            r1 = r2
        L_0x0043:
            com.scb.phone.view.custom.common.DefaultButton r0 = r4.mButton
            boolean r0 = r0.isEnabled()
            if (r0 == r1) goto L_0x0050
            com.scb.phone.view.custom.common.DefaultButton r4 = r4.mButton
            r4.setButtonEnabled(r1)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.transferandpay.BaseTargetSelectedFragment.read(com.scb.phone.view.fragment.transferandpay.BaseTargetSelectedFragment):void");
    }
}
