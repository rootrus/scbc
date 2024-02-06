package com.scb.phone.view.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import java.io.File;
import java.util.Map;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getRightEdgeTearWidth;
import p040o.onCheckBoxClick;
import p040o.setExitButtonEnabled;

public class ThemeSlipLayout extends LinearLayout implements getRightEdgeTearWidth {
    private int MediaBrowserCompat$ItemReceiver = 0;
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

    public ThemeSlipLayout(Context context) {
        super(context);
        MediaBrowserCompat$ItemReceiver((AttributeSet) null);
    }

    public ThemeSlipLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MediaBrowserCompat$ItemReceiver(attributeSet);
    }

    public ThemeSlipLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MediaBrowserCompat$ItemReceiver(attributeSet);
    }

    private void MediaBrowserCompat$ItemReceiver(AttributeSet attributeSet) {
        ViewGroup viewGroup;
        Context context = getContext();
        LayoutInflater.from(getContext()).inflate(R.layout.f91242131494351, this, true);
        ButterKnife.IconCompatParcelizer(this, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.ThemeSlipLayout, 0, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                this.MediaBrowserCompat$ItemReceiver = resourceId;
                if (resourceId > 0 && (viewGroup = (ViewGroup) findViewById(R.id.slip_content)) != null) {
                    inflate(context, this.MediaBrowserCompat$ItemReceiver, viewGroup);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void MediaBrowserCompat$ItemReceiver(Map<String, String> map) {
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
                MediaBrowserCompat$CustomActionResultReceiver(frameLayout, FragmentBuilder_BindDepositSelectorFragment.write(new File(str6)));
            }
        }
    }

    private void write(View view, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setAlpha(204);
        view.setBackground(bitmapDrawable);
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(View view) throws OutOfMemoryError {
        MediaBrowserCompat$CustomActionResultReceiver(view, BitmapFactory.decodeResource(getResources(), R.drawable.slip_watermark_regenslip));
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(View view, Bitmap bitmap) throws OutOfMemoryError {
        if (bitmap != null) {
            int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.f74462131165894);
            try {
                write(view, Bitmap.createScaledBitmap(bitmap, dimensionPixelOffset, dimensionPixelOffset, false));
            } catch (OutOfMemoryError e) {
                onCheckBoxClick.IconCompatParcelizer(e, "Tile Image got OOM", new Object[0]);
            }
        }
    }

    public final void write(setExitButtonEnabled setexitbuttonenabled) {
        setexitbuttonenabled.read = this;
        setexitbuttonenabled.read();
    }
}
