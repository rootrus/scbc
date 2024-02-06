package com.scb.phone.view.custom.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import com.scb.phone.view.adapter.tierpricing.TierPricingInstallmentAdapter;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;
import p040o.getCustomKeys;
import p040o.getIdentifierUtf8Bytes;
import p040o.onGetStartedClick;

public final class ItemComplexInterestCustom extends ItemCustom<getCustomKeys> {
    @BindView
    public FrameLayout divider;
    @BindView
    public RecyclerView installments;
    @BindView
    public TextView promo;
    @BindView
    public TextView remark;
    @BindView
    public TextView title;

    public final void setDivider(FrameLayout frameLayout) {
        onGetStartedClick.write((Object) frameLayout, "<set-?>");
        this.divider = frameLayout;
    }

    public final void setPromo(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.promo = textView;
    }

    public final void setTitle(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.title = textView;
    }

    public final void setInstallments(RecyclerView recyclerView) {
        onGetStartedClick.write((Object) recyclerView, "<set-?>");
        this.installments = recyclerView;
    }

    public final void setRemark(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.remark = textView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemComplexInterestCustom(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemComplexInterestCustom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemComplexInterestCustom(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        LayoutInflater.from(context).inflate(R.layout.f90472131494274, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public final void setUpWithDisplay(getCustomKeys getcustomkeys) {
        onGetStartedClick.write((Object) getcustomkeys, "display");
        TextView textView = this.title;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(MessageBundle.TITLE_ENTRY);
        }
        textView.setText(getcustomkeys.read);
        TextView textView2 = this.promo;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("promo");
        }
        textView2.setVisibility(8);
        TextView textView3 = this.remark;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("remark");
        }
        textView3.setVisibility(8);
        RecyclerView recyclerView = this.installments;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("installments");
        }
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        List<getIdentifierUtf8Bytes> list = getcustomkeys.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            RecyclerView recyclerView2 = this.installments;
            if (recyclerView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("installments");
            }
            recyclerView2.setAdapter(new TierPricingInstallmentAdapter(list, Integer.valueOf(getcustomkeys.MediaBrowserCompat$ItemReceiver)));
        }
    }
}
