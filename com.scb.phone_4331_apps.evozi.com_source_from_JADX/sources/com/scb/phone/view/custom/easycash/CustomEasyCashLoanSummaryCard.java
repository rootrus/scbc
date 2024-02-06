package com.scb.phone.view.custom.easycash;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import com.scb.phone.view.custom.ImageTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.bouncycastle.i18n.ErrorBundle;
import p040o.CommonUtils;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.RestrictedComponentContainer;
import p040o.onGetStartedClick;

public final class CustomEasyCashLoanSummaryCard extends ConstraintLayout {
    @BindView
    public Button btApplyNow;
    @BindView
    public CustomSeparatedViews csvDetails;
    @BindView
    public ImageTextView itvLoanName;
    @BindView
    public TextView tvCreditAmount;

    public CustomEasyCashLoanSummaryCard(Context context) {
        this(context, (AttributeSet) null, 6, (byte) 0);
    }

    public CustomEasyCashLoanSummaryCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ CustomEasyCashLoanSummaryCard(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomEasyCashLoanSummaryCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        LayoutInflater.from(context).inflate(R.layout.f81752131493401, this, true);
        ButterKnife.IconCompatParcelizer(this);
        setBackgroundResource(R.color.f71012131100257);
    }

    public final void setItvLoanName(ImageTextView imageTextView) {
        onGetStartedClick.write((Object) imageTextView, "<set-?>");
        this.itvLoanName = imageTextView;
    }

    public final void setTvCreditAmount(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.tvCreditAmount = textView;
    }

    public final void setCsvDetails(CustomSeparatedViews customSeparatedViews) {
        onGetStartedClick.write((Object) customSeparatedViews, "<set-?>");
        this.csvDetails = customSeparatedViews;
    }

    public final void setBtApplyNow(Button button) {
        onGetStartedClick.write((Object) button, "<set-?>");
        this.btApplyNow = button;
    }

    public final void setLoanName(String str) {
        onGetStartedClick.write((Object) str, "loanName");
        ImageTextView imageTextView = this.itvLoanName;
        if (imageTextView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("itvLoanName");
        }
        imageTextView.setText(str);
    }

    public final void setLoanImageFromUrl(String str) {
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        if (!TextUtils.isEmpty(str)) {
            getContext();
            ImageTextView imageTextView = this.itvLoanName;
            if (imageTextView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("itvLoanName");
            }
            FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer(imageTextView, str);
        }
    }

    public final void setCreditAmount(String str) {
        onGetStartedClick.write((Object) str, "creditAmount");
        TextView textView = this.tvCreditAmount;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCreditAmount");
        }
        textView.setText(str);
    }

    public final void setLoanDetails(List<? extends CommonUtils.C31811> list) {
        onGetStartedClick.write((Object) list, ErrorBundle.DETAIL_ENTRY);
        Iterable<CommonUtils.C31811> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (CommonUtils.C31811 r1 : iterable) {
            arrayList.add(new RestrictedComponentContainer(r1.MediaBrowserCompat$ItemReceiver, r1.MediaDescriptionCompat));
        }
        List list2 = (List) arrayList;
        CustomSeparatedViews customSeparatedViews = this.csvDetails;
        if (customSeparatedViews == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("csvDetails");
        }
        customSeparatedViews.MediaBrowserCompat$ItemReceiver(list2);
    }

    public final void setApplyNowButton(boolean z, View.OnClickListener onClickListener) {
        onGetStartedClick.write((Object) onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Button button = this.btApplyNow;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btApplyNow");
        }
        button.setEnabled(z);
        Button button2 = this.btApplyNow;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btApplyNow");
        }
        button2.setOnClickListener(onClickListener);
    }
}
