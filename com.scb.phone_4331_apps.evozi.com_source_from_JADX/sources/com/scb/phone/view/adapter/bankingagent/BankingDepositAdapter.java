package com.scb.phone.view.adapter.bankingagent;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;
import p040o.AndroidApplication;
import p040o.AndroidApplication$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.MoreExecutors;
import p040o.onGetStartedClick;
import p040o.onStart;

public final class BankingDepositAdapter extends AndroidApplication<MoreExecutors.C36611> {
    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        MoreExecutors.C36611 r7 = (MoreExecutors.C36611) obj;
        onGetStartedClick.write((Object) r7, "item");
        super.MediaBrowserCompat$ItemReceiver(r7);
        ViewPager viewPager = this.IconCompatParcelizer;
        if (viewPager != null) {
            int childCount = viewPager.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewPager.getChildAt(i);
                View findViewById = childAt.findViewById(R.id.account_source_linear_layout);
                if (findViewById != null) {
                    onGetStartedClick.IconCompatParcelizer((Object) childAt, Promotion.ACTION_VIEW);
                    findViewById.setBackgroundResource(onGetStartedClick.MediaBrowserCompat$ItemReceiver(childAt.getTag(), (Object) r7.MediaBrowserCompat$CustomActionResultReceiver) ? R.drawable.bg_button_fake_white_with_purple_border_rounded : R.drawable.bg_white_rounded);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BankingDepositAdapter(Context context, AndroidApplication.read<MoreExecutors.C36611> read2) {
        super(context, read2);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) read2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    public final class DepositViewHolder_ViewBinding implements Unbinder {
        private DepositViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public DepositViewHolder_ViewBinding(DepositViewHolder depositViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = depositViewHolder;
            depositViewHolder.background = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_source_linear_layout, "field 'background'", LinearLayout.class);
            depositViewHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_source_name_text_view, "field 'title'", TextView.class);
            depositViewHolder.fund = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_source_funds_text_view, "field 'fund'", TextView.class);
        }

        public final void read() {
            DepositViewHolder depositViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (depositViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                depositViewHolder.background = null;
                depositViewHolder.title = null;
                depositViewHolder.fund = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    protected static final class DepositViewHolder extends AndroidApplication$MediaBrowserCompat$CustomActionResultReceiver<MoreExecutors.C36611> {
        final FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> Keep;
        @BindView
        public LinearLayout background;
        @BindView
        public TextView fund;
        @BindView
        public TextView title;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DepositViewHolder(View view, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
            super(view);
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            onGetStartedClick.write((Object) fundActionsSuccessActivity, "onClick");
            this.Keep = fundActionsSuccessActivity;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ BankingDepositAdapter MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ int read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(BankingDepositAdapter bankingDepositAdapter, int i) {
            super(0);
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingDepositAdapter;
            this.read = i;
        }

        public final /* synthetic */ Object invoke() {
            ViewPager viewPager = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
            if (viewPager != null) {
                viewPager.setCurrentItem(this.read, true);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final View MediaBrowserCompat$ItemReceiver(int i) {
        List<? extends T> list = this.MediaBrowserCompat$ItemReceiver;
        MoreExecutors.C36611 r0 = (MoreExecutors.C36611) (list != null ? list.get(i) : null);
        View inflate = MediaBrowserCompat$ItemReceiver().inflate(R.layout.f80832131493309, (ViewGroup) null);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        DepositViewHolder depositViewHolder = new DepositViewHolder(inflate, new read(this, i));
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        ViewPager viewPager = this.IconCompatParcelizer;
        boolean z = viewPager != null && i == viewPager.getCurrentItem();
        onGetStartedClick.write((Object) r0, "display");
        TextView textView = depositViewHolder.title;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(MessageBundle.TITLE_ENTRY);
        }
        textView.setText(r0.read);
        TextView textView2 = depositViewHolder.fund;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("fund");
        }
        textView2.setText(r0.write);
        LinearLayout linearLayout = depositViewHolder.background;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("background");
        }
        linearLayout.setBackgroundResource(z ? R.drawable.bg_button_fake_white_with_purple_border_rounded : R.drawable.bg_white_rounded);
        LinearLayout linearLayout2 = depositViewHolder.background;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("background");
        }
        linearLayout2.setOnClickListener(new C5729x461fa8fe(depositViewHolder));
        inflate.setTag(r0.MediaBrowserCompat$CustomActionResultReceiver);
        return inflate;
    }
}
