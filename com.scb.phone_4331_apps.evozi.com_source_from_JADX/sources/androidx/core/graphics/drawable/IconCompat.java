package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode IconCompatParcelizer = PorterDuff.Mode.SRC_IN;
    public byte[] MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    PorterDuff.Mode MediaBrowserCompat$MediaItem = IconCompatParcelizer;
    public String MediaBrowserCompat$SearchResultReceiver;
    public Parcelable MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public ColorStateList RatingCompat = null;
    public int read;
    Object write;

    private static String IconCompatParcelizer(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "BITMAP_MASKABLE" : "URI" : "DATA" : "RESOURCE" : "BITMAP";
    }

    public String read() {
        if (this.MediaMetadataCompat == -1 && Build.VERSION.SDK_INT >= 23) {
            return MediaBrowserCompat$ItemReceiver((Icon) this.write);
        }
        if (this.MediaMetadataCompat == 2) {
            return ((String) this.write).split(":", -1)[0];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("called getResPackage() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public int write() {
        if (this.MediaMetadataCompat == -1 && Build.VERSION.SDK_INT >= 23) {
            return read((Icon) this.write);
        }
        if (this.MediaMetadataCompat == 2) {
            return this.read;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("called getResId() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != 5) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.MediaMetadataCompat
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.write
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.MediaMetadataCompat
            java.lang.String r1 = IconCompatParcelizer(r1)
            r0.append(r1)
            int r1 = r4.MediaMetadataCompat
            r2 = 1
            if (r1 == r2) goto L_0x007a
            r3 = 2
            if (r1 == r3) goto L_0x0052
            r2 = 3
            if (r1 == r2) goto L_0x0039
            r2 = 4
            if (r1 == r2) goto L_0x002e
            r2 = 5
            if (r1 == r2) goto L_0x007a
            goto L_0x009a
        L_0x002e:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.write
            r0.append(r1)
            goto L_0x009a
        L_0x0039:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.read
            r0.append(r1)
            int r1 = r4.MediaBrowserCompat$ItemReceiver
            if (r1 == 0) goto L_0x009a
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.MediaBrowserCompat$ItemReceiver
            r0.append(r1)
            goto L_0x009a
        L_0x0052:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.read()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            int r3 = r4.write()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x009a
        L_0x007a:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.write
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.write
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
            r0.append(r1)
        L_0x009a:
            android.content.res.ColorStateList r1 = r4.RatingCompat
            if (r1 == 0) goto L_0x00a8
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.RatingCompat
            r0.append(r1)
        L_0x00a8:
            android.graphics.PorterDuff$Mode r1 = r4.MediaBrowserCompat$MediaItem
            android.graphics.PorterDuff$Mode r2 = IconCompatParcelizer
            if (r1 == r2) goto L_0x00b8
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.MediaBrowserCompat$MediaItem
            r0.append(r1)
        L_0x00b8:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }

    public void write(boolean z) {
        this.MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$MediaItem.name();
        int i = this.MediaMetadataCompat;
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = ((String) this.write).getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i == 3) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = (byte[]) this.write;
                    return;
                } else if (i == 4) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = this.write.toString().getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i != 5) {
                    return;
                }
            }
            if (z) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((Bitmap) this.write).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.MediaBrowserCompat$CustomActionResultReceiver = byteArrayOutputStream.toByteArray();
                return;
            }
            this.MediaDescriptionCompat = (Parcelable) this.write;
        } else if (!z) {
            this.MediaDescriptionCompat = (Parcelable) this.write;
        } else {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
    }

    public void MediaBrowserCompat$ItemReceiver() {
        this.MediaBrowserCompat$MediaItem = PorterDuff.Mode.valueOf(this.MediaBrowserCompat$SearchResultReceiver);
        int i = this.MediaMetadataCompat;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.write = this.MediaBrowserCompat$CustomActionResultReceiver;
                        return;
                    } else if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                    }
                }
                this.write = new String(this.MediaBrowserCompat$CustomActionResultReceiver, Charset.forName("UTF-16"));
                return;
            }
            Parcelable parcelable = this.MediaDescriptionCompat;
            if (parcelable != null) {
                this.write = parcelable;
                return;
            }
            byte[] bArr = this.MediaBrowserCompat$CustomActionResultReceiver;
            this.write = bArr;
            this.MediaMetadataCompat = 3;
            this.read = 0;
            this.MediaBrowserCompat$ItemReceiver = bArr.length;
            return;
        }
        Parcelable parcelable2 = this.MediaDescriptionCompat;
        if (parcelable2 != null) {
            this.write = parcelable2;
            return;
        }
        throw new IllegalArgumentException("Invalid icon");
    }

    private static String MediaBrowserCompat$ItemReceiver(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    private static int read(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }
}
