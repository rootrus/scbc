package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import p040o.FragmentBuilder_BindEStatementsSuccessfulFragment;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.MissingDependencyException;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onCheckBoxClick;

public class MultilineDataComponent extends ConstraintLayout {
    @BindView
    TextView firstLine;
    @BindView
    ImageView icon;
    @BindView
    TextView secondLine;
    @BindView
    TextView title;

    public MultilineDataComponent(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public MultilineDataComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultilineDataComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.f81462131493372, this, true);
        ButterKnife.IconCompatParcelizer(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.MultilineDataComponent);
        String string = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        this.title.setText(string);
    }

    public void setDisplay(MissingDependencyException missingDependencyException) {
        this.firstLine.setText(missingDependencyException.MediaBrowserCompat$CustomActionResultReceiver);
        this.secondLine.setText(missingDependencyException.IconCompatParcelizer);
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(missingDependencyException.MediaBrowserCompat$ItemReceiver).write();
        write.MediaBrowserCompat$CustomActionResultReceiver.read(new FragmentBuilder_BindEStatementsSuccessfulFragment(getResources().getDimensionPixelSize(R.dimen.f74412131165877)));
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            write.read(this.icon, (FragmentBuilder_BindEkycFragment) null);
            return;
        }
        try {
            this.icon.setImageBitmap(write.MediaBrowserCompat$CustomActionResultReceiver());
        } catch (IOException e) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "setCircularDrawableToImageView", new Object[0]);
        }
    }
}
