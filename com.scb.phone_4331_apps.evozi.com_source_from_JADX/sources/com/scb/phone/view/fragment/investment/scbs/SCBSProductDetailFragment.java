package com.scb.phone.view.fragment.investment.scbs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.partner.PartnerAuthorizationActivity;
import com.scb.phone.view.custom.investment.scbs.ProductDetailCustomView;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.HmlPinActivity;
import p040o.JustCapturedListener;
import p040o.KUILogging;
import p040o.MyECouponActivity_ViewBinding;
import p040o.forEachDst;
import p040o.getBottomEdgeTearWidth;
import p040o.getKeysFileForSession;
import p040o.getOuterViewFinderColor;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.valueOrNull;

public class SCBSProductDetailFragment extends BaseFragment implements getBottomEdgeTearWidth {
    @BindView
    ImageView arrowUp;
    @BindView
    Button button;
    @BindView
    TextView currency;
    @BindView
    LinearLayout details;
    @BindView
    TextView disclaimer;
    @BindView
    View genericSeparator;
    @BindView
    TextView marketValue;
    @BindView
    TextView nameLabel;
    @BindView
    TextView nameValue;
    @HmlPinActivity
    public getOuterViewFinderColor presenter;
    @BindView
    TextView unrealized;
    @BindView
    TextView unrealizedAmount;

    public static SCBSProductDetailFragment IconCompatParcelizer(valueOrNull valueornull) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_DISPLAY", valueornull);
        SCBSProductDetailFragment sCBSProductDetailFragment = new SCBSProductDetailFragment();
        sCBSProductDetailFragment.setArguments(bundle);
        return sCBSProductDetailFragment;
    }

    public final void write(valueOrNull valueornull) {
        this.nameLabel.setText(valueornull.IconCompatParcelizer);
        this.nameValue.setText(valueornull.read);
        this.currency.setText(valueornull.MediaBrowserCompat$MediaItem);
        this.unrealizedAmount.setText(valueornull.MediaBrowserCompat$ItemReceiver);
        List<getKeysFileForSession> list = valueornull.MediaDescriptionCompat;
        int i = 8;
        if (getContext() != null) {
            this.details.removeAllViews();
            for (int i2 = 0; i2 < list.size(); i2++) {
                ProductDetailCustomView productDetailCustomView = new ProductDetailCustomView(getContext());
                productDetailCustomView.setDisplay(list.get(i2));
                if (i2 >= list.size() - 1) {
                    productDetailCustomView.separator.setVisibility(8);
                }
                this.details.addView(productDetailCustomView);
            }
        }
        this.disclaimer.setText(valueornull.MediaBrowserCompat$CustomActionResultReceiver);
        int i3 = valueornull.write;
        if (getContext() != null) {
            if (i3 > 0) {
                this.arrowUp.setImageDrawable(setLastBaselineToBottomHeight.write(getContext(), R.drawable.ic_arrow_up));
                this.unrealizedAmount.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66422131099798));
            } else if (i3 < 0) {
                this.arrowUp.setImageDrawable(setLastBaselineToBottomHeight.write(getContext(), R.drawable.ic_arrow_down));
                this.unrealizedAmount.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66452131099801));
            }
        }
        Button button2 = this.button;
        if (valueornull.MediaBrowserCompat$SearchResultReceiver) {
            i = 0;
        }
        button2.setVisibility(i);
    }

    public final void read(String str) {
        Context context = getContext();
        if (context != null) {
            Intent MediaBrowserCompat$ItemReceiver = PartnerAuthorizationActivity.MediaBrowserCompat$ItemReceiver(context, str);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$ItemReceiver.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(MediaBrowserCompat$ItemReceiver);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onTradeClick() {
        forEachDst foreachdst = new forEachDst();
        foreachdst.read("source", "SCBS_asset_detail");
        if (getActivity() != null) {
            foreachdst.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "trade_now");
        }
        getOuterViewFinderColor getouterviewfindercolor = this.presenter;
        KUILogging kUILogging = new KUILogging(getouterviewfindercolor);
        if (getouterviewfindercolor.RatingCompat != null) {
            kUILogging.IconCompatParcelizer(getouterviewfindercolor.RatingCompat);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("scbs_asset_detail");
        }
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89042131494131, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        if (!(getArguments() == null || getArguments().getParcelable("EXTRA_DISPLAY") == null)) {
            getOuterViewFinderColor getouterviewfindercolor = this.presenter;
            valueOrNull valueornull = (valueOrNull) getArguments().getParcelable("EXTRA_DISPLAY");
            getouterviewfindercolor.MediaBrowserCompat$ItemReceiver = valueornull;
            JustCapturedListener justCapturedListener = new JustCapturedListener(valueornull);
            if (getouterviewfindercolor.RatingCompat != null) {
                z = true;
            }
            if (z) {
                justCapturedListener.IconCompatParcelizer(getouterviewfindercolor.RatingCompat);
            }
        }
        return inflate;
    }
}
