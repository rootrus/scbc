package com.scb.phone.view.adapter.profilemanagement;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.DirectDebitService;
import p040o.onStart;
import p040o.setExecution;

public final class ManagePromptpayProxyAdapter extends RecyclerView.IconCompatParcelizer<ManagePromptpayViewHolder> {
    public List<setExecution> MediaBrowserCompat$ItemReceiver;
    private write write;

    public interface write {
        void MediaBrowserCompat$ItemReceiver(setExecution setexecution);
    }

    public class ManagePromptpayViewHolder_ViewBinding implements Unbinder {
        private ManagePromptpayViewHolder write;

        public ManagePromptpayViewHolder_ViewBinding(ManagePromptpayViewHolder managePromptpayViewHolder, View view) {
            this.write = managePromptpayViewHolder;
            managePromptpayViewHolder.iconPromptpay = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.icon_promptpay, "field 'iconPromptpay'", ImageView.class);
            managePromptpayViewHolder.promptpayId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.promptpay_id, "field 'promptpayId'", TextView.class);
            managePromptpayViewHolder.relativeAccount = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.relative_account, "field 'relativeAccount'", RelativeLayout.class);
            managePromptpayViewHolder.accountNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account, "field 'accountNo'", TextView.class);
            managePromptpayViewHolder.typeAccount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.type_account, "field 'typeAccount'", TextView.class);
            managePromptpayViewHolder.nickname = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nickname, "field 'nickname'", TextView.class);
            managePromptpayViewHolder.linearRequestMoney = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.linear_request_money, "field 'linearRequestMoney'", LinearLayout.class);
            managePromptpayViewHolder.separator = onStart.IconCompatParcelizer(view, R.id.separator_view, "field 'separator'");
        }

        public final void read() {
            ManagePromptpayViewHolder managePromptpayViewHolder = this.write;
            if (managePromptpayViewHolder != null) {
                this.write = null;
                managePromptpayViewHolder.iconPromptpay = null;
                managePromptpayViewHolder.promptpayId = null;
                managePromptpayViewHolder.relativeAccount = null;
                managePromptpayViewHolder.accountNo = null;
                managePromptpayViewHolder.typeAccount = null;
                managePromptpayViewHolder.nickname = null;
                managePromptpayViewHolder.linearRequestMoney = null;
                managePromptpayViewHolder.separator = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ManagePromptpayViewHolder managePromptpayViewHolder = (ManagePromptpayViewHolder) setcontentview;
        setExecution setexecution = this.MediaBrowserCompat$ItemReceiver.get(i);
        managePromptpayViewHolder.promptpayId.setText(setexecution.IconCompatParcelizer);
        managePromptpayViewHolder.iconPromptpay.setImageResource(setexecution.read == 1 ? R.drawable.ic_cid : R.drawable.ic_mobile);
        if (setexecution.MediaBrowserCompat$ItemReceiver != null) {
            managePromptpayViewHolder.relativeAccount.setVisibility(0);
            managePromptpayViewHolder.accountNo.setText(setexecution.MediaBrowserCompat$ItemReceiver.write);
            managePromptpayViewHolder.typeAccount.setText(setexecution.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
            if (!TextUtils.isEmpty(setexecution.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver)) {
                managePromptpayViewHolder.nickname.setVisibility(0);
                managePromptpayViewHolder.nickname.setText(setexecution.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
            } else {
                managePromptpayViewHolder.nickname.setVisibility(8);
            }
            managePromptpayViewHolder.linearRequestMoney.setVisibility(setexecution.RatingCompat ? 0 : 8);
        } else {
            managePromptpayViewHolder.relativeAccount.setVisibility(8);
        }
        managePromptpayViewHolder.write.setOnClickListener(new DirectDebitService(managePromptpayViewHolder, setexecution));
        if (setexecution.MediaBrowserCompat$CustomActionResultReceiver) {
            managePromptpayViewHolder.separator.setVisibility(8);
        } else {
            managePromptpayViewHolder.separator.setVisibility(0);
        }
    }

    public ManagePromptpayProxyAdapter(write write2) {
        this.write = write2;
    }

    public final int IconCompatParcelizer() {
        List<setExecution> list = this.MediaBrowserCompat$ItemReceiver;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static class ManagePromptpayViewHolder extends RecyclerView.setContentView {
        public write Keep;
        @BindView
        TextView accountNo;
        @BindView
        ImageView iconPromptpay;
        @BindView
        LinearLayout linearRequestMoney;
        @BindView
        TextView nickname;
        @BindView
        TextView promptpayId;
        @BindView
        RelativeLayout relativeAccount;
        @BindView
        View separator;
        @BindView
        TextView typeAccount;

        public ManagePromptpayViewHolder(View view, write write) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.Keep = write;
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new ManagePromptpayViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83312131493557, viewGroup, false), this.write);
    }
}
