package p040o;

import com.kofax.kmc.ken.engines.service.ImageService;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: o.F64_2 */
public final class F64_2 extends createCubemapFromCubeFaces<I16> {
    public F64_2(I16 i16) {
        super(i16);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        createFromBitmap createfrombitmap;
        switch (i) {
            case 0:
                return ((I16) this.write).MediaBrowserCompat$SearchResultReceiver(i);
            case 10:
                return String.format("0x%08X", new Object[]{((I16) this.write).MediaBrowserCompat$CustomActionResultReceiver(i)});
            case 14:
                return String.format("%d", new Object[]{((I16) this.write).MediaBrowserCompat$CustomActionResultReceiver(i)});
            case 18:
                return String.format("0x%08X", new Object[]{((I16) this.write).MediaBrowserCompat$CustomActionResultReceiver(i)});
            case 22:
                return String.format("%d", new Object[]{((I16) this.write).MediaBrowserCompat$CustomActionResultReceiver(i)});
            case 24:
            case 31:
            case 38:
            case 45:
            case 52:
                return ((I16) this.write).MediaBrowserCompat$SearchResultReceiver(i);
            case 53:
                int[] MediaBrowserCompat$ItemReceiver = ((I16) this.write).MediaBrowserCompat$ItemReceiver(i);
                if (MediaBrowserCompat$ItemReceiver == null) {
                    return null;
                }
                return String.format("%d/%d", new Object[]{Integer.valueOf(MediaBrowserCompat$ItemReceiver[0]), Integer.valueOf(MediaBrowserCompat$ItemReceiver[1])});
            case 55:
                return String.format("%d", new Object[]{((I16) this.write).MediaBrowserCompat$CustomActionResultReceiver(i)});
            case 59:
                String MediaBrowserCompat$SearchResultReceiver = ((I16) this.write).MediaBrowserCompat$SearchResultReceiver(i);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ImageService.EXIF_TIME_FORMAT);
                    return simpleDateFormat.format(simpleDateFormat.parse(MediaBrowserCompat$SearchResultReceiver));
                } catch (ParseException unused) {
                    return null;
                }
            case 67:
                return MediaBrowserCompat$CustomActionResultReceiver(i, "New", "Waxing Crescent", "First Quarter", "Waxing Gibbous", "Full", "Waning Gibbous", "Last Quarter", "Waning Crescent");
            case 68:
            case 70:
                return String.format("%d", new Object[]{((I16) this.write).MediaBrowserCompat$CustomActionResultReceiver(i)});
            case 72:
                return MediaBrowserCompat$CustomActionResultReceiver(i, "Off", "On");
            case 73:
                Double read = ((I16) this.write).read(i);
                DecimalFormat decimalFormat = new DecimalFormat("0.000");
                if (read != null) {
                    return decimalFormat.format(read);
                }
                return null;
            case 75:
                Object obj = ((I16) this.write).MediaBrowserCompat$ItemReceiver.get(Integer.valueOf(i));
                if (obj instanceof createFromBitmap) {
                    createfrombitmap = (createFromBitmap) obj;
                } else {
                    createfrombitmap = null;
                }
                if (createfrombitmap == null) {
                    return null;
                }
                return createfrombitmap.toString();
            case 80:
                return ((I16) this.write).MediaBrowserCompat$SearchResultReceiver(i);
            default:
                return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }
}
