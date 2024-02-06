package com.scb.phone.view.adapter.hml;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.bumptech.glide.Glide;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDeltaInput$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.custom.common.CustomDeltaInputPressed;
import com.scb.phone.view.custom.hml.CustomLoanSuccessInformation;
import com.scb.phone.view.fragment.hml.C6009x7f2cab88;
import java.util.List;
import java.util.NoSuchElementException;
import p040o.CrashlyticsController;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindCardlessWithdrawAmountFragment;
import p040o.abandon;
import p040o.createGroup;
import p040o.deleteGroup;
import p040o.deleteRecipient;
import p040o.editRecipient;
import p040o.getDataGroups;
import p040o.getICheckDeserializerRtti;
import p040o.getNextTransition;
import p040o.getRecipients;
import p040o.isReset;
import p040o.loadInBackground;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.show;
import p040o.updateNameGroup;
import p040o.verifyBulkTransfer;
import p040o.writeNonFatalEventsTo;

public final class HmlOutcomeCounterAdapter extends RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> {
    private List<loadInBackground> MediaBrowserCompat$ItemReceiver;
    private FragmentBuilder_BindCardlessWithdrawAmountFragment read;
    private C6009x7f2cab88 write;

    public class CounterOfferViewHolder_ViewBinding implements Unbinder {
        private CounterOfferViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public CounterOfferViewHolder_ViewBinding(CounterOfferViewHolder counterOfferViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = counterOfferViewHolder;
            counterOfferViewHolder.headerTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_loaninfo_header_title, "field 'headerTitle'", TextView.class);
            counterOfferViewHolder.headerSeparator = onStart.IconCompatParcelizer(view, R.id.v_separator, "field 'headerSeparator'");
            counterOfferViewHolder.loanInfo = (CustomLoanSuccessInformation) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.clsi_counter_loaninfo, "field 'loanInfo'", CustomLoanSuccessInformation.class);
            counterOfferViewHolder.acceptButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_accept, "field 'acceptButton'", Button.class);
        }

        public final void read() {
            CounterOfferViewHolder counterOfferViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (counterOfferViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                counterOfferViewHolder.headerTitle = null;
                counterOfferViewHolder.headerSeparator = null;
                counterOfferViewHolder.loanInfo = null;
                counterOfferViewHolder.acceptButton = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class UpsellOfferViewHolder_ViewBinding implements Unbinder {
        private UpsellOfferViewHolder IconCompatParcelizer;

        public UpsellOfferViewHolder_ViewBinding(UpsellOfferViewHolder upsellOfferViewHolder, View view) {
            this.IconCompatParcelizer = upsellOfferViewHolder;
            upsellOfferViewHolder.headerTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_upsell_header_title, "field 'headerTitle'", TextView.class);
            upsellOfferViewHolder.upsellIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_upsell_icon, "field 'upsellIcon'", ImageView.class);
            upsellOfferViewHolder.upsellDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_upsell_description, "field 'upsellDescription'", TextView.class);
            upsellOfferViewHolder.loanAmount = (CustomDeltaInputPressed) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cdi_loan_amount, "field 'loanAmount'", CustomDeltaInputPressed.class);
            upsellOfferViewHolder.loanAmountRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_loanamount_remark, "field 'loanAmountRemark'", TextView.class);
            upsellOfferViewHolder.acceptBtn = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_accept, "field 'acceptBtn'", Button.class);
        }

        public final void read() {
            UpsellOfferViewHolder upsellOfferViewHolder = this.IconCompatParcelizer;
            if (upsellOfferViewHolder != null) {
                this.IconCompatParcelizer = null;
                upsellOfferViewHolder.headerTitle = null;
                upsellOfferViewHolder.upsellIcon = null;
                upsellOfferViewHolder.upsellDescription = null;
                upsellOfferViewHolder.loanAmount = null;
                upsellOfferViewHolder.loanAmountRemark = null;
                upsellOfferViewHolder.acceptBtn = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public HmlOutcomeCounterAdapter(List<loadInBackground> list, FragmentBuilder_BindCardlessWithdrawAmountFragment fragmentBuilder_BindCardlessWithdrawAmountFragment, C6009x7f2cab88 hmlOutcomeCounterOfferFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$ItemReceiver = list;
        this.read = fragmentBuilder_BindCardlessWithdrawAmountFragment;
        this.write = hmlOutcomeCounterOfferFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        return i != 2 ? new CounterOfferViewHolder(from.inflate(R.layout.f83032131493529, viewGroup, false)) : new UpsellOfferViewHolder(from.inflate(R.layout.f83042131493530, viewGroup, false));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof CounterOfferViewHolder) {
            CounterOfferViewHolder counterOfferViewHolder = (CounterOfferViewHolder) setcontentview;
            writeNonFatalEventsTo writenonfataleventsto = (writeNonFatalEventsTo) this.MediaBrowserCompat$ItemReceiver.get(i);
            FragmentBuilder_BindCardlessWithdrawAmountFragment fragmentBuilder_BindCardlessWithdrawAmountFragment = this.read;
            if (writenonfataleventsto.MediaDescriptionCompat != null) {
                counterOfferViewHolder.headerTitle.setText(writenonfataleventsto.MediaDescriptionCompat);
                counterOfferViewHolder.headerTitle.setVisibility(0);
                counterOfferViewHolder.headerSeparator.setVisibility(0);
            }
            if (writenonfataleventsto.IconCompatParcelizer != null) {
                counterOfferViewHolder.loanInfo.setIcon(writenonfataleventsto.IconCompatParcelizer);
            } else {
                ImageView imageView = counterOfferViewHolder.loanInfo.counterIcon;
                if (imageView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("counterIcon");
                }
                imageView.setVisibility(8);
            }
            counterOfferViewHolder.loanInfo.setAmountTitle(writenonfataleventsto.MediaBrowserCompat$CustomActionResultReceiver);
            counterOfferViewHolder.loanInfo.setAmount(writenonfataleventsto.MediaBrowserCompat$ItemReceiver);
            counterOfferViewHolder.loanInfo.setRepayment(writenonfataleventsto.read);
            CustomLoanSuccessInformation customLoanSuccessInformation = counterOfferViewHolder.loanInfo;
            customLoanSuccessInformation.setRepaymentTitle(customLoanSuccessInformation.getContext().getString(R.string.hml_outcome_counter_installments_title));
            if (writenonfataleventsto.write != null) {
                CustomLoanSuccessInformation customLoanSuccessInformation2 = counterOfferViewHolder.loanInfo;
                show IconCompatParcelizer = show.IconCompatParcelizer((T[]) new CrashlyticsReport.FilesPayload.Builder[]{writenonfataleventsto.write});
                show MediaBrowserCompat$CustomActionResultReceiver = new show(IconCompatParcelizer.write, new getNextTransition(IconCompatParcelizer.IconCompatParcelizer, editRecipient.MediaBrowserCompat$ItemReceiver)).MediaBrowserCompat$CustomActionResultReceiver(1);
                if (MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.hasNext()) {
                    Object next = MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.next();
                    if (!MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.hasNext()) {
                        customLoanSuccessInformation2.setPromotion((CrashlyticsReport.FilesPayload.Builder) next);
                        TextView textView = counterOfferViewHolder.loanInfo.promotion.remark;
                        if (textView == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("remark");
                        }
                        View view = textView;
                        onGetStartedClick.write((Object) view, "$this$isVisible");
                        view.setVisibility(8);
                        TextView textView2 = counterOfferViewHolder.loanInfo.promotion.promo;
                        if (textView2 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("promo");
                        }
                        View view2 = textView2;
                        onGetStartedClick.write((Object) view2, "$this$isVisible");
                        view2.setVisibility(8);
                    } else {
                        throw new IllegalStateException("Stream contains more than one element");
                    }
                } else {
                    throw new NoSuchElementException("Stream contains no element");
                }
            }
            counterOfferViewHolder.acceptButton.setOnClickListener(new createGroup(counterOfferViewHolder, fragmentBuilder_BindCardlessWithdrawAmountFragment));
        } else if (setcontentview instanceof UpsellOfferViewHolder) {
            UpsellOfferViewHolder upsellOfferViewHolder = (UpsellOfferViewHolder) setcontentview;
            CrashlyticsController.C321911 r10 = (CrashlyticsController.C321911) this.MediaBrowserCompat$ItemReceiver.get(i);
            C6009x7f2cab88 hmlOutcomeCounterOfferFragment$MediaBrowserCompat$CustomActionResultReceiver = this.write;
            Glide.MediaBrowserCompat$CustomActionResultReceiver((View) upsellOfferViewHolder.upsellIcon).MediaBrowserCompat$ItemReceiver(r10.write).MediaBrowserCompat$ItemReceiver((abandon<?>) new isReset().IconCompatParcelizer((int) R.drawable.ic_offer_icon_placeholder)).MediaBrowserCompat$ItemReceiver(upsellOfferViewHolder.upsellIcon);
            upsellOfferViewHolder.headerTitle.setText(r10.MediaBrowserCompat$MediaItem);
            upsellOfferViewHolder.upsellDescription.setText(r10.MediaBrowserCompat$CustomActionResultReceiver);
            upsellOfferViewHolder.loanAmount.setHint(R.string.auto_app_outcome_upselling_custom_placeholder);
            upsellOfferViewHolder.loanAmount.setMaxValue(r10.read);
            upsellOfferViewHolder.loanAmount.setMinValue(r10.IconCompatParcelizer);
            upsellOfferViewHolder.loanAmount.setDelta(r10.MediaBrowserCompat$ItemReceiver);
            upsellOfferViewHolder.loanAmount.container.setBackgroundResource(R.color.f71012131100257);
            upsellOfferViewHolder.loanAmount.setOnValueChangedListener(new updateNameGroup(upsellOfferViewHolder, r10));
            upsellOfferViewHolder.loanAmount.setOnKeyboardDoneListener(new deleteGroup(upsellOfferViewHolder));
            upsellOfferViewHolder.loanAmount.setOnDismissKeyboardListener(new getDataGroups(upsellOfferViewHolder));
            upsellOfferViewHolder.loanAmount.setOnClickInputAmountListener(new getRecipients(upsellOfferViewHolder));
            upsellOfferViewHolder.loanAmount.setOnIncrementChangeListener(new CustomDeltaInput$MediaBrowserCompat$CustomActionResultReceiver() {
                public final void MediaSessionCompat$Token() {
                    UpsellOfferViewHolder.this.PlaybackStateCompat.removeCallbacks(UpsellOfferViewHolder.this.Keep);
                    UpsellOfferViewHolder.this.PlaybackStateCompat.postDelayed(UpsellOfferViewHolder.this.Keep, 2000);
                }

                /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
                public final void mo13975x50fd9e4a() {
                    UpsellOfferViewHolder.this.PlaybackStateCompat.removeCallbacks(UpsellOfferViewHolder.this.Keep);
                    UpsellOfferViewHolder.this.PlaybackStateCompat.postDelayed(UpsellOfferViewHolder.this.Keep, 2000);
                }
            });
            upsellOfferViewHolder.loanAmountRemark.setText(upsellOfferViewHolder.loanAmount.getContext().getString(R.string.auto_app_outcome_upselling_custom_remarks, new Object[]{getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(r10.IconCompatParcelizer), getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(r10.read)}));
            upsellOfferViewHolder.acceptBtn.setOnClickListener(new verifyBulkTransfer(upsellOfferViewHolder, hmlOutcomeCounterOfferFragment$MediaBrowserCompat$CustomActionResultReceiver));
        }
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        loadInBackground loadinbackground = this.MediaBrowserCompat$ItemReceiver.get(i);
        if (loadinbackground instanceof writeNonFatalEventsTo) {
            return 1;
        }
        return loadinbackground instanceof CrashlyticsController.C321911 ? 2 : 0;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public class CounterOfferViewHolder extends RecyclerView.setContentView {
        @BindView
        Button acceptButton;
        @BindView
        View headerSeparator;
        @BindView
        TextView headerTitle;
        @BindView
        CustomLoanSuccessInformation loanInfo;

        public CounterOfferViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public class UpsellOfferViewHolder extends RecyclerView.setContentView {
        public Runnable Keep = new deleteRecipient(this);
        public Handler PlaybackStateCompat = new Handler();
        @BindView
        public Button acceptBtn;
        @BindView
        public TextView headerTitle;
        @BindView
        public CustomDeltaInputPressed loanAmount;
        @BindView
        public TextView loanAmountRemark;
        @BindView
        TextView upsellDescription;
        @BindView
        ImageView upsellIcon;

        public UpsellOfferViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
