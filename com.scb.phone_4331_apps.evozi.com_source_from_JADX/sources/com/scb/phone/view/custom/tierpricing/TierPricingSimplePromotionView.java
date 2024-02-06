package com.scb.phone.view.custom.tierpricing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.tierpricing.TierPricingInstallmentAdapter;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;
import p040o.CrashlyticsReport;
import p040o.getIdentifierUtf8Bytes;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;

public final class TierPricingSimplePromotionView extends ConstraintLayout {
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

    public TierPricingSimplePromotionView(Context context) {
        this(context, (AttributeSet) null, 6, (byte) 0);
    }

    public TierPricingSimplePromotionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TierPricingSimplePromotionView(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TierPricingSimplePromotionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.f85022131493729, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

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

    public final void setDisplay(CrashlyticsReport.FilesPayload.Builder builder) {
        onGetStartedClick.write((Object) builder, "display");
        TextView textView = this.promo;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("promo");
        }
        View view = textView;
        boolean z = builder.read;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(z ? 0 : 8);
        TextView textView2 = this.title;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(MessageBundle.TITLE_ENTRY);
        }
        textView2.setText(builder.write);
        TextView textView3 = this.remark;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("remark");
        }
        textView3.setText(builder.MediaBrowserCompat$ItemReceiver);
        RecyclerView recyclerView = this.installments;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("installments");
        }
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        List<getIdentifierUtf8Bytes> list = builder.IconCompatParcelizer;
        if (list != null) {
            RecyclerView recyclerView2 = this.installments;
            if (recyclerView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("installments");
            }
            recyclerView2.setAdapter(new TierPricingInstallmentAdapter(list, (Integer) null));
        }
    }

    public final void setRemarkTextColor(int i) {
        TextView textView = this.remark;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("remark");
        }
        textView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), i));
        TextView textView2 = this.remark;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("remark");
        }
        textView2.setTextSize(0, getResources().getDimension(R.dimen.f72282131165352));
    }
}
