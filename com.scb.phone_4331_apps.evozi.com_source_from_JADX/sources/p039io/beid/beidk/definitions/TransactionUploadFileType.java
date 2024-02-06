package p039io.beid.beidk.definitions;

/* renamed from: io.beid.beidk.definitions.TransactionUploadFileType */
public enum TransactionUploadFileType {
    CITIZEN(0),
    EPASSPORT(1),
    LIVENESS_VDO(2),
    PORTRAIT(3),
    DG1(4),
    DG2(5),
    DG13(6),
    SOD(7),
    SELFIE1(8),
    SELFIE2(9),
    DG2Image(10),
    LIVENESS_1(101),
    LIVENESS_2(102),
    LIVENESS_3(103),
    LIVENESS_4(104),
    LIVENESS_5(105),
    LIVENESS_6(106),
    LIVENESS_7(107),
    LIVENESS_8(108),
    LIVENESS_9(109);
    
    private final Integer fileTypeId;

    private TransactionUploadFileType(int i) {
        this.fileTypeId = Integer.valueOf(i);
    }

    public static TransactionUploadFileType getSelfieType(int i) {
        switch (i) {
            case 1:
                return LIVENESS_1;
            case 2:
                return LIVENESS_2;
            case 3:
                return LIVENESS_3;
            case 4:
                return LIVENESS_4;
            case 5:
                return LIVENESS_5;
            case 6:
                return LIVENESS_6;
            case 7:
                return LIVENESS_7;
            case 8:
                return LIVENESS_8;
            case 9:
                return LIVENESS_9;
            default:
                return null;
        }
    }

    public final Integer getValue() {
        return this.fileTypeId;
    }
}
