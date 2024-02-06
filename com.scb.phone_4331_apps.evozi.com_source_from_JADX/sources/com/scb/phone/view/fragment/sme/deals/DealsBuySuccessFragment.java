package com.scb.phone.view.fragment.sme.deals;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.activity.landingpage.PartnerWebViewActivity;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import p040o.ActivityBuilder_ContributeRegistrationTermsAndConsActivity;
import p040o.C5161qE;
import p040o.C5166qL;
import p040o.HmlPinActivity;
import p040o.RttiJsonExactionHelper;
import p040o.onStart;
import p040o.proxyGetIIdDeserializerKta;
import p040o.setCurrentSession;
import p040o.standardStartAndWait;

public class DealsBuySuccessFragment extends PurchaseSuccessFragment implements proxyGetIIdDeserializerKta {
    private ExtraViewHolder MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public C5166qL dealsBuySuccessPresenter;

    public class ExtraViewHolder_ViewBinding implements Unbinder {
        private ExtraViewHolder MediaBrowserCompat$ItemReceiver;

        public ExtraViewHolder_ViewBinding(ExtraViewHolder extraViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = extraViewHolder;
            extraViewHolder.extraButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deals_extra_button, "field 'extraButton'", Button.class);
            extraViewHolder.extratext = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deals_extra_text, "field 'extratext'", TextView.class);
        }

        public final void read() {
            ExtraViewHolder extraViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (extraViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                extraViewHolder.extraButton = null;
                extraViewHolder.extratext = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public static DealsBuySuccessFragment write(standardStartAndWait standardstartandwait) {
        DealsBuySuccessFragment dealsBuySuccessFragment = new DealsBuySuccessFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.PURCHASE_SUCCESS_DISPLAY", standardstartandwait);
        dealsBuySuccessFragment.setArguments(bundle);
        return dealsBuySuccessFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        boolean z = true;
        ExtraViewHolder extraViewHolder = new ExtraViewHolder(LayoutInflater.from(getContext()).inflate(R.layout.f91292131494356, this.extraContainer, true));
        this.MediaBrowserCompat$CustomActionResultReceiver = extraViewHolder;
        extraViewHolder.extraButton.setOnClickListener(new ActivityBuilder_ContributeRegistrationTermsAndConsActivity(this));
        MediaSessionCompat$ResultReceiverWrapper();
        this.dealsBuySuccessPresenter.MediaBrowserCompat$ItemReceiver(this);
        C5166qL qLVar = this.dealsBuySuccessPresenter;
        int i = qLVar.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.write().MediaBrowserCompat$MediaItem;
        if (i == 0) {
            RttiJsonExactionHelper.C3762a aVar = RttiJsonExactionHelper.C3762a.MediaBrowserCompat$ItemReceiver;
            if (qLVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                aVar.IconCompatParcelizer(qLVar.RatingCompat);
            }
        } else if (i == 1) {
            C5161qE qEVar = C5161qE.MediaBrowserCompat$ItemReceiver;
            if (qLVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                qEVar.IconCompatParcelizer(qLVar.RatingCompat);
            }
        }
        return onCreateView;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setCurrentSession setcurrentsession) {
        Context context = getContext();
        if (context != null) {
            PartnerWebViewActivity.MediaBrowserCompat$ItemReceiver(context, setcurrentsession);
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.MediaBrowserCompat$CustomActionResultReceiver.extratext.setText(R.string.deals_buy_success_extra_text_sme_deals);
    }

    public final void MediaMetadataCompat() {
        this.MediaBrowserCompat$CustomActionResultReceiver.extratext.setText(R.string.deals_buy_success_extra_text_deal_of_the_day);
    }

    public void onDestroyView() {
        this.dealsBuySuccessPresenter.onDestroy();
        super.onDestroyView();
    }

    protected class ExtraViewHolder {
        @BindView
        Button extraButton;
        @BindView
        TextView extratext;

        ExtraViewHolder(View view) {
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
