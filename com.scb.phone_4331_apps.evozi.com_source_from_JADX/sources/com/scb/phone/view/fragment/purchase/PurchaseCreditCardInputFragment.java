package com.scb.phone.view.fragment.purchase;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.purchase.PurchaseReviewActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.AmountEditText$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.ActivityBuilder_ContributeManageQrToPayActivity;
import p040o.ActivityBuilder_ContributeMwChangeCasaSuccessActivity;
import p040o.C4863jY;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FragmentBuilder_BindEasycashContactInformationFragment;
import p040o.HmlPinActivity;
import p040o.chain;
import p040o.getCarbonStrip;
import p040o.getICheckDeserializerRtti;
import p040o.setLastBaselineToBottomHeight;
import p040o.setUuidFromUtf8Bytes;

public class PurchaseCreditCardInputFragment extends BaseFragment implements getCarbonStrip.read {
    private CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder IconCompatParcelizer;
    private double MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    protected DefaultButton buttonReview;
    @BindView
    protected AmountEditText editAmount;
    @BindView
    protected ImageView imageIcon;
    @BindView
    protected TextInputLayout inputLayout;
    @BindView
    protected NoteEditText noteEditText;
    @HmlPinActivity
    public C4863jY purchaseCreditCardInputpresenter;
    @BindView
    protected TextView terminalId;
    @BindView
    protected TextView textNumber;
    @BindView
    protected TextView textTitle;

    public static PurchaseCreditCardInputFragment read(CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.TransferTabFragment.EXTRA_BILL_SCAN", builder);
        PurchaseCreditCardInputFragment purchaseCreditCardInputFragment = new PurchaseCreditCardInputFragment();
        purchaseCreditCardInputFragment.setArguments(bundle);
        return purchaseCreditCardInputFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89142131494141, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.purchaseCreditCardInputpresenter.MediaBrowserCompat$ItemReceiver(this);
        if (!(getArguments() == null || getArguments().getParcelable("com.scb.phone.TransferTabFragment.EXTRA_BILL_SCAN") == null)) {
            this.IconCompatParcelizer = (CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder) getArguments().getParcelable("com.scb.phone.TransferTabFragment.EXTRA_BILL_SCAN");
        }
        this.purchaseCreditCardInputpresenter.write = this.IconCompatParcelizer;
        Context context = getContext();
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, setLastBaselineToBottomHeight.write(getContext(), R.drawable.shop_large), this.imageIcon, this.IconCompatParcelizer.IconCompatParcelizer.write, context.getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(context, R.color.f66402131099796));
        this.textTitle.setVisibility(0);
        this.textTitle.setText(this.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver);
        this.textNumber.setVisibility(8);
        if (this.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$MediaItem != null && !this.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$MediaItem.isEmpty()) {
            this.terminalId.setVisibility(0);
            this.terminalId.setText(getString(R.string.terminal_id, this.IconCompatParcelizer.IconCompatParcelizer.RatingCompat, this.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$MediaItem));
        }
        if (!(this.IconCompatParcelizer.IconCompatParcelizer.MediaDescriptionCompat == null || Double.parseDouble(this.IconCompatParcelizer.IconCompatParcelizer.MediaDescriptionCompat) == 0.0d)) {
            this.MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.IconCompatParcelizer.MediaDescriptionCompat).doubleValue();
            this.editAmount.setFormattedAmount(this.IconCompatParcelizer.IconCompatParcelizer.MediaDescriptionCompat);
            this.editAmount.setEnabled(false);
        }
        this.buttonReview.setButtonEnabled(false);
        this.inputLayout.setVisibility(0);
        this.inputLayout.setHint("0.00");
        this.editAmount.setOnPasteListener(new AmountEditText$MediaBrowserCompat$ItemReceiver());
        this.editAmount.setMaximumDecimalDigit(17);
        this.editAmount.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                PurchaseCreditCardInputFragment.MediaBrowserCompat$CustomActionResultReceiver(PurchaseCreditCardInputFragment.this, d);
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                PurchaseCreditCardInputFragment.this.IconCompatParcelizer();
                PurchaseCreditCardInputFragment.this.PlaybackStateCompat$CustomAction();
            }
        });
        return inflate;
    }

    public final void IconCompatParcelizer(chain chain) {
        chain chain2 = chain;
        C4863jY jYVar = this.purchaseCreditCardInputpresenter;
        jYVar.MediaBrowserCompat$ItemReceiver = chain2.MediaDescriptionCompat;
        jYVar.IconCompatParcelizer = chain2.MediaSessionCompat$Token;
        jYVar.read = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(chain2.MediaBrowserCompat$CustomActionResultReceiver).doubleValue();
        C4863jY jYVar2 = this.purchaseCreditCardInputpresenter;
        double d = this.MediaBrowserCompat$CustomActionResultReceiver;
        this.buttonReview.setButtonEnabled(jYVar2.IconCompatParcelizer != null && d <= jYVar2.read && d > 0.0d);
        AmountEditText amountEditText = this.editAmount;
        amountEditText.setCurrencyFormattingTextWatcher(new FragmentBuilder_BindEasycashContactInformationFragment(amountEditText, this.inputLayout, getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(chain2.MediaBrowserCompat$CustomActionResultReceiver).doubleValue(), 0.0d, getResources().getString(R.string.error_limit), getResources().getString(R.string.not_enough_funds_on_selected_account), getResources().getString(R.string.scan_qr_credit_card_error_inline)));
        if (this.MediaBrowserCompat$CustomActionResultReceiver > this.purchaseCreditCardInputpresenter.read) {
            this.inputLayout.setError(getString(R.string.not_enough_funds_on_selected_account));
            this.inputLayout.setErrorEnabled(true);
            return;
        }
        this.inputLayout.setError((CharSequence) null);
        this.inputLayout.setErrorEnabled(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReviewButtonClick() {
        /*
            r8 = this;
            o.jY r0 = r8.purchaseCreditCardInputpresenter
            com.scb.phone.view.custom.common.NoteEditText r1 = r8.noteEditText
            android.widget.EditText r1 = r1.mNoteEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            T r2 = r0.RatingCompat
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0016
            r2 = r3
            goto L_0x0017
        L_0x0016:
            r2 = r4
        L_0x0017:
            if (r2 == 0) goto L_0x003e
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x003f
            java.lang.String r2 = "^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L_0x003f
            o.jH r1 = p040o.C10023jH.MediaBrowserCompat$ItemReceiver
            T r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r3 = r4
        L_0x0037:
            if (r3 == 0) goto L_0x003e
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
        L_0x003e:
            r3 = r4
        L_0x003f:
            if (r3 == 0) goto L_0x0075
            r8.PlaybackStateCompat$CustomAction()
            r8.AlertController$RecycleListView()
            o.jY r0 = r8.purchaseCreditCardInputpresenter
            double r1 = r8.MediaBrowserCompat$CustomActionResultReceiver
            com.scb.phone.view.custom.common.NoteEditText r3 = r8.noteEditText
            android.widget.EditText r3 = r3.mNoteEditText
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            o.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r4 = r0.write
            java.lang.String r4 = r4.MediaBrowserCompat$MediaItem
            java.lang.String r5 = r0.MediaBrowserCompat$ItemReceiver
            o.chooseTableSize r6 = new o.chooseTableSize
            java.lang.String r7 = p040o.removeIfFromRandomAccessList.read((double) r1)
            r6.<init>(r4, r5, r7)
            o.Splitter$5 r4 = r0.MediaBrowserCompat$SearchResultReceiver
            r4.MediaBrowserCompat$CustomActionResultReceiver(r6)
            o.Splitter$5 r4 = r0.MediaBrowserCompat$SearchResultReceiver
            o.jY$read r5 = new o.jY$read
            r5.<init>(r1, r3)
            r4.IconCompatParcelizer(r5)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.purchase.PurchaseCreditCardInputFragment.onReviewButtonClick():void");
    }

    public final void IconCompatParcelizer() {
        boolean z = true;
        if (this.MediaBrowserCompat$CustomActionResultReceiver == 0.0d || this.editAmount.getText().toString().isEmpty()) {
            this.inputLayout.setError(getString(R.string.scan_qr_credit_card_error_inline));
            this.inputLayout.setErrorEnabled(true);
            this.buttonReview.setButtonEnabled(false);
            return;
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver > this.purchaseCreditCardInputpresenter.read) {
            this.inputLayout.setError(getString(R.string.not_enough_funds_on_selected_account));
            this.inputLayout.setErrorEnabled(true);
            this.buttonReview.setButtonEnabled(false);
            return;
        }
        this.inputLayout.setError((CharSequence) null);
        this.inputLayout.setErrorEnabled(false);
        C4863jY jYVar = this.purchaseCreditCardInputpresenter;
        double d = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (jYVar.IconCompatParcelizer == null || d > jYVar.read || d <= 0.0d) {
            z = false;
        }
        this.buttonReview.setButtonEnabled(z);
    }

    public final void write() {
        this.noteEditText.write();
    }

    public final void IconCompatParcelizer(String str, String str2, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(str).MediaBrowserCompat$ItemReceiver(str2);
        CustomDialog IconCompatParcelizer2 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ok), new ActivityBuilder_ContributeMwChangeCasaSuccessActivity(this, setuuidfromutf8bytes));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), ActivityBuilder_ContributeManageQrToPayActivity.read).show();
    }

    public final void IconCompatParcelizer(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        PurchaseReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), setuuidfromutf8bytes, "creditcard");
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(PurchaseCreditCardInputFragment purchaseCreditCardInputFragment, double d) {
        purchaseCreditCardInputFragment.MediaBrowserCompat$CustomActionResultReceiver = d;
        C4863jY jYVar = purchaseCreditCardInputFragment.purchaseCreditCardInputpresenter;
        purchaseCreditCardInputFragment.buttonReview.setButtonEnabled(jYVar.IconCompatParcelizer != null && d <= jYVar.read && d > 0.0d);
    }
}
