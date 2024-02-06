package com.google.firebase.p067ml.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.vision.text.Text;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionText */
public class FirebaseVisionText {
    private final String text;
    private final List<TextBlock> zzazm;

    public List<TextBlock> getTextBlocks() {
        return Collections.unmodifiableList(this.zzazm);
    }

    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionText$Element */
    public static class Element extends TextBase {
        Element(com.google.android.gms.vision.text.Element element) {
            super(element);
        }

        public Element(String str, Rect rect, List<RecognizedLanguage> list, Float f) {
            super(str, rect, list, f);
        }

        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }

        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }
    }

    public FirebaseVisionText(SparseArray<com.google.android.gms.vision.text.TextBlock> sparseArray) {
        this.zzazm = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sparseArray.size(); i++) {
            com.google.android.gms.vision.text.TextBlock textBlock = sparseArray.get(sparseArray.keyAt(i));
            if (textBlock != null) {
                TextBlock textBlock2 = new TextBlock(textBlock);
                this.zzazm.add(textBlock2);
                if (sb.length() != 0) {
                    sb.append("\n");
                }
                if (textBlock.getValue() != null) {
                    sb.append(textBlock2.getText());
                }
            }
        }
        this.text = sb.toString();
    }

    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionText$TextBase */
    static class TextBase {
        private final Float confidence;
        private final Point[] cornerPoints;
        private final String text;
        private final Rect zzawz;
        private final List<RecognizedLanguage> zzaxs;

        TextBase(Text text2) {
            Preconditions.checkNotNull(text2, "Text to construct FirebaseVisionText classes can't be null");
            this.confidence = null;
            this.text = text2.getValue();
            this.zzawz = text2.getBoundingBox();
            this.cornerPoints = text2.getCornerPoints();
            this.zzaxs = Collections.emptyList();
        }

        private TextBase(String str, Rect rect, List<RecognizedLanguage> list, Float f) {
            Preconditions.checkNotNull(str, "Text string cannot be null");
            Preconditions.checkNotNull(list, "Text languages cannot be null");
            this.confidence = f;
            this.cornerPoints = null;
            this.text = str;
            this.zzawz = rect;
            this.zzaxs = list;
        }

        public Rect getBoundingBox() {
            return this.zzawz;
        }

        public String getText() {
            String str = this.text;
            return str == null ? "" : str;
        }

        public Float getConfidence() {
            return this.confidence;
        }

        public List<RecognizedLanguage> getRecognizedLanguages() {
            return this.zzaxs;
        }
    }

    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionText$Line */
    public static class Line extends TextBase {
        private final List<Element> zzazn;

        Line(com.google.android.gms.vision.text.Line line) {
            super(line);
            this.zzazn = new ArrayList();
            for (Text text : line.getComponents()) {
                if (text instanceof com.google.android.gms.vision.text.Element) {
                    this.zzazn.add(new Element((com.google.android.gms.vision.text.Element) text));
                } else {
                    Log.e("FirebaseVisionText", "A subcomponent of line is should be an element!");
                }
            }
        }

        public Line(String str, Rect rect, List<RecognizedLanguage> list, List<Element> list2, Float f) {
            super(str, rect, list, f);
            this.zzazn = list2;
        }

        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }

        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }
    }

    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionText$TextBlock */
    public static class TextBlock extends TextBase {
        private final List<Line> zzazo;

        TextBlock(com.google.android.gms.vision.text.TextBlock textBlock) {
            super(textBlock);
            this.zzazo = new ArrayList();
            for (Text text : textBlock.getComponents()) {
                if (text instanceof com.google.android.gms.vision.text.Line) {
                    this.zzazo.add(new Line((com.google.android.gms.vision.text.Line) text));
                } else {
                    Log.e("FirebaseVisionText", "A subcomponent of textblock is should be a line!");
                }
            }
        }

        public TextBlock(String str, Rect rect, List<RecognizedLanguage> list, List<Line> list2, Float f) {
            super(str, rect, list, f);
            this.zzazo = list2;
        }

        public /* bridge */ /* synthetic */ List getRecognizedLanguages() {
            return super.getRecognizedLanguages();
        }

        public /* bridge */ /* synthetic */ Float getConfidence() {
            return super.getConfidence();
        }

        public /* bridge */ /* synthetic */ String getText() {
            return super.getText();
        }

        public /* bridge */ /* synthetic */ Rect getBoundingBox() {
            return super.getBoundingBox();
        }
    }

    public FirebaseVisionText(String str, List<TextBlock> list) {
        ArrayList arrayList = new ArrayList();
        this.zzazm = arrayList;
        this.text = str;
        arrayList.addAll(list);
    }
}
