package com.scb.phone.view.adapter.profile_management.manage_account_inbound;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import p040o.FundFactSheetActivity;
import p040o.getUiOrientation;
import p040o.onGetStartedClick;

public final class ManageAccountInboundViewHolder extends RecyclerView.setContentView {
    @BindView
    public CheckBox toggleView;
    @BindView
    public TextView tvAccountNo;
    @BindView
    public TextView tvAccountType;
    @BindView
    public TextView tvNickName;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ManageAccountInboundViewHolder(View view) {
        super(view);
        onGetStartedClick.write((Object) view, "itemView");
        ButterKnife.IconCompatParcelizer(this, view);
    }

    public static final class read implements View.OnClickListener {
        private /* synthetic */ getUiOrientation MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ FundFactSheetActivity write;

        public read(FundFactSheetActivity fundFactSheetActivity, getUiOrientation getuiorientation) {
            this.write = fundFactSheetActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = getuiorientation;
        }

        public final void onClick(View view) {
            FundFactSheetActivity fundFactSheetActivity = this.write;
            if (fundFactSheetActivity != null) {
                getUiOrientation getuiorientation = this.MediaBrowserCompat$CustomActionResultReceiver;
                getuiorientation.MediaBrowserCompat$ItemReceiver = !getuiorientation.MediaBrowserCompat$ItemReceiver;
                fundFactSheetActivity.invoke(getuiorientation);
            }
        }
    }
}
