package p040o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.setAnnotation$MediaBrowserCompat$ItemReceiver */
public final class setAnnotation$MediaBrowserCompat$ItemReceiver extends RecyclerView.setContentView {
    final setAnnotation$MediaBrowserCompat$CustomActionResultReceiver setHasDecor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setAnnotation$MediaBrowserCompat$ItemReceiver(View view, setAnnotation$MediaBrowserCompat$CustomActionResultReceiver setannotation_mediabrowsercompat_customactionresultreceiver) {
        super(view);
        onGetStartedClick.write((Object) view, "itemView");
        onGetStartedClick.write((Object) setannotation_mediabrowsercompat_customactionresultreceiver, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.setHasDecor = setannotation_mediabrowsercompat_customactionresultreceiver;
    }

    /* renamed from: o.setAnnotation$MediaBrowserCompat$ItemReceiver$read */
    static final class read implements View.OnClickListener {
        private /* synthetic */ setAnnotation$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
        private /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ List write;

        read(setAnnotation$MediaBrowserCompat$ItemReceiver setannotation_mediabrowsercompat_itemreceiver, AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application, List list) {
            this.IconCompatParcelizer = setannotation_mediabrowsercompat_itemreceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = autoValue_CrashlyticsReport_Session_Event_Application;
            this.write = list;
        }

        public final void onClick(View view) {
            this.IconCompatParcelizer.setHasDecor.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, new ArrayList(this.write));
        }
    }
}
