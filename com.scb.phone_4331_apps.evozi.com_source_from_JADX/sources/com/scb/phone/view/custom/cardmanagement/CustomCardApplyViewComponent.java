package com.scb.phone.view.custom.cardmanagement;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import org.bouncycastle.i18n.MessageBundle;
import p040o.onGetStartedClick;

public final class CustomCardApplyViewComponent extends ConstraintLayout {
    /* access modifiers changed from: private */
    public int IconCompatParcelizer;
    /* access modifiers changed from: private */
    public IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public CheckBox ckbCardName;
    @BindView
    public View divider;
    @BindView
    public View fullDivider;
    /* access modifiers changed from: private */
    public String write;

    public interface IconCompatParcelizer {
        void write(int i, String str, boolean z);
    }

    public CustomCardApplyViewComponent(Context context) {
        this(context, (AttributeSet) null, 6, (byte) 0);
    }

    public CustomCardApplyViewComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ CustomCardApplyViewComponent(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomCardApplyViewComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        this.write = "";
        this.IconCompatParcelizer = -1;
        LayoutInflater.from(context).inflate(R.layout.f91032131494330, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public final void setCkbCardName(CheckBox checkBox) {
        onGetStartedClick.write((Object) checkBox, "<set-?>");
        this.ckbCardName = checkBox;
    }

    public final void setFullDivider(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.fullDivider = view;
    }

    public final void setDivider(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.divider = view;
    }

    public final void setListener(IconCompatParcelizer iconCompatParcelizer) {
        onGetStartedClick.write((Object) iconCompatParcelizer, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        CheckBox checkBox = this.ckbCardName;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbCardName");
        }
        checkBox.setOnCheckedChangeListener(new write(this));
    }

    public final void setIndex(int i) {
        this.IconCompatParcelizer = i;
    }

    public final void setKey(String str) {
        onGetStartedClick.write((Object) str, "key");
        this.write = str;
    }

    public final void setTitle(String str) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        CheckBox checkBox = this.ckbCardName;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbCardName");
        }
        checkBox.setText(str);
    }

    public final void setSelect(boolean z) {
        CheckBox checkBox = this.ckbCardName;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbCardName");
        }
        checkBox.setChecked(z);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        View view = this.fullDivider;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("fullDivider");
        }
        view.setVisibility(z ? 8 : 0);
    }

    static final class write implements CompoundButton.OnCheckedChangeListener {
        private /* synthetic */ CustomCardApplyViewComponent MediaBrowserCompat$CustomActionResultReceiver;

        write(CustomCardApplyViewComponent customCardApplyViewComponent) {
            this.MediaBrowserCompat$CustomActionResultReceiver = customCardApplyViewComponent;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            IconCompatParcelizer IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            if (IconCompatParcelizer != null) {
                int write = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
                String read = this.MediaBrowserCompat$CustomActionResultReceiver.write;
                CheckBox checkBox = this.MediaBrowserCompat$CustomActionResultReceiver.ckbCardName;
                if (checkBox == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbCardName");
                }
                IconCompatParcelizer.write(write, read, checkBox.isChecked());
            }
        }
    }
}
