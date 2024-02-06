package p040o;

import com.kofax.kmc.ken.engines.service.ImageService;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: o.F64_4 */
public final class F64_4 extends createCubemapFromCubeFaces<I16_2> {
    public F64_4(I16_2 i16_2) {
        super(i16_2);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        createFromBitmap createfrombitmap;
        switch (i) {
            case 0:
                return String.format("%d", new Object[]{((I16_2) this.write).MediaBrowserCompat$CustomActionResultReceiver(i)});
            case 2:
                return ((I16_2) this.write).MediaBrowserCompat$SearchResultReceiver(i);
            case 12:
                return ((I16_2) this.write).MediaBrowserCompat$SearchResultReceiver(i);
            case 14:
                int[] MediaBrowserCompat$ItemReceiver = ((I16_2) this.write).MediaBrowserCompat$ItemReceiver(i);
                if (MediaBrowserCompat$ItemReceiver == null) {
                    return null;
                }
                return String.format("%d/%d", new Object[]{Integer.valueOf(MediaBrowserCompat$ItemReceiver[0]), Integer.valueOf(MediaBrowserCompat$ItemReceiver[1])});
            case 18:
                return String.format("%d", new Object[]{((I16_2) this.write).MediaBrowserCompat$CustomActionResultReceiver(i)});
            case 22:
                String MediaBrowserCompat$SearchResultReceiver = ((I16_2) this.write).MediaBrowserCompat$SearchResultReceiver(i);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ImageService.EXIF_TIME_FORMAT);
                    return simpleDateFormat.format(simpleDateFormat.parse(MediaBrowserCompat$SearchResultReceiver));
                } catch (ParseException unused) {
                    return null;
                }
            case 36:
                return MediaBrowserCompat$CustomActionResultReceiver(i, "New", "Waxing Crescent", "First Quarter", "Waxing Gibbous", "Full", "Waning Gibbous", "Last Quarter", "Waning Crescent");
            case 38:
            case 40:
                return String.format("%d", new Object[]{((I16_2) this.write).MediaBrowserCompat$CustomActionResultReceiver(i)});
            case 42:
                Object obj = ((I16_2) this.write).MediaBrowserCompat$ItemReceiver.get(Integer.valueOf(i));
                if (obj instanceof createFromBitmap) {
                    createfrombitmap = (createFromBitmap) obj;
                } else {
                    createfrombitmap = null;
                }
                if (createfrombitmap == null) {
                    return null;
                }
                return createfrombitmap.toString();
            case 72:
            case 74:
            case 76:
            case 78:
                return String.format("%d", new Object[]{((I16_2) this.write).MediaBrowserCompat$CustomActionResultReceiver(i)});
            case 80:
                return MediaBrowserCompat$CustomActionResultReceiver(i, "Off", "On");
            case 82:
                return String.format("%d", new Object[]{((I16_2) this.write).MediaBrowserCompat$CustomActionResultReceiver(i)});
            case 84:
                Double read = ((I16_2) this.write).read(i);
                DecimalFormat decimalFormat = new DecimalFormat("0.000");
                if (read != null) {
                    return decimalFormat.format(read);
                }
                return null;
            case 86:
                return ((I16_2) this.write).MediaBrowserCompat$SearchResultReceiver(i);
            default:
                return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }
}
