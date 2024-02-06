package p040o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.scb.phone.R;
import java.util.List;

/* renamed from: o.sendOta */
public final class sendOta<T> extends ArrayAdapter<T> {
    public sendOta(Context context, T[] tArr) {
        super(context, R.layout.f84822131493709, tArr);
    }

    public sendOta(Context context, List<T> list) {
        super(context, R.layout.f84822131493709, list);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (i != 0) {
            return super.getDropDownView(i, (View) null, viewGroup);
        }
        TextView textView = new TextView(getContext());
        textView.setHeight(0);
        textView.setVisibility(8);
        return textView;
    }
}
