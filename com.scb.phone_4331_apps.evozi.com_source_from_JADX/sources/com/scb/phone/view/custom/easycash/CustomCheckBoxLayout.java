package com.scb.phone.view.custom.easycash;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.easycash.CustomCheckboxAdapter;
import java.util.List;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.performUpdateApp;

public class CustomCheckBoxLayout extends LinearLayout {
    public CustomCheckboxAdapter IconCompatParcelizer;
    @BindView
    public TextView errorMessage;
    @BindView
    public RecyclerView rvCustomCheckBox;

    public CustomCheckBoxLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CustomCheckBoxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public CustomCheckBoxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = true;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81252131493351, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomCheckBoxLayout, 0, 0);
        try {
            String string = obtainStyledAttributes.getString(0);
            int i2 = obtainStyledAttributes.getInt(1, 8);
            obtainStyledAttributes.recycle();
            ButterKnife.IconCompatParcelizer(this);
            this.rvCustomCheckBox.setLayoutManager(new GridLayoutManager(getContext(), 2));
            this.rvCustomCheckBox.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.RatingCompat) new read(this, (int) TypedValue.applyDimension(1, (float) i2, getContext().getResources().getDisplayMetrics())));
            if (!(string == null || string.length() == 0)) {
                z = false;
            }
            if (z) {
                this.errorMessage.setText(string);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setCreditPowerTileDisplayList(List<performUpdateApp> list) {
        CustomCheckboxAdapter customCheckboxAdapter = this.IconCompatParcelizer;
        customCheckboxAdapter.MediaBrowserCompat$ItemReceiver = list;
        customCheckboxAdapter.IconCompatParcelizer.write();
    }

    class read extends RecyclerView.RatingCompat {
        private int MediaBrowserCompat$ItemReceiver;

        /* synthetic */ read(CustomCheckBoxLayout customCheckBoxLayout, int i) {
            this(i);
        }

        private read(int i) {
            this.MediaBrowserCompat$ItemReceiver = i;
        }

        public final void read(Rect rect, View view, RecyclerView recyclerView, RecyclerView.Keep keep) {
            rect.top = this.MediaBrowserCompat$ItemReceiver;
            rect.right = this.MediaBrowserCompat$ItemReceiver;
            rect.bottom = this.MediaBrowserCompat$ItemReceiver;
            rect.left = this.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(performUpdateApp performupdateapp) {
        if (performupdateapp == null) {
            return false;
        }
        return performupdateapp.MediaDescriptionCompat.booleanValue();
    }
}
