package com.scb.phone.view.custom.cardmanagement;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import org.bouncycastle.i18n.MessageBundle;
import p040o.onGetStartedClick;

public final class CustomStatementChannelViewComponent extends ConstraintLayout {
    /* access modifiers changed from: private */
    public IconCompatParcelizer IconCompatParcelizer;
    /* access modifiers changed from: private */
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public RadioButton cbSelect;
    @BindView
    public View divider;
    @BindView
    public View fullDivider;
    @BindView
    public TextView tvRemark;
    @BindView
    public TextView tvTitle;

    public interface IconCompatParcelizer {
        void MediaBrowserCompat$CustomActionResultReceiver(String str);
    }

    public CustomStatementChannelViewComponent(Context context) {
        this(context, (AttributeSet) null, 6, (byte) 0);
    }

    public CustomStatementChannelViewComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ CustomStatementChannelViewComponent(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomStatementChannelViewComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        this.MediaBrowserCompat$CustomActionResultReceiver = "";
        LayoutInflater.from(context).inflate(R.layout.f81222131493348, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public final void setCbSelect(RadioButton radioButton) {
        onGetStartedClick.write((Object) radioButton, "<set-?>");
        this.cbSelect = radioButton;
    }

    public final void setTvTitle(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.tvTitle = textView;
    }

    public final void setTvRemark(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.tvRemark = textView;
    }

    public final void setDivider(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.divider = view;
    }

    public final void setFullDivider(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.fullDivider = view;
    }

    public final void setListener(IconCompatParcelizer iconCompatParcelizer) {
        onGetStartedClick.write((Object) iconCompatParcelizer, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.IconCompatParcelizer = iconCompatParcelizer;
        RadioButton radioButton = this.cbSelect;
        if (radioButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbSelect");
        }
        radioButton.setOnClickListener(new C5800x476be7af(this));
        setOnClickListener(new read(this));
    }

    public final void setKey(String str) {
        onGetStartedClick.write((Object) str, "key");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void setTitle(String str) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        TextView textView = this.tvTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTitle");
        }
        textView.setText(str);
    }

    public final void setRemark(String str) {
        onGetStartedClick.write((Object) str, "remark");
        TextView textView = this.tvRemark;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
        }
        textView.setText(str);
    }

    public final void IconCompatParcelizer(boolean z) {
        if (z) {
            View view = this.divider;
            if (view == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("divider");
            }
            view.setVisibility(4);
            MediaBrowserCompat$ItemReceiver(false);
            return;
        }
        View view2 = this.divider;
        if (view2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("divider");
        }
        view2.setVisibility(0);
        MediaBrowserCompat$ItemReceiver(true);
    }

    private final void MediaBrowserCompat$ItemReceiver(boolean z) {
        View view = this.fullDivider;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("fullDivider");
        }
        view.setVisibility(z ? 8 : 0);
    }

    public final void setSelect(String str) {
        onGetStartedClick.write((Object) str, "userSelect");
        RadioButton radioButton = this.cbSelect;
        if (radioButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbSelect");
        }
        radioButton.setChecked(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    static final class read implements View.OnClickListener {
        private /* synthetic */ CustomStatementChannelViewComponent IconCompatParcelizer;

        read(CustomStatementChannelViewComponent customStatementChannelViewComponent) {
            this.IconCompatParcelizer = customStatementChannelViewComponent;
        }

        public final void onClick(View view) {
            IconCompatParcelizer read = this.IconCompatParcelizer.IconCompatParcelizer;
            if (read != null) {
                read.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
    }
}
