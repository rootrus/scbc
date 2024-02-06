package com.scb.phone.view.adapter.ccrredemption.ecoupon;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.fragment.easycash.EasycashCommonReviewFragment;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import p040o.getAllowReturnTransitionOverlap;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.verifyResetPin;
import p040o.zzvo;

public final class MyECouponViewHolder extends RecyclerView.setContentView {
    /* access modifiers changed from: private */
    public final SimpleDateFormat AlertController$RecycleListView = new SimpleDateFormat("mm:ss", Locale.getDefault());
    public CountDownTimer Keep;
    public final boolean PlaybackStateCompat;
    @BindView
    public ImageView ivIcon;
    @BindView
    public ImageView ivNotificationIcon;
    /* access modifiers changed from: private */
    public final verifyResetPin setBackgroundResource;
    public final View setHasDecor;
    @BindView
    public TextView tvExpire;
    @BindView
    public TextView tvTitle;
    @BindView
    public View vwSeparatorFull;
    @BindView
    public View vwSeparatorMarginLeft;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyECouponViewHolder(View view, boolean z, verifyResetPin verifyresetpin) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        onGetStartedClick.write((Object) verifyresetpin, "timeoutListener");
        this.setHasDecor = view;
        this.PlaybackStateCompat = z;
        this.setBackgroundResource = verifyresetpin;
        ButterKnife.IconCompatParcelizer(this, this.setHasDecor);
    }

    public static final class write implements getAllowReturnTransitionOverlap {
        private final /* synthetic */ EasycashCommonReviewFragment.IconCompatParcelizer IconCompatParcelizer;

        private write() {
        }

        public /* synthetic */ write(EasycashCommonReviewFragment.IconCompatParcelizer iconCompatParcelizer) {
            this.IconCompatParcelizer = iconCompatParcelizer;
        }

        public final boolean write(Object obj) {
            return EasycashCommonReviewFragment.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(((zzvo) obj).MediaDescriptionCompat, "QUICK_BALANCE_FUNCTION");
        }
    }

    public static SimpleDateFormat read() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
    }

    public static String MediaBrowserCompat$ItemReceiver() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
        Calendar instance = Calendar.getInstance();
        onGetStartedClick.IconCompatParcelizer((Object) instance, "Calendar.getInstance()");
        String format = simpleDateFormat.format(instance.getTime());
        onGetStartedClick.IconCompatParcelizer((Object) format, "SimpleDateFormat(DateUti…endar.getInstance().time)");
        return format;
    }

    public static final /* synthetic */ void write(MyECouponViewHolder myECouponViewHolder, String str) {
        TextView textView = myECouponViewHolder.tvExpire;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExpire");
        }
        TextView textView2 = myECouponViewHolder.tvExpire;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExpire");
        }
        textView.setTextColor(setLastBaselineToBottomHeight.read(textView2.getContext(), R.color.f67232131099879));
        TextView textView3 = myECouponViewHolder.tvExpire;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExpire");
        }
        textView3.setText(myECouponViewHolder.setHasDecor.getResources().getString(R.string.my_e_coupon_expire_min, new Object[]{str}));
    }
}
