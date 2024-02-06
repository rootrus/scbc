package com.scb.phone.view.custom.ccrredemption;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import java.io.File;
import java.util.Map;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.getRightEdgeTearWidth;
import p040o.onCheckBoxClick;

public class ConfirmationThemeSlipLayout extends LinearLayout implements getRightEdgeTearWidth {
    @BindView
    ImageView imageSlipBorderLeft;
    @BindView
    ImageView imageSlipBorderRight;
    @BindView
    ImageView imageSlipBottom;
    @BindView
    ImageView imageSlipBottomBorder;
    @BindView
    ImageView imageSlipHeader;
    @BindView
    FrameLayout slipContent;

    public ConfirmationThemeSlipLayout(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R.layout.f91272131494354, this, true);
        ButterKnife.IconCompatParcelizer(this, this);
    }

    public ConfirmationThemeSlipLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.f91272131494354, this, true);
        ButterKnife.IconCompatParcelizer(this, this);
    }

    public ConfirmationThemeSlipLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.f91272131494354, this, true);
        ButterKnife.IconCompatParcelizer(this, this);
    }

    public final void MediaBrowserCompat$ItemReceiver(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            ImageView imageView = this.imageSlipHeader;
            String str = map.get("slip_header.png");
            if (!TextUtils.isEmpty(str)) {
                getContext();
                FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(new File(str), imageView);
            }
            ImageView imageView2 = this.imageSlipBorderLeft;
            String str2 = map.get("slip_side.png");
            if (!TextUtils.isEmpty(str2)) {
                getContext();
                FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(new File(str2), imageView2);
            }
            ImageView imageView3 = this.imageSlipBorderRight;
            String str3 = map.get("slip_side.png");
            if (!TextUtils.isEmpty(str3)) {
                getContext();
                FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(new File(str3), imageView3);
            }
            ImageView imageView4 = this.imageSlipBottom;
            String str4 = map.get("slip_bottom.png");
            if (!TextUtils.isEmpty(str4)) {
                getContext();
                FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(new File(str4), imageView4);
            }
            ImageView imageView5 = this.imageSlipBottomBorder;
            String str5 = map.get("slip_zigzag.png");
            if (!TextUtils.isEmpty(str5)) {
                getContext();
                FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(new File(str5), imageView5);
            }
            FrameLayout frameLayout = this.slipContent;
            String str6 = map.get("slip_watermark.png");
            if (!TextUtils.isEmpty(str6)) {
                getContext();
                Bitmap write = FragmentBuilder_BindDepositSelectorFragment.write(new File(str6));
                if (write != null) {
                    int applyDimension = (int) TypedValue.applyDimension(1, 84.0f, getContext().getResources().getDisplayMetrics());
                    try {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(write, applyDimension, applyDimension, false));
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        bitmapDrawable.setAlpha(204);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (OutOfMemoryError e) {
                        onCheckBoxClick.IconCompatParcelizer(e, "Tile Image got OOM", new Object[0]);
                    }
                }
            }
        }
    }
}
