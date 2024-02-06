package p040o;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p040o.getSubElementOffsetBytes;
import p040o.rsnAllocationRead1D;

/* renamed from: o.Element  reason: case insensitive filesystem */
public final class C10821Element extends createCubemapFromCubeFaces<A_8> {

    /* renamed from: o.Element$Builder */
    public final class Builder {
        private Set<String> MediaBrowserCompat$CustomActionResultReceiver;
        private getSubElementOffsetBytes.read read;
        private C1344x72315db3 write;

        protected Builder() {
            this(new rsnAllocationRead1D.read(), new getSubElementCount());
        }

        private Builder(getSubElementOffsetBytes.read read2, C1344x72315db3 getsubelementoffsetbytes_mediabrowsercompat_customactionresultreceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new HashSet();
            this.read = read2;
            this.write = getsubelementoffsetbytes_mediabrowsercompat_customactionresultreceiver;
        }

        /* access modifiers changed from: package-private */
        public void MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, String str2) {
            if (!this.MediaBrowserCompat$CustomActionResultReceiver.contains(str)) {
                try {
                    this.read.write(str);
                    this.MediaBrowserCompat$CustomActionResultReceiver.add(str);
                } catch (UnsatisfiedLinkError e) {
                    Log.getStackTraceString(e);
                    File MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(context, str, str2);
                    if (!MediaBrowserCompat$ItemReceiver.exists()) {
                        read(context, str, str2);
                        this.write.read(context, this.read.write(), this.read.IconCompatParcelizer(str), MediaBrowserCompat$ItemReceiver, this);
                    }
                    this.read.read(MediaBrowserCompat$ItemReceiver.getAbsolutePath());
                    this.MediaBrowserCompat$CustomActionResultReceiver.add(str);
                }
            }
        }

        private File MediaBrowserCompat$ItemReceiver(Context context, String str, String str2) {
            String IconCompatParcelizer = this.read.IconCompatParcelizer(str);
            if (str2 == null || str2.length() == 0) {
                return new File(context.getDir("lib", 0), IconCompatParcelizer);
            }
            File dir = context.getDir("lib", 0);
            StringBuilder sb = new StringBuilder();
            sb.append(IconCompatParcelizer);
            sb.append(".");
            sb.append(str2);
            return new File(dir, sb.toString());
        }

        private void read(Context context, String str, String str2) {
            File dir = context.getDir("lib", 0);
            File MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(context, str, str2);
            final String IconCompatParcelizer = this.read.IconCompatParcelizer(str);
            File[] listFiles = dir.listFiles(new FilenameFilter() {
                public final boolean accept(File file, String str) {
                    return str.startsWith(IconCompatParcelizer);
                }
            });
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (!file.getAbsolutePath().equals(MediaBrowserCompat$ItemReceiver.getAbsolutePath())) {
                        file.delete();
                    }
                }
            }
        }
    }

    public C10821Element(A_8 a_8) {
        super(a_8);
    }

    /* renamed from: o.Element$DataType */
    public final class DataType extends DataKind {
        public Element$DataType$MediaBrowserCompat$ItemReceiver PlaybackStateCompat = Element$DataType$MediaBrowserCompat$ItemReceiver.TOP;
        public int PlaybackStateCompat$CustomAction = 1;
        public int setHasDecor = 1;

        public DataType() {
            this.f2542x50fd9e4a = subShort3.read(4.0f);
        }
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 0) {
            return IconCompatParcelizer(0, 4);
        }
        switch (i) {
            case 264:
                return MediaBrowserCompat$CustomActionResultReceiver(264, "sRGB", "Adobe RGB", "Pro Photo RGB");
            case 265:
                return MediaBrowserCompat$CustomActionResultReceiver(265, "High Speed", "High Function", "Advanced High Speed", "Advanced High Function");
            case 266:
                Integer MediaBrowserCompat$CustomActionResultReceiver = ((A_8) this.write).MediaBrowserCompat$CustomActionResultReceiver(266);
                if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                    return null;
                }
                if (MediaBrowserCompat$CustomActionResultReceiver.intValue() == 0) {
                    return "(none)";
                }
                StringBuilder sb = new StringBuilder();
                int intValue = MediaBrowserCompat$CustomActionResultReceiver.intValue();
                if ((intValue & 1) != 0) {
                    sb.append("Noise Reduction, ");
                }
                if (((intValue >> 1) & 1) != 0) {
                    sb.append("Noise Filter, ");
                }
                if (((intValue >> 2) & 1) != 0) {
                    sb.append("Noise Filter (ISO Boost), ");
                }
                return sb.substring(0, sb.length() - 2);
            case 267:
                Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((A_8) this.write).MediaBrowserCompat$CustomActionResultReceiver(267);
                if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                    return null;
                }
                int intValue2 = MediaBrowserCompat$CustomActionResultReceiver2.intValue();
                if (intValue2 == 0) {
                    return "Original";
                }
                if (intValue2 == 1) {
                    return "Edited (Landscape)";
                }
                if (intValue2 == 6 || intValue2 == 8) {
                    return "Edited (Portrait)";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown (");
                sb2.append(MediaBrowserCompat$CustomActionResultReceiver2);
                sb2.append(")");
                return sb2.toString();
            case 268:
                Integer MediaBrowserCompat$CustomActionResultReceiver3 = ((A_8) this.write).MediaBrowserCompat$CustomActionResultReceiver(268);
                if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                    return null;
                }
                if (MediaBrowserCompat$CustomActionResultReceiver3.intValue() == 0) {
                    return "(none)";
                }
                StringBuilder sb3 = new StringBuilder();
                int intValue3 = MediaBrowserCompat$CustomActionResultReceiver3.intValue();
                if ((intValue3 & 1) != 0) {
                    sb3.append("WB Color Temp, ");
                }
                if (((intValue3 >> 1) & 1) != 0) {
                    sb3.append("WB Gray Point, ");
                }
                if (((intValue3 >> 2) & 1) != 0) {
                    sb3.append("Saturation, ");
                }
                if (((intValue3 >> 3) & 1) != 0) {
                    sb3.append("Contrast, ");
                }
                if (((intValue3 >> 4) & 1) != 0) {
                    sb3.append("Sharpness, ");
                }
                if (((intValue3 >> 5) & 1) != 0) {
                    sb3.append("Color Space, ");
                }
                if (((intValue3 >> 6) & 1) != 0) {
                    sb3.append("High Function, ");
                }
                if (((intValue3 >> 7) & 1) != 0) {
                    sb3.append("Noise Reduction, ");
                }
                return sb3.substring(0, sb3.length() - 2);
            default:
                return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }

    /* renamed from: o.Element$DataKind */
    public abstract class DataKind extends C11751 {
        public float IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        private addU16 Keep;
        public float MediaBrowserCompat$CustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        public float[] MediaBrowserCompat$ItemReceiver = new float[0];
        public int MediaBrowserCompat$MediaItem;
        public boolean MediaBrowserCompat$SearchResultReceiver = true;
        public int MediaDescriptionCompat = 6;
        public float[] MediaMetadataCompat = new float[0];
        public List<createFieldPack> RatingCompat;
        public int read;
        public float write = BitmapDescriptorFactory.HUE_RED;

        public DataKind() {
            this.MediaSessionCompat$QueueItem = subShort3.read(10.0f);
            this.MediaSessionCompat$Token = subShort3.read(5.0f);
            this.f2542x50fd9e4a = subShort3.read(5.0f);
            this.RatingCompat = new ArrayList();
        }

        public final String IconCompatParcelizer() {
            String str;
            int i = 0;
            String str2 = "";
            while (true) {
                float[] fArr = this.MediaMetadataCompat;
                if (i >= fArr.length) {
                    return str2;
                }
                if (i < 0 || i >= fArr.length) {
                    str = "";
                } else {
                    str = MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat[i]);
                }
                if (str != null && str2.length() < str.length()) {
                    str2 = str;
                }
                i++;
            }
        }

        public final addU16 MediaBrowserCompat$CustomActionResultReceiver() {
            addU16 addu16 = this.Keep;
            if (addu16 == null || ((addu16 instanceof addU32) && ((addU32) addu16).write != this.read)) {
                this.Keep = new addU32(this.read);
            }
            return this.Keep;
        }

        public void MediaBrowserCompat$ItemReceiver(float f, float f2) {
            float f3 = f2 + BitmapDescriptorFactory.HUE_RED;
            if (Math.abs(f3 - f) == BitmapDescriptorFactory.HUE_RED) {
                f3 += 1.0f;
                f -= 1.0f;
            }
            this.IconCompatParcelizer = f;
            this.MediaBrowserCompat$CustomActionResultReceiver = f3;
            this.write = Math.abs(f3 - f);
        }
    }
}
