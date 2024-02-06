package com.scb.phone.view.fragment.sme.gifting;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.squareup.picasso.Picasso;
import p040o.AutoValue_CrashlyticsReport_Session_User;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.setLastBaselineToBottomHeight;

public class GiftSharingMomentPreviewFragment extends Fragment {
    @BindView
    ImageView previewImg;
    @BindView
    TextView previewMsg;

    public static GiftSharingMomentPreviewFragment MediaBrowserCompat$ItemReceiver(AutoValue_CrashlyticsReport_Session_User.Builder builder) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("GIFT_SHARING_MOMENT_PREVIEW", builder);
        GiftSharingMomentPreviewFragment giftSharingMomentPreviewFragment = new GiftSharingMomentPreviewFragment();
        giftSharingMomentPreviewFragment.setArguments(bundle);
        return giftSharingMomentPreviewFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89932131494220, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (getArguments() != null && getArguments().containsKey("GIFT_SHARING_MOMENT_PREVIEW")) {
            AutoValue_CrashlyticsReport_Session_User.Builder builder = (AutoValue_CrashlyticsReport_Session_User.Builder) getArguments().get("GIFT_SHARING_MOMENT_PREVIEW");
            FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(builder.read);
            write.write = true;
            write.read(this.previewImg, (FragmentBuilder_BindEkycFragment) null);
            this.previewMsg.setText(builder.RatingCompat);
            this.previewMsg.setTextColor(setLastBaselineToBottomHeight.read(getActivity(), builder.IconCompatParcelizer));
        }
        return inflate;
    }

    @OnClick
    public void closeFragment() {
        getActivity().sendBroadcast(new Intent("com.scb.phone/BROADCAST_CLOSE_SHARING_MOMENT_GIFT_PREVIEW"));
    }
}
