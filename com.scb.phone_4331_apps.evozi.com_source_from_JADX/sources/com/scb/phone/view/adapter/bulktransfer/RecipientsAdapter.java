package com.scb.phone.view.adapter.bulktransfer;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import java.util.List;
import p040o.C10880GoogleSigninApi;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.UncaughtExceptionHandlers;
import p040o.getICheckDeserializerRtti;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;
import p040o.verifyUser;

public final class RecipientsAdapter extends RecyclerView.IconCompatParcelizer<RecipientsHolder> {
    public read MediaBrowserCompat$ItemReceiver;
    public List<UncaughtExceptionHandlers> read;

    public interface read {
        void IconCompatParcelizer();

        void write();
    }

    public class RecipientsHolder_ViewBinding implements Unbinder {
        private RecipientsHolder write;

        public RecipientsHolder_ViewBinding(RecipientsHolder recipientsHolder, View view) {
            this.write = recipientsHolder;
            recipientsHolder.logo = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.logo_image_view, "field 'logo'", ImageView.class);
            recipientsHolder.accountName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_name_text_view, "field 'accountName'", TextView.class);
            recipientsHolder.accountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_number_text_view, "field 'accountNumber'", TextView.class);
            recipientsHolder.recipientSelected = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recipient_selected_checkbox, "field 'recipientSelected'", CheckBox.class);
            recipientsHolder.error = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_text_view, "field 'error'", TextView.class);
            recipientsHolder.amountEditText = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_edit_text, "field 'amountEditText'", AmountEditText.class);
        }

        public final void read() {
            RecipientsHolder recipientsHolder = this.write;
            if (recipientsHolder != null) {
                this.write = null;
                recipientsHolder.logo = null;
                recipientsHolder.accountName = null;
                recipientsHolder.accountNumber = null;
                recipientsHolder.recipientSelected = null;
                recipientsHolder.error = null;
                recipientsHolder.amountEditText = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        RecipientsHolder recipientsHolder = (RecipientsHolder) setcontentview;
        UncaughtExceptionHandlers uncaughtExceptionHandlers = this.read.get(i);
        read read2 = this.MediaBrowserCompat$ItemReceiver;
        recipientsHolder.AlertController$RecycleListView = uncaughtExceptionHandlers;
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(recipientsHolder.setHasDecor.getContext(), (int) R.drawable.shape_circle_lighter_gray_background, recipientsHolder.logo, uncaughtExceptionHandlers.IconCompatParcelizer, recipientsHolder.setHasDecor.getContext().getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(recipientsHolder.write.getContext(), R.color.f66402131099796));
        recipientsHolder.accountName.setText(uncaughtExceptionHandlers.MediaMetadataCompat);
        recipientsHolder.accountNumber.setText(uncaughtExceptionHandlers.read);
        recipientsHolder.Keep = null;
        recipientsHolder.recipientSelected.setChecked(uncaughtExceptionHandlers.MediaBrowserCompat$MediaItem);
        recipientsHolder.amountEditText.setFormattedAmount(uncaughtExceptionHandlers.MediaBrowserCompat$ItemReceiver);
        recipientsHolder.Keep = read2;
        recipientsHolder.MediaBrowserCompat$CustomActionResultReceiver(uncaughtExceptionHandlers.MediaBrowserCompat$SearchResultReceiver);
    }

    public RecipientsAdapter(List<UncaughtExceptionHandlers> list) {
        this.read = list;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public static class RecipientsHolder extends RecyclerView.setContentView {
        public UncaughtExceptionHandlers AlertController$RecycleListView;
        public read Keep;
        @BindView
        TextView accountName;
        @BindView
        TextView accountNumber;
        @BindView
        public AmountEditText amountEditText;
        @BindView
        TextView error;
        @BindView
        ImageView logo;
        @BindView
        CheckBox recipientSelected;
        View setHasDecor;

        RecipientsHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.setHasDecor = view;
            this.recipientSelected.setOnCheckedChangeListener(new C10880GoogleSigninApi(this));
            this.amountEditText.setOnFocusChangeListener(new verifyUser(this));
            this.amountEditText.setOnAmountChangeListener(new AmountEditText.read() {
                public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                    if (RecipientsHolder.this.Keep != null) {
                        String obj = RecipientsHolder.this.amountEditText.getText().toString();
                        RecipientsHolder.this.write(obj);
                        RecipientsHolder.this.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver = obj;
                        RecipientsHolder.this.Keep.write();
                    }
                }

                public final void MediaBrowserCompat$CustomActionResultReceiver() {
                    if (RecipientsHolder.this.Keep != null) {
                        RecipientsHolder.this.Keep.IconCompatParcelizer();
                    }
                }
            });
            this.amountEditText.setMaximumDecimalDigit(15);
        }

        public final void write(String str) {
            if (TextUtils.isEmpty(str)) {
                MediaBrowserCompat$CustomActionResultReceiver(this.amountEditText.getResources().getString(R.string.incomplete_information));
            } else if (getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str).doubleValue() == 0.0d) {
                MediaBrowserCompat$CustomActionResultReceiver(this.amountEditText.getResources().getString(R.string.incorrect_amount));
            } else {
                MediaBrowserCompat$CustomActionResultReceiver("");
            }
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
            if (TextUtils.isEmpty(str)) {
                this.amountEditText.setInvalidAmount(false);
                this.error.setVisibility(8);
            } else {
                this.amountEditText.setInvalidAmount(true);
                this.error.setVisibility(0);
            }
            this.AlertController$RecycleListView.MediaBrowserCompat$SearchResultReceiver = str;
            this.error.setText(str);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new RecipientsHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83642131493590, viewGroup, false));
    }
}
