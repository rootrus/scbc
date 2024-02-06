package com.scb.phone.view.custom.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import org.bouncycastle.i18n.MessageBundle;
import p040o.Utils;
import p040o.onGetStartedClick;

public class ItemTitleCustom extends ItemCustom<Utils.C39301> {
    @BindView
    public TextView title;

    public ItemTitleCustom(Context context) {
        this(context, (AttributeSet) null, 6, (byte) 0);
    }

    public ItemTitleCustom(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ ItemTitleCustom(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemTitleCustom(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
    }

    public final void setTitle(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.title = textView;
    }

    public void setUpWithDisplay(Utils.C39301 r3) {
        onGetStartedClick.write((Object) r3, "display");
        TextView textView = this.title;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(MessageBundle.TITLE_ENTRY);
        }
        textView.setText(r3.MediaBrowserCompat$ItemReceiver);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        LayoutInflater.from(context).inflate(R.layout.f81552131493381, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }
}
