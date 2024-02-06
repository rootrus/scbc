package p040o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import java.util.ArrayList;

/* renamed from: o.getTopbarVisible */
public final class getTopbarVisible extends RecyclerView.IconCompatParcelizer<isDynamicHeightEnabled> {
    ArrayList<AutoValue_CrashlyticsReport_Session_Event_Application> MediaBrowserCompat$ItemReceiver;
    getTopbarVisible$MediaBrowserCompat$CustomActionResultReceiver write;

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90832131494310, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        return new isDynamicHeightEnabled(inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        isDynamicHeightEnabled isdynamicheightenabled = (isDynamicHeightEnabled) setcontentview;
        onGetStartedClick.write((Object) isdynamicheightenabled, "holder");
        AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application = this.MediaBrowserCompat$ItemReceiver.get(i);
        onGetStartedClick.IconCompatParcelizer((Object) autoValue_CrashlyticsReport_Session_Event_Application, "currencies[position]");
        AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application2 = autoValue_CrashlyticsReport_Session_Event_Application;
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application2, "currency");
        isdynamicheightenabled.PlaybackStateCompat.setText(autoValue_CrashlyticsReport_Session_Event_Application2.IconCompatParcelizer);
        isdynamicheightenabled.setHasDecor.setText(autoValue_CrashlyticsReport_Session_Event_Application2.write);
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(isdynamicheightenabled.AlertController$RecycleListView, autoValue_CrashlyticsReport_Session_Event_Application2.RatingCompat, (isReset) new isReset().IconCompatParcelizer((int) R.color.f66402131099796));
        isdynamicheightenabled.write.setOnClickListener(new getTopbarVisible$MediaBrowserCompat$ItemReceiver(this, i));
    }

    public getTopbarVisible(ArrayList<AutoValue_CrashlyticsReport_Session_Event_Application> arrayList, getTopbarVisible$MediaBrowserCompat$CustomActionResultReceiver gettopbarvisible_mediabrowsercompat_customactionresultreceiver) {
        onGetStartedClick.write((Object) arrayList, "currencies");
        onGetStartedClick.write((Object) gettopbarvisible_mediabrowsercompat_customactionresultreceiver, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.MediaBrowserCompat$ItemReceiver = arrayList;
        this.write = gettopbarvisible_mediabrowsercompat_customactionresultreceiver;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }
}
