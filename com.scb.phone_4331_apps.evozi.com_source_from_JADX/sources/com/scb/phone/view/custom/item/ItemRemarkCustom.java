package com.scb.phone.view.custom.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import p040o.onGetStartedClick;
import p040o.recursiveDelete;

public final class ItemRemarkCustom extends ItemCustom<recursiveDelete> {
    @BindView
    public TextView remarkInfo;

    public final void setRemarkInfo(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.remarkInfo = textView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemRemarkCustom(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemRemarkCustom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemRemarkCustom(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
    }

    public final void setUpWithDisplay(recursiveDelete recursivedelete) {
        onGetStartedClick.write((Object) recursivedelete, "display");
        TextView textView = this.remarkInfo;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("remarkInfo");
        }
        textView.setText(recursivedelete.read);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        LayoutInflater.from(context).inflate(R.layout.f81482131493374, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }
}
