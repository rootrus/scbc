package com.airbnb.lottie.parser;

import android.graphics.Rect;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p040o.setAutoSizeTextTypeWithDefaults;
import p040o.setButtonDrawable;

public class LottieCompositionParser {
    static JsonReader.Options NAMES = JsonReader.Options.m33of("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    public static LottieComposition parse(JsonReader jsonReader) throws IOException {
        ArrayList arrayList;
        HashMap hashMap;
        JsonReader jsonReader2 = jsonReader;
        float dpScale = Utils.dpScale();
        setAutoSizeTextTypeWithDefaults setautosizetexttypewithdefaults = new setAutoSizeTextTypeWithDefaults();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        setButtonDrawable setbuttondrawable = new setButtonDrawable();
        LottieComposition lottieComposition = new LottieComposition();
        jsonReader.beginObject();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            switch (jsonReader2.selectName(NAMES)) {
                case 0:
                    HashMap hashMap5 = hashMap4;
                    ArrayList arrayList4 = arrayList3;
                    i = jsonReader.nextInt();
                    continue;
                case 1:
                    HashMap hashMap6 = hashMap4;
                    ArrayList arrayList5 = arrayList3;
                    i2 = jsonReader.nextInt();
                    continue;
                case 2:
                    HashMap hashMap7 = hashMap4;
                    ArrayList arrayList6 = arrayList3;
                    f = (float) jsonReader.nextDouble();
                    continue;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) jsonReader.nextDouble()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case 5:
                    String[] split = jsonReader.nextString().split("\\.");
                    if (!Utils.isAtLeastVersion(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        lottieComposition.addWarning("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 6:
                    parseLayers(jsonReader2, lottieComposition, arrayList2, setautosizetexttypewithdefaults);
                    break;
            }
            hashMap = hashMap4;
            arrayList = arrayList3;
            jsonReader.skipValue();
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            jsonReader2 = jsonReader;
        }
        ArrayList arrayList7 = arrayList3;
        lottieComposition.init(new Rect(0, 0, (int) (((float) i) * dpScale), (int) (((float) i2) * dpScale)), f, f2, f3, arrayList2, setautosizetexttypewithdefaults, hashMap2, hashMap3, setbuttondrawable, hashMap4, arrayList3);
        return lottieComposition;
    }

    private static void parseLayers(JsonReader jsonReader, LottieComposition lottieComposition, List<Layer> list, setAutoSizeTextTypeWithDefaults<Layer> setautosizetexttypewithdefaults) throws IOException {
        jsonReader.beginArray();
        int i = 0;
        while (jsonReader.hasNext()) {
            Layer parse = LayerParser.parse(jsonReader, lottieComposition);
            if (parse.getLayerType() == Layer.LayerType.IMAGE) {
                i++;
            }
            list.add(parse);
            setautosizetexttypewithdefaults.read(parse.getId(), parse);
            if (i > 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("You have ");
                sb.append(i);
                sb.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                Logger.warning(sb.toString());
            }
        }
        jsonReader.endArray();
    }
}
