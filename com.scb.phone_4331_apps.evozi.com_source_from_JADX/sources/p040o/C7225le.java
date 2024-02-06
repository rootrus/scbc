package p040o;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;

/* renamed from: o.le */
public final class C7225le extends C7200kZ<getHeadEulerAngleZ> {
    final TextView AlertController$RecycleListView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7225le(View view) {
        super(view);
        onGetStartedClick.write((Object) view, "itemView");
        this.AlertController$RecycleListView = (TextView) view.findViewById(R.id.text1);
    }
}
