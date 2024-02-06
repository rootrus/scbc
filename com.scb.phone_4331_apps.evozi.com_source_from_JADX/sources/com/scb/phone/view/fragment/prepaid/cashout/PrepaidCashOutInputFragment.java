package com.scb.phone.view.fragment.prepaid.cashout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.onGetStartedClick;

public final class PrepaidCashOutInputFragment extends BaseFragment implements AmountEditText.read {
    public static final C6124x48a86f5b MediaBrowserCompat$CustomActionResultReceiver = new C6124x48a86f5b((byte) 0);
    /* access modifiers changed from: private */
    public read IconCompatParcelizer;
    @BindView
    public DefaultButton btnReview;
    @BindView
    public AmountEditText mAmountEditText;
    @BindView
    public NoteEditText mNoteEditText;

    public interface read {
        void MediaBrowserCompat$CustomActionResultReceiver(boolean z, String str);

        void write(String str);

        void write(String str, String str2);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f86022131493829, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        AmountEditText amountEditText = this.mAmountEditText;
        if (amountEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAmountEditText");
        }
        amountEditText.setMaximumDecimalDigit(13);
        AmountEditText amountEditText2 = this.mAmountEditText;
        if (amountEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAmountEditText");
        }
        amountEditText2.setOnAmountChangeListener(this);
        DefaultButton defaultButton = this.btnReview;
        if (defaultButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnReview");
        }
        defaultButton.setButtonEnabled(false);
        NoteEditText noteEditText = this.mNoteEditText;
        if (noteEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mNoteEditText");
        }
        noteEditText.setOnNoteInputListener(new PrepaidCashOutInputFragment$MediaBrowserCompat$ItemReceiver(this), "^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$", false);
        return inflate;
    }

    @OnClick
    public final void btnReviewClicked(View view) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        read read2 = this.IconCompatParcelizer;
        if (read2 != null) {
            AmountEditText amountEditText = this.mAmountEditText;
            if (amountEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAmountEditText");
            }
            String valueOf = String.valueOf(amountEditText.getText());
            NoteEditText noteEditText = this.mNoteEditText;
            if (noteEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mNoteEditText");
            }
            String obj = noteEditText.mNoteEditText.getText().toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj, "mNoteEditText.note");
            read2.write(valueOf, obj);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
        read read2 = this.IconCompatParcelizer;
        if (read2 != null) {
            AmountEditText amountEditText = this.mAmountEditText;
            if (amountEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAmountEditText");
            }
            read2.write(String.valueOf(amountEditText.getText()));
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        read read2 = this.IconCompatParcelizer;
        if (read2 != null) {
            AmountEditText amountEditText = this.mAmountEditText;
            if (amountEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAmountEditText");
            }
            read2.write(String.valueOf(amountEditText.getText()));
        }
        PlaybackStateCompat$CustomAction();
    }
}
