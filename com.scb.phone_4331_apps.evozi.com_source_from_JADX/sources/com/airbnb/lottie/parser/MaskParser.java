package com.airbnb.lottie.parser;

class MaskParser {
    private MaskParser() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.airbnb.lottie.model.content.Mask parse(com.airbnb.lottie.parser.moshi.JsonReader r12, com.airbnb.lottie.LottieComposition r13) throws java.io.IOException {
        /*
            r12.beginObject()
            r0 = 0
            r1 = 0
            r4 = r0
            r2 = r1
            r3 = r2
        L_0x0008:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x00d6
            java.lang.String r5 = r12.nextName()
            int r6 = r5.hashCode()
            r7 = 111(0x6f, float:1.56E-43)
            r8 = 3
            r9 = 1
            r10 = 2
            r11 = -1
            if (r6 == r7) goto L_0x004a
            r7 = 3588(0xe04, float:5.028E-42)
            if (r6 == r7) goto L_0x0040
            r7 = 104433(0x197f1, float:1.46342E-40)
            if (r6 == r7) goto L_0x0036
            r7 = 3357091(0x3339a3, float:4.704286E-39)
            if (r6 != r7) goto L_0x0054
            java.lang.String r6 = "mode"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0054
            r6 = r0
            goto L_0x0055
        L_0x0036:
            java.lang.String r6 = "inv"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0054
            r6 = r8
            goto L_0x0055
        L_0x0040:
            java.lang.String r6 = "pt"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0054
            r6 = r9
            goto L_0x0055
        L_0x004a:
            java.lang.String r6 = "o"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0054
            r6 = r10
            goto L_0x0055
        L_0x0054:
            r6 = r11
        L_0x0055:
            if (r6 == 0) goto L_0x0070
            if (r6 == r9) goto L_0x006b
            if (r6 == r10) goto L_0x0066
            if (r6 == r8) goto L_0x0061
            r12.skipValue()
            goto L_0x0008
        L_0x0061:
            boolean r4 = r12.nextBoolean()
            goto L_0x0008
        L_0x0066:
            com.airbnb.lottie.model.animatable.AnimatableIntegerValue r3 = com.airbnb.lottie.parser.AnimatableValueParser.parseInteger(r12, r13)
            goto L_0x0008
        L_0x006b:
            com.airbnb.lottie.model.animatable.AnimatableShapeValue r2 = com.airbnb.lottie.parser.AnimatableValueParser.parseShapeData(r12, r13)
            goto L_0x0008
        L_0x0070:
            java.lang.String r1 = r12.nextString()
            int r6 = r1.hashCode()
            r7 = 97
            if (r6 == r7) goto L_0x0099
            r7 = 105(0x69, float:1.47E-43)
            if (r6 == r7) goto L_0x008f
            r7 = 115(0x73, float:1.61E-43)
            if (r6 == r7) goto L_0x0085
            goto L_0x00a2
        L_0x0085:
            java.lang.String r6 = "s"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00a2
            r11 = r9
            goto L_0x00a2
        L_0x008f:
            java.lang.String r6 = "i"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00a2
            r11 = r10
            goto L_0x00a2
        L_0x0099:
            java.lang.String r6 = "a"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00a2
            r11 = r0
        L_0x00a2:
            if (r11 == 0) goto L_0x00d2
            if (r11 == r9) goto L_0x00ce
            if (r11 == r10) goto L_0x00c5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "Unknown mask mode "
            r1.append(r6)
            r1.append(r5)
            java.lang.String r5 = ". Defaulting to Add."
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.airbnb.lottie.utils.Logger.warning(r1)
            com.airbnb.lottie.model.content.Mask$MaskMode r1 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD
            goto L_0x0008
        L_0x00c5:
            java.lang.String r1 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r13.addWarning(r1)
            com.airbnb.lottie.model.content.Mask$MaskMode r1 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_INTERSECT
            goto L_0x0008
        L_0x00ce:
            com.airbnb.lottie.model.content.Mask$MaskMode r1 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_SUBTRACT
            goto L_0x0008
        L_0x00d2:
            com.airbnb.lottie.model.content.Mask$MaskMode r1 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD
            goto L_0x0008
        L_0x00d6:
            r12.endObject()
            com.airbnb.lottie.model.content.Mask r12 = new com.airbnb.lottie.model.content.Mask
            r12.<init>(r1, r2, r3, r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.MaskParser.parse(com.airbnb.lottie.parser.moshi.JsonReader, com.airbnb.lottie.LottieComposition):com.airbnb.lottie.model.content.Mask");
    }
}
