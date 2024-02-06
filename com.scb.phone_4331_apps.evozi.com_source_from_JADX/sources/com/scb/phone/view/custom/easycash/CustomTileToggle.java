package com.scb.phone.view.custom.easycash;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.ManageChequeService;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setBaselineAligned;
import p040o.setLastBaselineToBottomHeight;

public class CustomTileToggle extends LinearLayout {
    private read IconCompatParcelizer;
    public View MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    @BindView
    public LinearLayout leftTile;
    @BindView
    ImageView leftTileIcon;
    @BindView
    TextView leftTileTitle;
    @BindView
    public LinearLayout rightTile;
    @BindView
    ImageView rightTileIcon;
    @BindView
    TextView rightTileTitle;

    public interface read {
        void IconCompatParcelizer(int i, View view);
    }

    public CustomTileToggle(Context context) {
        this(context, (AttributeSet) null);
    }

    public CustomTileToggle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomTileToggle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompat$ItemReceiver = -1;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f85032131493730, this, true);
        ButterKnife.IconCompatParcelizer(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomTileToggle, 0, 0);
        try {
            this.leftTileIcon.setImageResource(obtainStyledAttributes.getResourceId(0, 0));
            this.rightTileIcon.setImageResource(obtainStyledAttributes.getResourceId(2, 0));
            this.leftTileTitle.setText(obtainStyledAttributes.getString(1));
            this.rightTileTitle.setText(obtainStyledAttributes.getString(3));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setTextSize(float f) {
        this.leftTileTitle.setTextSize(f);
        this.rightTileTitle.setTextSize(f);
    }

    public void setTextSize(int i, float f) {
        this.leftTileTitle.setTextSize(i, f);
        this.rightTileTitle.setTextSize(i, f);
    }

    public final void read(read read2) {
        this.IconCompatParcelizer = read2;
        this.leftTile.setOnClickListener(new ManageChequeService(this));
        this.rightTile.setOnClickListener(new ManageChequeService(this));
    }

    public final void write(View view) {
        int i;
        if (view.equals(this.leftTile)) {
            i = 0;
        } else {
            i = view.equals(this.rightTile) ? 1 : -1;
        }
        if (this.MediaBrowserCompat$ItemReceiver != i) {
            read(view, i);
        }
    }

    private void read(View view, int i) {
        View view2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (view2 != null) {
            view2.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.bg_white_rounded));
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = view;
        view.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.rounded_purple_view_pager));
        this.IconCompatParcelizer.IconCompatParcelizer(i, view);
    }

    public void setDisabledAppearanceLeftTile() {
        this.leftTileTitle.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
        setBaselineAligned.MediaBrowserCompat$ItemReceiver(this.leftTileIcon.getDrawable().mutate(), setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
    }
}
