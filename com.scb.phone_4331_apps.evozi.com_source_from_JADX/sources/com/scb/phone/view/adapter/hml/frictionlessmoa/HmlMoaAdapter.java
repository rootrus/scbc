package com.scb.phone.view.adapter.hml.frictionlessmoa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import java.util.List;
import p040o.CrashlyticsController;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;
import p040o.onStart;

public final class HmlMoaAdapter extends RecyclerView.IconCompatParcelizer<HmlMoaViewHolder> {
    /* access modifiers changed from: private */
    public int MediaBrowserCompat$ItemReceiver = -1;
    final List<CrashlyticsController.C32346> read;
    final FundFactSheetActivity<CrashlyticsController.C32346, HmlVerifyPhoneValidateOtpActivity> write;

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f84242131493650, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(pare…ount_item, parent, false)");
        return new HmlMoaViewHolder(inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        HmlMoaViewHolder hmlMoaViewHolder = (HmlMoaViewHolder) setcontentview;
        onGetStartedClick.write((Object) hmlMoaViewHolder, "holder");
        View view = hmlMoaViewHolder.item;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("item");
        }
        view.setOnClickListener(new HmlMoaAdapter$MediaBrowserCompat$ItemReceiver(this, i));
        if (this.read.get(i).MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$ItemReceiver = i;
        }
        CrashlyticsController.C32346 r5 = this.read.get(i);
        onGetStartedClick.write((Object) r5, "item");
        TextView textView = hmlMoaViewHolder.account;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("account");
        }
        textView.setText(r5.IconCompatParcelizer);
        TextView textView2 = hmlMoaViewHolder.type;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("type");
        }
        textView2.setText(r5.write);
        TextView textView3 = hmlMoaViewHolder.nickname;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nickname");
        }
        textView3.setText(r5.MediaBrowserCompat$ItemReceiver);
        RadioButton radioButton = hmlMoaViewHolder.button;
        if (radioButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("button");
        }
        radioButton.setChecked(r5.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public HmlMoaAdapter(FundFactSheetActivity<? super CrashlyticsController.C32346, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity, List<CrashlyticsController.C32346> list) {
        onGetStartedClick.write((Object) fundFactSheetActivity, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        onGetStartedClick.write((Object) list, "items");
        this.write = fundFactSheetActivity;
        this.read = list;
    }

    public final class HmlMoaViewHolder_ViewBinding implements Unbinder {
        private HmlMoaViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public HmlMoaViewHolder_ViewBinding(HmlMoaViewHolder hmlMoaViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlMoaViewHolder;
            hmlMoaViewHolder.item = onStart.IconCompatParcelizer(view, R.id.rl_item, "field 'item'");
            hmlMoaViewHolder.account = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account, "field 'account'", TextView.class);
            hmlMoaViewHolder.button = (RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rb_account, "field 'button'", RadioButton.class);
            hmlMoaViewHolder.type = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_type_account, "field 'type'", TextView.class);
            hmlMoaViewHolder.nickname = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_nickname, "field 'nickname'", TextView.class);
        }

        public final void read() {
            HmlMoaViewHolder hmlMoaViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (hmlMoaViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                hmlMoaViewHolder.item = null;
                hmlMoaViewHolder.account = null;
                hmlMoaViewHolder.button = null;
                hmlMoaViewHolder.type = null;
                hmlMoaViewHolder.nickname = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public static final class HmlMoaViewHolder extends RecyclerView.setContentView {
        @BindView
        public TextView account;
        @BindView
        public RadioButton button;
        @BindView
        public View item;
        @BindView
        public TextView nickname;
        @BindView
        public TextView type;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HmlMoaViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            ButterKnife.IconCompatParcelizer(this, view);
            RadioButton radioButton = this.button;
            if (radioButton == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("button");
            }
            radioButton.setClickable(false);
        }
    }
}
