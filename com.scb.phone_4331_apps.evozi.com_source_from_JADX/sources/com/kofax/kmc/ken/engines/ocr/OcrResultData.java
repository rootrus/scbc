package com.kofax.kmc.ken.engines.ocr;

import android.graphics.Rect;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.util.ArrayList;
import java.util.Iterator;

public class OcrResultData {

    /* renamed from: hS */
    String f3395hS;

    /* renamed from: hT */
    private ArrayList<OcrWord> f3396hT;
    String imageID;
    ErrorInfo resultCode;

    public String getText() {
        m3752ae();
        if (this.f3396hT == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<OcrWord> it = this.f3396hT.iterator();
        while (it.hasNext()) {
            StringBuilder sb = new StringBuilder();
            sb.append(it.next().getText());
            sb.append(" ");
            stringBuffer.append(sb.toString());
        }
        return stringBuffer.toString();
    }

    public OcrWord getWordAtPoint(int i, int i2) {
        m3752ae();
        ArrayList<OcrWord> arrayList = this.f3396hT;
        if (arrayList == null) {
            return null;
        }
        Iterator<OcrWord> it = arrayList.iterator();
        while (it.hasNext()) {
            OcrWord next = it.next();
            if (new Rect(next.getX(), next.getY(), next.getX() + next.getWidth(), next.getY() + next.getHeight()).contains(i, i2)) {
                return next;
            }
        }
        return null;
    }

    public ArrayList<OcrWord> getWordsinRect(int i, int i2, int i3, int i4) {
        m3752ae();
        if (this.f3396hT == null) {
            return null;
        }
        ArrayList<OcrWord> arrayList = new ArrayList<>();
        Iterator<OcrWord> it = this.f3396hT.iterator();
        while (it.hasNext()) {
            OcrWord next = it.next();
            if (new Rect(i, i2, i3, i4).intersect(new Rect(next.getX(), next.getY(), next.getWidth() + next.getX(), next.getHeight() + next.getY()))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public ArrayList<OcrWord> getWords() {
        m3752ae();
        return (ArrayList) this.f3396hT.clone();
    }

    /* renamed from: ae */
    private void m3752ae() {
        if (this.f3396hT == null) {
            this.f3396hT = (ArrayList) OcrEngine.ocrWords().clone();
        }
    }
}
