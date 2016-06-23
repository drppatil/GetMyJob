package util;

import java.util.HashMap;


public class CreateResponse {

    static HashMap responseHashMap = null;
    public static HashMap setObjectResponse(Object object){
        if(object!=null) {
            responseHashMap = new HashMap();
        responseHashMap.put("responseData",object);
        }
        return responseHashMap;
    }
}
