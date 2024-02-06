package com.scb.phone.view.custom.common;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

public class MultiLineNoPaddingTextView extends AppCompatTextView {
    public MultiLineNoPaddingTextView(Context context) {
        super(context);
    }

    public MultiLineNoPaddingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MultiLineNoPaddingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onMeasure(int i, int i2) {
        Layout layout;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824 && (layout = getLayout()) != null) {
            int lineCount = layout.getLineCount();
            float f = BitmapDescriptorFactory.HUE_RED;
            for (int i3 = 0; i3 < lineCount; i3++) {
                if (layout.getLineWidth(i3) > f) {
                    f = layout.getLineWidth(i3);
                }
            }
            int ceil = ((int) Math.ceil((double) f)) + getCompoundPaddingLeft() + getCompoundPaddingRight();
            if (ceil < getMeasuredWidth()) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(ceil, PKIFailureInfo.systemUnavail), i2);
            }
        }
    }
}
