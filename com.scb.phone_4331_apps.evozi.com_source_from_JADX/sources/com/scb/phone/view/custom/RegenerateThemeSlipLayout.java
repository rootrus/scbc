package com.scb.phone.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import com.scb.phone.R;
import java.util.Map;
import p040o.onGetStartedClick;

public final class RegenerateThemeSlipLayout extends ThemeSlipLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegenerateThemeSlipLayout(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegenerateThemeSlipLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) attributeSet, "attrs");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegenerateThemeSlipLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
    }

    public final void MediaBrowserCompat$ItemReceiver(Map<String, String> map) {
        this.imageSlipHeader.setImageResource(R.drawable.slip_header_regenslip);
        this.imageSlipBorderLeft.setImageResource(R.drawable.slip_side_regenslip);
        this.imageSlipBorderRight.setImageResource(R.drawable.slip_side_regenslip);
        this.imageSlipBottom.setImageResource(R.drawable.slip_bottom_regenslip);
        this.imageSlipBottomBorder.setImageResource(R.drawable.slip_zigzag_regenslip);
        MediaBrowserCompat$CustomActionResultReceiver(this.slipContent);
    }
}
