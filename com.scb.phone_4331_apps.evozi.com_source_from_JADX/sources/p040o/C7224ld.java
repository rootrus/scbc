package p040o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;

/* renamed from: o.ld */
public final class C7224ld extends C7198kW<String, now> {
    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        onGetStartedClick.write((Object) viewGroup, "$this$inflate");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f91022131494329, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(cont…late(layout, this, false)");
        return new now(inflate);
    }

    public final /* synthetic */ void IconCompatParcelizer(C7200kZ kZVar, Object obj) {
        now now = (now) kZVar;
        String str = (String) obj;
        onGetStartedClick.write((Object) now, "holder");
        onGetStartedClick.write((Object) str, "item");
        TextView textView = now.PlaybackStateCompat;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7224ld(FundFactSheetActivity<? super String, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        super(fundFactSheetActivity);
        onGetStartedClick.write((Object) fundFactSheetActivity, "onClick");
    }
}
