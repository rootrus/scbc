package p040o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.NotFoundException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import kotlin.TypeCastException;
import net.sourceforge.zbar.Image;
import net.sourceforge.zbar.ImageScanner;
import net.sourceforge.zbar.Symbol;
import net.sourceforge.zbar.SymbolSet;

/* renamed from: o.FragmentBuilder_BindDepositProductDetailFragment */
public final class FragmentBuilder_BindDepositProductDetailFragment {
    private static final HmlVerifyEmailActivity MediaBrowserCompat$CustomActionResultReceiver;
    private static final HmlVerifyEmailActivity read;

    static {
        FundActionsSuccessActivity fundActionsSuccessActivity = write.read;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        read = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
        FundActionsSuccessActivity fundActionsSuccessActivity2 = C6499xb793c190.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity2, "initializer");
        MediaBrowserCompat$CustomActionResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity2);
    }

    public static final String MediaBrowserCompat$ItemReceiver(int i, int i2, byte[] bArr) {
        onGetStartedClick.write((Object) bArr, "imageData");
        Image image = new Image(i, i2, "Y800");
        image.setData(bArr);
        String MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver((ImageScanner) read.MediaBrowserCompat$CustomActionResultReceiver(), image);
        return MediaBrowserCompat$CustomActionResultReceiver2 == null ? "" : MediaBrowserCompat$CustomActionResultReceiver2;
    }

    private static Image IconCompatParcelizer(int i, int i2, int[] iArr) {
        Image image = new Image(i, i2, "RGB4");
        image.setData(iArr);
        long convert = image.convert(image.peer, "Y800");
        Image image2 = convert == 0 ? null : new Image(convert);
        onGetStartedClick.IconCompatParcelizer((Object) image2, "convert(IMAGE_FORMAT_Y800)");
        onGetStartedClick.IconCompatParcelizer((Object) image2, "with(Image(width, height…GE_FORMAT_Y800)\n        }");
        return image2;
    }

    private static String MediaBrowserCompat$CustomActionResultReceiver(ImageScanner imageScanner, Image image) {
        String str = "";
        if (imageScanner.scanImage(image) != 0) {
            for (Symbol symbol : new SymbolSet(imageScanner.getResults(imageScanner.peer))) {
                try {
                    onGetStartedClick.IconCompatParcelizer((Object) symbol, "it");
                    String data = symbol.getData();
                    onGetStartedClick.IconCompatParcelizer((Object) data, "it.data");
                    str = write(data);
                    if (str != null && GoodToKnowActivity.read(str, "�", false)) {
                        byte[] dataBytes = symbol.getDataBytes();
                        onGetStartedClick.IconCompatParcelizer((Object) dataBytes, "it.dataBytes");
                        str = new String(dataBytes, GroupFavoriteActivity.IconCompatParcelizer);
                    }
                } catch (UnsupportedEncodingException e) {
                    onCheckBoxClick.IconCompatParcelizer(e, "Error getting data from the barcode", new Object[0]);
                }
            }
        }
        return str;
    }

    private static String write(String str) {
        try {
            Charset forName = Charset.forName("Shift_JIS");
            onGetStartedClick.IconCompatParcelizer((Object) forName, "Charset.forName(charsetName)");
            if (str != null) {
                byte[] bytes = str.getBytes(forName);
                onGetStartedClick.IconCompatParcelizer((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                return new String(bytes, GroupFavoriteActivity.IconCompatParcelizer);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private static String read(int i, int i2, int[] iArr) {
        setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver = new setFontAssetDelegate$MediaBrowserCompat$ItemReceiver(new rsnScriptSetVarJ(new rsnObjDestroy(i, i2, iArr)));
        rsnSamplerCreate rsnsamplercreate = new rsnSamplerCreate();
        try {
            EnumSet<E> noneOf = EnumSet.noneOf(rsnIncAllocationCreateTyped.class);
            noneOf.addAll(zzmc.MediaBrowserCompat$MediaItem());
            noneOf.addAll(zzmc.IconCompatParcelizer());
            noneOf.addAll(zzmc.MediaBrowserCompat$SearchResultReceiver());
            noneOf.addAll(zzmc.write());
            noneOf.addAll(zzmc.MediaBrowserCompat$ItemReceiver());
            noneOf.addAll(zzmc.MediaBrowserCompat$CustomActionResultReceiver());
            noneOf.addAll(zzmc.read());
            EnumMap enumMap = new EnumMap(rsnIncContextCreate.class);
            enumMap.put(rsnIncContextCreate.TRY_HARDER, Boolean.TRUE);
            enumMap.put(rsnIncContextCreate.CHARACTER_SET, "utf-8");
            enumMap.put(rsnIncContextCreate.POSSIBLE_FORMATS, noneOf);
            rsnsamplercreate.MediaBrowserCompat$ItemReceiver((Map<rsnIncContextCreate, ?>) enumMap);
            if (rsnsamplercreate.read == null) {
                rsnsamplercreate.MediaBrowserCompat$ItemReceiver((Map<rsnIncContextCreate, ?>) null);
            }
            getLayers$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver = rsnsamplercreate.MediaBrowserCompat$ItemReceiver(setfontassetdelegate_mediabrowsercompat_itemreceiver);
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "result");
            String str = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            onGetStartedClick.IconCompatParcelizer((Object) str, "result.text");
            return str;
        } catch (Exception e) {
            if ((e instanceof NotFoundException) || (e instanceof NullPointerException)) {
                onCheckBoxClick.IconCompatParcelizer(e);
                return "";
            }
            throw e;
        }
    }

    /* renamed from: o.FragmentBuilder_BindDepositProductDetailFragment$write */
    static final class write extends CheckEligibilityActivity implements FundActionsSuccessActivity<ImageScanner> {
        public static final write read = new write();

        write() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ImageScanner imageScanner = new ImageScanner();
            imageScanner.setConfig(128, 256, 0);
            imageScanner.setConfig(128, 257, 0);
            imageScanner.setConfig(64, 256, 0);
            imageScanner.setConfig(64, 257, 0);
            imageScanner.setConfig(128, 0, 1);
            imageScanner.setConfig(64, 0, 1);
            return imageScanner;
        }
    }

    public static final String write(byte[] bArr) {
        byte[] bArr2 = bArr;
        String str = "";
        onGetStartedClick.write((Object) bArr2, "imageData");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length, options);
        onGetStartedClick.IconCompatParcelizer((Object) decodeByteArray, "bitmap");
        int width = decodeByteArray.getWidth();
        int height = decodeByteArray.getHeight();
        decodeByteArray.getPixels(new int[(width * height)], 0, width, 0, 0, width, height);
        int width2 = decodeByteArray.getWidth();
        int height2 = decodeByteArray.getHeight();
        int[] iArr = new int[(width2 * height2)];
        try {
            decodeByteArray.getPixels(iArr, 0, width2, 0, 0, width2, height2);
            int i = 2;
            String MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver((ImageScanner) MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(), IconCompatParcelizer(width2, height2, iArr));
            int i2 = 0;
            while (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                if (!(MediaBrowserCompat$CustomActionResultReceiver2.length() == 0) || i2 > 3) {
                    break;
                }
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, decodeByteArray.getWidth() / i, decodeByteArray.getHeight() / i, true);
                onGetStartedClick.IconCompatParcelizer((Object) createScaledBitmap, "bCode");
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap.getWidth() + 100, createScaledBitmap.getHeight() + 100, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setColor(-1);
                onGetStartedClick.IconCompatParcelizer((Object) createBitmap, "bHolder");
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) createBitmap.getWidth(), (float) createBitmap.getHeight(), paint);
                canvas.drawBitmap(createScaledBitmap, 50.0f, 50.0f, paint);
                int width3 = createBitmap.getWidth();
                int height3 = createBitmap.getHeight();
                int[] iArr2 = new int[(width3 * height3)];
                createBitmap.getPixels(iArr2, 0, width3, 0, 0, width3, height3);
                createBitmap.recycle();
                NTBPinLoginActivity nTBPinLoginActivity = new NTBPinLoginActivity(Integer.valueOf(width3), Integer.valueOf(height3), iArr2);
                int intValue = ((Number) nTBPinLoginActivity.write).intValue();
                int intValue2 = ((Number) nTBPinLoginActivity.IconCompatParcelizer).intValue();
                int[] iArr3 = (int[]) nTBPinLoginActivity.read;
                String MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver((ImageScanner) MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(), IconCompatParcelizer(intValue, intValue2, iArr3));
                if (MediaBrowserCompat$CustomActionResultReceiver3 != null) {
                    if (MediaBrowserCompat$CustomActionResultReceiver3.length() == 0) {
                        MediaBrowserCompat$CustomActionResultReceiver2 = read(intValue, intValue2, iArr3);
                        i++;
                        i2++;
                    }
                }
                MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver3;
                i++;
                i2++;
            }
            if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                str = MediaBrowserCompat$CustomActionResultReceiver2;
            }
            return str;
        } catch (Exception e) {
            onCheckBoxClick.write((Throwable) e);
            return str;
        } finally {
            decodeByteArray.recycle();
        }
    }
}
