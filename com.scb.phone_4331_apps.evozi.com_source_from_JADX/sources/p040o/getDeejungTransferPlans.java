package p040o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;

/* renamed from: o.getDeejungTransferPlans */
public final class getDeejungTransferPlans extends ArrayAdapter<captureReportData> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getDeejungTransferPlans(Context context) {
        super(context, R.layout.f84812131493708);
        onGetStartedClick.write((Object) context, "context");
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View view2 = super.getView(i, view, viewGroup);
        onGetStartedClick.IconCompatParcelizer((Object) view2, "super.getView(position, convertView, parent)");
        write(view2);
        String str = null;
        TextView textView = (TextView) (!(view2 instanceof TextView) ? null : view2);
        if (textView != null) {
            captureReportData capturereportdata = (captureReportData) getItem(i);
            if (capturereportdata != null) {
                str = capturereportdata.read;
            }
            textView.setText(str);
        }
        return view2;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        String str;
        onGetStartedClick.write((Object) viewGroup, "parent");
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        captureReportData capturereportdata = (captureReportData) getItem(i);
        if (dropDownView != null) {
            write(dropDownView);
        }
        String str2 = null;
        TextView textView = (TextView) (!(dropDownView instanceof TextView) ? null : dropDownView);
        if (textView != null) {
            if (capturereportdata != null && (str = capturereportdata.write) != null) {
                str2 = str;
            } else if (capturereportdata != null) {
                str2 = capturereportdata.read;
            }
            textView.setText(str2);
        }
        onGetStartedClick.IconCompatParcelizer((Object) dropDownView, Promotion.ACTION_VIEW);
        return dropDownView;
    }

    private final void write(View view) {
        Context context = getContext();
        onGetStartedClick.IconCompatParcelizer((Object) context, "context");
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.f72512131165427);
        view.setPadding(view.getPaddingLeft(), dimensionPixelOffset, context.getResources().getDimensionPixelOffset(R.dimen.f72502131165424), dimensionPixelOffset);
    }
}
