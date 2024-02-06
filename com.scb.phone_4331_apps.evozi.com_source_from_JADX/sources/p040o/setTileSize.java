package p040o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import com.scb.phone.view.activity.privacymanagement.PrivacyManagementLandingViewHolder;
import java.util.List;

/* renamed from: o.setTileSize */
public final class setTileSize extends RecyclerView.IconCompatParcelizer<PrivacyManagementLandingViewHolder> {
    /* access modifiers changed from: private */
    public read MediaBrowserCompat$ItemReceiver;
    private List<getBackground> write;

    /* renamed from: o.setTileSize$read */
    public interface read {
        void write(int i);
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90922131494319, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        return new PrivacyManagementLandingViewHolder(inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder = (PrivacyManagementLandingViewHolder) setcontentview;
        onGetStartedClick.write((Object) privacyManagementLandingViewHolder, "holder");
        getBackground getbackground = this.write.get(i);
        onGetStartedClick.write((Object) getbackground, "privacy");
        TextView textView = privacyManagementLandingViewHolder.label;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("label");
        }
        textView.setText(getbackground.MediaBrowserCompat$ItemReceiver);
        privacyManagementLandingViewHolder.write.setOnClickListener(new IconCompatParcelizer(this, i));
    }

    public setTileSize(List<getBackground> list, read read2) {
        onGetStartedClick.write((Object) list, "mPrivacyList");
        onGetStartedClick.write((Object) read2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.write = list;
        this.MediaBrowserCompat$ItemReceiver = read2;
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    /* renamed from: o.setTileSize$IconCompatParcelizer */
    static final class IconCompatParcelizer implements View.OnClickListener {
        private /* synthetic */ setTileSize MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ int write;

        IconCompatParcelizer(setTileSize settilesize, int i) {
            this.MediaBrowserCompat$CustomActionResultReceiver = settilesize;
            this.write = i;
        }

        public final void onClick(View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.write(this.write);
        }
    }
}
