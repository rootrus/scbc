package p040o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import com.scb.phone.view.adapter.creditcardpurchase.TenureViewHolder;
import com.scb.phone.view.adapter.creditcardpurchase.TenureViewHolder$MediaBrowserCompat$ItemReceiver;
import java.util.List;
import p040o.ComponentDiscovery;

/* renamed from: o.ServiceModule */
public final class ServiceModule extends RecyclerView.IconCompatParcelizer<TenureViewHolder> {
    public List<ComponentDiscovery.RegistrarNameRetriever> MediaBrowserCompat$ItemReceiver;
    public Integer read;
    private read write;

    /* renamed from: o.ServiceModule$read */
    public interface read {
        void MediaBrowserCompat$ItemReceiver(ComponentDiscovery.RegistrarNameRetriever registrarNameRetriever);
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90482131494275, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        return new TenureViewHolder(inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        TenureViewHolder tenureViewHolder = (TenureViewHolder) setcontentview;
        onGetStartedClick.write((Object) tenureViewHolder, "holder");
        ComponentDiscovery.RegistrarNameRetriever registrarNameRetriever = this.MediaBrowserCompat$ItemReceiver.get(i);
        Integer num = this.read;
        read read2 = this.write;
        onGetStartedClick.write((Object) registrarNameRetriever, "installmentPlansDisplay");
        onGetStartedClick.write((Object) read2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        tenureViewHolder.write.setOnClickListener(new TenureViewHolder$MediaBrowserCompat$ItemReceiver(read2, registrarNameRetriever));
        TextView textView = tenureViewHolder.tvTenure;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTenure");
        }
        textView.setText(String.valueOf(registrarNameRetriever.RatingCompat));
        int i2 = registrarNameRetriever.RatingCompat;
        if (num == null || num.intValue() != i2) {
            RelativeLayout relativeLayout = tenureViewHolder.rlContainer;
            if (relativeLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("rlContainer");
            }
            relativeLayout.setBackground(setLastBaselineToBottomHeight.write(tenureViewHolder.AlertController$RecycleListView.getContext(), R.drawable.bg_button_amount));
            TextView textView2 = tenureViewHolder.tvTenure;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTenure");
            }
            textView2.setTextColor(setLastBaselineToBottomHeight.read(tenureViewHolder.AlertController$RecycleListView.getContext(), R.color.f67252131099881));
            return;
        }
        RelativeLayout relativeLayout2 = tenureViewHolder.rlContainer;
        if (relativeLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rlContainer");
        }
        relativeLayout2.setBackground(setLastBaselineToBottomHeight.write(tenureViewHolder.AlertController$RecycleListView.getContext(), R.drawable.bg_button_amount_purple));
        TextView textView3 = tenureViewHolder.tvTenure;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTenure");
        }
        textView3.setTextColor(setLastBaselineToBottomHeight.read(tenureViewHolder.AlertController$RecycleListView.getContext(), R.color.f71012131100257));
    }

    public ServiceModule(List<ComponentDiscovery.RegistrarNameRetriever> list, Integer num, read read2) {
        onGetStartedClick.write((Object) list, "tenorList");
        onGetStartedClick.write((Object) read2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.MediaBrowserCompat$ItemReceiver = list;
        this.read = num;
        this.write = read2;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }
}
