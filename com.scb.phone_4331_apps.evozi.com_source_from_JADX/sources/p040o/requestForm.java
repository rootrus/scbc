package p040o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import java.util.List;
import p040o.ZHER2K;

/* renamed from: o.requestForm */
public final class requestForm extends RecyclerView.IconCompatParcelizer<requestForm$MediaBrowserCompat$ItemReceiver> {
    public read MediaBrowserCompat$ItemReceiver = read.TOTAL;
    public FirebaseTooManyRequestsException write;

    /* renamed from: o.requestForm$read */
    public enum read {
        TOTAL,
        BREAKDOWN
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.MediaBrowserCompat$ItemReceiver == read.BREAKDOWN ? R.layout.f82222131493448 : R.layout.f82232131493449, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        return new requestForm$MediaBrowserCompat$ItemReceiver(inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        String str;
        String str2;
        String str3;
        requestForm$MediaBrowserCompat$ItemReceiver requestform_mediabrowsercompat_itemreceiver = (requestForm$MediaBrowserCompat$ItemReceiver) setcontentview;
        onGetStartedClick.write((Object) requestform_mediabrowsercompat_itemreceiver, "viewHolder");
        FirebaseTooManyRequestsException firebaseTooManyRequestsException = this.write;
        read read2 = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) read2, "viewType");
        if (firebaseTooManyRequestsException != null) {
            List<getApplicationId> list = firebaseTooManyRequestsException.MediaDescriptionCompat;
            String str4 = null;
            getApplicationId getapplicationid = list != null ? list.get(i) : null;
            String str5 = "";
            if (read2 == read.BREAKDOWN) {
                View view = requestform_mediabrowsercompat_itemreceiver.write;
                onGetStartedClick.IconCompatParcelizer((Object) view, "itemView");
                AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(ZHER2K.write.tvBreakdownMonth);
                onGetStartedClick.IconCompatParcelizer((Object) appCompatTextView, "itemView.tvBreakdownMonth");
                if (getapplicationid != null) {
                    str2 = getapplicationid.read;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = str5;
                }
                appCompatTextView.setText(str2);
                View view2 = requestform_mediabrowsercompat_itemreceiver.write;
                onGetStartedClick.IconCompatParcelizer((Object) view2, "itemView");
                TextView textView = (TextView) view2.findViewById(ZHER2K.write.tvInterestItemDummy);
                onGetStartedClick.IconCompatParcelizer((Object) textView, "itemView.tvInterestItemDummy");
                textView.setText(firebaseTooManyRequestsException.MediaMetadataCompat);
                View view3 = requestform_mediabrowsercompat_itemreceiver.write;
                onGetStartedClick.IconCompatParcelizer((Object) view3, "itemView");
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) view3.findViewById(ZHER2K.write.tvInterestItemText);
                onGetStartedClick.IconCompatParcelizer((Object) appCompatTextView2, "itemView.tvInterestItemText");
                if (getapplicationid != null) {
                    str3 = getapplicationid.MediaBrowserCompat$CustomActionResultReceiver;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = str5;
                }
                appCompatTextView2.setText(str3);
                View view4 = requestform_mediabrowsercompat_itemreceiver.write;
                onGetStartedClick.IconCompatParcelizer((Object) view4, "itemView");
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) view4.findViewById(ZHER2K.write.tvPrincipalItemDummy);
                onGetStartedClick.IconCompatParcelizer((Object) appCompatTextView3, "itemView.tvPrincipalItemDummy");
                appCompatTextView3.setText(firebaseTooManyRequestsException.MediaBrowserCompat$SearchResultReceiver);
                View view5 = requestform_mediabrowsercompat_itemreceiver.write;
                onGetStartedClick.IconCompatParcelizer((Object) view5, "itemView");
                AppCompatTextView appCompatTextView4 = (AppCompatTextView) view5.findViewById(ZHER2K.write.tvPrincipalItemText);
                onGetStartedClick.IconCompatParcelizer((Object) appCompatTextView4, "itemView.tvPrincipalItemText");
                if (getapplicationid != null) {
                    str4 = getapplicationid.write;
                }
                if (str4 != null) {
                    str5 = str4;
                }
                appCompatTextView4.setText(str5);
                return;
            }
            View view6 = requestform_mediabrowsercompat_itemreceiver.write;
            onGetStartedClick.IconCompatParcelizer((Object) view6, "itemView");
            TextView textView2 = (TextView) view6.findViewById(ZHER2K.write.tvTotalMonth);
            onGetStartedClick.IconCompatParcelizer((Object) textView2, "itemView.tvTotalMonth");
            if (getapplicationid != null) {
                str = getapplicationid.read;
            } else {
                str = null;
            }
            if (str == null) {
                str = str5;
            }
            textView2.setText(str);
            View view7 = requestform_mediabrowsercompat_itemreceiver.write;
            onGetStartedClick.IconCompatParcelizer((Object) view7, "itemView");
            AppCompatTextView appCompatTextView5 = (AppCompatTextView) view7.findViewById(ZHER2K.write.tvTotalItemDummy);
            onGetStartedClick.IconCompatParcelizer((Object) appCompatTextView5, "itemView.tvTotalItemDummy");
            appCompatTextView5.setText(firebaseTooManyRequestsException.MediaBrowserCompat$MediaItem);
            View view8 = requestform_mediabrowsercompat_itemreceiver.write;
            onGetStartedClick.IconCompatParcelizer((Object) view8, "itemView");
            AppCompatTextView appCompatTextView6 = (AppCompatTextView) view8.findViewById(ZHER2K.write.tvTotalItemText);
            onGetStartedClick.IconCompatParcelizer((Object) appCompatTextView6, "itemView.tvTotalItemText");
            if (getapplicationid != null) {
                str4 = getapplicationid.IconCompatParcelizer;
            }
            if (str4 != null) {
                str5 = str4;
            }
            appCompatTextView6.setText(str5);
        }
    }

    public final int IconCompatParcelizer() {
        List<getApplicationId> list;
        FirebaseTooManyRequestsException firebaseTooManyRequestsException = this.write;
        if (firebaseTooManyRequestsException == null || (list = firebaseTooManyRequestsException.MediaDescriptionCompat) == null) {
            return 0;
        }
        return list.size();
    }
}
