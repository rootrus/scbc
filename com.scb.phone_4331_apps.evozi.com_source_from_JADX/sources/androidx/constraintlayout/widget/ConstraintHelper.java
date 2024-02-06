package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import p040o.getSupportImageTintList;
import p040o.setImageResource;
import p040o.setImageURI;

public abstract class ConstraintHelper extends View {
    protected int IconCompatParcelizer;
    protected int[] MediaBrowserCompat$CustomActionResultReceiver = new int[32];
    private Context MediaBrowserCompat$ItemReceiver;
    protected setImageURI read;
    private String write;

    public void onDraw(Canvas canvas) {
    }

    public void read() {
    }

    public ConstraintHelper(Context context) {
        super(context);
        this.MediaBrowserCompat$ItemReceiver = context;
        read((AttributeSet) null);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaBrowserCompat$ItemReceiver = context;
        read(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompat$ItemReceiver = context;
        read(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void read(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.write = string;
                    MediaBrowserCompat$CustomActionResultReceiver(string);
                }
            }
        }
    }

    public final int[] MediaBrowserCompat$CustomActionResultReceiver() {
        return Arrays.copyOf(this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer);
    }

    public void setReferencedIds(int[] iArr) {
        this.IconCompatParcelizer = 0;
        for (int tag : iArr) {
            setTag(tag, (Object) null);
        }
    }

    public void setTag(int i, Object obj) {
        int i2 = this.IconCompatParcelizer;
        int[] iArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i2 + 1 > iArr.length) {
            this.MediaBrowserCompat$CustomActionResultReceiver = Arrays.copyOf(iArr, iArr.length << 1);
        }
        int[] iArr2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i3 = this.IconCompatParcelizer;
        iArr2[i3] = i;
        this.IconCompatParcelizer = i3 + 1;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void write() {
        if (this.read != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) {
                ((ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) layoutParams).setLogo = this.read;
            }
        }
    }

    private void MediaBrowserCompat$ItemReceiver(String str) {
        int i;
        Object write2;
        if (str != null && this.MediaBrowserCompat$ItemReceiver != null) {
            String trim = str.trim();
            try {
                i = getSupportImageTintList.write.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = this.MediaBrowserCompat$ItemReceiver.getResources().getIdentifier(trim, Name.MARK, this.MediaBrowserCompat$ItemReceiver.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (write2 = ((ConstraintLayout) getParent()).write(trim)) != null && (write2 instanceof Integer)) {
                i = ((Integer) write2).intValue();
            }
            if (i != 0) {
                setTag(i, (Object) null);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find id of \"");
            sb.append(trim);
            sb.append("\"");
            Log.w("ConstraintHelper", sb.toString());
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    MediaBrowserCompat$ItemReceiver(str.substring(i));
                    return;
                } else {
                    MediaBrowserCompat$ItemReceiver(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            MediaBrowserCompat$CustomActionResultReceiver(this.write);
        }
        setImageURI setimageuri = this.read;
        if (setimageuri != null) {
            setimageuri.ActionBarOverlayLayout = 0;
            for (int i = 0; i < this.IconCompatParcelizer; i++) {
                View view = constraintLayout.MediaBrowserCompat$ItemReceiver.get(this.MediaBrowserCompat$CustomActionResultReceiver[i]);
                if (view != null) {
                    setImageURI setimageuri2 = this.read;
                    setImageResource setimageresource = view == constraintLayout ? constraintLayout.read : view == null ? null : ((ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) view.getLayoutParams()).setLogo;
                    int i2 = setimageuri2.ActionBarOverlayLayout;
                    setImageResource[] setimageresourceArr = setimageuri2.setActionBarVisibilityCallback;
                    if (i2 + 1 > setimageresourceArr.length) {
                        setimageuri2.setActionBarVisibilityCallback = (setImageResource[]) Arrays.copyOf(setimageresourceArr, setimageresourceArr.length << 1);
                    }
                    setImageResource[] setimageresourceArr2 = setimageuri2.setActionBarVisibilityCallback;
                    int i3 = setimageuri2.ActionBarOverlayLayout;
                    setimageresourceArr2[i3] = setimageresource;
                    setimageuri2.ActionBarOverlayLayout = i3 + 1;
                }
            }
        }
    }
}
