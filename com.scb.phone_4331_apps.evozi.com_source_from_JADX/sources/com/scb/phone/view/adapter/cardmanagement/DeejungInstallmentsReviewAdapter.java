package com.scb.phone.view.adapter.cardmanagement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.cardmanagement.TermsAndConditionsView;
import p040o.confirmPayment;
import p040o.getICheckDeserializerRtti;
import p040o.initializeApp;
import p040o.isDefaultApp;
import p040o.loadInBackground;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.verifyPurposefulFeatures;

public class DeejungInstallmentsReviewAdapter extends RecyclerView.IconCompatParcelizer {
    public initializeApp MediaBrowserCompat$ItemReceiver;
    public loadInBackground read;
    public verifyPurposefulFeatures write;

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return i;
    }

    public class InstallmentsHeaderViewHolder_ViewBinding implements Unbinder {
        private InstallmentsHeaderViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public InstallmentsHeaderViewHolder_ViewBinding(InstallmentsHeaderViewHolder installmentsHeaderViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = installmentsHeaderViewHolder;
            installmentsHeaderViewHolder.txvNickName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_type, "field 'txvNickName'", TextView.class);
            installmentsHeaderViewHolder.txvCardNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_number, "field 'txvCardNumber'", TextView.class);
            installmentsHeaderViewHolder.txvPurchaseAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.purchase_amount, "field 'txvPurchaseAmount'", TextView.class);
        }

        public final void read() {
            InstallmentsHeaderViewHolder installmentsHeaderViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (installmentsHeaderViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                installmentsHeaderViewHolder.txvNickName = null;
                installmentsHeaderViewHolder.txvCardNumber = null;
                installmentsHeaderViewHolder.txvPurchaseAmount = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class PaymentDetailsViewHolder_ViewBinding implements Unbinder {
        private PaymentDetailsViewHolder write;

        public PaymentDetailsViewHolder_ViewBinding(PaymentDetailsViewHolder paymentDetailsViewHolder, View view) {
            this.write = paymentDetailsViewHolder;
            paymentDetailsViewHolder.txvMerchName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.merchant_name_label, "field 'txvMerchName'", TextView.class);
            paymentDetailsViewHolder.txvAmountIncludingInterest = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_including_interest_value, "field 'txvAmountIncludingInterest'", TextView.class);
        }

        public final void read() {
            PaymentDetailsViewHolder paymentDetailsViewHolder = this.write;
            if (paymentDetailsViewHolder != null) {
                this.write = null;
                paymentDetailsViewHolder.txvMerchName = null;
                paymentDetailsViewHolder.txvAmountIncludingInterest = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class ReviewBottomViewHolder_ViewBinding implements Unbinder {
        private ReviewBottomViewHolder MediaBrowserCompat$ItemReceiver;

        public ReviewBottomViewHolder_ViewBinding(ReviewBottomViewHolder reviewBottomViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = reviewBottomViewHolder;
            reviewBottomViewHolder.txvTermAndConditions = (TermsAndConditionsView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.terms_and_conditions, "field 'txvTermAndConditions'", TermsAndConditionsView.class);
            reviewBottomViewHolder.confirmButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btn_confirm, "field 'confirmButton'", Button.class);
        }

        public final void read() {
            ReviewBottomViewHolder reviewBottomViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (reviewBottomViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                reviewBottomViewHolder.txvTermAndConditions = null;
                reviewBottomViewHolder.confirmButton = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class InstallmentsSummaryViewHolder_ViewBinding implements Unbinder {
        private InstallmentsSummaryViewHolder IconCompatParcelizer;

        public InstallmentsSummaryViewHolder_ViewBinding(InstallmentsSummaryViewHolder installmentsSummaryViewHolder, View view) {
            this.IconCompatParcelizer = installmentsSummaryViewHolder;
            installmentsSummaryViewHolder.txDuration = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.duration, "field 'txDuration'", TextView.class);
            installmentsSummaryViewHolder.txvInterestRate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.interest_rate, "field 'txvInterestRate'", TextView.class);
            installmentsSummaryViewHolder.txvInterestRateLable = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.interest_rate_label, "field 'txvInterestRateLable'", TextView.class);
            installmentsSummaryViewHolder.clMonthlyPaymentHolder = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.monthlyPaymentHolder, "field 'clMonthlyPaymentHolder'", ViewGroup.class);
            installmentsSummaryViewHolder.txTotalPayment = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvTotalPayment, "field 'txTotalPayment'", TextView.class);
            installmentsSummaryViewHolder.txPrincipal = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvPrincipal, "field 'txPrincipal'", TextView.class);
            installmentsSummaryViewHolder.txInterest = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvInterest, "field 'txInterest'", TextView.class);
            installmentsSummaryViewHolder.txMonthlyPayment = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvMonthlyPayment, "field 'txMonthlyPayment'", TextView.class);
            installmentsSummaryViewHolder.emailHolder = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.emailHolderConstraint, "field 'emailHolder'", ConstraintLayout.class);
            installmentsSummaryViewHolder.txEmail = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvEmail, "field 'txEmail'", TextView.class);
            installmentsSummaryViewHolder.txEmailRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvEmailDesc, "field 'txEmailRemark'", TextView.class);
        }

        public final void read() {
            InstallmentsSummaryViewHolder installmentsSummaryViewHolder = this.IconCompatParcelizer;
            if (installmentsSummaryViewHolder != null) {
                this.IconCompatParcelizer = null;
                installmentsSummaryViewHolder.txDuration = null;
                installmentsSummaryViewHolder.txvInterestRate = null;
                installmentsSummaryViewHolder.txvInterestRateLable = null;
                installmentsSummaryViewHolder.clMonthlyPaymentHolder = null;
                installmentsSummaryViewHolder.txTotalPayment = null;
                installmentsSummaryViewHolder.txPrincipal = null;
                installmentsSummaryViewHolder.txInterest = null;
                installmentsSummaryViewHolder.txMonthlyPayment = null;
                installmentsSummaryViewHolder.emailHolder = null;
                installmentsSummaryViewHolder.txEmail = null;
                installmentsSummaryViewHolder.txEmailRemark = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new InstallmentsHeaderViewHolder(from.inflate(R.layout.f91322131494359, viewGroup, false));
        }
        if (i == (this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat.size() + 3) - 2) {
            return new InstallmentsSummaryViewHolder(from.inflate(R.layout.f91342131494361, viewGroup, false));
        }
        if (i == (this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat.size() + 3) - 1) {
            return new ReviewBottomViewHolder(from.inflate(R.layout.f91772131494404, viewGroup, false));
        }
        return new PaymentDetailsViewHolder(from.inflate(R.layout.f91332131494360, viewGroup, false));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        Context context = setcontentview.write.getContext();
        if (setcontentview instanceof InstallmentsHeaderViewHolder) {
            InstallmentsHeaderViewHolder installmentsHeaderViewHolder = (InstallmentsHeaderViewHolder) setcontentview;
            installmentsHeaderViewHolder.txvNickName.setText(this.MediaBrowserCompat$ItemReceiver.RatingCompat);
            installmentsHeaderViewHolder.txvCardNumber.setText(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
            TextView textView = installmentsHeaderViewHolder.txvPurchaseAmount;
            String MediaBrowserCompat$ItemReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem);
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "amountDoubleWithTwoDecim…ator(totalPurchaseAmount)");
            textView.setText(MediaBrowserCompat$ItemReceiver2);
        } else if (setcontentview instanceof InstallmentsSummaryViewHolder) {
            InstallmentsSummaryViewHolder installmentsSummaryViewHolder = (InstallmentsSummaryViewHolder) setcontentview;
            installmentsSummaryViewHolder.txDuration.setText(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
            String str = "";
            if (this.MediaBrowserCompat$ItemReceiver.write != null) {
                TextView textView2 = installmentsSummaryViewHolder.txvInterestRate;
                initializeApp initializeapp = this.MediaBrowserCompat$ItemReceiver;
                if (initializeapp.setHasDecor != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(initializeapp.setHasDecor);
                    sb.append('%');
                    str = sb.toString();
                }
                textView2.setText(str);
                installmentsSummaryViewHolder.txvInterestRateLable.setText(context.getText(R.string.yearly_interest_rate_label));
                installmentsSummaryViewHolder.clMonthlyPaymentHolder.setVisibility(8);
            } else {
                TextView textView3 = installmentsSummaryViewHolder.txvInterestRate;
                initializeApp initializeapp2 = this.MediaBrowserCompat$ItemReceiver;
                if (initializeapp2.MediaBrowserCompat$SearchResultReceiver != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(initializeapp2.MediaBrowserCompat$SearchResultReceiver);
                    sb2.append('%');
                    str = sb2.toString();
                }
                textView3.setText(str);
                installmentsSummaryViewHolder.txvInterestRateLable.setText(context.getText(R.string.monthly_interest_rate_label));
                installmentsSummaryViewHolder.clMonthlyPaymentHolder.setVisibility(0);
                TextView textView4 = installmentsSummaryViewHolder.txMonthlyPayment;
                String MediaBrowserCompat$ItemReceiver3 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat);
                onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver3, "amountDoubleWithTwoDecim…Separator(monthlyPayment)");
                textView4.setText(MediaBrowserCompat$ItemReceiver3);
            }
            installmentsSummaryViewHolder.txInterest.setText(this.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo);
            installmentsSummaryViewHolder.txPrincipal.setText(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem);
            installmentsSummaryViewHolder.txTotalPayment.setText(this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper);
            if (this.MediaBrowserCompat$ItemReceiver.f2868x50fd9e4a != null) {
                installmentsSummaryViewHolder.emailHolder.setVisibility(0);
                installmentsSummaryViewHolder.txEmail.setText(this.MediaBrowserCompat$ItemReceiver.f2868x50fd9e4a);
                return;
            }
            installmentsSummaryViewHolder.emailHolder.setVisibility(8);
        } else if (setcontentview instanceof PaymentDetailsViewHolder) {
            isDefaultApp isdefaultapp = this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat.get(i - 1);
            PaymentDetailsViewHolder paymentDetailsViewHolder = (PaymentDetailsViewHolder) setcontentview;
            paymentDetailsViewHolder.txvMerchName.setText(isdefaultapp.read);
            paymentDetailsViewHolder.txvAmountIncludingInterest.setText(isdefaultapp.MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            ReviewBottomViewHolder reviewBottomViewHolder = (ReviewBottomViewHolder) setcontentview;
            reviewBottomViewHolder.txvTermAndConditions.setTermsAndConditionsListener(this.write);
            reviewBottomViewHolder.confirmButton.setEnabled(reviewBottomViewHolder.txvTermAndConditions.termsCheckBox.isChecked());
            reviewBottomViewHolder.txvTermAndConditions.setTermsCheckboxListener(new confirmPayment(reviewBottomViewHolder));
            reviewBottomViewHolder.confirmButton.setOnClickListener(this.read);
        }
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat.size() + 3;
    }

    public class InstallmentsHeaderViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView txvCardNumber;
        @BindView
        TextView txvNickName;
        @BindView
        TextView txvPurchaseAmount;

        public InstallmentsHeaderViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public class InstallmentsSummaryViewHolder extends RecyclerView.setContentView {
        @BindView
        ViewGroup clMonthlyPaymentHolder;
        @BindView
        ConstraintLayout emailHolder;
        @BindView
        TextView txDuration;
        @BindView
        TextView txEmail;
        @BindView
        TextView txEmailRemark;
        @BindView
        TextView txInterest;
        @BindView
        TextView txMonthlyPayment;
        @BindView
        TextView txPrincipal;
        @BindView
        TextView txTotalPayment;
        @BindView
        TextView txvInterestRate;
        @BindView
        TextView txvInterestRateLable;

        public InstallmentsSummaryViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public class PaymentDetailsViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView txvAmountIncludingInterest;
        @BindView
        TextView txvMerchName;

        public PaymentDetailsViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            TextView textView = this.txvMerchName;
            view.getResources();
            textView.setMaxLines(2);
        }
    }

    public class ReviewBottomViewHolder extends RecyclerView.setContentView {
        @BindView
        Button confirmButton;
        @BindView
        TermsAndConditionsView txvTermAndConditions;

        public ReviewBottomViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
