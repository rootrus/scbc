package p040o;

import android.util.Log;
import com.google.firebase.p067ml.vision.text.FirebaseVisionText;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p039io.beid.beidk.p058ui.camera.GraphicOverlay;

/* renamed from: o.ThirdPartySlipActivity */
public final class ThirdPartySlipActivity implements CloseAccountSelectionActivity<FirebaseVisionText> {
    public ChequeSuccessActivity IconCompatParcelizer;
    private GraphicOverlay<Object> MediaBrowserCompat$CustomActionResultReceiver;
    private Map<Character, Integer> MediaBrowserCompat$ItemReceiver;

    public ThirdPartySlipActivity(GraphicOverlay<Object> graphicOverlay) {
        new SimpleDateFormat("yyMMdd");
        this.MediaBrowserCompat$CustomActionResultReceiver = graphicOverlay;
        IconCompatParcelizer();
    }

    private void IconCompatParcelizer() {
        HashMap hashMap = new HashMap();
        this.MediaBrowserCompat$ItemReceiver = hashMap;
        Integer num = 0;
        hashMap.put('<', num);
        while (num.intValue() < 10) {
            this.MediaBrowserCompat$ItemReceiver.put(Character.valueOf(num.toString().toCharArray()[0]), num);
            num = Integer.valueOf(num.intValue() + 1);
        }
        for (Integer num2 = 10; num2.intValue() < 36; num2 = Integer.valueOf(num2.intValue() + 1)) {
            this.MediaBrowserCompat$ItemReceiver.put(Character.valueOf((char) (num2.intValue() + 55)), num2);
        }
    }

    private boolean IconCompatParcelizer(String str, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            i2++;
            i3 += write(i2) * this.MediaBrowserCompat$ItemReceiver.get(Character.valueOf(charAt)).intValue();
        }
        return i3 % 10 == i;
    }

    private void MediaBrowserCompat$ItemReceiver(String str) {
        Matcher matcher = Pattern.compile("([\\w\\d<]{9})(\\d)([\\w<]{3})(\\d{6})(\\d)([FM])(\\d{6})(\\d)").matcher(str.trim().replaceAll(" ", ""));
        while (matcher.find()) {
            String group = matcher.group(1);
            int parseInt = Integer.parseInt(matcher.group(2));
            String group2 = matcher.group(4);
            int parseInt2 = Integer.parseInt(matcher.group(5));
            String group3 = matcher.group(7);
            int parseInt3 = Integer.parseInt(matcher.group(8));
            try {
                if (IconCompatParcelizer(group, parseInt) && IconCompatParcelizer(group2, parseInt2) && IconCompatParcelizer(group3, parseInt3)) {
                    Log.d(getClass().getName(), "Found BAC DATA in processor!");
                    this.IconCompatParcelizer.read(group, group2, group3);
                    write();
                }
            } catch (Exception unused) {
                Log.d(getClass().getName(), "error on processing text");
            }
        }
    }

    private static int write(int i) {
        int i2 = i % 3;
        if (i2 == 0) {
            return 1;
        }
        if (i2 != 1) {
            return i2 != 2 ? 0 : 3;
        }
        return 7;
    }

    public final void read(List<FirebaseVisionText> list) {
        for (FirebaseVisionText textBlocks : list) {
            for (FirebaseVisionText.TextBlock text : textBlocks.getTextBlocks()) {
                String text2 = text.getText();
                StringBuilder sb = new StringBuilder();
                sb.append("Text detected! ");
                sb.append(text2);
                Log.d("OcrDetectorProcessor", sb.toString());
                MediaBrowserCompat$ItemReceiver(text2);
            }
        }
    }

    public final void write() {
        GraphicOverlay<Object> graphicOverlay = this.MediaBrowserCompat$CustomActionResultReceiver;
        synchronized (graphicOverlay.read) {
            graphicOverlay.write.clear();
        }
        graphicOverlay.postInvalidate();
    }
}
