package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;

class ContentModelParser {
    private static JsonReader.Options NAMES = JsonReader.Options.m33of("ty", KtaJsonExactionHelper.OBJECT);

    private ContentModelParser() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        if (r2.equals("gs") != false) goto L_0x00c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.airbnb.lottie.model.content.ContentModel parse(com.airbnb.lottie.parser.moshi.JsonReader r6, com.airbnb.lottie.LottieComposition r7) throws java.io.IOException {
        /*
            r6.beginObject()
            r0 = 2
            r1 = r0
        L_0x0005:
            boolean r2 = r6.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0028
            com.airbnb.lottie.parser.moshi.JsonReader$Options r2 = NAMES
            int r2 = r6.selectName(r2)
            if (r2 == 0) goto L_0x0023
            if (r2 == r3) goto L_0x001e
            r6.skipName()
            r6.skipValue()
            goto L_0x0005
        L_0x001e:
            int r1 = r6.nextInt()
            goto L_0x0005
        L_0x0023:
            java.lang.String r2 = r6.nextString()
            goto L_0x0029
        L_0x0028:
            r2 = r4
        L_0x0029:
            if (r2 != 0) goto L_0x002c
            return r4
        L_0x002c:
            int r5 = r2.hashCode()
            switch(r5) {
                case 3239: goto L_0x00b6;
                case 3270: goto L_0x00ac;
                case 3295: goto L_0x00a2;
                case 3307: goto L_0x0098;
                case 3308: goto L_0x008f;
                case 3488: goto L_0x0084;
                case 3633: goto L_0x0079;
                case 3646: goto L_0x006e;
                case 3669: goto L_0x0064;
                case 3679: goto L_0x0059;
                case 3681: goto L_0x004e;
                case 3705: goto L_0x0041;
                case 3710: goto L_0x0035;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x00c0
        L_0x0035:
            java.lang.String r0 = "tr"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c0
            r0 = 5
            goto L_0x00c1
        L_0x0041:
            java.lang.String r0 = "tm"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c0
            r0 = 9
            goto L_0x00c1
        L_0x004e:
            java.lang.String r0 = "st"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c0
            r0 = r3
            goto L_0x00c1
        L_0x0059:
            java.lang.String r0 = "sr"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c0
            r0 = 10
            goto L_0x00c1
        L_0x0064:
            java.lang.String r0 = "sh"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c0
            r0 = 6
            goto L_0x00c1
        L_0x006e:
            java.lang.String r0 = "rp"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c0
            r0 = 12
            goto L_0x00c1
        L_0x0079:
            java.lang.String r0 = "rc"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c0
            r0 = 8
            goto L_0x00c1
        L_0x0084:
            java.lang.String r0 = "mm"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c0
            r0 = 11
            goto L_0x00c1
        L_0x008f:
            java.lang.String r3 = "gs"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00c0
            goto L_0x00c1
        L_0x0098:
            java.lang.String r0 = "gr"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c0
            r0 = 0
            goto L_0x00c1
        L_0x00a2:
            java.lang.String r0 = "gf"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c0
            r0 = 4
            goto L_0x00c1
        L_0x00ac:
            java.lang.String r0 = "fl"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c0
            r0 = 3
            goto L_0x00c1
        L_0x00b6:
            java.lang.String r0 = "el"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c0
            r0 = 7
            goto L_0x00c1
        L_0x00c0:
            r0 = -1
        L_0x00c1:
            switch(r0) {
                case 0: goto L_0x011a;
                case 1: goto L_0x0115;
                case 2: goto L_0x0110;
                case 3: goto L_0x010b;
                case 4: goto L_0x0106;
                case 5: goto L_0x0101;
                case 6: goto L_0x00fc;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00f2;
                case 9: goto L_0x00ed;
                case 10: goto L_0x00e8;
                case 11: goto L_0x00de;
                case 12: goto L_0x00d9;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unknown shape type "
            r7.append(r0)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            com.airbnb.lottie.utils.Logger.warning(r7)
            goto L_0x011e
        L_0x00d9:
            com.airbnb.lottie.model.content.Repeater r4 = com.airbnb.lottie.parser.RepeaterParser.parse(r6, r7)
            goto L_0x011e
        L_0x00de:
            com.airbnb.lottie.model.content.MergePaths r4 = com.airbnb.lottie.parser.MergePathsParser.parse(r6)
            java.lang.String r0 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."
            r7.addWarning(r0)
            goto L_0x011e
        L_0x00e8:
            com.airbnb.lottie.model.content.PolystarShape r4 = com.airbnb.lottie.parser.PolystarShapeParser.parse(r6, r7)
            goto L_0x011e
        L_0x00ed:
            com.airbnb.lottie.model.content.ShapeTrimPath r4 = com.airbnb.lottie.parser.ShapeTrimPathParser.parse(r6, r7)
            goto L_0x011e
        L_0x00f2:
            com.airbnb.lottie.model.content.RectangleShape r4 = com.airbnb.lottie.parser.RectangleShapeParser.parse(r6, r7)
            goto L_0x011e
        L_0x00f7:
            com.airbnb.lottie.model.content.CircleShape r4 = com.airbnb.lottie.parser.CircleShapeParser.parse(r6, r7, r1)
            goto L_0x011e
        L_0x00fc:
            com.airbnb.lottie.model.content.ShapePath r4 = com.airbnb.lottie.parser.ShapePathParser.parse(r6, r7)
            goto L_0x011e
        L_0x0101:
            com.airbnb.lottie.model.animatable.AnimatableTransform r4 = com.airbnb.lottie.parser.AnimatableTransformParser.parse(r6, r7)
            goto L_0x011e
        L_0x0106:
            com.airbnb.lottie.model.content.GradientFill r4 = com.airbnb.lottie.parser.GradientFillParser.parse(r6, r7)
            goto L_0x011e
        L_0x010b:
            com.airbnb.lottie.model.content.ShapeFill r4 = com.airbnb.lottie.parser.ShapeFillParser.parse(r6, r7)
            goto L_0x011e
        L_0x0110:
            com.airbnb.lottie.model.content.GradientStroke r4 = com.airbnb.lottie.parser.GradientStrokeParser.parse(r6, r7)
            goto L_0x011e
        L_0x0115:
            com.airbnb.lottie.model.content.ShapeStroke r4 = com.airbnb.lottie.parser.ShapeStrokeParser.parse(r6, r7)
            goto L_0x011e
        L_0x011a:
            com.airbnb.lottie.model.content.ShapeGroup r4 = com.airbnb.lottie.parser.ShapeGroupParser.parse(r6, r7)
        L_0x011e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0128
            r6.skipValue()
            goto L_0x011e
        L_0x0128:
            r6.endObject()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.ContentModelParser.parse(com.airbnb.lottie.parser.moshi.JsonReader, com.airbnb.lottie.LottieComposition):com.airbnb.lottie.model.content.ContentModel");
    }
}
