package com.scb.phone.view.fragment.personalize;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class PersonalizeFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private PersonalizeFragment write;

    public PersonalizeFragment_ViewBinding(final PersonalizeFragment personalizeFragment, View view) {
        super(personalizeFragment, view);
        this.write = personalizeFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.add_quick_balance, "field 'addQuickBalance' and method 'addQuickBalance'");
        personalizeFragment.addQuickBalance = (RelativeLayout) onStart.write(IconCompatParcelizer2, R.id.add_quick_balance, "field 'addQuickBalance'", RelativeLayout.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PersonalizeFragment.this.addQuickBalance();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.add_prompt_pay, "field 'addPromptPay' and method 'addQuickPromptPay'");
        personalizeFragment.addPromptPay = (RelativeLayout) onStart.write(IconCompatParcelizer3, R.id.add_prompt_pay, "field 'addPromptPay'", RelativeLayout.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PersonalizeFragment.this.addQuickPromptPay();
            }
        });
        personalizeFragment.avatarQuickBalance = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_avatar_image_view_quick_balance, "field 'avatarQuickBalance'", ImageView.class);
        personalizeFragment.avatarPromtPay = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_avatar_image_view_promptpay, "field 'avatarPromtPay'", ImageView.class);
        personalizeFragment.favouriteTransferRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.favourite_transfer_recycler_view, "field 'favouriteTransferRecyclerView'", RecyclerView.class);
        personalizeFragment.favouriteTopUpRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.favourite_top_up_recycler_view, "field 'favouriteTopUpRecyclerView'", RecyclerView.class);
        personalizeFragment.favouriteBillPaymentRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.favourite_bill_payments_recycler_view, "field 'favouriteBillPaymentRecyclerView'", RecyclerView.class);
        personalizeFragment.favouriteRemittanceRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.favourite_remittance_recycler_view, "field 'favouriteRemittanceRecyclerView'", RecyclerView.class);
        personalizeFragment.transferTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_title, "field 'transferTitle'", TextView.class);
        personalizeFragment.topUpTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.top_up_title, "field 'topUpTitle'", TextView.class);
        personalizeFragment.billPaymentTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bill_payment_title, "field 'billPaymentTitle'", TextView.class);
        personalizeFragment.remittanceTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_title, "field 'remittanceTitle'", TextView.class);
        personalizeFragment.remittanceContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_container, "field 'remittanceContainer'", LinearLayout.class);
        personalizeFragment.mFavouriteTopUpEmpty = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.favourite_empty_top_up, "field 'mFavouriteTopUpEmpty'", LinearLayout.class);
        personalizeFragment.mFavouriteBillPaymentEmpty = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.favourite_empty_bill_payments, "field 'mFavouriteBillPaymentEmpty'", LinearLayout.class);
        personalizeFragment.mFavouriteTransferEmpty = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.favourite_empty_transfer, "field 'mFavouriteTransferEmpty'", LinearLayout.class);
        personalizeFragment.mFavouriteRemittanceEmpty = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.favourite_empty_remittance, "field 'mFavouriteRemittanceEmpty'", LinearLayout.class);
    }

    public final void read() {
        PersonalizeFragment personalizeFragment = this.write;
        if (personalizeFragment != null) {
            this.write = null;
            personalizeFragment.addQuickBalance = null;
            personalizeFragment.addPromptPay = null;
            personalizeFragment.avatarQuickBalance = null;
            personalizeFragment.avatarPromtPay = null;
            personalizeFragment.favouriteTransferRecyclerView = null;
            personalizeFragment.favouriteTopUpRecyclerView = null;
            personalizeFragment.favouriteBillPaymentRecyclerView = null;
            personalizeFragment.favouriteRemittanceRecyclerView = null;
            personalizeFragment.transferTitle = null;
            personalizeFragment.topUpTitle = null;
            personalizeFragment.billPaymentTitle = null;
            personalizeFragment.remittanceTitle = null;
            personalizeFragment.remittanceContainer = null;
            personalizeFragment.mFavouriteTopUpEmpty = null;
            personalizeFragment.mFavouriteBillPaymentEmpty = null;
            personalizeFragment.mFavouriteTransferEmpty = null;
            personalizeFragment.mFavouriteRemittanceEmpty = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
