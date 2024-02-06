package p040o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import java.util.ArrayList;
import p040o.setHeaderTextAppearance;

/* renamed from: o.setDynamicHeightEnabled */
public final class setDynamicHeightEnabled extends RecyclerView.IconCompatParcelizer<setHeaderTextAppearance> {
    private write MediaBrowserCompat$ItemReceiver;
    private ArrayList<setRam> write;

    /* renamed from: o.setDynamicHeightEnabled$write */
    public interface write {
        void IconCompatParcelizer();

        void write(setRam setram);
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90842131494311, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        return new setHeaderTextAppearance(inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        setHeaderTextAppearance setheadertextappearance = (setHeaderTextAppearance) setcontentview;
        onGetStartedClick.write((Object) setheadertextappearance, "holder");
        setRam setram = this.write.get(i);
        onGetStartedClick.IconCompatParcelizer((Object) setram, "toAccounts[position]");
        setRam setram2 = setram;
        write write2 = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) setram2, "account");
        onGetStartedClick.write((Object) write2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        setheadertextappearance.PlaybackStateCompat.setText(setram2.write);
        setheadertextappearance.Keep.setText(setram2.MediaBrowserCompat$CustomActionResultReceiver);
        setheadertextappearance.write.setOnClickListener(new setHeaderTextAppearance$MediaBrowserCompat$ItemReceiver(write2, setram2));
        setheadertextappearance.AlertController$RecycleListView.setOnClickListener(new setHeaderTextAppearance.IconCompatParcelizer(write2));
        int i2 = 0;
        setheadertextappearance.setHasDecor.setVisibility(setram2.IconCompatParcelizer ? 0 : 8);
        ImageView imageView = setheadertextappearance.AlertController$RecycleListView;
        if (!setram2.read) {
            i2 = 4;
        }
        imageView.setVisibility(i2);
    }

    public setDynamicHeightEnabled(ArrayList<setRam> arrayList, write write2) {
        onGetStartedClick.write((Object) arrayList, "toAccounts");
        onGetStartedClick.write((Object) write2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.write = arrayList;
        this.MediaBrowserCompat$ItemReceiver = write2;
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }
}
