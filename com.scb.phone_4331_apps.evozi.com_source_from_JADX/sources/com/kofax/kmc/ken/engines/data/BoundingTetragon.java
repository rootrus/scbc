package com.kofax.kmc.ken.engines.data;

import android.graphics.Point;
import com.kofax.BuildConfig;
import com.kofax.kmc.ken.engines.version.KenVersion;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import p040o.ModifyQuickTopUpReviewActivity;

public class BoundingTetragon implements Serializable, Cloneable {
    private static final String TAG = BoundingTetragon.class.getSimpleName();
    private static final long serialVersionUID = 6111310662346562354L;
    /* access modifiers changed from: private */

    /* renamed from: cw */
    public transient Point f195cw = new Point(0, 0);
    /* access modifiers changed from: private */

    /* renamed from: cx */
    public transient Point f196cx = new Point(0, 0);
    /* access modifiers changed from: private */

    /* renamed from: cy */
    public transient Point f197cy = new Point(0, 0);
    /* access modifiers changed from: private */

    /* renamed from: cz */
    public transient Point f198cz = new Point(0, 0);

    public enum Rotation {
        LEFT,
        RIGHT,
        FLIP
    }

    public BoundingTetragon() {
    }

    public BoundingTetragon clone() {
        try {
            BoundingTetragon boundingTetragon = (BoundingTetragon) super.clone();
            if (boundingTetragon.f195cw != null) {
                boundingTetragon.f195cw = new Point(boundingTetragon.f195cw);
            }
            if (boundingTetragon.f196cx != null) {
                boundingTetragon.f196cx = new Point(boundingTetragon.f196cx);
            }
            if (boundingTetragon.f197cy != null) {
                boundingTetragon.f197cy = new Point(boundingTetragon.f197cy);
            }
            if (boundingTetragon.f198cz != null) {
                boundingTetragon.f198cz = new Point(boundingTetragon.f198cz);
            }
            return boundingTetragon;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new InternalError("BoundingTetragon: unexpected clone not supported exception");
        }
    }

    public BoundingTetragon(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f195cw.set(i, i2);
        this.f196cx.set(i3, i4);
        this.f197cy.set(i5, i6);
        this.f198cz.set(i7, i8);
    }

    public BoundingTetragon(Point point, Point point2, Point point3, Point point4) {
        this.f195cw.set(point.x, point.y);
        this.f196cx.set(point2.x, point2.y);
        this.f197cy.set(point3.x, point3.y);
        this.f198cz.set(point4.x, point4.y);
    }

    public Point getTopLeft() {
        return new Point(this.f195cw);
    }

    public void setTopLeft(Point point) {
        if (point == null) {
            this.f195cw = null;
        } else {
            this.f195cw.set(point.x, point.y);
        }
    }

    public Point getTopRight() {
        return new Point(this.f196cx);
    }

    public void setTopRight(Point point) {
        if (point == null) {
            this.f196cx = null;
        } else {
            this.f196cx.set(point.x, point.y);
        }
    }

    public Point getBottomLeft() {
        return new Point(this.f197cy);
    }

    public void setBottomLeft(Point point) {
        if (point == null) {
            this.f197cy = null;
        } else {
            this.f197cy.set(point.x, point.y);
        }
    }

    public Point getBottomRight() {
        return new Point(this.f198cz);
    }

    public void setBottomRight(Point point) {
        if (point == null) {
            this.f198cz = null;
        } else {
            this.f198cz.set(point.x, point.y);
        }
    }

    /* renamed from: com.kofax.kmc.ken.engines.data.BoundingTetragon$1 */
    static /* synthetic */ class C04371 {

        /* renamed from: cA */
        static final /* synthetic */ int[] f200cA;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.kofax.kmc.ken.engines.data.BoundingTetragon$Rotation[] r0 = com.kofax.kmc.ken.engines.data.BoundingTetragon.Rotation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f200cA = r0
                com.kofax.kmc.ken.engines.data.BoundingTetragon$Rotation r1 = com.kofax.kmc.ken.engines.data.BoundingTetragon.Rotation.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f200cA     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.ken.engines.data.BoundingTetragon$Rotation r1 = com.kofax.kmc.ken.engines.data.BoundingTetragon.Rotation.FLIP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f200cA     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.kmc.ken.engines.data.BoundingTetragon$Rotation r1 = com.kofax.kmc.ken.engines.data.BoundingTetragon.Rotation.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.data.BoundingTetragon.C04371.<clinit>():void");
        }
    }

    public void rotate(int i, int i2, Rotation rotation) {
        Point point;
        Point point2;
        Point point3;
        Point point4;
        if (rotation != null) {
            int i3 = C04371.f200cA[rotation.ordinal()];
            if (i3 == 1) {
                Point point5 = this.f195cw;
                point5.set(point5.y, i - this.f195cw.x);
                Point point6 = this.f196cx;
                point6.set(point6.y, i - this.f196cx.x);
                Point point7 = this.f197cy;
                point7.set(point7.y, i - this.f197cy.x);
                Point point8 = this.f198cz;
                point8.set(point8.y, i - this.f198cz.x);
                point4 = this.f195cw;
                point = this.f196cx;
                point2 = this.f197cy;
                point3 = this.f198cz;
            } else if (i3 == 2) {
                Point point9 = this.f195cw;
                point9.set(i - point9.x, i2 - this.f195cw.y);
                Point point10 = this.f196cx;
                point10.set(i - point10.x, i2 - this.f196cx.y);
                Point point11 = this.f197cy;
                point11.set(i - point11.x, i2 - this.f197cy.y);
                Point point12 = this.f198cz;
                point12.set(i - point12.x, i2 - this.f198cz.y);
                point2 = this.f195cw;
                point4 = this.f196cx;
                point3 = this.f197cy;
                point = this.f198cz;
            } else if (i3 == 3) {
                Point point13 = this.f195cw;
                point13.set(i2 - point13.y, this.f195cw.x);
                Point point14 = this.f196cx;
                point14.set(i2 - point14.y, this.f196cx.x);
                Point point15 = this.f197cy;
                point15.set(i2 - point15.y, this.f197cy.x);
                Point point16 = this.f198cz;
                point16.set(i2 - point16.y, this.f198cz.x);
                point3 = this.f195cw;
                point2 = this.f196cx;
                point = this.f197cy;
                point4 = this.f198cz;
            } else {
                return;
            }
            this.f195cw = point;
            this.f196cx = point3;
            this.f197cy = point4;
            this.f198cz = point2;
            return;
        }
        throw new IllegalArgumentException("rotation cannot be null");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(BoundingTetragon.class.getName());
        objectOutputStream.writeObject(KenVersion.getPackageVersion());
        objectOutputStream.writeObject(Integer.valueOf(this.f195cw.x));
        objectOutputStream.writeObject(Integer.valueOf(this.f195cw.y));
        objectOutputStream.writeObject(Integer.valueOf(this.f196cx.x));
        objectOutputStream.writeObject(Integer.valueOf(this.f196cx.y));
        objectOutputStream.writeObject(Integer.valueOf(this.f197cy.x));
        objectOutputStream.writeObject(Integer.valueOf(this.f197cy.y));
        objectOutputStream.writeObject(Integer.valueOf(this.f198cz.x));
        objectOutputStream.writeObject(Integer.valueOf(this.f198cz.y));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException, KmcRuntimeException {
        objectInputStream.defaultReadObject();
        if (BoundingTetragon.class.getName().compareToIgnoreCase((String) objectInputStream.readObject()) == 0) {
            if (SdkVersion.versionCompatible(KenVersion.getPackageVersion(), (String) objectInputStream.readObject()).booleanValue()) {
                this.f195cw = new Point(((Integer) objectInputStream.readObject()).intValue(), ((Integer) objectInputStream.readObject()).intValue());
                this.f196cx = new Point(((Integer) objectInputStream.readObject()).intValue(), ((Integer) objectInputStream.readObject()).intValue());
                this.f197cy = new Point(((Integer) objectInputStream.readObject()).intValue(), ((Integer) objectInputStream.readObject()).intValue());
                this.f198cz = new Point(((Integer) objectInputStream.readObject()).intValue(), ((Integer) objectInputStream.readObject()).intValue());
                return;
            }
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_VERSION_ERROR);
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR);
    }

    public class FriendBT {
        public FriendBT(String str) throws KmcException {
            if (!ModifyQuickTopUpReviewActivity.IconCompatParcelizer((CharSequence) str, (CharSequence) BuildConfig.APPLICATION_ID)) {
                throw new KmcException(ErrorInfo.KMC_GN_UNSUPPORTED_OPERATION);
            }
        }

        public boolean isValid() {
            return BoundingTetragon.this.f195cw.x <= BoundingTetragon.this.f196cx.x && BoundingTetragon.this.f195cw.y <= BoundingTetragon.this.f197cy.y && BoundingTetragon.this.f196cx.y <= BoundingTetragon.this.f198cz.y && BoundingTetragon.this.f197cy.x <= BoundingTetragon.this.f198cz.x;
        }

        public boolean isAllZero() {
            return BoundingTetragon.this.f195cw.x == 0 && BoundingTetragon.this.f195cw.y == 0 && BoundingTetragon.this.f197cy.x == 0 && BoundingTetragon.this.f197cy.y == 0 && BoundingTetragon.this.f196cx.x == 0 && BoundingTetragon.this.f196cx.y == 0 && BoundingTetragon.this.f198cz.x == 0 && BoundingTetragon.this.f198cz.y == 0;
        }

        public String toExtCornersOpString(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("<PropertyName=\"CSkewDetect.use_external_page_corners.Bool\" Value=\"1\" Comment=\"DEFAULT   0\" />");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(str);
            sb2.append("<PropertyName=\"CSkewDetect.external_page_corner_tl_x.double\" Value=\"");
            sb2.append(BoundingTetragon.this.f195cw.x);
            sb2.append("\" />");
            String obj2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj2);
            sb3.append(str);
            sb3.append("<PropertyName=\"CSkewDetect.external_page_corner_tl_y.double\" Value=\"");
            sb3.append(BoundingTetragon.this.f195cw.y);
            sb3.append("\" />");
            String obj3 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj3);
            sb4.append(str);
            sb4.append("<PropertyName=\"CSkewDetect.external_page_corner_tr_x.double\" Value=\"");
            sb4.append(BoundingTetragon.this.f196cx.x);
            sb4.append("\" />");
            String obj4 = sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(obj4);
            sb5.append(str);
            sb5.append("<PropertyName=\"CSkewDetect.external_page_corner_tr_y.double\" Value=\"");
            sb5.append(BoundingTetragon.this.f196cx.y);
            sb5.append("\" />");
            String obj5 = sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(obj5);
            sb6.append(str);
            sb6.append("<PropertyName=\"CSkewDetect.external_page_corner_bl_x.double\" Value=\"");
            sb6.append(BoundingTetragon.this.f197cy.x);
            sb6.append("\" />");
            String obj6 = sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(obj6);
            sb7.append(str);
            sb7.append("<PropertyName=\"CSkewDetect.external_page_corner_bl_y.double\" Value=\"");
            sb7.append(BoundingTetragon.this.f197cy.y);
            sb7.append("\" />");
            String obj7 = sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(obj7);
            sb8.append(str);
            sb8.append("<PropertyName=\"CSkewDetect.external_page_corner_br_x.double\" Value=\"");
            sb8.append(BoundingTetragon.this.f198cz.x);
            sb8.append("\" />");
            String obj8 = sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(obj8);
            sb9.append(str);
            sb9.append("<PropertyName=\"CSkewDetect.external_page_corner_br_y.double\" Value=\"");
            sb9.append(BoundingTetragon.this.f198cz.y);
            sb9.append("\" />");
            return sb9.toString();
        }
    }
}
