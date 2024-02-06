package androidx.renderscript;

import android.os.Build;
import androidx.renderscript.Script;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class ScriptIntrinsicColorMatrix extends ScriptIntrinsic {
    private static final int INTRINSIC_API_LEVEL = 19;
    private final Float4 mAdd = new Float4();
    private Allocation mInput;
    private final Matrix4f mMatrix = new Matrix4f();

    protected ScriptIntrinsicColorMatrix(long j, RenderScript renderScript) {
        super(j, renderScript);
    }

    public static ScriptIntrinsicColorMatrix create(RenderScript renderScript, Element element) {
        if (element.isCompatible(Element.U8_4(renderScript))) {
            boolean z = renderScript.isUseNative() && Build.VERSION.SDK_INT < 19;
            ScriptIntrinsicColorMatrix scriptIntrinsicColorMatrix = new ScriptIntrinsicColorMatrix(renderScript.nScriptIntrinsicCreate(2, element.getID(renderScript), z), renderScript);
            scriptIntrinsicColorMatrix.setIncSupp(z);
            return scriptIntrinsicColorMatrix;
        }
        throw new RSIllegalArgumentException("Unsupported element type.");
    }

    private void setMatrix() {
        FieldPacker fieldPacker = new FieldPacker(64);
        fieldPacker.addMatrix(this.mMatrix);
        setVar(0, fieldPacker);
    }

    public void setColorMatrix(Matrix4f matrix4f) {
        this.mMatrix.load(matrix4f);
        setMatrix();
    }

    public void setColorMatrix(Matrix3f matrix3f) {
        this.mMatrix.load(matrix3f);
        setMatrix();
    }

    public void setAdd(Float4 float4) {
        this.mAdd.f29x = float4.f29x;
        this.mAdd.f30y = float4.f30y;
        this.mAdd.f31z = float4.f31z;
        this.mAdd.f28w = float4.f28w;
        FieldPacker fieldPacker = new FieldPacker(16);
        fieldPacker.addF32(float4.f29x);
        fieldPacker.addF32(float4.f30y);
        fieldPacker.addF32(float4.f31z);
        fieldPacker.addF32(float4.f28w);
        setVar(1, fieldPacker);
    }

    public void setAdd(float f, float f2, float f3, float f4) {
        this.mAdd.f29x = f;
        this.mAdd.f30y = f2;
        this.mAdd.f31z = f3;
        this.mAdd.f28w = f4;
        FieldPacker fieldPacker = new FieldPacker(16);
        fieldPacker.addF32(this.mAdd.f29x);
        fieldPacker.addF32(this.mAdd.f30y);
        fieldPacker.addF32(this.mAdd.f31z);
        fieldPacker.addF32(this.mAdd.f28w);
        setVar(1, fieldPacker);
    }

    public void setGreyscale() {
        this.mMatrix.loadIdentity();
        this.mMatrix.set(0, 0, 0.299f);
        this.mMatrix.set(1, 0, 0.587f);
        this.mMatrix.set(2, 0, 0.114f);
        this.mMatrix.set(0, 1, 0.299f);
        this.mMatrix.set(1, 1, 0.587f);
        this.mMatrix.set(2, 1, 0.114f);
        this.mMatrix.set(0, 2, 0.299f);
        this.mMatrix.set(1, 2, 0.587f);
        this.mMatrix.set(2, 2, 0.114f);
        setMatrix();
    }

    public void setYUVtoRGB() {
        this.mMatrix.loadIdentity();
        this.mMatrix.set(0, 0, 1.0f);
        this.mMatrix.set(1, 0, BitmapDescriptorFactory.HUE_RED);
        this.mMatrix.set(2, 0, 1.13983f);
        this.mMatrix.set(0, 1, 1.0f);
        this.mMatrix.set(1, 1, -0.39465f);
        this.mMatrix.set(2, 1, -0.5806f);
        this.mMatrix.set(0, 2, 1.0f);
        this.mMatrix.set(1, 2, 2.03211f);
        this.mMatrix.set(2, 2, BitmapDescriptorFactory.HUE_RED);
        setMatrix();
    }

    public void setRGBtoYUV() {
        this.mMatrix.loadIdentity();
        this.mMatrix.set(0, 0, 0.299f);
        this.mMatrix.set(1, 0, 0.587f);
        this.mMatrix.set(2, 0, 0.114f);
        this.mMatrix.set(0, 1, -0.14713f);
        this.mMatrix.set(1, 1, -0.28886f);
        this.mMatrix.set(2, 1, 0.436f);
        this.mMatrix.set(0, 2, 0.615f);
        this.mMatrix.set(1, 2, -0.51499f);
        this.mMatrix.set(2, 2, -0.10001f);
        setMatrix();
    }

    public void forEach(Allocation allocation, Allocation allocation2) {
        forEach(0, allocation, allocation2, (FieldPacker) null);
    }

    public void forEach(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getElement().isCompatible(Element.m31U8(this.mRS)) && !allocation.getElement().isCompatible(Element.U8_2(this.mRS)) && !allocation.getElement().isCompatible(Element.U8_3(this.mRS)) && !allocation.getElement().isCompatible(Element.U8_4(this.mRS)) && !allocation.getElement().isCompatible(Element.F32(this.mRS)) && !allocation.getElement().isCompatible(Element.F32_2(this.mRS)) && !allocation.getElement().isCompatible(Element.F32_3(this.mRS)) && !allocation.getElement().isCompatible(Element.F32_4(this.mRS))) {
            throw new RSIllegalArgumentException("Unsupported element type.");
        } else if (allocation2.getElement().isCompatible(Element.m31U8(this.mRS)) || allocation2.getElement().isCompatible(Element.U8_2(this.mRS)) || allocation2.getElement().isCompatible(Element.U8_3(this.mRS)) || allocation2.getElement().isCompatible(Element.U8_4(this.mRS)) || allocation2.getElement().isCompatible(Element.F32(this.mRS)) || allocation2.getElement().isCompatible(Element.F32_2(this.mRS)) || allocation2.getElement().isCompatible(Element.F32_3(this.mRS)) || allocation2.getElement().isCompatible(Element.F32_4(this.mRS))) {
            forEach(0, allocation, allocation2, (FieldPacker) null, launchOptions);
        } else {
            throw new RSIllegalArgumentException("Unsupported element type.");
        }
    }

    public Script.KernelID getKernelID() {
        return createKernelID(0, 3, (Element) null, (Element) null);
    }
}
