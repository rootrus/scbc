package p040o;

import com.drew.metadata.MetadataException;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.createFromBitmapResource */
public abstract class createFromBitmapResource {
    public final Collection<String> IconCompatParcelizer = new ArrayList(4);
    public createCubemapFromCubeFaces MediaBrowserCompat$CustomActionResultReceiver;
    public Map<Integer, Object> MediaBrowserCompat$ItemReceiver = new HashMap();
    private Collection<rsnAllocationRead1D> read = new ArrayList();

    /* access modifiers changed from: protected */
    public abstract HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver();

    public abstract String MediaBrowserCompat$ItemReceiver();

    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer.isEmpty() && this.read.isEmpty();
    }

    public final void read(createCubemapFromCubeFaces createcubemapfromcubefaces) {
        this.MediaBrowserCompat$CustomActionResultReceiver = createcubemapfromcubefaces;
    }

    public void MediaBrowserCompat$ItemReceiver(int i, byte[] bArr) {
        MediaBrowserCompat$ItemReceiver(i, (Object) bArr);
    }

    public void IconCompatParcelizer(int i, Object obj) {
        if (obj != null) {
            if (!this.MediaBrowserCompat$ItemReceiver.containsKey(Integer.valueOf(i))) {
                this.read.add(new rsnAllocationRead1D(i, this));
            }
            this.MediaBrowserCompat$ItemReceiver.put(Integer.valueOf(i), obj);
            return;
        }
        throw new NullPointerException("cannot set a null object");
    }

    public void MediaBrowserCompat$ItemReceiver(int i, Object obj) {
        IconCompatParcelizer(i, obj);
    }

    public final int write() throws MetadataException {
        Integer MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(274);
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2.intValue();
        }
        Object obj = this.MediaBrowserCompat$ItemReceiver.get(274);
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tag '");
            sb.append(MediaMetadataCompat(274));
            sb.append("' has not been set -- check using containsTag() first");
            throw new MetadataException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tag '");
        sb2.append(274);
        sb2.append("' cannot be converted to int.  It is of type '");
        sb2.append(obj.getClass());
        sb2.append("'.");
        throw new MetadataException(sb2.toString());
    }

    public String MediaMetadataCompat(int i) {
        HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2.containsKey(Integer.valueOf(i))) {
            return MediaBrowserCompat$CustomActionResultReceiver2.get(Integer.valueOf(i));
        }
        String hexString = Integer.toHexString(i);
        while (hexString.length() < 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("0");
            sb.append(hexString);
            hexString = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unknown tag (0x");
        sb2.append(hexString);
        sb2.append(")");
        return sb2.toString();
    }

    public boolean ParcelableVolumeInfo(int i) {
        return MediaBrowserCompat$CustomActionResultReceiver().containsKey(Integer.valueOf(i));
    }

    public String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = MediaBrowserCompat$ItemReceiver();
        objArr[1] = Integer.valueOf(this.MediaBrowserCompat$ItemReceiver.size());
        objArr[2] = this.MediaBrowserCompat$ItemReceiver.size() == 1 ? "tag" : "tags";
        return String.format("%s Directory (%d %s)", objArr);
    }

    public final byte[] IconCompatParcelizer(int i) {
        Object obj = this.MediaBrowserCompat$ItemReceiver.get(Integer.valueOf(i));
        if (obj == null) {
            return null;
        }
        if (obj instanceof createFromBitmap) {
            return ((createFromBitmap) obj).MediaBrowserCompat$ItemReceiver;
        }
        int i2 = 0;
        if (obj instanceof copy3DRangeFromUnchecked[]) {
            copy3DRangeFromUnchecked[] copy3drangefromuncheckedArr = (copy3DRangeFromUnchecked[]) obj;
            int length = copy3drangefromuncheckedArr.length;
            byte[] bArr = new byte[length];
            while (i2 < length) {
                bArr[i2] = copy3drangefromuncheckedArr[i2].byteValue();
                i2++;
            }
            return bArr;
        } else if (obj instanceof byte[]) {
            return (byte[]) obj;
        } else {
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                byte[] bArr2 = new byte[iArr.length];
                while (i2 < iArr.length) {
                    bArr2[i2] = (byte) iArr[i2];
                    i2++;
                }
                return bArr2;
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                byte[] bArr3 = new byte[sArr.length];
                while (i2 < sArr.length) {
                    bArr3[i2] = (byte) sArr[i2];
                    i2++;
                }
                return bArr3;
            } else if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                byte[] bArr4 = new byte[charSequence.length()];
                while (i2 < charSequence.length()) {
                    bArr4[i2] = (byte) charSequence.charAt(i2);
                    i2++;
                }
                return bArr4;
            } else if (!(obj instanceof Integer)) {
                return null;
            } else {
                return new byte[]{((Integer) obj).byteValue()};
            }
        }
    }

    public final Double read(int i) {
        Object obj = this.MediaBrowserCompat$ItemReceiver.get(Integer.valueOf(i));
        if (obj == null) {
            return null;
        }
        if ((obj instanceof String) || (obj instanceof createFromBitmap)) {
            try {
                return Double.valueOf(Double.parseDouble(obj.toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        } else if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        } else {
            return null;
        }
    }

    public final Float write(int i) {
        Object obj = this.MediaBrowserCompat$ItemReceiver.get(Integer.valueOf(i));
        if (obj == null) {
            return null;
        }
        if ((obj instanceof String) || (obj instanceof createFromBitmap)) {
            try {
                return Float.valueOf(Float.parseFloat(obj.toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        } else if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        } else {
            return null;
        }
    }

    public final int[] MediaBrowserCompat$ItemReceiver(int i) {
        Object obj = this.MediaBrowserCompat$ItemReceiver.get(Integer.valueOf(i));
        if (obj == null) {
            return null;
        }
        if (obj instanceof int[]) {
            return (int[]) obj;
        }
        int i2 = 0;
        if (obj instanceof copy3DRangeFromUnchecked[]) {
            copy3DRangeFromUnchecked[] copy3drangefromuncheckedArr = (copy3DRangeFromUnchecked[]) obj;
            int length = copy3drangefromuncheckedArr.length;
            int[] iArr = new int[length];
            while (i2 < length) {
                iArr[i2] = copy3drangefromuncheckedArr[i2].intValue();
                i2++;
            }
            return iArr;
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int[] iArr2 = new int[sArr.length];
            while (i2 < sArr.length) {
                iArr2[i2] = sArr[i2];
                i2++;
            }
            return iArr2;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int[] iArr3 = new int[bArr.length];
            while (i2 < bArr.length) {
                iArr3[i2] = bArr[i2];
                i2++;
            }
            return iArr3;
        } else if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            int[] iArr4 = new int[charSequence.length()];
            while (i2 < charSequence.length()) {
                iArr4[i2] = charSequence.charAt(i2);
                i2++;
            }
            return iArr4;
        } else if (!(obj instanceof Integer)) {
            return null;
        } else {
            return new int[]{((Integer) obj).intValue()};
        }
    }

    public final Integer MediaBrowserCompat$CustomActionResultReceiver(int i) {
        Object obj = this.MediaBrowserCompat$ItemReceiver.get(Integer.valueOf(i));
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if ((obj instanceof String) || (obj instanceof createFromBitmap)) {
            try {
                return Integer.valueOf(Integer.parseInt(obj.toString()));
            } catch (NumberFormatException unused) {
                long j = 0;
                for (byte b : obj.toString().getBytes()) {
                    j = (j << 8) + ((long) (b & 255));
                }
                return Integer.valueOf((int) j);
            }
        } else {
            if (obj instanceof copy3DRangeFromUnchecked[]) {
                copy3DRangeFromUnchecked[] copy3drangefromuncheckedArr = (copy3DRangeFromUnchecked[]) obj;
                if (copy3drangefromuncheckedArr.length == 1) {
                    return Integer.valueOf(copy3drangefromuncheckedArr[0].intValue());
                }
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (bArr.length == 1) {
                    return Integer.valueOf(bArr[0]);
                }
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                if (iArr.length == 1) {
                    return Integer.valueOf(iArr[0]);
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                if (sArr.length == 1) {
                    return Integer.valueOf(sArr[0]);
                }
            }
            return null;
        }
    }

    public final Long MediaDescriptionCompat(int i) {
        Object obj = this.MediaBrowserCompat$ItemReceiver.get(Integer.valueOf(i));
        if (obj == null) {
            return null;
        }
        if ((obj instanceof String) || (obj instanceof createFromBitmap)) {
            try {
                return Long.valueOf(Long.parseLong(obj.toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        } else if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        } else {
            return null;
        }
    }

    public final copy3DRangeFromUnchecked RatingCompat(int i) {
        Object obj = this.MediaBrowserCompat$ItemReceiver.get(Integer.valueOf(i));
        if (obj == null) {
            return null;
        }
        if (obj instanceof copy3DRangeFromUnchecked) {
            return (copy3DRangeFromUnchecked) obj;
        }
        if (obj instanceof Integer) {
            return new copy3DRangeFromUnchecked((long) ((Integer) obj).intValue(), 1);
        }
        if (obj instanceof Long) {
            return new copy3DRangeFromUnchecked(((Long) obj).longValue(), 1);
        }
        return null;
    }

    public final copy3DRangeFromUnchecked[] MediaBrowserCompat$MediaItem(int i) {
        Object obj = this.MediaBrowserCompat$ItemReceiver.get(Integer.valueOf(i));
        if (obj != null && (obj instanceof copy3DRangeFromUnchecked[])) {
            return (copy3DRangeFromUnchecked[]) obj;
        }
        return null;
    }

    public final String MediaBrowserCompat$SearchResultReceiver(int i) {
        Object obj = this.MediaBrowserCompat$ItemReceiver.get(Integer.valueOf(i));
        if (obj == null) {
            return null;
        }
        if (obj instanceof copy3DRangeFromUnchecked) {
            return ((copy3DRangeFromUnchecked) obj).IconCompatParcelizer(true);
        }
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            Class<?> componentType = obj.getClass().getComponentType();
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            if (Object.class.isAssignableFrom(componentType)) {
                while (i2 < length) {
                    if (i2 != 0) {
                        sb.append(' ');
                    }
                    sb.append(Array.get(obj, i2).toString());
                    i2++;
                }
            } else if (componentType.getName().equals("int")) {
                while (i2 < length) {
                    if (i2 != 0) {
                        sb.append(' ');
                    }
                    sb.append(Array.getInt(obj, i2));
                    i2++;
                }
            } else if (componentType.getName().equals("short")) {
                while (i2 < length) {
                    if (i2 != 0) {
                        sb.append(' ');
                    }
                    sb.append(Array.getShort(obj, i2));
                    i2++;
                }
            } else if (componentType.getName().equals("long")) {
                while (i2 < length) {
                    if (i2 != 0) {
                        sb.append(' ');
                    }
                    sb.append(Array.getLong(obj, i2));
                    i2++;
                }
            } else if (componentType.getName().equals("float")) {
                while (i2 < length) {
                    if (i2 != 0) {
                        sb.append(' ');
                    }
                    sb.append(new DecimalFormat("0.###").format((double) Array.getFloat(obj, i2)));
                    i2++;
                }
            } else if (componentType.getName().equals("double")) {
                while (i2 < length) {
                    if (i2 != 0) {
                        sb.append(' ');
                    }
                    sb.append(new DecimalFormat("0.###").format(Array.getDouble(obj, i2)));
                    i2++;
                }
            } else if (componentType.getName().equals("byte")) {
                while (i2 < length) {
                    if (i2 != 0) {
                        sb.append(' ');
                    }
                    sb.append(Array.getByte(obj, i2) & 255);
                    i2++;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected array component type: ");
                sb2.append(componentType.getName());
                this.IconCompatParcelizer.add(sb2.toString());
            }
            return sb.toString();
        } else if (obj instanceof Double) {
            return new DecimalFormat("0.###").format(((Double) obj).doubleValue());
        } else {
            if (obj instanceof Float) {
                return new DecimalFormat("0.###").format((double) ((Float) obj).floatValue());
            }
            return obj.toString();
        }
    }
}
