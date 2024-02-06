package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindBranchTabFragment;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setLastBaselineToBottomHeight;

public class CustomEditCell extends RelativeLayout {
    private Context IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private Drawable MediaBrowserCompat$ItemReceiver;
    private String MediaBrowserCompat$MediaItem;
    private int MediaDescriptionCompat;
    private String RatingCompat;
    @BindView
    View divider;
    @BindView
    ImageView icon;
    private int read;
    @BindView
    View ripple;
    @BindView
    TextView text;
    @BindView
    TextView title;
    private Drawable write;

    public void setOnEditIconClickListener(FragmentBuilder_BindBranchTabFragment fragmentBuilder_BindBranchTabFragment) {
    }

    public CustomEditCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IconCompatParcelizer = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomCellOptions, 0, 0);
        this.MediaDescriptionCompat = obtainStyledAttributes.getColor(5, setLastBaselineToBottomHeight.read(context, R.color.f71012131100257));
        String str = "";
        this.MediaBrowserCompat$MediaItem = obtainStyledAttributes.getString(6) != null ? obtainStyledAttributes.getString(6) : str;
        this.RatingCompat = obtainStyledAttributes.getString(4) != null ? obtainStyledAttributes.getString(4) : str;
        this.write = obtainStyledAttributes.getDrawable(0) != null ? obtainStyledAttributes.getDrawable(0) : setLastBaselineToBottomHeight.write(context, R.drawable.ic_edit_black_24dp);
        this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getDrawable(1) != null ? obtainStyledAttributes.getDrawable(1) : setLastBaselineToBottomHeight.write(context, R.drawable.ripple_purple);
        this.read = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81202131493346, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.title.setText(this.MediaBrowserCompat$MediaItem);
        this.title.setTextColor(this.MediaDescriptionCompat);
        this.text.setText(this.RatingCompat);
        this.text.setTextColor(this.MediaDescriptionCompat);
        this.icon.setImageDrawable(this.write);
        this.ripple.setBackground(this.MediaBrowserCompat$ItemReceiver);
        this.ripple.getLayoutParams().height = this.read;
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.divider.setVisibility(0);
        }
    }

    public void setText(int i) {
        this.text.setText(this.IconCompatParcelizer.getString(i));
    }

    public void setText(String str) {
        TextView textView = this.text;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }
}
