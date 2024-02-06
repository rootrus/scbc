package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomHorizontalProgressBar;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class TempLimitHomeFragment_ViewBinding extends BaseFragment_ViewBinding {
    private TempLimitHomeFragment MediaBrowserCompat$CustomActionResultReceiver;

    public TempLimitHomeFragment_ViewBinding(TempLimitHomeFragment tempLimitHomeFragment, View view) {
        super(tempLimitHomeFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = tempLimitHomeFragment;
        tempLimitHomeFragment.mCustomHorizontalProgressBar = (CustomHorizontalProgressBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_horizontal_progress, "field 'mCustomHorizontalProgressBar'", CustomHorizontalProgressBar.class);
        tempLimitHomeFragment.imvCard = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_image_view, "field 'imvCard'", ImageView.class);
        tempLimitHomeFragment.cardFirstFourDigit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_front_text_view, "field 'cardFirstFourDigit'", TextView.class);
        tempLimitHomeFragment.cardSecondTwoDigit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_2nd_front_text_view, "field 'cardSecondTwoDigit'", TextView.class);
        tempLimitHomeFragment.cardLastFourDigit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_text_view, "field 'cardLastFourDigit'", TextView.class);
        tempLimitHomeFragment.txvCardName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_nick_name, "field 'txvCardName'", TextView.class);
    }

    public final void read() {
        TempLimitHomeFragment tempLimitHomeFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (tempLimitHomeFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            tempLimitHomeFragment.mCustomHorizontalProgressBar = null;
            tempLimitHomeFragment.imvCard = null;
            tempLimitHomeFragment.cardFirstFourDigit = null;
            tempLimitHomeFragment.cardSecondTwoDigit = null;
            tempLimitHomeFragment.cardLastFourDigit = null;
            tempLimitHomeFragment.txvCardName = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
