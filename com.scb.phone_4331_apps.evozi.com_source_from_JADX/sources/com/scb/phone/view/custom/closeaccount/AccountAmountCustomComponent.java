package com.scb.phone.view.custom.closeaccount;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomAmountRow;
import p040o.addDependency;

public class AccountAmountCustomComponent extends ConstraintLayout {
    @BindView
    CustomAmountRow amount;
    @BindView
    CustomAmountRow closingFee;
    @BindView
    CustomAmountRow fee;
    @BindView
    CustomAmountRow interest;
    @BindView
    TextView netAmount;
    @BindView
    public TextView netAmountButton;
    @BindView
    CustomAmountRow tax;

    public AccountAmountCustomComponent(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public AccountAmountCustomComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountAmountCustomComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.f81402131493366, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setDisplayData(addDependency adddependency) {
        this.amount.setAmount(adddependency.write);
        this.interest.setAmount(adddependency.MediaBrowserCompat$ItemReceiver);
        this.tax.setAmount(adddependency.MediaMetadataCompat);
        this.closingFee.setAmount(adddependency.read);
        this.fee.setAmount(adddependency.MediaBrowserCompat$CustomActionResultReceiver);
        this.netAmount.setText(adddependency.IconCompatParcelizer);
    }

    public void setButtonListener(View.OnClickListener onClickListener) {
        this.netAmountButton.setVisibility(0);
        this.netAmountButton.setClickable(true);
        this.netAmountButton.setOnClickListener(onClickListener);
    }
}
