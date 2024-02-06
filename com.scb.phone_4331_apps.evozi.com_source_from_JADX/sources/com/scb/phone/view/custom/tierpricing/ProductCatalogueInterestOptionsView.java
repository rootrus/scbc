package com.scb.phone.view.custom.tierpricing;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ThaiTextView;
import p040o.CrashlyticsReport;
import p040o.onGetStartedClick;
import p040o.setNavigationContentDescription;

public final class ProductCatalogueInterestOptionsView extends BaseProductCatalogueView<CrashlyticsReport.CustomAttribute.Builder> {
    @BindView
    public LinearLayout interestsContainer;
    @BindView
    public TextView principal;

    public final int IconCompatParcelizer() {
        return R.layout.f84382131493664;
    }

    public /* synthetic */ ProductCatalogueInterestOptionsView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductCatalogueInterestOptionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
    }

    public final void setPrincipal(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.principal = textView;
    }

    public final void setInterestsContainer(LinearLayout linearLayout) {
        onGetStartedClick.write((Object) linearLayout, "<set-?>");
        this.interestsContainer = linearLayout;
    }

    public final void setDisplay(CrashlyticsReport.CustomAttribute.Builder builder) {
        onGetStartedClick.write((Object) builder, "display");
        TextView textView = this.principal;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("principal");
        }
        textView.setText(builder.MediaBrowserCompat$CustomActionResultReceiver);
        for (CrashlyticsReport.CustomAttribute.Builder.read read : builder.read) {
            LinearLayout linearLayout = this.interestsContainer;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("interestsContainer");
            }
            linearLayout.addView(MediaBrowserCompat$CustomActionResultReceiver(read.MediaBrowserCompat$ItemReceiver, R.style.f97852131821005, linearLayout.getChildCount() != 0));
            linearLayout.addView(MediaBrowserCompat$CustomActionResultReceiver(read.write, R.style.f97862131821006, false));
        }
    }

    private final TextView MediaBrowserCompat$CustomActionResultReceiver(String str, int i, boolean z) {
        ThaiTextView thaiTextView = new ThaiTextView(getContext());
        if (str == null) {
            str = "";
        }
        thaiTextView.setText(str);
        if (z) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, (int) TypedValue.applyDimension(1, 10.0f, thaiTextView.getContext().getResources().getDisplayMetrics()), 0, 0);
            thaiTextView.setLayoutParams(layoutParams);
        }
        TextView textView = thaiTextView;
        setNavigationContentDescription.read(textView, i);
        return textView;
    }
}
