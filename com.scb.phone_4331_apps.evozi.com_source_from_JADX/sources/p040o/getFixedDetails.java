package p040o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.scb.phone.R;
import java.util.List;
import p040o.ZHER2K;

/* renamed from: o.getFixedDetails */
public final class getFixedDetails extends RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> {
    public int MediaBrowserCompat$ItemReceiver;
    public List<AutoValue_CrashlyticsReport_Session_Event_Application> write;

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return i != 0 ? 2 : 1;
    }

    public getFixedDetails(Context context) {
        onGetStartedClick.write((Object) context, "context");
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        if (i != 1) {
            onGetStartedClick.write((Object) viewGroup, "$this$inflate");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90902131494317, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(cont…late(layout, this, false)");
            return new write(inflate);
        }
        onGetStartedClick.write((Object) viewGroup, "$this$inflate");
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90912131494318, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate2, "LayoutInflater.from(cont…late(layout, this, false)");
        return new read(inflate2);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        onGetStartedClick.write((Object) setcontentview, "holder");
        if (setcontentview instanceof write) {
            write write2 = (write) setcontentview;
            List<AutoValue_CrashlyticsReport_Session_Event_Application> list = this.write;
            if (list == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("walletTravelList");
            }
            AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application = list.get(i);
            onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application, "travelWalletDisplay");
            View view = write2.write;
            ImageView imageView = (ImageView) view.findViewById(ZHER2K.write.ivTopUpFlag);
            onGetStartedClick.IconCompatParcelizer((Object) imageView, "ivTopUpFlag");
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(imageView, autoValue_CrashlyticsReport_Session_Event_Application.RatingCompat, (isReset) new isReset().IconCompatParcelizer((int) R.color.f66402131099796));
            TextView textView = (TextView) view.findViewById(ZHER2K.write.tvOtherTopupCurrencyName);
            onGetStartedClick.IconCompatParcelizer((Object) textView, "tvOtherTopupCurrencyName");
            textView.setText(autoValue_CrashlyticsReport_Session_Event_Application.IconCompatParcelizer);
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(ZHER2K.write.tvOtherTopupCurrency);
            onGetStartedClick.IconCompatParcelizer((Object) appCompatTextView, "tvOtherTopupCurrency");
            appCompatTextView.setText(autoValue_CrashlyticsReport_Session_Event_Application.IconCompatParcelizer);
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(ZHER2K.write.tvOtherTopupCurrencyAmount);
            onGetStartedClick.IconCompatParcelizer((Object) appCompatTextView2, "tvOtherTopupCurrencyAmount");
            appCompatTextView2.setText(autoValue_CrashlyticsReport_Session_Event_Application.read);
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) view.findViewById(ZHER2K.write.tvThbCurrencyAmount);
            onGetStartedClick.IconCompatParcelizer((Object) appCompatTextView3, "tvThbCurrencyAmount");
            appCompatTextView3.setText(autoValue_CrashlyticsReport_Session_Event_Application.MediaDescriptionCompat);
        } else if (setcontentview instanceof read) {
            read read2 = (read) setcontentview;
            List<AutoValue_CrashlyticsReport_Session_Event_Application> list2 = this.write;
            if (list2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("walletTravelList");
            }
            AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application2 = list2.get(i);
            onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application2, "travelWalletDisplay");
            View view2 = read2.write;
            Glide.MediaBrowserCompat$ItemReceiver(view2.getContext()).MediaBrowserCompat$ItemReceiver(autoValue_CrashlyticsReport_Session_Event_Application2.RatingCompat).MediaBrowserCompat$ItemReceiver((ImageView) view2.findViewById(ZHER2K.write.icThaiCurrencyFlag));
            TextView textView2 = (TextView) view2.findViewById(ZHER2K.write.tvThaiCurrencyAmount);
            onGetStartedClick.IconCompatParcelizer((Object) textView2, "tvThaiCurrencyAmount");
            textView2.setText(autoValue_CrashlyticsReport_Session_Event_Application2.read);
        }
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    /* renamed from: o.getFixedDetails$read */
    public static final class read extends RecyclerView.setContentView {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
        }
    }

    /* renamed from: o.getFixedDetails$write */
    public static final class write extends RecyclerView.setContentView {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
        }
    }
}
