package com.scb.phone.view.fragment.investment;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.view.custom.common.CustomSwitchItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import p040o.isBuildIdValid;

public class BaseInvestmentSwitchSuccessReviewFragment extends BaseInvestmentSuccessReviewFragment {
    @BindView
    CustomTransferAndPayItem defaultFee;
    @BindView
    RelativeLayout effectiveDate;
    @BindView
    public CustomSwitchItem switchDate;
    @BindView
    CustomSwitchItem switchFee;

    public final void read(isBuildIdValid isbuildidvalid, View view, Context context, String str) {
        ButterKnife.IconCompatParcelizer(this, view);
        super.read(isbuildidvalid, view, context, str);
        if (isbuildidvalid.ParcelableVolumeInfo.equals("FUND_ACTION_SWITCH")) {
            this.defaultFee.setVisibility(8);
            this.effectiveDate.setVisibility(8);
            this.switchDate.setVisibility(0);
            this.switchDate.setSecondValue(isbuildidvalid.AlertController$RecycleListView);
            this.switchDate.setSecondText(isbuildidvalid.PlaybackStateCompat$CustomAction);
            this.switchFee.setVisibility(0);
            this.switchFee.setFirstValue(isbuildidvalid.MediaSessionCompat$Token);
            this.switchFee.setFirstText(isbuildidvalid.MediaSessionCompat$QueueItem);
            this.switchFee.setSecondValue(isbuildidvalid.MediaDescriptionCompat);
            this.switchFee.setSecondText(isbuildidvalid.MediaBrowserCompat$MediaItem);
        }
    }
}
