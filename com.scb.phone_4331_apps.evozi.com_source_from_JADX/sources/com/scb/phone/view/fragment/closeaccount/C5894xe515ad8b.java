package com.scb.phone.view.fragment.closeaccount;

import android.view.View;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.closeaccount.AmountDetailsSuccessAdapter;
import com.scb.phone.view.fragment.closeaccount.CloseAccountSuccessFragment;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindEBillSelectedFragment;
import p040o.setExitButtonEnabled;

/* renamed from: com.scb.phone.view.fragment.closeaccount.CloseAccountSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver */
class C5894xe515ad8b extends FragmentBuilder_BindEBillSelectedFragment<CloseAccountSuccessFragment.CloseAccountSuccessfulDisplay> {
    public final /* synthetic */ void write(ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, View view) {
        CloseAccountSuccessFragment.CloseAccountSuccessfulDisplay closeAccountSuccessfulDisplay = (CloseAccountSuccessFragment.CloseAccountSuccessfulDisplay) simpleForwardingListenableFuture;
        ButterKnife.IconCompatParcelizer(closeAccountSuccessfulDisplay, view);
        closeAccountSuccessfulDisplay.tvSuccessTitle.setText(CloseAccountSuccessFragment.this.getString(R.string.close_account_deposit_account_closed));
        closeAccountSuccessfulDisplay.tvTransactionDate.setText(closeAccountSuccessfulDisplay.IconCompatParcelizer.RatingCompat);
        closeAccountSuccessfulDisplay.tvReferenceId.setText(CloseAccountSuccessFragment.this.getString(R.string.reference_id, closeAccountSuccessfulDisplay.IconCompatParcelizer.MediaBrowserCompat$MediaItem));
        closeAccountSuccessfulDisplay.tvReferenceId.setVisibility(0);
        closeAccountSuccessfulDisplay.tvSuccessDescription.setVisibility(8);
        closeAccountSuccessfulDisplay.successInformation.setData(closeAccountSuccessfulDisplay.IconCompatParcelizer.IconCompatParcelizer);
        closeAccountSuccessfulDisplay.accountAmountComponent.setDisplayData(closeAccountSuccessfulDisplay.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
        closeAccountSuccessfulDisplay.accountAmountComponent.netAmountButton.setVisibility(8);
        closeAccountSuccessfulDisplay.receivingAccountData.setDisplay(closeAccountSuccessfulDisplay.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
        if (closeAccountSuccessfulDisplay.IconCompatParcelizer.write == null || closeAccountSuccessfulDisplay.IconCompatParcelizer.write.isEmpty()) {
            closeAccountSuccessfulDisplay.layoutDepositDetails.setVisibility(8);
            return;
        }
        closeAccountSuccessfulDisplay.layoutDepositDetails.setVisibility(0);
        CloseAccountSuccessFragment.this.getContext();
        closeAccountSuccessfulDisplay.recyclerView.setAdapter(new AmountDetailsSuccessAdapter(closeAccountSuccessfulDisplay.IconCompatParcelizer.write));
    }

    public C5894xe515ad8b(setExitButtonEnabled setexitbuttonenabled) {
        super(setexitbuttonenabled);
    }
}
