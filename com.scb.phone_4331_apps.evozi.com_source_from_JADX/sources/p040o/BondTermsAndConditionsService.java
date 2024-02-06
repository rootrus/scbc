package p040o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;

/* renamed from: o.BondTermsAndConditionsService */
public final class BondTermsAndConditionsService extends ArrayAdapter<deleteSessionPartFilesFor> {
    public final boolean isEnabled(int i) {
        return i != 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BondTermsAndConditionsService(Context context) {
        super(context, R.layout.f84812131493708);
        onGetStartedClick.write((Object) context, "context");
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View view2 = super.getView(i, view, viewGroup);
        onGetStartedClick.IconCompatParcelizer((Object) view2, "super.getView(position, convertView, parent)");
        MediaBrowserCompat$ItemReceiver(view2);
        String str = null;
        TextView textView = (TextView) (!(view2 instanceof TextView) ? null : view2);
        if (textView != null) {
            deleteSessionPartFilesFor deletesessionpartfilesfor = (deleteSessionPartFilesFor) getItem(i);
            if (deletesessionpartfilesfor != null) {
                str = deletesessionpartfilesfor.MediaBrowserCompat$MediaItem;
            }
            textView.setText(str);
        }
        int i2 = R.color.f65772131099731;
        if (i == 0) {
            i2 = R.color.f66402131099796;
        }
        if (textView != null) {
            textView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), i2));
        }
        return view2;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        if (dropDownView != null) {
            MediaBrowserCompat$ItemReceiver(dropDownView);
        }
        String str = null;
        TextView textView = (TextView) (!(dropDownView instanceof TextView) ? null : dropDownView);
        if (textView != null) {
            deleteSessionPartFilesFor deletesessionpartfilesfor = (deleteSessionPartFilesFor) getItem(i);
            if (deletesessionpartfilesfor != null) {
                str = deletesessionpartfilesfor.MediaBrowserCompat$MediaItem;
            }
            textView.setText(str);
        }
        int i2 = R.color.f67522131099908;
        if (i == 0) {
            i2 = R.color.f66402131099796;
        }
        if (textView != null) {
            textView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), i2));
        }
        onGetStartedClick.IconCompatParcelizer((Object) dropDownView, Promotion.ACTION_VIEW);
        return dropDownView;
    }

    private final void MediaBrowserCompat$ItemReceiver(View view) {
        Context context = getContext();
        onGetStartedClick.IconCompatParcelizer((Object) context, "it");
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.f72512131165427);
        view.setPadding(view.getPaddingLeft(), dimensionPixelOffset, context.getResources().getDimensionPixelOffset(R.dimen.f72502131165424), dimensionPixelOffset);
    }
}
