package Utils;

import static Utils.Constants.*;

public class ValidateMessage {
    public static String getPopupMessage(String type){
        switch (type.toUpperCase()){
            case ALREADY_BRAND_TYPE:
                return ALREADY_EXIST_BRAND;
            case CREATE_BRAND_TYPE:
                return SUCCESSFULL_CREATE_BRAND;
            case DELETE_BRAND_TYPE:
                return SUCCESSFULL_DELETE_BRAND;
            case CREATE_CAMPAIGN_TYPE:
                return SUCCESSFULL_CREATE_CAMPAIGN;
            case CREATE_SUBCAMPAIGN_TYPE:
                return SUCCESSFULL_CREATE_SUBCAMPAIGN;
            case CREATE_CODE_TYPE:
                return SUCCESSFULL_CREATE_CODE;
            default:
                return null;
        }
    }
}
