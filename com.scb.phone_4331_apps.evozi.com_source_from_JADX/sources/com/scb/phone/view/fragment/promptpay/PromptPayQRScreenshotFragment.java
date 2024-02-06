package com.scb.phone.view.fragment.promptpay;

import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;

public class PromptPayQRScreenshotFragment {
    @BindView
    public CustomTransferAndPayItem accountNumberCustomTarget;
    @BindView
    public TextView amountTextView;
    @BindView
    public TextView payerSpecifyAmountTextView;
    @BindView
    public ImageView qrCodeImageView;
}
