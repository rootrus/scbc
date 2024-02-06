package com.scb.phone.view.adapter.insurance;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import java.util.ArrayList;
import p040o.AlertController$RecycleListView;
import p040o.CrashlyticsCore;
import p040o.isReset;
import p040o.onGetStartedClick;
import p040o.onStart;

public final class InsurersAdapter extends RecyclerView.IconCompatParcelizer<InsurersViewHolder> {
    public final ArrayList<CrashlyticsCore> MediaBrowserCompat$ItemReceiver;
    private final write read;

    public interface write {
        void read(CrashlyticsCore crashlyticsCore);
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90682131494295, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(pare…_insurers, parent, false)");
        return new InsurersViewHolder(inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        InsurersViewHolder insurersViewHolder = (InsurersViewHolder) setcontentview;
        onGetStartedClick.write((Object) insurersViewHolder, "holder");
        CrashlyticsCore crashlyticsCore = this.MediaBrowserCompat$ItemReceiver.get(i);
        onGetStartedClick.IconCompatParcelizer((Object) crashlyticsCore, "insurersList[position]");
        CrashlyticsCore crashlyticsCore2 = crashlyticsCore;
        write write2 = this.read;
        onGetStartedClick.write((Object) crashlyticsCore2, "item");
        onGetStartedClick.write((Object) write2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ImageView imageView = insurersViewHolder.ivPartnerIcon;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivPartnerIcon");
        }
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(imageView, crashlyticsCore2.write, (isReset) ((isReset) new isReset().IconCompatParcelizer((int) R.drawable.biller_place_holder)).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.biller_place_holder));
        TextView textView = insurersViewHolder.tvPartnerName;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPartnerName");
        }
        textView.setText(crashlyticsCore2.MediaBrowserCompat$ItemReceiver);
        if (crashlyticsCore2.IconCompatParcelizer) {
            View view = insurersViewHolder.vwSelectPartner;
            if (view == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwSelectPartner");
            }
            view.setVisibility(0);
        } else {
            View view2 = insurersViewHolder.vwSelectPartner;
            if (view2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwSelectPartner");
            }
            view2.setVisibility(4);
        }
        insurersViewHolder.write.setOnClickListener(new InsurersViewHolder.IconCompatParcelizer(crashlyticsCore2, write2));
    }

    public final class InsurersViewHolder_ViewBinding implements Unbinder {
        private InsurersViewHolder MediaBrowserCompat$ItemReceiver;

        public InsurersViewHolder_ViewBinding(InsurersViewHolder insurersViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = insurersViewHolder;
            insurersViewHolder.ivPartnerIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_partner_icon, "field 'ivPartnerIcon'", ImageView.class);
            insurersViewHolder.tvPartnerName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_partner_name, "field 'tvPartnerName'", TextView.class);
            insurersViewHolder.vwSelectPartner = onStart.IconCompatParcelizer(view, R.id.vw_select_partner, "field 'vwSelectPartner'");
        }

        public final void read() {
            InsurersViewHolder insurersViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (insurersViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                insurersViewHolder.ivPartnerIcon = null;
                insurersViewHolder.tvPartnerName = null;
                insurersViewHolder.vwSelectPartner = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public InsurersAdapter(ArrayList<CrashlyticsCore> arrayList, write write2) {
        onGetStartedClick.write((Object) arrayList, "insurersList");
        onGetStartedClick.write((Object) write2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.MediaBrowserCompat$ItemReceiver = arrayList;
        this.read = write2;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public static final class InsurersViewHolder extends RecyclerView.setContentView {
        @BindView
        public ImageView ivPartnerIcon;
        @BindView
        public TextView tvPartnerName;
        @BindView
        public View vwSelectPartner;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public InsurersViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "inflate");
            ButterKnife.IconCompatParcelizer(this, this.write);
        }

        static final class IconCompatParcelizer implements View.OnClickListener {
            private /* synthetic */ CrashlyticsCore MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ write write;

            IconCompatParcelizer(CrashlyticsCore crashlyticsCore, write write2) {
                this.MediaBrowserCompat$CustomActionResultReceiver = crashlyticsCore;
                this.write = write2;
            }

            public final void onClick(View view) {
                if (!this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer) {
                    this.write.read(this.MediaBrowserCompat$CustomActionResultReceiver);
                }
            }
        }
    }
}
