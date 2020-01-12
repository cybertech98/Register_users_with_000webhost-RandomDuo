package com.example.register_000webhost_youtube;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
public class register extends StringRequest {
    private static final String url = "https://randomduo-youtube.000webhostapp.com/Register.php";
    private Map<String, String> param;

    public register(String name, String password, Response.Listener<String> listener) {
        super(Request.Method.POST,url,listener,null);
        param=new HashMap<>();
        param.put("name",name);
        param.put("password",password);
    }
    @Override
    public Map<String,String> getParams(){return param;}
}