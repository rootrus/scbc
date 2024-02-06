package com.scb.phone.view.fragment.transferandpay.cardlessatm;

import android.widget.TextView;
import butterknife.BindView;
import com.scb.phone.view.custom.transferandpay.CustomCardlessWithdrawCodeItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;

public class CardlessSuccessScreenshotFragment {
    @BindView
    public CustomTransferAndPayItem customAmount;
    @BindView
    public CustomTransferAndPaySource customSource;
    @BindView
    public CustomCardlessWithdrawCodeItem customWithdrawCode;
    @BindView
    public CustomTransferAndPayItem mobileNo;
    @BindView
    public TextView requestTime;
}
