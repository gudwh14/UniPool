package com.unipool.unipool;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {
    final static private String URL = "http://121.137.115.20/Login.php";
    private Map<String,String> parameters;

    public LoginRequest(String userID, String userPW, Response.Listener<String> listener) {
        super(Method.POST,URL,listener,null);
        parameters = new HashMap<>();
        parameters.put("userID",userID);
        parameters.put("userPW",userPW);
    }

    public Map<String,String> getParams() {
        return parameters;
    }
}
