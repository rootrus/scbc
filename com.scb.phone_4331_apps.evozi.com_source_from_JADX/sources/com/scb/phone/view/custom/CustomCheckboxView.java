package com.scb.phone.view.custom;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.EventBus$$Lambda$1;
import p040o.verifyNTBReferral;

public class CustomCheckboxView extends ConstraintLayout {
    public write MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    TextView subtitle;
    @BindView
    TextView title;
    @BindView
    CheckBox toggleView;

    public interface write {
        void IconCompatParcelizer(boolean z);
    }

    public CustomCheckboxView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CustomCheckboxView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomCheckboxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.f81232131493349, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setData(EventBus$$Lambda$1 eventBus$$Lambda$1) {
        this.title.setText(eventBus$$Lambda$1.MediaBrowserCompat$CustomActionResultReceiver);
        if (!TextUtils.isEmpty(eventBus$$Lambda$1.write)) {
            this.subtitle.setVisibility(0);
            this.subtitle.setText(eventBus$$Lambda$1.write);
        }
        setChecked(eventBus$$Lambda$1.IconCompatParcelizer);
        this.toggleView.setOnCheckedChangeListener(new verifyNTBReferral(this));
    }

    public void setChecked(boolean z) {
        this.toggleView.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.toggleView.setChecked(z);
        this.toggleView.setOnCheckedChangeListener(new verifyNTBReferral(this));
    }

    public void setListener(write write2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write2;
    }
}
