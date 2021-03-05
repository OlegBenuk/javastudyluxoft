package Bank;

public enum Gender {
    MALE("Mr."), FEMALE("Ms.");
private String mrs;
    Gender(String mrs) {
        this.mrs = mrs;
    }

    public String getMrs() {
        return mrs;
    }
}
