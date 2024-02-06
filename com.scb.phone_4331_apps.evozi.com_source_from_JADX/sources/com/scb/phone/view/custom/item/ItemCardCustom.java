package com.scb.phone.view.custom.item;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.removeAllReports;
import p040o.setLastBaselineToBottomHeight;

public class ItemCardCustom extends ItemCustom<removeAllReports> {
    @BindView
    ImageView cardImage;
    @BindView
    TextView cardNo;

    public ItemCardCustom(Context context) {
        super(context);
    }

    public ItemCardCustom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemCardCustom(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81422131493368, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setUpWithDisplay(removeAllReports removeallreports) {
        if (TextUtils.isEmpty(removeallreports.MediaBrowserCompat$CustomActionResultReceiver)) {
            this.cardNo.setVisibility(8);
        } else {
            this.cardNo.setText(removeallreports.MediaBrowserCompat$CustomActionResultReceiver);
        }
        getContext();
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(setLastBaselineToBottomHeight.write(getContext(), R.drawable.default_card), this.cardImage, removeallreports.IconCompatParcelizer);
        this.cardImage.setContentDescription(removeallreports.MediaBrowserCompat$ItemReceiver);
    }
}
