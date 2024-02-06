package p040o;

import java.util.List;

/* renamed from: o.rsnIncContextCreate */
public enum rsnIncContextCreate {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(r0),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(rsnScriptFieldIDCreate.class),
    ALLOWED_EAN_EXTENSIONS(r0);
    
    public final Class<?> valueType;

    private rsnIncContextCreate(Class<?> cls) {
        this.valueType = cls;
    }
}
