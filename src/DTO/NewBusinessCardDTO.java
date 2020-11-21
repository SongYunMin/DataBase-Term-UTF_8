package DTO;

public class NewBusinessCardDTO {
    private String cardSignature;       // 이름
    private String cardPhone;           // 전화번호
    private String comName;             // 회사이름
    private String comPhone;            // 회사번호
    private String comDivision;         // 회사부서
    private String comPosition;         // 회사직급
    private String comAddress;          // 회사주소
    private String cardNum;                // 카드 Index
    private String userNum;                // 회원 Index

    public String getCardSignature() {
        return cardSignature;
    }

    public void setCardSignature(String cardSignature) {
        this.cardSignature = cardSignature;
    }

    public String getCardPhone() {
        return cardPhone;
    }

    public void setCardPhone(String cardPhone) {
        this.cardPhone = cardPhone;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getComPhone() {
        return comPhone;
    }

    public void setComPhone(String comPhone) {
        this.comPhone = comPhone;
    }

    public String getComDivision() {
        return comDivision;
    }

    public void setComDivision(String comDivision) {
        this.comDivision = comDivision;
    }

    public String getComPosition() {
        return comPosition;
    }

    public void setComPosition(String comPosition) {
        this.comPosition = comPosition;
    }

    public String getComAddress() {
        return comAddress;
    }

    public void setComAddress(String comAddress) {
        this.comAddress = comAddress;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }
}
