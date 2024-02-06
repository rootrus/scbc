package p040o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import java.util.List;
import kotlin.TypeCastException;
import p040o.ZHER2K;

/* renamed from: o.exportDepositStatement */
public final class exportDepositStatement extends onActivityCreated {
    private final Context MediaBrowserCompat$CustomActionResultReceiver;
    public List<AutoValue_CrashlyticsReport_Session_Event_Application> write = HmlNationalIdActivity.IconCompatParcelizer;

    public final boolean isViewFromObject(View view, Object obj) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        onGetStartedClick.write(obj, "object");
        return view == obj;
    }

    public exportDepositStatement(Context context) {
        onGetStartedClick.write((Object) context, "context");
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "container");
        Object systemService = this.MediaBrowserCompat$CustomActionResultReceiver.getSystemService("layout_inflater");
        if (systemService != null) {
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.f90852131494312, viewGroup, false);
            AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application = this.write.get(i);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
            C7102x9f5b3412 exportdepositstatement_mediabrowsercompat_customactionresultreceiver = new C7102x9f5b3412(inflate);
            onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application, "prepaidTravelWalletDisplay");
            View view = exportdepositstatement_mediabrowsercompat_customactionresultreceiver.write;
            Glide.MediaBrowserCompat$ItemReceiver(view.getContext()).MediaBrowserCompat$ItemReceiver(autoValue_CrashlyticsReport_Session_Event_Application.RatingCompat).MediaBrowserCompat$ItemReceiver((ImageView) view.findViewById(ZHER2K.write.icFlag));
            TextView textView = (TextView) view.findViewById(ZHER2K.write.tvCurrencyName);
            onGetStartedClick.IconCompatParcelizer((Object) textView, "tvCurrencyName");
            textView.setText(autoValue_CrashlyticsReport_Session_Event_Application.IconCompatParcelizer);
            TextView textView2 = (TextView) view.findViewById(ZHER2K.write.tvAmount);
            onGetStartedClick.IconCompatParcelizer((Object) textView2, "tvAmount");
            textView2.setText(autoValue_CrashlyticsReport_Session_Event_Application.read);
            viewGroup.addView(inflate, 0);
            return inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public final int getCount() {
        return this.write.size();
    }
}
