package com.scb.phone.view.fragment.transferandpay.cardlessatm;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomCardlessWithdrawCodeItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class CardlessSuccessfulRequestFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CardlessSuccessfulRequestFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View RatingCompat;
    private View write;

    public CardlessSuccessfulRequestFragment_ViewBinding(final CardlessSuccessfulRequestFragment cardlessSuccessfulRequestFragment, View view) {
        super(cardlessSuccessfulRequestFragment, view);
        this.IconCompatParcelizer = cardlessSuccessfulRequestFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_save_request, "field 'mSaveRequestButton' and method 'onSaveRequestButtonClick'");
        cardlessSuccessfulRequestFragment.mSaveRequestButton = (Button) onStart.write(IconCompatParcelizer2, R.id.button_save_request, "field 'mSaveRequestButton'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CardlessSuccessfulRequestFragment.this.onSaveRequestButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_cancel_request, "field 'mCancelRequestButton' and method 'onCancelRequestButtonClick'");
        cardlessSuccessfulRequestFragment.mCancelRequestButton = (Button) onStart.write(IconCompatParcelizer3, R.id.button_cancel_request, "field 'mCancelRequestButton'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CardlessSuccessfulRequestFragment.this.onCancelRequestButtonClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.button_find_atm, "field 'mFindAtmButton' and method 'onFindAtmButtonClick'");
        cardlessSuccessfulRequestFragment.mFindAtmButton = (Button) onStart.write(IconCompatParcelizer4, R.id.button_find_atm, "field 'mFindAtmButton'", Button.class);
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CardlessSuccessfulRequestFragment.this.onFindAtmButtonClick();
            }
        });
        cardlessSuccessfulRequestFragment.customWithdrawCode = (CustomCardlessWithdrawCodeItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.withdraw_code, "field 'customWithdrawCode'", CustomCardlessWithdrawCodeItem.class);
        cardlessSuccessfulRequestFragment.mobileNo = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.mobile_no, "field 'mobileNo'", CustomTransferAndPayItem.class);
        cardlessSuccessfulRequestFragment.customSource = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cardless_source, "field 'customSource'", CustomTransferAndPaySource.class);
        cardlessSuccessfulRequestFragment.customAmount = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cardless_amount, "field 'customAmount'", CustomTransferAndPayItem.class);
        cardlessSuccessfulRequestFragment.withdrawCodeTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.textview_use_withdraw_code, "field 'withdrawCodeTextView'", TextView.class);
        cardlessSuccessfulRequestFragment.requestTimeTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.textview_date, "field 'requestTimeTextView'", TextView.class);
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.return_button, "field 'returnTextView' and method 'onReturnHomeClick'");
        cardlessSuccessfulRequestFragment.returnTextView = (TextView) onStart.write(IconCompatParcelizer5, R.id.return_button, "field 'returnTextView'", TextView.class);
        this.RatingCompat = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CardlessSuccessfulRequestFragment.this.onReturnHomeClick();
            }
        });
    }

    public final void read() {
        CardlessSuccessfulRequestFragment cardlessSuccessfulRequestFragment = this.IconCompatParcelizer;
        if (cardlessSuccessfulRequestFragment != null) {
            this.IconCompatParcelizer = null;
            cardlessSuccessfulRequestFragment.mSaveRequestButton = null;
            cardlessSuccessfulRequestFragment.mCancelRequestButton = null;
            cardlessSuccessfulRequestFragment.mFindAtmButton = null;
            cardlessSuccessfulRequestFragment.customWithdrawCode = null;
            cardlessSuccessfulRequestFragment.mobileNo = null;
            cardlessSuccessfulRequestFragment.customSource = null;
            cardlessSuccessfulRequestFragment.customAmount = null;
            cardlessSuccessfulRequestFragment.withdrawCodeTextView = null;
            cardlessSuccessfulRequestFragment.requestTimeTextView = null;
            cardlessSuccessfulRequestFragment.returnTextView = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.RatingCompat.setOnClickListener((View.OnClickListener) null);
            this.RatingCompat = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
