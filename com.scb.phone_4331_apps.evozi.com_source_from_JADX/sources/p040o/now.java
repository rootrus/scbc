package p040o;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;

/* renamed from: o.now */
public final class now extends C7200kZ<String> {
    final TextView PlaybackStateCompat;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public now(View view) {
        super(view);
        onGetStartedClick.write((Object) view, "itemView");
        this.PlaybackStateCompat = (TextView) view.findViewById(R.id.tv_history_value);
    }
}
