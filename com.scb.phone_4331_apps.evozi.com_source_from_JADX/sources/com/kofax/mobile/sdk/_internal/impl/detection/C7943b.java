package com.kofax.mobile.sdk._internal.impl.detection;

import android.graphics.Bitmap;
import com.kofax.kmc.kui.uicontrols.Utility;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiJsonExactionHelper;

/* renamed from: com.kofax.mobile.sdk._internal.impl.detection.b */
public class C7943b implements Frame {
    public final byte[] _data;
    public final int _format;
    public final int _height;
    public final int _width;

    public C7943b(byte[] bArr, int i, int i2, int i3) {
        if (bArr != null) {
            m3909a(i2, RttiJsonExactionHelper.WIDTH);
            m3909a(i3, RttiJsonExactionHelper.HEIGHT);
            this._data = bArr;
            this._format = i;
            this._width = i2;
            this._height = i3;
            return;
        }
        throw new IllegalArgumentException("data is null");
    }

    public int getWidth() {
        return this._width;
    }

    public int getHeight() {
        return this._height;
    }

    public Bitmap toBitmap() {
        return Utility.imageDataToBitmap(this._data, this._width, this._height, this._format, 0);
    }

    /* renamed from: a */
    private static void m3909a(int i, String str) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
