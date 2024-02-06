package com.google.android.gms.internal.firebase_ml;

import android.graphics.Rect;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.p067ml.vision.text.FirebaseVisionText;
import com.google.firebase.p067ml.vision.text.RecognizedLanguage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class zzql {
    private static final GmsLogger zzaoz = new GmsLogger("TextAnnotationConverter", "");

    static FirebaseVisionText zzb(zzjs zzjs, float f) {
        Iterator<zziu> it;
        Iterator<zzjl> it2;
        FirebaseVisionText.TextBlock textBlock;
        Iterator<zzjm> it3;
        Iterator<zziu> it4;
        Iterator<zzjl> it5;
        Iterator<zzjm> it6;
        Iterator<zziu> it7;
        Iterator<zzjl> it8;
        String str;
        FirebaseVisionText.Element element;
        float f2 = f;
        Preconditions.checkNotNull(zzjs, "The input TextAnnotation can not be null");
        FirebaseVisionText.TextBlock textBlock2 = null;
        if (zzjs.getPages().size() <= 0) {
            zzaoz.mo4172d("TextAnnotationConverter", "Text Annotation is null, return null");
            return null;
        }
        if (zzjs.getPages().size() > 1) {
            zzaoz.mo4172d("TextAnnotationConverter", "Text Annotation has more than one page, which should not happen");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<zzjl> it9 = zzjs.getPages().iterator();
        while (it9.hasNext()) {
            Iterator<zziu> it10 = it9.next().getBlocks().iterator();
            while (it10.hasNext()) {
                zziu next = it10.next();
                Preconditions.checkNotNull(next, "Input block can not be null");
                ArrayList arrayList2 = new ArrayList();
                if (next.getParagraphs() == null) {
                    it2 = it9;
                    textBlock = textBlock2;
                    it = it10;
                } else {
                    Iterator<zzjm> it11 = next.getParagraphs().iterator();
                    while (it11.hasNext()) {
                        zzjm next2 = it11.next();
                        if (next2 != null) {
                            Preconditions.checkNotNull(next2, "Input Paragraph can not be null");
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            HashSet<RecognizedLanguage> hashSet = new HashSet<>();
                            StringBuilder sb = new StringBuilder();
                            int i = 0;
                            float f3 = BitmapDescriptorFactory.HUE_RED;
                            while (i < next2.getWords().size()) {
                                zzjx zzjx = next2.getWords().get(i);
                                if (zzjx != null) {
                                    Preconditions.checkNotNull(zzjx, "Input Word can not be null");
                                    Rect zza = zzpm.zza(zzjx.zzhq(), f2);
                                    it8 = it9;
                                    List<RecognizedLanguage> zze = zze(zzjx.zzhr());
                                    Preconditions.checkNotNull(zzjx, "Input Word can not be null");
                                    String str2 = "";
                                    if (zzjx.getSymbols() == null) {
                                        it7 = it10;
                                        str = str2;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        for (zzjr text : zzjx.getSymbols()) {
                                            sb2.append(text.getText());
                                            it10 = it10;
                                        }
                                        it7 = it10;
                                        str = sb2.toString();
                                    }
                                    if (str.isEmpty()) {
                                        it6 = it11;
                                        element = null;
                                    } else {
                                        it6 = it11;
                                        element = new FirebaseVisionText.Element(str, zza, zze, zzjx.getConfidence());
                                    }
                                    if (element != null) {
                                        arrayList4.add(element);
                                        float zza2 = f3 + zzpm.zza(element.getConfidence());
                                        hashSet.addAll(element.getRecognizedLanguages());
                                        sb.append(element.getText());
                                        Preconditions.checkNotNull(zzjx, "Input word can not be null");
                                        String zza3 = zza(zzjx);
                                        if (zza3 != null) {
                                            if (zza3.equals("SPACE") || zza3.equals("SURE_SPACE")) {
                                                str2 = " ";
                                            } else if (zza3.equals("HYPHEN")) {
                                                str2 = "-";
                                            }
                                        }
                                        sb.append(str2);
                                        Preconditions.checkNotNull(zzjx, "Input word can not be null");
                                        String zza4 = zza(zzjx);
                                        if (!(zza4 != null && (zza4.equals("EOL_SURE_SPACE") || zza4.equals("LINE_BREAK") || zza4.equals("HYPHEN")))) {
                                            if (i != next2.getWords().size() - 1) {
                                                f3 = zza2;
                                            }
                                        }
                                        Preconditions.checkNotNull(arrayList4, "Input elements can not be null");
                                        ArrayList arrayList5 = arrayList4;
                                        int size = arrayList5.size();
                                        int i2 = 0;
                                        Rect rect = null;
                                        while (i2 < size) {
                                            Object obj = arrayList5.get(i2);
                                            i2++;
                                            FirebaseVisionText.Element element2 = (FirebaseVisionText.Element) obj;
                                            if (element2.getBoundingBox() != null) {
                                                Rect rect2 = rect == null ? new Rect() : rect;
                                                rect2.union(element2.getBoundingBox());
                                                rect = rect2;
                                            }
                                        }
                                        String sb3 = sb.toString();
                                        ArrayList arrayList6 = new ArrayList();
                                        for (RecognizedLanguage recognizedLanguage : hashSet) {
                                            if (!(recognizedLanguage == null || recognizedLanguage.getLanguageCode() == null || recognizedLanguage.getLanguageCode().isEmpty())) {
                                                arrayList6.add(recognizedLanguage);
                                            }
                                        }
                                        arrayList3.add(new FirebaseVisionText.Line(sb3, rect, arrayList6, arrayList4, Float.compare(zza2, BitmapDescriptorFactory.HUE_RED) > 0 ? Float.valueOf(zza2 / ((float) arrayList4.size())) : null));
                                        ArrayList arrayList7 = new ArrayList();
                                        hashSet.clear();
                                        arrayList4 = arrayList7;
                                        sb = new StringBuilder();
                                        f3 = 0.0f;
                                        i++;
                                        zzjs zzjs2 = zzjs;
                                        it9 = it8;
                                        it10 = it7;
                                        it11 = it6;
                                    }
                                } else {
                                    it8 = it9;
                                    it7 = it10;
                                    it6 = it11;
                                }
                                i++;
                                zzjs zzjs22 = zzjs;
                                it9 = it8;
                                it10 = it7;
                                it11 = it6;
                            }
                            it5 = it9;
                            it4 = it10;
                            it3 = it11;
                            arrayList2.addAll(arrayList3);
                        } else {
                            it5 = it9;
                            it4 = it10;
                            it3 = it11;
                        }
                        zzjs zzjs3 = zzjs;
                        it9 = it5;
                        it10 = it4;
                        it11 = it3;
                    }
                    it2 = it9;
                    it = it10;
                    if (arrayList2.isEmpty()) {
                        textBlock = null;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        ArrayList arrayList8 = arrayList2;
                        int size2 = arrayList8.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayList8.get(i3);
                            i3++;
                            sb4.append(((FirebaseVisionText.Line) obj2).getText());
                            sb4.append("\n");
                        }
                        textBlock = new FirebaseVisionText.TextBlock(sb4.toString(), zzpm.zza(next.zzhq(), f2), zze(next.zzhr()), arrayList2, next.getConfidence());
                    }
                }
                if (textBlock != null) {
                    arrayList.add(textBlock);
                }
                textBlock2 = null;
                zzjs zzjs4 = zzjs;
                it9 = it2;
                it10 = it;
            }
            zzjs zzjs5 = zzjs;
        }
        return new FirebaseVisionText(zzjs.getText(), arrayList);
    }

    public static List<RecognizedLanguage> zze(zzjt zzjt) {
        ArrayList arrayList = new ArrayList();
        if (!(zzjt == null || zzjt.zzia() == null)) {
            for (zziz zza : zzjt.zzia()) {
                RecognizedLanguage zza2 = RecognizedLanguage.zza(zza);
                if (zza2 != null) {
                    arrayList.add(zza2);
                }
            }
        }
        return arrayList;
    }

    private static String zza(zzjx zzjx) {
        Preconditions.checkNotNull(zzjx, "Input Word can not be null");
        if (zzjx.getSymbols() == null || zzjx.getSymbols().size() <= 0) {
            return null;
        }
        zzjr zzjr = zzjx.getSymbols().get(zzjx.getSymbols().size() - 1);
        if (zzjr.zzhr() == null || zzjr.zzhr().zzhz() == null) {
            return null;
        }
        return zzjx.getSymbols().get(zzjx.getSymbols().size() - 1).zzhr().zzhz().getType();
    }
}
