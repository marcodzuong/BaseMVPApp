package com.example.myapplication.view.toast;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

public class CustomToast {
    private String txtToast;
    private String nameImg;
    private int backGroundColor;
    private int imgToast;
    private int colorText;

    public CustomToast setColorTextToast(int colorText){
        this.colorText = colorText;
        return this;
    }
    public CustomToast setTxtToast(String txtToast) {
        this.txtToast = txtToast;
        return this;
    }


    public CustomToast setNameImg(String nameImg) {
        this.nameImg = nameImg;
        return this;
    }

    public CustomToast setBackGroundColor(int backGroundColor) {
        this.backGroundColor = backGroundColor;
        return this;
    }

    public Toast toastLiked(Context context) {
        return setNameImg("check").setBackGroundColor(Color.GREEN).setColorTextToast(Color.WHITE).setTxtToast("Đăng ki thành công ").build(context);
    }
    public Toast toastWarning(Context context){
        return setNameImg("warning").setBackGroundColor(Color.CYAN).setColorTextToast(Color.WHITE).setTxtToast("Báo lỗi !").build(context);
    }
    public Toast toastError(Context context){
        return  setNameImg("error").setBackGroundColor(Color.RED).setColorTextToast(Color.WHITE).setTxtToast("Đang hủy theo dõi ").build(context);
    }
    public Toast custom(Context context,String nameImg, int backGroundColor, String txtToast, int colorText){
        this.colorText =colorText;
        this.nameImg =nameImg;
        this.backGroundColor= backGroundColor;
        this.txtToast =txtToast;
        return build(context);

    }
    public Toast build(Context context) {
        String pkg = context.getPackageName();
        imgToast= context.getResources().getIdentifier(nameImg,"drawable",pkg);
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);
        View view =  LayoutInflater.from(context).inflate(R.layout.custom_toast, null);
        view.setBackgroundColor(backGroundColor);
        TextView txt = view.findViewById(R.id.text);
        txt.setTextColor(colorText);
        ImageView img = view.findViewById(R.id.iconToast);
        txt.setText(txtToast);
        img.setImageResource(imgToast);
        toast.setGravity(Gravity.TOP,0,0);
        toast.setView(view);
        toast.show();
        return  toast;
    }

}
