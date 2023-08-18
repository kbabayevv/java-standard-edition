package enumpractice.enummodel;

public enum ErrorMessage {
    CARD_NOT_FOUND("Card not found with pan: {}");
    private String value;

    ErrorMessage(String value) {
        this.value = value;
    }

    public String getValue(String pan) {
        return value.replace("{}", String.valueOf(pan));
    }
}
